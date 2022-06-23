package com.example.mychat;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

@PrimaryKey(autoGenerate = true)


private String username;
private  String email;
private int profilePicture;

    public User() {
        this.profilePicture = R.drawable.pic1;
    }

    public User(String username, String email, int profilePicture) {
        this.username = username;
        this.email = email;
        this.profilePicture = profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(int profilePicture) {
        this.profilePicture = profilePicture;
    }
}
