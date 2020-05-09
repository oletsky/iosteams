package javatraining.oletsky.io;

import java.io.File;
import java.io.IOException;

/**
 * @author O.Oletsky
 * Creating a directory and a file
 */
public class CreatingNewDirAndFile {
    public static void main(String[] args) {
        File dir = new File("C:\\newdir");
        boolean success = dir.mkdir();
        if (success) System.out.println("Directory successfully created");
        else System.out.println("Something terrible happened");
        File fl=new File(dir,"fl.txt");
        try {
            fl.createNewFile();
            System.out.println("File created");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
