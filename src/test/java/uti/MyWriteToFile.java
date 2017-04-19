package uti;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by rahul.kulkarni on 19/04/2017.
 */
public class MyWriteToFile {

    public static void myWriteMethod(String SKUValue){
    BufferedWriter bw = null;
    FileWriter fw = null;

		try {

        //String data = " This is new content";

        File file = new File("/src/test/resources/SKU.txt");

        // if file doesnt exists, then create it
        if (!file.exists()) {
            file.createNewFile();
        }

        // true = append file
        fw = new FileWriter(file.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);

        bw.write(SKUValue);
        bw.newLine();
        System.out.println("Done");

    } catch (IOException e) {

        e.printStackTrace();

    } finally {

        try {

            if (bw != null)
                bw.close();

            if (fw != null)
                fw.close();

        } catch (IOException ex) {

            ex.printStackTrace();

            }
        }
    }
}
