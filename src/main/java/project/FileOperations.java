package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileOperations {
    
    private String textIn;
    private String textOut;
    
    
    public FileOperations(String text) {
        this.textIn = text;
        this.textOut = "";
    }
    
    
    public void writeToFile(String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.println(textIn);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public String readFromFile() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("src/main/resources/project/Animals.txt"));
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            textOut += line;
        }
        scanner.close();
        return textOut;
    }

}
