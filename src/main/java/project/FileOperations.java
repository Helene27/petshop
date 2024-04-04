package project;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOperations {
    private String inputField;

    public FileOperations(String inputField) {
        this.inputField = inputField;
    }
    
    @Override
    public String toString() {
        return "animal choosen: " + inputField;
    }

    public String getInputField() {
        return inputField;
    }

    public void writeInputToFile(String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.println("Chosen bajs animal: " + inputField);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileOperations dog = new FileOperations("dog");
        dog.writeInputToFile("../../resources/project/Animals.txt");
    }
}
