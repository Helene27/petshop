package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileOperations {
    
    private String textIn;

    private String filePath = "src/main/resources/project/Animals.txt";
    
    
    public FileOperations(String text) {
        this.textIn = text;
    }
    
    
    public void writeAnimalToFile() throws IOException {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath, true));
            writer.println(textIn);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void writeNameToFile() throws IOException {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath, true));
            writer.println(textIn);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public String[] readFromFile() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File(filePath));

        String last = null; //name
        String secondLast = null; //animal

        while (scanner.hasNextLine()) {
            secondLast = last;
            last = scanner.nextLine();
        }
        scanner.close();
        String[] textOut = new String[2];
        textOut[0] = secondLast;
        textOut[1] = last;
        return textOut;

    }

}
