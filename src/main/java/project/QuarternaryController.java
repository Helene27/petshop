package project;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class QuarternaryController {

    FileOperations operation;

    @FXML
    ImageView certificateImage;
    @FXML
    Label certificateAnimal;
    @FXML
    Label certificateName;

    String text;

    @FXML
    public void initialize() throws FileNotFoundException{
        operation = new FileOperations("none");
        text = operation.readFromFile();
        certificateName.setText(text);

    }
    
    @FXML
    public void closeApplication(ActionEvent event) throws IOException {
        Platform.exit();
    }
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
