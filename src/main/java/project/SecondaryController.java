package project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SecondaryController {
    @FXML
    TextField nameField;

    @FXML
    private void switchToTertiary() throws IOException {
        String name = nameField.getText();
        System.out.println(name);
        App.setRoot("tertiary");
    }
}