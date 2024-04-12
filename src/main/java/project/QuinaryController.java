package project;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class QuinaryController {
    FileOperations operation;

    String[] textArray;

    @FXML
    Label firstText;
    @FXML
    Label secondText;
    @FXML
    Label yearsField;
    @FXML
    TextField inputField;

    String animal;
    String name;

    String humanAge;
    int intHumanAge;
    String finalResult;
    int result;

    @FXML
    public void initialize() throws FileNotFoundException{
        operation = new FileOperations("none");
        textArray = operation.readFromFile();

        animal = textArray[0].strip();
        name = textArray[1].strip();

        firstText.setText(name + " ages faster than you, as their life is shorter.");
        secondText.setText("Enter your age, to see how old you would be in " + animal + " years!");

    }

    @FXML
    private void calculateAge() throws IOException {
        humanAge = inputField.getText();

        if (Pattern.matches("[0-9]+", humanAge) == false) {
            yearsField.setText("Enter a valid number!");
            return;
        }
        intHumanAge = Integer.parseInt(humanAge); 
        
        if (animal.equals("dog")) {
            Dog dog = new Dog();
            result = dog.calculateAge(intHumanAge);
        }
        else if (animal.equals("cat")) {
            Cat cat = new Cat();
            result = cat.calculateAge(intHumanAge);
        }
        else if (animal.equals("bunny")) {
            Bunny bunny = new Bunny();
            result = bunny.calculateAge(intHumanAge);
        }
        else if (animal.equals("bird")) {
            Bird bird = new Bird();
            result = bird.calculateAge(intHumanAge);
        }

        finalResult = Integer.toString(result);
        yearsField.setText("You would be " + finalResult + " in " + animal + " years!");
        return;
    }


    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void closeApplication(ActionEvent event) throws IOException {
        Platform.exit();
    }
}