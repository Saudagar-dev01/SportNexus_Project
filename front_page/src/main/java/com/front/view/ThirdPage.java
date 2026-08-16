package com.front.view;

import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


public class ThirdPage {
    
    private Scene thirdScene;

    public Scene getThirdScene() {

        Image tagLineImg = new Image("assets\\images\\thirdLogo.png");
        
        ImageView tagLineView  = new ImageView(tagLineImg);
        tagLineView.setFitHeight(800);
        tagLineView.setFitWidth(700);
        tagLineView.setPreserveRatio(true);
        tagLineView.setTranslateY(30);

        Button nextButton = new Button("Skip >>");
        nextButton.setStyle("-fx-background-color: #5ca8b9; -fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight : bold");
        nextButton.setTranslateY(108);
        nextButton.setTranslateX(700);

        nextButton.setOnAction(e -> {
            FourthPage fp = new FourthPage();
            Scene fourthScene = fp.getFourthScene();
            FrontPage.fronStage.setScene(fourthScene);
        });
        
        VBox secondVbox = new VBox(10, tagLineView, nextButton);
        secondVbox.setAlignment(Pos.CENTER);
        secondVbox.setStyle("-fx-background-color: " +
            "linear-gradient(to bottom right, " +
            "#61c9e0 0%, " +      
            "#98a0cd 30%, " +     
            "#9783af 55%, " +     
            "#ab814a 78%, " +     
            "#c6a515 100%); ");

        thirdScene = new Scene(secondVbox,1550,800);
        return thirdScene;
    }
}
