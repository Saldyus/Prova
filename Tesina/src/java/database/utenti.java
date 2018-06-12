/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import javax.validation.constraints.Size;

/**
 *
 * @author salva
 */
public class utenti {
    
    @Size(max = 30)
    private String username; 
    
    @Size(max = 100)
    private String password;

    /**
     * 
     * @param username The username use to acces the site
     * @param password The password of user
     */
    public utenti(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * The blank constructor
     */
    public utenti() {
    }    
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
