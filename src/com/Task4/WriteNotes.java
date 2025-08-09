package com.Task4;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNotes {
    public static void main(String[] args) {
        String notes = "These are my important notes.\nAlways back up your data!";
        
        try {
        	FileWriter writer = new FileWriter("C:\\Users\\user\\OneDrive\\Desktop\\JAVA\\notes.txt");

            writer.write(notes);
            writer.close();
            System.out.println("Notes saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

