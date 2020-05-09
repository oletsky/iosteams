package javatraining.oletsky.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SimpleFileOutput {
    public static void main(String[] args) throws FileNotFoundException {
        final String FILENAME = "testfile";
        PrintWriter pw = new PrintWriter(FILENAME);
        pw.write("This information is extremely important!");
        pw.close();

    }
}
