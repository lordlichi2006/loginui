package com.dami.loginui.exception;

/**
 * Thrown when the user login fails
 *
 * @author Brayan
 * @author Ekaitz
 * @author Aritz
 */
public class LoginException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception with a message.
     *
     * @param message the description of the invalid value
     */
    public LoginException(String message) {
        super(message);
    }

    /**
     * Creates the exception with a message and the original cause.
     *
     * @param message the description of the invalid value
     * @param cause   the original exception
     */
    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
