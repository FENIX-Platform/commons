package org.fao.fenix.commons.utils;

import org.apache.log4j.Logger;
import org.fao.fenix.commons.utils.database.DataIterator;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class CSVWriter {
    private static final Logger LOGGER = Logger.getLogger("access");

    public static final char DEFAULT_SEPARATOR = ',';
    public static final String DEFAULT_DATE_FORMAT = "dd/MM/YYYY";
    public static final String DEFAULT_NUMBER_FORMAT = "###.##########";
    public static final String DEFAULT_CHARSET = "UTF8";

    Writer out; char separator; boolean useQuote; boolean windows; boolean close; String[] header;
    SimpleDateFormat dateFormatter;
    DecimalFormat numberFormatter;
    boolean writeHeader;


    public CSVWriter (String fileName, Character separator, Boolean useQuote, Boolean windows, String dateFromat, String numberFormat, String[] header) throws IOException {
        this(new FileWriter(fileName),separator,useQuote,windows,null,dateFromat,numberFormat,header);
    }
    public CSVWriter(OutputStream out, Character separator, Boolean useQuote, Boolean windows, Boolean close, String dateFromat, String numberFormat, String[] header, String charsetName) throws UnsupportedEncodingException {
        this(new OutputStreamWriter(out, charsetName==null? StandardCharsets.UTF_8.name() : charsetName.toString()),separator,useQuote,windows,close,dateFromat,numberFormat,header);
    }

    public CSVWriter(Writer out, Character separator, Boolean useQuote, Boolean windows, Boolean close, String dateFromat, String numberFormat, String[] header) {
        this.out = out;
        this.separator = separator!=null ? separator : DEFAULT_SEPARATOR;
        this.useQuote = useQuote!=null ? useQuote : true;
        this.windows = windows!=null ? windows : true;
        this.close = close!=null ? close : true;
        this.header = header;
        this.writeHeader = header!=null && header.length>0;

        dateFormatter = new SimpleDateFormat(dateFromat!=null ? dateFromat : DEFAULT_DATE_FORMAT);
        numberFormatter = numberFormat!=null ? new DecimalFormat(numberFormat) : new DecimalFormat(DEFAULT_NUMBER_FORMAT, new DecimalFormatSymbols(Locale.US));
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        DecimalFormat numberFormatter = new DecimalFormat(DEFAULT_NUMBER_FORMAT, new DecimalFormatSymbols(Locale.US));

        double n = 20010.756;
        Date date = new Date();

        System.out.println("num: "+numberFormatter.format(n));
        System.out.println("date: "+dateFormatter.format(date));

        System.out.println("ss\"ddd\"".replaceAll("\"", "\\\\\""));
    }

    private void writeHeader() throws Exception {
        boolean closeOriginalValue = close;
        close = false;
        write(Arrays.asList(new Object[][]{header}).iterator(), 1);
        close = closeOriginalValue;
    }

    public int write(Iterator<Object[]> data, int size) throws Exception {
        if (writeHeader) {
            writeHeader=false;
            writeHeader();
        }
        StringBuilder row = new StringBuilder();
        int count = 0;

        if (data!=null)
            while (data.hasNext() && count<size) {
                for (Object cell : data.next()) {
                    if (cell==null)
                        row.append(separator);
                    else if (cell instanceof Number)
                        row.append(numberFormatter.format(cell)).append(separator);
                    else if (cell instanceof Date)
                        row.append(dateFormatter.format(cell)).append(separator);
                    else {
                        if (useQuote)
                            row.append('"').append(cell.toString().replaceAll("\"", "\\\\\"")/*.replaceAll(";", "\\"+separator+"")*/).append('"').append(separator);
                        else
                            row.append(cell.toString()).append(separator);
                    }
                }
                if (windows) {
                    row.setCharAt(row.length() - 1, '\r');
                    row.append('\n');
                } else
                    row.setCharAt(row.length()-1,'\n');
                out.write(row.toString());
                row.setLength(0);
                count++;
            }

        out.flush();
        if (close)
            out.close();

        return count;
    }


    public int write(FileWriter fileWriter, Iterator<Object[]> data, int size) throws Exception {
        if (writeHeader) {
            writeHeader=false;
            writeHeader();
        }
        StringBuilder row = new StringBuilder();
        int count = 0;

        if (data!=null)
            while (data.hasNext() && count<size) {
                for (Object cell : data.next()) {
                    if (cell==null)
                        row.append(separator);
                    else if (cell instanceof Number)
                        row.append(numberFormatter.format(cell)).append(separator);
                    else if (cell instanceof Date)
                        row.append(dateFormatter.format(cell)).append(separator);
                    else {
                        if (useQuote)
                            row.append('"').append(cell.toString().replaceAll("\"", "\\\\\"")/*.replaceAll(";", "\\"+separator+"")*/).append('"').append(separator);
                        else
                            row.append(cell.toString()).append(separator);
                    }
                }
                if (windows) {
                    row.setCharAt(row.length() - 1, '\r');
                    row.append('\n');
                } else
                    row.setCharAt(row.length()-1,'\n');
                fileWriter.write(row.toString());
                row.setLength(0);
                count++;
            }

        fileWriter.flush();
        if (close)
            fileWriter.close();

        return count;
    }


    public static  Object deepCopy(Object oldObj) throws Exception
    {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try
        {
            ByteArrayOutputStream bos =
                    new ByteArrayOutputStream(); // A
            oos = new ObjectOutputStream(bos); // B
            // serialize and pass the object
            oos.writeObject(oldObj);   // C
            oos.flush();               // D
            ByteArrayInputStream bin =
                    new ByteArrayInputStream(bos.toByteArray()); // E
            ois = new ObjectInputStream(bin);                  // F
            // return the new object
            return ois.readObject(); // G
        }
        catch(Exception e)
        {
            System.out.println("Exception in ObjectCloner = " + e);
            throw(e);
        }
        finally
        {
            oos.close();
            ois.close();
        }
    }





}
