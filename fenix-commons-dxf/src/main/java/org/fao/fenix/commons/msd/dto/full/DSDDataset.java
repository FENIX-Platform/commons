package org.fao.fenix.commons.msd.dto.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.fao.fenix.commons.msd.dto.type.DataType;
import org.fao.fenix.commons.utils.Language;

import javax.persistence.Embedded;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DSDDataset extends DSD {

    @JsonProperty private Collection<DSDAggregationRule> aggregationRules;
    @JsonProperty private Collection<DSDColumn> columns;

    public DSDDataset() {}
    public DSDDataset(String rid) {
        setRID(rid);
    }

    public Collection<DSDAggregationRule> getAggregationRules() {
        return aggregationRules;
    }

    public void setAggregationRules(Collection<DSDAggregationRule> aggregationRules) {
        this.aggregationRules = aggregationRules;
    }

    public Collection<DSDColumn> getColumns() {
        return columns;
    }
    @Embedded
    public void setColumns(Collection<DSDColumn> columns) {
        this.columns = columns;
    }

    //Utils
    public DSDColumn findColumn(String id) {
        Collection<DSDColumn> sourceColumns = getColumns();

        if (sourceColumns!=null)
            for (DSDColumn column : sourceColumns)
                if (column.getId().equals(id))
                    return column;

        return null;
    }

    public DSDDataset extend (boolean copy, Language ... languages) {
        Collection<DSDColumn> sourceColumns = getColumns();
        //languages normalization
        if (languages==null || languages.length==0)
            languages = Language.values();
        //create new columns (avoid duplicates)
        if (sourceColumns!=null) {
            Set<String> columnsId = new HashSet<>();
            for (DSDColumn column : sourceColumns)
                columnsId.add(column.getId());
            Collection<DSDColumn> columns = new LinkedList<>(sourceColumns);

            for (DSDColumn column : sourceColumns)
                if (column.getDataType()== DataType.code || column.getDataType()==DataType.customCode)
                    for (Language l : languages) {
                        String id = column.getId() + '_' + l.getCode();
                        if (!columnsId.contains(id)) {
                            DSDColumn newColumn = new DSDColumn();
                            newColumn.setId(id);
                            newColumn.setDataType(DataType.text);
                            newColumn.setTitle(column.getTitle());
                            newColumn.setKey(false);
                            newColumn.setVirtual(false);
                            newColumn.setTransposed(false);
                            columns.add(newColumn);
                        }
                    }
            if (copy) {
                DSDDataset dsd = new DSDDataset();
                dsd.setContextSystem(getContextSystem());
                dsd.setDatasources(getDatasources());
                dsd.setCache(getCache());
                dsd.setContextExtension(getContextExtension());
                dsd.setAggregationRules(getAggregationRules());
                dsd.setColumns(columns);
                return dsd;
            } else
                setColumns(columns);
        }

        return this;
    }


    //TODO remove copy parameter from extend and implement the clone function (without get/set and with nulls chek)


    @Override
    public DSDDataset clone() {
        return null;
    }
}
