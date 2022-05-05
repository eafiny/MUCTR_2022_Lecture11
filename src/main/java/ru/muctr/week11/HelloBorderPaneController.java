package ru.muctr.week11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * @author Evgenia Skichko
 */
public class HelloBorderPaneController {
    @FXML
    public HBox bottomHBox;

    int i = 1;
    private Stage newStage;

    public void createNewButton(ActionEvent actionEvent) {
        Button button = new Button("Button № " + i++);
        bottomHBox.getChildren().add(button);
        button.setOnAction(actionEvent1 -> {
            System.out.println(button.getText() + " clicked");
        });
    }

    public void createNewWindow(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Parent root = fxmlLoader.load();
            newStage = new Stage();

            newStage.setTitle("New Test Window");
            newStage.setScene(new Scene(root, 500, 400));
            newStage.initStyle(StageStyle.UTILITY);
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
