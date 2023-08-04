package com.example.proyecto_parcial_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] food = {"Pizza", "Hamburguesa", "Hot Dog", "Tacos", "Torta"};

    @FXML
    private ChoiceBox comboBox;


    @FXML
    private Label Lblue;
    @FXML
    private Label Lred;
    @FXML
    private Label Lgreen;
    @FXML
    private Label Lyellow;

    @FXML
    private Button btncolor;

    @FXML
    private TextField textUser;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private void eventKey(KeyEvent event){

    }

    @FXML
    private void eventAction(ActionEvent event) throws Exception{
        String User = textUser.getText();
        String correctUser = "admin";

        String password = txtPassword.getText();
        String correctPassword = "12345";
        boolean isValidPassword = password.equals(correctPassword) && User.equals(correctUser);

        // Imprimir el resultado en la consola
        if (isValidPassword) {
            System.out.println("Usuario válida.");


            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("choicebox.fxml"));
            //ventanacontroller controller = fxmlLoader.getController();
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root, 600, 400);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
           /*
            stage.setOnCloseRequest(e -> controller.closeWindows());
            Stage myStage = (Stage) this.btnLogin.getScene().getWindow();
            myStage.close();*/
        } else {
            System.out.println("Usuario inválida.");
        }

            }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::getFood);*/

    }

    public void getFood(ActionEvent event){
        String food = myChoiceBox.getValue();
        myLabel.setText(food);
    }


}


