package project;

import java.io.FileNotFoundException;
import java.io.IOException;

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

    int humanAge;
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
        humanAge = Integer.parseInt(inputField.getText());
        if (animal.equals("dog")) {
            Dog dog = new Dog();
            result = dog.calculateAge(humanAge);
        }
        else if (animal.equals("cat")) {
            Cat cat = new Cat();
            result = cat.calculateAge(humanAge);
        }
        else if (animal.equals("bunny")) {
            Bunny bunny = new Bunny();
            result = bunny.calculateAge(humanAge);
        }
        else if (animal.equals("bird")) {
            Bird bird = new Bird();
            result = bird.calculateAge(humanAge);
        }

        finalResult = Integer.toString(result);
        System.out.println(finalResult);
        yearsField.setText("You would be " + finalResult + " in " + animal + " years!");
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