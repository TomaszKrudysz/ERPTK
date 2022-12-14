package com.example.erptk.factory;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by tkrud on 26.10.2022.
 */
public class PopupFactory {
    public Stage createWaitingPopup(String text){
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);

        VBox pane = new VBox();
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(10);

        Label label = new Label(text);
        ProgressBar progressBar = new ProgressBar();
        pane.getChildren().add(label);
        pane.getChildren().add(progressBar);

        stage.setScene(new Scene(pane,200,100));
        stage.initModality(Modality.APPLICATION_MODAL);
        return stage;
    }
}
