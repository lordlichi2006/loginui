/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dami.loginui;

import java.net.URL;
import java.util.ResourceBundle;

import com.dami.loginui.models.User;

import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author LordL
 */
public class UserDataController implements Initializable {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO: Get users role, use getUsersbelowRole to display users in table
    }

}
