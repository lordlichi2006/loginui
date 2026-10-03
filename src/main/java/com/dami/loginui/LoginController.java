/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dami.loginui;

import com.dami.loginui.dao.UserDAO;
import com.dami.loginui.dao.UserDAOImplStatic;
import com.dami.loginui.exception.ValidationException;
import com.dami.loginui.models.Role;
import com.dami.loginui.models.User;
import com.dami.loginui.util.InputValidator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ekaitz.Rivero
 */
public class LoginController implements Initializable {

    private UserDAO userDAO;
    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button loginButton;
    @FXML
    private Label lblError;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userDAO = new UserDAOImplStatic();
    }

    @FXML
    private void login(ActionEvent event) {
        lblError.setText("");
        try {
            String email = InputValidator.validateEmail(txtEmail.getText());
            String password = InputValidator.validatePassword(txtPassword.getText());

            // if login is incorrect, it will throw an exception, past here the user has correctly logged in
            User loggedUser = userDAO.login(email, password);

            App.setRoot("UserDataView", loggedUser);

        } catch (Exception e) {
            String text = "⚠ " + e.getMessage();
            System.out.println(text);
            lblError.setText(text);

        }

    }

}
