package project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class TertiaryController {

    @FXML Label outputLabel;

    @FXML private CheckBox checkBox1;
    @FXML private CheckBox checkBox2;
    @FXML private CheckBox checkBox3;
    @FXML private CheckBox checkBox4;
    @FXML private CheckBox checkBox5;
    @FXML private CheckBox checkBox6;
    @FXML private CheckBox checkBox7;
    @FXML private CheckBox checkBox8;
    @FXML private CheckBox checkBox9;
    @FXML private CheckBox checkBox10;
    @FXML private CheckBox checkBox11;
    @FXML private CheckBox checkBox12;

    @FXML
    private void switchToQuarternary() throws IOException {
        boolean threeChecked = false;

        CheckBox[] checkBoxes = {checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11, checkBox12};
       

        int counter = 0;

        for (CheckBox cb : checkBoxes) {
            if (cb.isSelected()) {
                counter++;
            }
        } 

        if (counter == 3) {
            threeChecked = true;
        }

       if(threeChecked){
            App.setRoot("quarternary");
        } else {
            this.outputLabel.setText("Your pet wants three accessories! Choose x more");
        }
            
    }

    

}