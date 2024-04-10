package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileOperations {
    
    private String textIn;
    // private String textOut = "";

    private String filePath = "src/main/resources/project/Animals.txt";
    
    
    public FileOperations(String text) {
        this.textIn = text;
    }
    
    
    public void writeAnimalToFile() throws IOException {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath, false));
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

        
        // while (scanner.hasNextLine()) {
        //     String line = scanner.nextLine();
        //     textOut += line;
        // }
        // scanner.close();
        // return textOut;
            
        //få denne til å returnere i to strenger, en animalOut og en nameOut
        String[] textOut = new String[2];
        String animalOut = scanner.nextLine();
        String nameOut = scanner.nextLine();
        scanner.close();
        textOut[0] = animalOut;
        textOut[1] = nameOut;
        return textOut;
    }

}
