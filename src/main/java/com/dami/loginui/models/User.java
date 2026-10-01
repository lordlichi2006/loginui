package com.dami.loginui.models;

/**
 * User model 
 */
public class User{
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
     * @return String
     */
    public String getName() {
        return name;
    }
    /** 
     * Sets the name of the {@link User}
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /** 
     * Gets the email of the {@link User}.
     * @return String
     */
    public String getEmail() {
        return email;
    }
    /** 
     * Sets the email of the {@link User}.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /** 
     * Gets the password of the {@link User}.
     * @return String
     */
    public String getPassword() {
        return password;
    }
    /** 
     * Sets the password of the {@link User}.
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /** 
     * Gets the role of the {@link User}.
     * @return Role
     */
    public Role getRole() {
        return role;
    }
    /** 
     * Sets the role of the {@link User}.
     * @param role
     */
    public void setRole(Role role) {
        this.role = role;
    }
    /** 
     * Gets a pretty printed version of the {@link User;
     * @return String
     */
    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", role=" + role + "]";
    }
    
    
}
