package javatraining.oletsky.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileInput {
    public static void main(String[] args) throws IOException {
        final String FILENAME = "testfile";
        BufferedReader br = new BufferedReader(new FileReader(FILENAME));
        String st;
        while((st=br.readLine())!=null) {
            System.out.println(st);  }
        br.close();
    }
}
