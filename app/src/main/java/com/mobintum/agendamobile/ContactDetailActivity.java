package com.mobintum.agendamobile;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class ContactDetailActivity extends ActionBarActivity implements View.OnClickListener{

    int contactPosition;
    Contact contact;
    ImageButton actionCall, actionEmail;

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
        actionCall = (ImageButton) findViewById(R.id.actionCall);
        actionEmail = (ImageButton) findViewById(R.id.actionEmail);

        actionCall.setOnClickListener(this);
        actionEmail.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {


        switch(v.getId()){
            case R.id.actionCall:
                Log.e("INETNT", "CALL");
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String uri = "tel:" + contact.getPhone();

                callIntent.setData(Uri.parse(uri));
                if(isAvailable(getApplicationContext(),callIntent))
                startActivity(callIntent);
                else
                    Toast.makeText(getApplicationContext(),"HARWARE NOT AVAILABLE", Toast.LENGTH_LONG).show();

                break;
            case R.id.actionEmail:
                Log.e("INETNT", "email");
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", contact.getEmail(), null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "EXTRA_SUBJECT");

                if(isAvailable(getApplicationContext(),emailIntent))
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
                else
                    Toast.makeText(getApplicationContext(),"HARWARE NOT AVAILABLE", Toast.LENGTH_LONG).show();

                break;
        }
    }

    public static boolean isAvailable(Context ctx, Intent intent) {
        final PackageManager mgr = ctx.getPackageManager();
        List<ResolveInfo> list =
                mgr.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() > 0;
    }
}
