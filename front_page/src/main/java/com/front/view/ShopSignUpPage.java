package com.front.view;


import java.time.format.SignStyle;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class  ShopSignUpPage  {


    private Scene ShopSignUpPageScene;

    public Scene getShopSignUpScene(Runnable backOnAction){

    

        Image backImage = new Image("assets/images/background_img_signup.png");
        ImageView imageviewback = new ImageView(backImage);

        Image SignUpImage = new Image("assets/icons/signup icons.png");
        ImageView imageviewSignUp = new ImageView(SignUpImage);
        imageviewSignUp.setFitWidth(180);
        imageviewSignUp.setFitHeight(170);
        imageviewSignUp.setTranslateX(100);
        imageviewSignUp.setTranslateY(-50);

       imageviewSignUp.setStyle(
        "-fx-fill: linear-gradient(to bottom right, #008CFF, #8A24FF);"
       );

       

        Text text1 = new Text("Create Your Account");
        text1.setStyle("-fx-fill: #ffffff; -fx-font-size:40px");
        text1.setTranslateX(20);
        text1.setTranslateY(-50);

        Text text2 = new Text("Fill in the deatils below to sign up");
        text2.setStyle("-fx-fill: #ffffff; -fx-font-size:20px");
        text2.setTranslateX(50);
        text2.setTranslateY(-45);

        Label namelLabel = new Label("Full Name");
        namelLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold; ");
        namelLabel.setTranslateX(0);
        namelLabel.setTranslateY(-40);

        TextField nameTextField = new TextField();
        nameTextField.setPromptText("👤 Enter your name");
        nameTextField.setFocusTraversable(false);
        nameTextField.setTranslateY(-40);

        Label contactLabel = new Label("Contact Number");
        contactLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold; ");
        contactLabel.setTranslateX(0);
        contactLabel.setTranslateY(-20);

        TextField contactTextField = new TextField();
        contactTextField.setPromptText("📱 Enter your contact number");
        contactTextField.setFocusTraversable(false);
        contactTextField.setTranslateY(-20);

        Label emailLabel = new Label("Email Address");
        emailLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold; ");
        emailLabel.setTranslateX(0);
        emailLabel.setTranslateY(0);

        TextField emailTextField = new TextField();
        emailTextField.setPromptText("✉️Enter your email address");
        emailTextField.setFocusTraversable(false);
        emailTextField.setTranslateY(0);

        Label passwordLabel = new Label("Password");
        passwordLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold; ");
        passwordLabel.setTranslateX(0);
        passwordLabel.setTranslateY(10);

        PasswordField password = new PasswordField();
        password.setPromptText("🔒 Enter your Password");
        password.setFocusTraversable(false);
        password.setTranslateY(10);


        Label confirmpasswordLabel = new Label("Confirm Password");
        confirmpasswordLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold; ");
        confirmpasswordLabel.setTranslateX(0);
        confirmpasswordLabel.setTranslateY(30);

        PasswordField confirmpassword = new PasswordField();
        confirmpassword.setPromptText("🔒 Confirm your Password");
        confirmpassword.setFocusTraversable(false);
        confirmpassword.setTranslateY(30);
        
        CheckBox checkBox = new CheckBox();
        checkBox.setText("I agree to the");
        checkBox.setTranslateY(50);
        checkBox.setTranslateX(10);
        checkBox.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 14;" +
                        "-fx-font-weight: bold;"
        );

        Text bluetext = new Text("Terms of Service");
        bluetext.setUnderline(true);
        bluetext.setTranslateY(50);
        bluetext.setTranslateX(15);
        bluetext.setStyle(
                "-fx-fill: Blue;" +
                        "-fx-font-size: 14;" +
                        "-fx-font-weight: bold;"
        );

        Text andText = new Text();
        andText.setText("and");
        andText.setTranslateY(50);
        andText.setTranslateX(20);
        andText.setStyle(
                "-fx-fill: white;" +
                        "-fx-font-size: 14;" +
                        "-fx-font-weight: bold;"
        );

        Text bluetext1 = new Text("Privacy Policy");
        bluetext1.setUnderline(true);
        bluetext1.setTranslateY(50);
        bluetext1.setTranslateX(25);
        bluetext1.setStyle(
                "-fx-fill: Blue;" +
                        "-fx-font-size: 14;" +
                        "-fx-font-weight: bold;"
        );

        HBox checkhb = new HBox(checkBox,bluetext,andText,bluetext1);

        Button SignButton = new Button();
        SignButton.setText("Register Now → ");
        SignButton.setPrefSize(340, 40);
        SignButton.setTranslateX(30);
        SignButton.setTranslateY(70);
        SignButton.setStyle(
                "-fx-background-color: #b4f4e6;" +
                        "-fx-text-fill: black;" +
                        "-fx-font-size: 16;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 15;"
        );

        Text lastText = new Text("Already have an account? ");
        lastText.setStyle("-fx-font-size: 14px; -fx-fill: white; -fx-font-weight: bold; ");


        Hyperlink LoginLink = new Hyperlink("Login");    
        LoginLink.setStyle("-fx-text-fill: #42b3d2; -fx-font-size: 14px; -fx-font-weight: bold; ");
        LoginLink.setOnAction(e ->{
            backOnAction.run();
        });      

        HBox LoginContainer = new HBox(5);
        LoginContainer.setAlignment(Pos.CENTER);
        LoginContainer.getChildren().addAll(lastText, LoginLink);
        LoginContainer.setTranslateY(90);



        VBox SignUpBox = new VBox(imageviewSignUp,text1,text2,namelLabel,nameTextField,contactLabel,contactTextField,emailLabel,emailTextField,passwordLabel,password,confirmpasswordLabel,confirmpassword,checkhb,SignButton,LoginContainer);  
        SignUpBox.setPadding(new Insets(45, 55, 40, 55));
        SignUpBox.setTranslateX(440);
        SignUpBox.setTranslateY(0);
        SignUpBox.setPrefSize(400, 750);
        SignUpBox.setMaxWidth(450);
        SignUpBox.setMaxHeight(750);

        SignUpBox.setStyle(
                "-fx-background-color: rgba(2, 8, 13, 0.72);" +
                "-fx-background-radius: 28;" +
                "-fx-border-color: rgba(255,255,255,0.35);" +
                "-fx-border-width: 1;" +
                "-fx-border-radius: 28;"
        );


        StackPane root = new StackPane();
        root.getChildren().addAll(imageviewback,SignUpBox);




        ShopSignUpPageScene = new Scene(root,1550,800);

        return(ShopSignUpPageScene);
        }
}

        
        

        

        

        
    
    


