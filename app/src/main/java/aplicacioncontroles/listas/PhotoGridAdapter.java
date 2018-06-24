package aplicacioncontroles.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by user on 17/06/2018.
 */

public class PhotoGridAdapter extends ArrayAdapter<String> {
    //public PhotoGridAdapter(Context context, int resource, List<String> objects) {
    public PhotoGridAdapter(Context context,  List<String> objects) {
//        super(context, resource, objects);
        super(context, android.R.layout.simple_list_item_1, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
     //   return super.getView(position, convertView, parent);
        View fila = LayoutInflater.from(getContext()).inflate(R.layout.fila_photo_grid,null);
        ImageView photo = (ImageView) fila.findViewById(R.id.imgPhoto);
        //photo.setImageResource(R.mipmap.ic_launcher);
        //Picasso.get().load(getItem(position)).into(photo);
        Picasso.with(getContext()).load(getItem(position)).into(photo);

        return fila;

    }
}
