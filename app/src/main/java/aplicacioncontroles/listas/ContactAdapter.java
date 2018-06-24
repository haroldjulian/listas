package aplicacioncontroles.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by user on 17/06/2018.
 */

public class ContactAdapter  extends ArrayAdapter<Contact>{

    //public ContactAdapter(Context context, int resource, List<Contact> objects) {
    //super(context, resource, objects);
    public ContactAdapter(Context context, List<Contact> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null)
        {
            v =LayoutInflater.from(getContext()).inflate(R.layout.row_contacts,null);
        }

        //View v = LayoutInflater.from(getContext()).inflate(R.layout.row_contacts,null);
        TextView lblNameContact = (TextView) v.findViewById(R.id.lblNameContact);
        TextView lblStatus = (TextView) v.findViewById(R.id.lslStatusContact);
        TextView lblDevice = (TextView) v.findViewById(R.id.lblDevice);

        ImageView imgContact = (ImageView) v.findViewById(R.id.imgContact);

        lblNameContact.setText(getItem(position).getNombres());
        lblStatus.setText(getItem(position).getStatus());
        lblDevice.setText(getItem(position).getDevice());

        Picasso.with(getContext()).load(getItem(position).getPhoto()).into(imgContact);
        return v;
    }
}
