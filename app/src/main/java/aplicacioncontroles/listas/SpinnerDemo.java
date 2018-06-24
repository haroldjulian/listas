package aplicacioncontroles.listas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerDemo extends Activity implements AdapterView.OnItemSelectedListener{
    String[] lenguajes = {"Java","Kotlin","Swift","C","Php"};
    Spinner spinnerLenguaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_demo);

        spinnerLenguaje = (Spinner) findViewById(R.id.spinnerLenguaje);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,lenguajes);
        spinnerLenguaje.setAdapter(adapter);
        spinnerLenguaje.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,lenguajes[position]+ " <posicion="+ position+">",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
