package com.front.view;

import com.front.view.*;
import javafx.animation.Interpolator;
import javafx.animation.PauseTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class FourthPage {
    
    private Scene fourthScene;

    public Scene getFourthScene() {

        Image shopImage = new Image("assets\\images\\forthLogo_img.png");
        ImageView shopImageView = new ImageView(shopImage);
        shopImageView.setFitHeight(800);
        shopImageView.setFitWidth(700);
        shopImageView.setPreserveRatio(true);
        shopImageView.setTranslateY(10);

        Button nextButton = new Button("Welcome Page >>");
        nextButton.setStyle("-fx-background-color: #61c9e0; -fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold;");
        nextButton.setTranslateY(113);
        nextButton.setTranslateX(650);

        nextButton.setOnAction(e -> {
            WelcomePage wp = new WelcomePage();
            FrontPage.fronStage.setScene(wp.getWelcomePageScene());

        });
        VBox vBox = new VBox(shopImageView, nextButton);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: " +
    "linear-gradient(to bottom right, " +
    "#61c9e0 0%, " +      
    "#98a0cd 30%, " +     
    "#9783af 55%, " +     
    "#ab814a 78%, " +     
    "#c6a515 100%); ");

        fourthScene = new Scene(vBox, 1550, 800);

        return fourthScene;
    }
}
