package org.fao.fenix.commons.utils;

import org.fao.fenix.commons.utils.database.Iterator;

import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CSVWriter {
    public static final char DEFAULT_SEPARATOR = ',';
    public static final String DEFAULT_DATE_FORMAT = "dd/MM/YYYY";
    public static final String DEFAULT_NUMBER_FORMAT = "###.##";

    Writer out; char separator; boolean useQuote; boolean windows; boolean close; String[] header;
    SimpleDateFormat dateFormatter;
    DecimalFormat numberFormatter;

    public CSVWriter (String fileName, Character separator, Boolean useQuote, Boolean windows, String dateFromat, String numberFormat, String[] header) throws IOException {
        this(new FileWriter(fileName),separator,useQuote,windows,null,dateFromat,numberFormat,header);
    }
    public CSVWriter (OutputStream out, Character separator, Boolean useQuote, Boolean windows, Boolean close, String dateFromat, String numberFormat, String[] header) {
        this(new OutputStreamWriter(out),separator,useQuote,windows,close,dateFromat,numberFormat,header);
    }

    public CSVWriter(Writer out, Character separator, Boolean useQuote, Boolean windows, Boolean close, String dateFromat, String numberFormat, String[] header) {
        this.out = out;
        this.separator = separator!=null ? separator : DEFAULT_SEPARATOR;
        this.useQuote = useQuote!=null ? useQuote : true;
        this.windows = windows!=null ? windows : true;
        this.close = close!=null ? close : true;
        this.header = header;

        dateFormatter = new SimpleDateFormat(dateFromat!=null ? dateFromat : DEFAULT_DATE_FORMAT);
        numberFormatter = new DecimalFormat(numberFormat!=null ? numberFormat : DEFAULT_NUMBER_FORMAT);
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        DecimalFormat numberFormatter = new DecimalFormat(DEFAULT_NUMBER_FORMAT);

        double n = 20010.756;
        Date date = new Date();

        System.out.println("num: "+numberFormatter.format(n));
        System.out.println("date: "+dateFormatter.format(date));

    }

    public void write(Iterator<Object[]> data) throws Exception {
        StringBuilder row = new StringBuilder();

        if (data!=null)
            while (data.hasNext()) {
                for (Object cell : data.next()) {
                    if (cell==null)
                        row.append(separator);
                    else if (cell instanceof Number)
                        row.append(numberFormatter.format(cell)).append(separator);
                    else if (cell instanceof Date)
                        row.append(dateFormatter.format(cell)).append(separator);
                    else {
                        if (useQuote)
                            row.append('"').append(cell.toString()).append('"').append(separator);
                        else
                            row.append(cell.toString()).append(separator);
                    }
                    if (windows) {
                        row.setCharAt(row.length() - 1, '\r');
                        row.append('\n');
                    } else
                        row.setCharAt(row.length()-1,'\n');
                }
                out.write(row.toString());
                row.setLength(0);
            }

        out.flush();
        if (close)
            out.close();
    }
}