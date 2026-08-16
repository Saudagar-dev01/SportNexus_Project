package com.front.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ShopLoginPage {
    private Scene shopLoginScene;

    public Scene getShopLoginScene(Runnable backHomepageAction) {

        Button backButton = new Button("⏪ Back");
        backButton.setStyle("-fx-background-color: #22cfb8; -fx-text-fill: black; -fx-font-size: 16px; -fx-font-weight: bold;");
        backButton.setTranslateY(-363);
        backButton.setTranslateX(-715);

        backButton.setOnAction(e -> {
            backHomepageAction.run();
        });

        Text headerText = new Text("Welcome Shopkeeper!");
        headerText.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-fill: white;");
           
        

        Text title = new Text("Login ");
        title.setStyle("-fx-font-size: 24px; -fx-fill: white; -fx-font-weight: bold; ");
        title.setTranslateY(5);


        Label emailLabel = new Label("Your Email");
        emailLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold; ");
        emailLabel.setTranslateY(10);
       
        TextField email = new TextField();
        email.setPromptText("Enter your Email");  
        email.focusedProperty().addListener((obs, oldValue, newValue) -> {
                if(newValue) {
                        email.setPromptText(" ");
                }else  if(email.getText().isEmpty()) {
                        email.setPromptText("Enter your Email");
                }
        });
      
        email.setStyle(  "-fx-background-color: rgba(255,255,255,0.12);" +
                "-fx-text-fill: white;" +
                "-fx-prompt-text-fill: #b8c7d9;" +
                "-fx-font-size: 16;" +
                "-fx-background-radius: 15;" +
                "-fx-border-color: rgba(255,255,255,0.25);" +
                "-fx-border-radius: 15;"
        );
        email.setMaxWidth(340);
        email.setAlignment(Pos.CENTER);

        Label passwordLabel = new Label("Your Password");
        passwordLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold; ");
        passwordLabel.setTranslateY(5);

        PasswordField password = new PasswordField();
        password.setPromptText("Enter your Password");
        
        password.focusedProperty().addListener((obs, oldValue, newValue) -> {
                if(newValue) {
                        password.setPromptText(" ");
                }else  if(password.getText().isEmpty()) {
                        password.setPromptText("Enter your Password");
                }
        });

        password.setStyle(
                "-fx-background-color: rgba(255,255,255,0.12);" +
                        "-fx-text-fill: white;" +
                        "-fx-prompt-text-fill: #b8c7d9;" +
                        "-fx-font-size: 16;" +
                        "-fx-background-radius: 15;" +
                        "-fx-border-color: rgba(255,255,255,0.25);" +
                        "-fx-border-radius: 15;"
        );
        password.setMaxWidth(340);
        password.setAlignment(Pos.CENTER);

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        
        Hyperlink forgotPasswordLink = new Hyperlink("Forgot Password?");
        forgotPasswordLink.setStyle(
                "-fx-text-fill: #42b3d2;" +
                        "-fx-font-size: 14;" +
                        "-fx-font-weight: bold;"
        );
        

        HBox checkBoxContainer = new HBox(10);
        checkBoxContainer.getChildren().addAll(spacer, forgotPasswordLink);

        Button loginButton = new Button();
        loginButton.setText("→Login");
        loginButton.setPrefSize(340, 40);
        loginButton.setStyle(
                "-fx-background-color: #b4f4e6;" +
                        "-fx-text-fill: black;" +
                        "-fx-font-size: 16;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 15;"
        );

        Label orLabel = new Label("  ──────────  OR  ──────────  ");
        orLabel.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 14;" +
                        "-fx-font-weight: bold;"
        );

        Button googleLoginButton = new Button();
        googleLoginButton.setText("Continue with Google");
        googleLoginButton.setPrefSize(340, 40);
        googleLoginButton.setStyle(
                "-fx-background-color: #4285F4;" +
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 16;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 15;"
        );

        Text signUpText = new Text("Don't have an account? ");
        signUpText.setStyle("-fx-font-size: 14px; -fx-fill: white; -fx-font-weight: bold; ");


        Hyperlink signUpLink = new Hyperlink("Sign Up");    
        signUpLink.setStyle("-fx-text-fill: #42b3d2; -fx-font-size: 14px; -fx-font-weight: bold; ");  
        signUpLink.setOnAction(e ->{
                ShopSignUpPage shopSignUpPage = new ShopSignUpPage() ;

                Runnable backOnAction = new Runnable() {
                        public void run(){
                                backOnLoginPage();
                        }
                };
                FrontPage.fronStage.setScene(shopSignUpPage.getShopSignUpScene(backOnAction));
        });    

        HBox signUpContainer = new HBox(5);
        signUpContainer.setAlignment(Pos.CENTER);
        signUpContainer.getChildren().addAll(signUpText, signUpLink);

        VBox loginBox = new VBox(20);
        loginBox.setPadding(new Insets(45, 55, 40, 55));
        loginBox.setTranslateX(440);
        loginBox.setTranslateY(30);
        loginBox.setPrefSize(400, 600);
        loginBox.setMaxWidth(450);
        loginBox.setMaxHeight(600);
        


        loginBox.setStyle(
                "-fx-background-color: rgba(10, 40, 65, 0.72);" +
                "-fx-background-radius: 28;" +
                "-fx-border-color: rgba(255,255,255,0.35);" +
                "-fx-border-width: 1;" +
                "-fx-border-radius: 28;"
        );

        loginBox.getChildren().addAll(headerText,title,emailLabel,email,passwordLabel,password,checkBoxContainer,loginButton,orLabel,googleLoginButton,signUpContainer);

        Image loginImage = new Image("assets\\images\\ShopBackgroundImg.jpeg");
        ImageView loginImageView = new ImageView(loginImage);
        


        StackPane root = new StackPane();
        root.getChildren().addAll(loginImageView, backButton, loginBox);
        
        
        shopLoginScene = new Scene(root,1550,800);

        return shopLoginScene;
    }

    private void backOnLoginPage(){
        FrontPage.fronStage.setScene(shopLoginScene);
    }
}
