package com.example.mychat;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

@PrimaryKey(autoGenerate = true)


private String username;
private  String nickname;
private int profilePicture;

    public User() {
        this.profilePicture = R.drawable.pic1;
    }


    public User(String username, String nickname, int profilePicture) {
        this.username = username;
        this.nickname = nickname;
        this.profilePicture = profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(int profilePicture) {
        this.profilePicture = profilePicture;
    }
}
