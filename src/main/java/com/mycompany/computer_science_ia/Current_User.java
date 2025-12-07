package com.mycompany.computer_science_ia;

/**
 *
 * @author antonportell
 */
public class Current_User {
    
    private static Current_User instance;
    public String username = "";
    public String password = "";
    public String email = "";
    public String imagePath = "";
    public int id = 0;
    public boolean admin = false;

    //To ensures only one instance exists throughout the application
    public static Current_User getInstance() {
        if (instance == null) {
            instance = new Current_User();
        }
        return instance;
    }
    
    //Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}