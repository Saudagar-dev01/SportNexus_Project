package com.front.view;

import javafx.util.Duration;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;

import javafx.animation.ScaleTransition;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;

//import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.VBox;

import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class FrontPage extends Application{

    public static Stage fronStage;

    Rectangle2D screen = Screen.getPrimary().getVisualBounds();

    @Override
    public void start(Stage stage) throws Exception {

        fronStage = stage;

        Image logo = new Image("assets\\images\\last_logo_img.png");
        ImageView logoView = new ImageView(logo);
        logoView.setFitHeight(800);
        logoView.setFitWidth(600);
        logoView.setPreserveRatio(true);

        logoView.setScaleX(0.1);
        logoView.setScaleY(0.1);
        logoView.setOpacity(0);

        ScaleTransition scale = new ScaleTransition(Duration.millis(2000), logoView);

        scale.setFromX(0.1);
        scale.setFromY(0.1);

        scale.setToX(1);
        scale.setToY(1);

        scale.setInterpolator(Interpolator.EASE_OUT);

        FadeTransition fade =new FadeTransition(Duration.millis(2000),logoView);

        fade.setFromValue(0);
        fade.setToValue(1);

        ParallelTransition popUp =new ParallelTransition(scale,fade);

        popUp.play();
        
        Text text = new Text("Welcome To SportNexus");
        text.setStyle("-fx-fill : white; -fx-font-weight : bold; -fx-font-size : 54px"); 

        Button nextButton = new Button("Skip >>");
        nextButton.setStyle("-fx-background-color: #5ca8b9; -fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight : bold");
        nextButton.setAlignment(Pos.BOTTOM_RIGHT);
        nextButton.setTranslateX(700);
        nextButton.setOnAction(e -> {
            SecondPage sp = new SecondPage();
            Scene secondScene = sp.getSecondScene();
            fronStage.setScene(secondScene);
        });

        VBox vBox = new VBox(10,logoView, text, nextButton);
        vBox.setStyle("-fx-background-color: " +
            "linear-gradient(to bottom right, " +
            "#61c9e0 0%, " +      // Light Cyan
            "#98a0cd 30%, " +     // Soft Blue
            "#9783af 55%, " +     // Light Purple
            "#ab814a 78%, " +     // Soft Peach
            "#c6a515 100%); ");

        vBox.setAlignment(Pos.CENTER);

        
        Scene scene = new Scene(vBox, 1550, 800);
        fronStage.setScene(scene);
        fronStage.setTitle("Front Page");
        fronStage.show();

        FadeTransition textFade = new FadeTransition(
            Duration.seconds(8),
            text
        );

        textFade.setFromValue(0);
        textFade.setToValue(1);

        textFade.setInterpolator(Interpolator.EASE_IN);

        textFade.play();
            }
        }
    

