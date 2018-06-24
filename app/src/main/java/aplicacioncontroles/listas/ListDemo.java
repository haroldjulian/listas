package aplicacioncontroles.listas;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListDemo extends Activity implements AdapterView.OnItemClickListener{
    ListView lstPaises;
    String[] paises = {"Peru","Colombia","Argentina","Ecuador"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_demo);

        lstPaises = (ListView) findViewById(R.id.lstPaises);
    //    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, paises);
        lstPaises.setAdapter(adapter);
        lstPaises.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);;  //adicionar esto para multiples checks
        lstPaises.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
     //   Toast.makeText(this, paises[position] + " [posicion ="+ id +"]",Toast.LENGTH_SHORT).show();
        int len = lstPaises.getCount();
        SparseBooleanArray checked = lstPaises.getCheckedItemPositions();
        for (int i=0; i< len; i++){
            if (checked.get(i)){
                String item = paises[i];
                Log.d("checked",item);
            }
        }
    }
}
