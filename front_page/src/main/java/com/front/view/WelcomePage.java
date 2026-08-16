package com.front.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WelcomePage{

    public static Stage welcomePageStage;

    private Scene welcomePageScene;

    public Scene getWelcomePageScene() {

        Image backImage = new Image("assets\\images\\backimgewelocme.jpeg");
        ImageView imageviewback = new ImageView(backImage);

        Text welcomePage = new  Text("Welcome To SportNexus");
        welcomePage.setStyle(" -fx-fill:#ffffff;-fx-effect: dropshadow(gaussian, #091161, 8, 0.7, 2, 2); -fx-font-size:55px; -fx-font-weight:bold");
        welcomePage.setTranslateX(490);
        welcomePage.setTranslateY(160);


        Image userimg = new Image("assets\\icons\\user login.png");
        ImageView imageviewuser = new ImageView(userimg);
        imageviewuser.setFitWidth(100);
        imageviewuser.setFitHeight(100);
        imageviewuser.setTranslateX(530);
        imageviewuser.setTranslateY(230);

        Button userbtn = new Button("User Login");
        userbtn.setTranslateX(525);
        userbtn.setTranslateY(250);
        userbtn.setStyle(
            "-fx-background-color: linear-gradient(to bottom right, #00A8FF, #0047FF);" +
            "-fx-background-radius: 25;" +
            "-fx-border-color: #66E6FF;" +
            "-fx-border-width: 3;" +
            "-fx-border-radius: 25;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 18px;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;"
        );

        userbtn.setOnAction(e -> {
            UserLoginPage userLoginPage = new UserLoginPage();
            Runnable backOnHomePage = new Runnable() {
                @Override
                public void run() {
                    goToWelcomePage();
                }
            };
            FrontPage.fronStage.setScene(userLoginPage.getUserLoginScene(backOnHomePage));
        });

        Image shopimg = new Image("assets\\icons\\shop.png");
        ImageView imageviewshop = new ImageView(shopimg);
        imageviewshop.setFitWidth(100);
        imageviewshop.setFitHeight(100);
        imageviewshop.setTranslateX(740);
        imageviewshop.setTranslateY(90);

        Button shopbtn = new Button("Shop Login");
        shopbtn.setTranslateX(731);
        shopbtn.setTranslateY(105);
        shopbtn.setStyle(
            "-fx-background-color: linear-gradient(to bottom right, #22C55E, #047857);" +
            "-fx-background-radius: 20;" +
            "-fx-border-color: #86EFAC;" +
            "-fx-border-width: 2;" +
            "-fx-border-radius: 20;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 18px;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;"
        );

        shopbtn.setOnAction(e -> {
            ShopLoginPage shopLoginPage = new ShopLoginPage();
            Runnable backOnHomePage = new Runnable() {
                @Override
                public void run() {
                    goToWelcomePage();
                }
            };
            FrontPage.fronStage.setScene(shopLoginPage.getShopLoginScene(backOnHomePage));
        });

        Image adminimg = new Image("assets\\icons\\admin login.png");
        ImageView imageviewadmin = new ImageView(adminimg);
        imageviewadmin.setFitWidth(100);
        imageviewadmin.setFitHeight(100);
        imageviewadmin.setTranslateX(950);
        imageviewadmin.setTranslateY(-50);

        Button adminbtn = new Button("Admin Login");
        adminbtn.setTranslateX(930);
        adminbtn.setTranslateY(-35);
        adminbtn.setStyle(
            "-fx-background-color: linear-gradient(to bottom right, #7C3AED, #4C1D95);" +
            "-fx-background-radius: 20;" +
            "-fx-border-color: #D8B4FE;" +
            "-fx-border-width: 2;" +
            "-fx-border-radius: 20;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 18px;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;"
        );


        adminbtn.setOnAction(e -> {
            AdminPageLogin adminPageLogin = new AdminPageLogin();
             Runnable backOnHomePage = new Runnable() {
                @Override
                public void run() {
                    goToWelcomePage();
                }
            };
            FrontPage.fronStage.setScene(adminPageLogin.getAdminLoginScene(backOnHomePage));
        });

        VBox vBox = new VBox(welcomePage,imageviewuser,userbtn,imageviewshop,shopbtn,imageviewadmin,adminbtn);
       
        StackPane root = new StackPane();
        root.getChildren().addAll(imageviewback , vBox);

        welcomePageScene = new Scene(root,1550,800);

        return (welcomePageScene);
    }
    
    private void goToWelcomePage() {
        WelcomePage welcomePage = new WelcomePage();
        FrontPage.fronStage.setScene(welcomePage.getWelcomePageScene());
    }
}
