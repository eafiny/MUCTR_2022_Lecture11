package ru.muctr.week11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class HelloController {
    @FXML
    public Button btn1;
    @FXML
    public TextField tfield1;
    @FXML
    public TextArea tArea;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void btn1Click(ActionEvent actionEvent) {
        System.out.println("Button 1 click");
    }

    public void tFieldClick(ActionEvent actionEvent) {
        tArea.appendText(tfield1.getText() + "\n");
        tfield1.clear();
        tfield1.requestFocus();
    }

    public void tFieldKeyPressed(KeyEvent keyEvent) {
        if (keyEvent.isShiftDown() && keyEvent.getCode().equals(KeyCode.ENTER)){
            System.out.println("Shift & Enter pressed");
        }
    }
}