package project;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class QuarternaryController {

    FileOperations operation;

    @FXML
    Label certificateText;

    String text;

    @FXML
    public void initialize() throws FileNotFoundException{
        operation = new FileOperations("lol");
        text = operation.readFromFile();
        certificateText.setText(text);

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
