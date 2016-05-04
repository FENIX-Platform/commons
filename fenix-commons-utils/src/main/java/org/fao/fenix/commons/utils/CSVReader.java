package org.fao.fenix.commons.utils;

import java.io.*;
import java.util.Iterator;

public class CSVReader implements Iterable<String[]> {
	
	
	public static final String DEFAULT_SEPARATOR = ";";
	public static final char UNICODE_BOM = '\uFEFF';
	
	private String separator;
	private BufferedReader reader;



	public CSVReader(File file) throws Exception {
        this(new BufferedReader(new FileReader(file)),DEFAULT_SEPARATOR);
    }
	public CSVReader(File file, String separator) throws Exception {
		this(new BufferedReader(new FileReader(file)),separator);
	}
    public CSVReader(InputStream in) {
        this(new BufferedReader(new InputStreamReader(in)),DEFAULT_SEPARATOR);
    }
    public CSVReader(InputStream in, String separator) {
        this(new BufferedReader(new InputStreamReader(in)),separator);
    }
    public CSVReader(BufferedReader reader) {
        this(reader,DEFAULT_SEPARATOR);
    }
    public CSVReader(BufferedReader reader, String separator) {
        assert reader!=null && separator!=null;
        this.separator = separator;
        this.reader = reader;
    }



	public String[] nextRow() throws Exception {
		String[] nextRow = null;
		String line = reader.readLine();
		
		if (line!=null) {
			if (line.length()>0 && line.charAt(0)==UNICODE_BOM)
				line = line.substring(1);
			nextRow = line.trim().length()>0 ? line.split(separator) : new String[0];
		}
        if (nextRow!=null && nextRow.length>0)
            for (int i=0; i<nextRow.length; i++) {
                if (nextRow[i].length()>2 && nextRow[i].charAt(0)=='"' && nextRow[i].charAt(nextRow[i].length()-1)=='"')
                    nextRow[i] = nextRow[i].substring(1, nextRow[i].length()-1);
            }
		return nextRow;
	}

    @Override
    public Iterator<String[]> iterator() {
        final CSVReader reader = this;
        return new Iterator<String[]>() {
            private String[] currentRow;
            private boolean consumed = true;

            @Override
            public boolean hasNext() {
                if (consumed)
                    try {
                        currentRow = reader.nextRow();
                        consumed = false;
                    } catch (Exception e) {
                        currentRow = null;
                    }
                return currentRow!=null;
            }

            @Override
            public String[] next() {
                if (consumed)
                    try {
                        currentRow = reader.nextRow();
                    } catch (Exception e) {
                        currentRow = null;
                    }
                consumed = true;
                return currentRow;
            }

            @Override
            public void remove() {

            }
        };
    }
}
