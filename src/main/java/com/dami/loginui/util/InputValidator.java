/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dami.loginui.util;

import com.dami.loginui.exception.ValidationException;

/**
 *
 * @author Ekaitz.Rivero
 */
public class InputValidator {

    private static final String EMAIL_REGEX = "[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+";
    public static final int PASSWD_MAX_LENGTH = 100;
    public static final int EMAIL_MAX_LENGTH = 100;

    /**
     * Validates an email address.
     *
     * @param email the raw email address
     * @return the trimmed email address in lower case
     * @throws ValidationException if it is empty, too long or malformed
     */
    public static String validateEmail(String email) throws ValidationException {
        String normalized = trim(email).toLowerCase();
        if (normalized.length() > EMAIL_MAX_LENGTH) {
            throw new ValidationException("The email field must have at most " + EMAIL_MAX_LENGTH + " characters.");
        }
        if (normalized.length() == 0) {
            throw new ValidationException("The email field must not be empty.");
        }
        if (!normalized.matches(EMAIL_REGEX)) {
            throw new ValidationException("The email field is not valid (for example name@example.com).");
        }
        return normalized;
    }

    public static String validatePassword(String password) throws ValidationException {
        String normalized = trim(password).toLowerCase();
        if (normalized.length() > PASSWD_MAX_LENGTH) {
            throw new ValidationException("The password must have at most " + PASSWD_MAX_LENGTH + " characters.");
        }
        if (normalized.length() == 0) {
            throw new ValidationException("The password field must not be empty.");
        }
        return normalized;

    }

    private static String trim(String value) {
        return value == null ? "" : value.trim();
    }
}
