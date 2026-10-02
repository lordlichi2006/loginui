package com.dami.loginui.models;

/**
 * User model
 */
public class User implements Comparable {

    private String name;
    private String email;
    private String password;
    private Role role;

    public User() {
        this.name = "";
        this.email = "";
        this.password = "";
        this.role = Role.USER;
    }

    public User(String name, String email, String password, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    /**
     * Gets the name of the {@link User}
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the {@link User}
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the email of the {@link User}.
     *
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the {@link User}.
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the password of the {@link User}.
     *
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the {@link User}.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the role of the {@link User}.
     *
     * @return Role
     */
    public Role getRole() {
        return role;
    }

    /**
     * Sets the role of the {@link User}.
     *
     * @param role
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Checks if this users credentials match
     *
     * @param email
     * @param password
     *
     * @return bool
     */
    public boolean credentialsMatch(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    /**
     * Gets a pretty printed version of the {@link User;
     *
     * @return String
     */
    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", role=" + role + "]";
    }

    @Override
    public int compareTo(Object o) {
        User other = (User) o;

        return other.name.compareTo(this.name);

    }

}
