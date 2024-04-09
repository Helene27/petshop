package project;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class FileOperations {
    
    private String text;

    public FileOperations(String text) {
        this.text = text;
    }


    public void writeToFile(String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.println(text);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String filename) {
        
    }

}
