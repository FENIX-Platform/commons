package org.fao.fenix.commons.utils;


import java.util.Collection;
import java.util.LinkedList;

public class Groups <T> {
    public Collection<T> insert = new LinkedList<>();
    public Collection<T> update = new LinkedList<>();
    public Collection<T> delete = new LinkedList<>();


    public Groups() { }
    public Groups (Collection<T> source, Collection<T> destination) {
        init(source,destination);
    }

    public void init (Collection<T> source, Collection<T> destination) {
        insert.clear();
        update.clear();
        delete.clear();

        insert.addAll(source);
        insert.removeAll(destination);

        update.addAll(source);
        update.retainAll(destination);

        delete.addAll(destination);
        delete.removeAll(source);
    }
}
