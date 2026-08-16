package com.front.view;

import javafx.util.Duration;
import javafx.animation.Interpolator;
import javafx.animation.PauseTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Screen;

public class SecondPage {

    private Scene secondScene;

    public Scene getSecondScene() {

        Image tagLineImg = new Image("assets\\images\\secondPage_img.png");
        ImageView tagLineView  = new ImageView(tagLineImg);
        tagLineView.setFitHeight(800);
        tagLineView.setFitWidth(700);
        tagLineView.setPreserveRatio(true);
        tagLineView.setTranslateY(20);
        tagLineView.setTranslateX(70);

        Button nextButton = new Button("Skip >>");
        nextButton.setStyle("-fx-background-color: #5ca8b9; -fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight : bold");
        nextButton.setTranslateY(113);
        nextButton.setTranslateX(700);
        

        nextButton.setOnAction(e -> {
            ThirdPage tp = new ThirdPage();
            Scene thirdScene = tp.getThirdScene();
            FrontPage.fronStage.setScene(thirdScene);
        });

        VBox secondVbox = new VBox(tagLineView, nextButton);
        secondVbox.setStyle("-fx-background-color: " +
            "linear-gradient(to bottom right, " +
            "#61c9e0 0%, " +      // Light Cyan
            "#98a0cd 30%, " +     // Soft Blue
            "#9783af 55%, " +     // Light Purple
            "#ab814a 78%, " +     // Soft Peach
            "#c6a515 100%); ");
        secondVbox.setAlignment(Pos.CENTER);

    secondScene = new Scene(secondVbox, 1550, 800);

    
        return secondScene;
    }
}

    

