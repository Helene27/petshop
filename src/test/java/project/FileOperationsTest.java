package project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class FileOperationsTest {

    private String textIn;
    private String filePath;

    @Test
    public void writeToFile() throws IOException {
        FileOperations fileOperations = new FileOperations("Test denne filen");
        
       fileOperations.writeNameToFile();

       Scanner scan = new Scanner(new FileReader("src/main/resources/project/Animals.txt"));
       while (scan.hasNextLine()){
           String line = scan.nextLine();

       }
       
       
        
       //assertEquals("Test denne filen", skrive);

    }


    @Test
    public void readFromFile() throws IOException {
        
        //fileOperations.writeNameToFile();
        

        //fileOperations.readFromFile();
        

    }

}
