package com.mobintum.agendamobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rick on 25/03/15.
 */
public class ContactAdapter extends ArrayAdapter {
    ArrayList<Contact> contacts;
    Context context;

    public ContactAdapter(Context context, int resource, ArrayList<Contact> contacts) {
        super(context, resource, contacts);
        this.contacts = contacts;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_list_contact, parent, false);
        ViewHolder holder = new ViewHolder();

        holder.textName = (TextView) rowView.findViewById(R.id.textName);

        holder.imgPic = (ImageView) rowView.findViewById(R.id.imgPic);
        Contact contact = contacts.get(position);

        holder.textName.setText(contact.getName());

        holder.imgPic.setImageDrawable(contact.getPicture());

        //convertView.setTag(holder);
        return rowView;
    }


    static class ViewHolder{
        TextView textName;

        ImageView imgPic;
    }
}
