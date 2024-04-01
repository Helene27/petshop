package project;

import java.io.IOException;
import javafx.fxml.FXML;

public class TertiaryController {

    @FXML
    private void switchToQuarternary() throws IOException {
        App.setRoot("quarternary");
    }
}