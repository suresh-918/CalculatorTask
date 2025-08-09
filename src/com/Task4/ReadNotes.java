package com.Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNotes {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\OneDrive\\Desktop\\JAVA\\notes.txt"));
            String line;
            
            System.out.println("Your saved notes:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
