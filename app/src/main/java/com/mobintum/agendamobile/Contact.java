package com.mobintum.agendamobile;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by Rick on 25/03/15.
 */
public class Contact {

    private String name;
    private String email;
    private String phone;
    private Drawable picture;
    private String github;
    private String twitter;
    private String facebook;

    public Contact(String name, String email, String phone, Drawable picture, String github, String twitter, String facebook) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.picture = picture;
        this.github = github;
        this.twitter = twitter;
        this.facebook = facebook;
    }

    public static ArrayList<Contact> getData(Context context){

        ArrayList<Contact> arrayContact = new ArrayList<Contact>();

        Contact juanCarlos = new Contact("Juan Carlos Martinez Avalos","jcmtza611@gmail.com","5591988868",context.getResources().getDrawable(R.mipmap.pic_juan), null, null, null);
        Contact christian = new Contact("Christian Jesus Rodriguez Martinez", "jesusrdzmtzm@gmail.com", "5538753188",context.getResources().getDrawable(R.mipmap.pic_christian), "jesusrdzmtzm", "jesusrdzmtzm","1154932578");
        Contact alex = new Contact("Alejandro Xochihua Jorge", "alexochihua23@gmail.com","5560116967", context.getResources().getDrawable(R.mipmap.pic_alex), "lennux23", "axj_lennux@hotmail.com", "100000972018165");
        Contact genaro = new Contact("Genaro Rodriguez", "grodriguezm@redcibercom.com.mx", "5528982474", context.getResources().getDrawable(R.mipmap.pic_genaro), "", null, "genaro_satto@hotmail.com");
        Contact ricardo = new Contact("Ricardo Centeno", "ricardo.celj@gmail.com", "5514382887", context.getResources().getDrawable(R.mipmap.pic_ricardo),"rickstart", "rickstart","100001865514717");

        arrayContact.add(juanCarlos);
        arrayContact.add(christian);
        arrayContact.add(alex);
        arrayContact.add(genaro);
        arrayContact.add(ricardo);

        return arrayContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

}