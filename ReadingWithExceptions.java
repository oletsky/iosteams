package javatraining.oletsky.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingWithExceptions {
    public static void main(String[] args) {
        final String FILENAME = "testfile";
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILENAME));
            try {
                String st;  while ((st = br.readLine()) != null) {
                    System.out.println(st);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
