package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class QuarternaryController {

    FileOperations operation;

    @FXML
    ImageView certificateImage;
    @FXML
    Label certificateAnimal;
    @FXML
    Label certificateName;

    String[] textArray;

    @FXML
    public void initialize() throws FileNotFoundException{
        operation = new FileOperations("none");
        textArray = operation.readFromFile();

        String animalOut = textArray[0];
        String nameOut = textArray[1];

        File file = new File("src/main/resources/images/" + animalOut.strip() + ".png");
        Image image = new Image(file.toURI().toString());
        certificateImage.setImage(image);

        certificateAnimal.setText("Animal: " + animalOut);
        certificateName.setText("Name: " + nameOut);
    }
    
    @FXML
    public void closeApplication(ActionEvent event) throws IOException {
        Platform.exit();
    }

    @FXML
    private void switchToQuinary() throws IOException {
        App.setRoot("quinary");
    }
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
