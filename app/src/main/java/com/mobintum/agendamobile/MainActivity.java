package com.mobintum.agendamobile;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    ListView listContacts;
    ArrayList<Contact> arrayContact;
    ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listContacts = (ListView) findViewById(R.id.listContacts);
        arrayContact = new ArrayList<Contact>();


        Contact juanCarlos = new Contact("Juan Carlos Martinez Avalos","jcmtza611@gmail.com","5591988868",getResources().getDrawable(R.mipmap.pic_juan));
        Contact christian = new Contact("Christian Jesus Rodriguez Martinez", "jesusrdzmtzm@gmail.com", "5538753188", getResources().getDrawable(R.mipmap.pic_christian));
        Contact alex = new Contact("Alejandro Xochihua Jorge", "alexochihua23@gmail.com","5560116967", getResources().getDrawable(R.mipmap.pic_alex));
        Contact genaro = new Contact("Genaro Rodriguez", "grodriguezm@redcibercom.com.mx", "5528982474", getResources().getDrawable(R.mipmap.pic_genaro));
        Contact ricardo = new Contact("Ricardo Centeno", "ricardo.celj@gmail.com", "5514382887", getResources().getDrawable(R.mipmap.pic_ricardo));

        arrayContact.add(juanCarlos);
        arrayContact.add(christian);
        arrayContact.add(alex);
        arrayContact.add(genaro);
        arrayContact.add(ricardo);

        adapter = new ContactAdapter(getApplicationContext(),R.layout.item_list_contact,arrayContact);

        listContacts.setAdapter(adapter);
        listContacts.setOnItemClickListener(new );


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
