package com.charliea.homeshareapp;

import android.graphics.Bitmap;

import java.util.Date;

//NOTES:
// createInvitation and createResponse dependent on respective
// class constructors (changes to either must be considered carefully)

public class User {
    private int id;
    private String email;
    private String name;
    private String password;
    private Bitmap picture;

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }

    //incomplete
    public Invitation createInvitation(){
        Invitation inv = new Invitation();
        return inv;
    };

    public Response createResponse(int invitationId, int userId, String message, Date timestamp){
        Response res = new Response(invitationId, userId, message, timestamp);
        return res;
    }
}
