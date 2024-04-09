package project;

import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;

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

    int checkedCounter;
    // int indexCounter;

    // public List<Integer> checked;

    // private PriceCalculations pc;

    

    @FXML
    private void switchToQuarternary() throws IOException {
        boolean threeChecked = false;

        CheckBox[] checkBoxes = {checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11, checkBox12};

        checkedCounter = 0;
        // indexCounter = 0;
        // checked = new ArrayList<>();

        // pc = new PriceCalculations();

        for (CheckBox cb : checkBoxes) {
            // indexCounter ++;
            if (cb.isSelected()) {
                checkedCounter++;
                // checked.add(indexCounter);
            }
        } 

        if (checkedCounter == 3) {
            threeChecked = true;
        }

        if(threeChecked){
            // System.out.println(pc.calculatePrice());
            App.setRoot("quarternary");
        } else {
            this.outputLabel.setText("Your pet wants three accessories! Make sure you have picked three items.");
        }
            
    }

    

}