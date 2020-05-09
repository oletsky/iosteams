package javatraining.oletsky.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author O.Oletsky
 * Reading the whole file
 */
public class ReadingUsingFiles {
    public static void main(String[] args) {
        final String FILENAME="testfile";
        try {
            String s = Files.readString(Paths.get(FILENAME));
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
