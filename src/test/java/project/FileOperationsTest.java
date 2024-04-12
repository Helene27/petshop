package project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class FileOperationsTest {

    private String filePath = "src/main/resources/project/Animals.txt";

    //Test 3. Tester metoden readFromFile

    @Test
    public void readFromFileTest() throws IOException {
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
        System.out.println(Arrays.toString(actual));

        assertEquals(expectedLastLine, actual[1]);

    }

    @Test
    public void writeAnimalToFileTest() throws IOException {
        FileOperations fileOperations = new FileOperations("Jeg tester at dyr blir skrevet");
        fileOperations.writeAnimalToFile();
        
        String[] actual = fileOperations.readFromFile();
        String expected = "Jeg tester at dyr blir skrevet";
        System.out.println(Arrays.toString(actual));

        assertEquals(expected, actual[1]);

    }
}
