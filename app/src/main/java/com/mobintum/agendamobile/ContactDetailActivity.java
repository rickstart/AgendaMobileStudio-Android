package com.mobintum.agendamobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ContactDetailActivity extends ActionBarActivity {

    int contactPosition;
    Contact contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);
        Intent intent = getIntent();
        contactPosition = intent.getIntExtra("CONTACT", 0);
        contact = Contact.getData(getApplicationContext()).get(contactPosition);

        RoundedImageView profileImage = (RoundedImageView) findViewById(R.id.profileImage);
        TextView textNameDetail = (TextView) findViewById(R.id.textNameDetail);
        TextView textPhone = (TextView) findViewById(R.id.textPhone);
        TextView textEmail = (TextView) findViewById(R.id.textEmail);
        profileImage.setImageDrawable(contact.getPicture());
        textNameDetail.setText(contact.getName());
        textPhone.setText(contact.getPhone());
        textEmail.setText(contact.getEmail());


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contact_detail, menu);
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
