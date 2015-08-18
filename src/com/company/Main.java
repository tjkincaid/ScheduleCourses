package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CourseScheduler cs = new CourseScheduler();
        Charset charset = Charset.forName("US-ASCII");

        String filePath = new File("Data/testData.txt").getAbsolutePath();


        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath), charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

    }
}
