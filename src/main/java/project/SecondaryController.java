package project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {
    FileOperations operation;

    @FXML
    TextField nameField;

    @FXML 
    Label outputLabel;

    @FXML
    Button enterButton;

    String name;
    
    @FXML
    private void switchToTertiary() throws IOException {
        name = nameField.getText();
        
        if (name.isEmpty()) {
            this.outputLabel.setText("Give your pet a name!");
        } else {
            operation = new FileOperations(name);
            operation.writeNameToFile();
            App.setRoot("tertiary");
        }
    }
}