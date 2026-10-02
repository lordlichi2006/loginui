/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dami.loginui.dao;

import com.dami.loginui.models.User;
import java.util.List;

/**
 *
 * @author Ekaitz.Rivero
 */
public interface UserDAO {

    User findByEmail(String email);

    List<User> getAll();

    List<User> getAllBelowRole(String role);
}
