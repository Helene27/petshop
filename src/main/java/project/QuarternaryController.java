package project;

import java.io.IOException;
import javafx.fxml.FXML;

public class QuarternaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
