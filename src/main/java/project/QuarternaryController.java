package project;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class QuarternaryController {

    @FXML
    public void closeApplication(ActionEvent event) throws IOException {
        Platform.exit();
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
