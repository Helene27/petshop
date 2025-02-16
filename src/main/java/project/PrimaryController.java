package project;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {
    @FXML
    Button dogButton;
    @FXML
    Button catButton;
    @FXML
    Button bunnyButton;
    @FXML
    Button birdButton;

    String animal;

    FileOperations operation;


    @FXML
    private void saveAnimal(ActionEvent event) throws IOException {
        Button sourceButton = (Button) event.getSource();
    
        if(sourceButton.equals(dogButton)){
            animal = "dog";
        }
        else if(sourceButton.equals(catButton)){
            animal = "cat";
        }
        else if(sourceButton.equals(bunnyButton)){
            animal = "bunny";
        }
        else if(sourceButton.equals(birdButton)){
            animal = "bird";
        }
        operation = new FileOperations(animal);
        operation.writeAnimalToFile();

    }

    @FXML
    private void switchToSecondary(ActionEvent event) throws IOException {
        saveAnimal(event);
        App.setRoot("secondary");
    }
}
