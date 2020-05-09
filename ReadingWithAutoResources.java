package javatraining.oletsky.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingWithAutoResources {
    public static void main(String[] args) {
        final String FILENAME = "testfile";
        try (BufferedReader br = new BufferedReader(
                new FileReader(FILENAME))) {
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
