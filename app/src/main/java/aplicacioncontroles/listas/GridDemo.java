package aplicacioncontroles.listas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class GridDemo extends Activity {

   // String[] urls = {"imagen 1","imagen 2","imagen 3", "imagen 4"};
    ArrayList<String> urls = new ArrayList<String>();
    GridView gridFotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_demo);
        gridFotos = (GridView) findViewById(R.id.gridFotos);
        urls.add("https://images-na.ssl-images-amazon.com/images/I/41kmcFsj33L.jpg");
        urls.add("https://amhistory.si.edu/militaryhistory/img/media/440_l.jpg");
        urls.add("http://www.nea.org/assets/img/content/RAA2014PosterThumb.jpg");
        urls.add("https://i.pinimg.com/originals/2f/4d/2e/2f4d2e7eb9e448ef6aa86fd54d0ebdb6.jpg");
        urls.add("https://i.ebayimg.com/images/g/IH4AAOSwgY9XeCAj/s-l300.jpg");
     //   ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
      //          android.R.layout.simple_list_item_1,urls);

        PhotoGridAdapter adapter = new PhotoGridAdapter(this, urls);
        gridFotos.setAdapter(adapter);
    }
}
