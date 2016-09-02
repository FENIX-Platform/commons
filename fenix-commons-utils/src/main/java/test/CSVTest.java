package test;


import org.fao.fenix.commons.utils.CSVWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class CSVTest {

    public static void main(String[] args) throws Exception {

        CSVWriter csvWriter;
        csvWriter = initialize();


        csvWriter.write(createData(), 100);


    }


    private static java.util.Iterator<Object[]> createData() {

        LinkedList<Object[]> result = new LinkedList<>();

        /*Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File("/home/faber-cst/Desktop/testBugD3S.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (fileScanner.hasNextLine()) {
            LinkedList<Object> dataArray = new LinkedList<>();
            String line = fileScanner.nextLine();

            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                dataArray.add(lineScanner.next());
                // do whatever needs to be done with token
            }
            lineScanner.close();
            result.add(dataArray.toArray());
            // you're at the end of the line here. Do what you have to do.
        }
        fileScanner.close();*/
        result.add(testStatic());
        return result.iterator();
    }


    private static CSVWriter initialize() {


        String filename = "/home/faber-cst/Documents/test.csv";

        CSVWriter result = null;
        try {
            result = new CSVWriter(filename, ';', true, null, null, null, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }


    private static Object[] testStatic() {

        Object[] test =
                {
                "POLICY_12_99_1_2_1_1_4_0",
                229,
                77,
                99,
                "HS2007",
                10061091,
                null,
                "n.a.",
                20070515,
                null, " %",
                10.00,
                null,
                "Observed",
                null,
                "http://www.infoleg.gov.ar/infolegInternet/anexos/125000-129999/128407/norma.htm",
                "Ministerio de Economía y Producción",
                "Decreto 509/2007",
                null,
                20070515,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                " OECD Export Restrictions",
                3,
                "Extension",
                null,
                10061091,
                "Arroz con cáscara (arroz paddy\"); parboilizado",
                "         www.infoleg.gov.ar_infolegInternet_anexos_125000-129999_128407_norma.pdf",
                null,
                "                (-) Rice in the husk (paddy or rough) for sowing (-) Parboilizado",
                null,
                "Rice. - Rice in the husk (paddy or rough). -- Los demás. --- Parboilizado.",
                null,
                null,
                null,
                null,
                null,
                null,
                null
        };

        return test;


    }
}
