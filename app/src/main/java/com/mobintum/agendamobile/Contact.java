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

    public Contact(String name, String email, String phone, Drawable picture) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.picture = picture;
    }

    public static ArrayList<Contact> getData(Context context){

        ArrayList<Contact> arrayContact = new ArrayList<Contact>();

        Contact juanCarlos = new Contact("Juan Carlos Martinez Avalos","jcmtza611@gmail.com","5591988868",context.getResources().getDrawable(R.mipmap.pic_juan));
        Contact christian = new Contact("Christian Jesus Rodriguez Martinez", "jesusrdzmtzm@gmail.com", "5538753188",context.getResources().getDrawable(R.mipmap.pic_christian));
        Contact alex = new Contact("Alejandro Xochihua Jorge", "alexochihua23@gmail.com","5560116967", context.getResources().getDrawable(R.mipmap.pic_alex));
        Contact genaro = new Contact("Genaro Rodriguez", "grodriguezm@redcibercom.com.mx", "5528982474", context.getResources().getDrawable(R.mipmap.pic_genaro));
        Contact ricardo = new Contact("Ricardo Centeno", "ricardo.celj@gmail.com", "5514382887", context.getResources().getDrawable(R.mipmap.pic_ricardo));

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
}