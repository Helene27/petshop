package project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
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
    private String filePath = "src/main/resources/project/Animals.txt";

    @Test
    public void writeToFileTest() throws IOException {
        
        // Scanner scanner = new Scanner(new File(filePath));
        // String last = null; //name
        // //String secondLast = null; //animal

        // while (scanner.hasNextLine()) {
        //     //secondLast = last;
        //     last = scanner.nextLine();
        // }
        // scanner.close();


        FileOperations fileOperations = new FileOperations("none");
        fileOperations.writeNameToFile();
        Scanner scan = new Scanner(new FileReader(filePath));
        
        while (scan.hasNextLine()){
            String line = scan.nextLine();

        }
       
       
        
       //assertEquals("Test denne filen", skrive);

    }


    @Test
    public void readFromFile() throws IOException {
        String expectedLastLine = null;
        String last = null;
        try (Scanner scanner = new Scanner(new FileReader(filePath))) {
            while (scanner.hasNextLine()) {
                last = scanner.nextLine();
                expectedLastLine = last;
            }
            System.out.println(expectedLastLine);
        }
        
        FileOperations fileOperations = new FileOperations("");
        String[] actual = fileOperations.readFromFile();
        System.out.println(actual);

        assertEquals(expectedLastLine, actual[1]);

    }
}
