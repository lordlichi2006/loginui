/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dami.loginui.dao;

import java.util.ArrayList;
import java.util.List;

import com.dami.loginui.exception.LoginException;
import com.dami.loginui.models.Role;
import com.dami.loginui.models.User;

/**
 *
 * @author Ekaitz.Rivero
 */
public class UserDAOImplStatic implements UserDAO {

    private ArrayList<User> users = new ArrayList<>();

    public UserDAOImplStatic() {
        users.add(new User("admin", "admin@admin.com", "admin", Role.ADMIN));
        users.add(new User("John Doe", "john@email.com", "1234", Role.ADMIN));
        users.add(new User("Jane Doe", "jane@email.com", "abcd", Role.ADMIN));
        users.add(new User("Bob Smith", "bob@email.com", "password", Role.ADMIN));
        users.add(new User("Alice Smith", "alice@email.com", "qwerty", Role.TEACHER));
        users.add(new User("Charlie Brown", "charlie@email.com", "charlie123", Role.TEACHER));
        users.add(new User("David Wilson", "david@email.com", "david123", Role.TEACHER));
        users.add(new User("Emma Johnson", "emma@email.com", "emma123", Role.USER));
        users.add(new User("Frank Miller", "frank@email.com", "frank123", Role.USER));
        users.add(new User("Grace Davis", "grace@email.com", "grace123", Role.USER));
    }

    public User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }

        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public List<User> getAllBelowRole(Role role) {

        List<User> result = new ArrayList<>();
        Role[] rolesBelow;

        switch (role) {
            case USER:
                rolesBelow = new Role[] {};
                break;

            case TEACHER:
                rolesBelow = new Role[] { Role.USER };
                break;

            case ADMIN:
                rolesBelow = new Role[] { Role.USER, Role.TEACHER };
                break;

            default:
                return result;
        }

        for (User user : users) {
            for (Role roleBelow : rolesBelow) {
                if (user.getRole() == roleBelow) {
                    result.add(user);
                    break;
                }
            }
        }

        return result;
    }

    @Override
    public User login(String email, String password) throws LoginException {

        User user = findByEmail(email);

        if (user == null || !user.getPassword().equals(password)) {
            throw new LoginException("The email or password submitted is incorrect.");
        }

        User loggedUser = new User(
                user.getName(),
                user.getEmail(),
                null,
                user.getRole());

        return loggedUser;
    }
}