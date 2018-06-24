package aplicacioncontroles.listas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class whatsappDemo extends Activity {
    ListView lstContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp_demo);

        ArrayList<Contact> contacts = new ArrayList<Contact>();

        Contact contact1 = new Contact();

        contact1.setNombres("Harold Julian");
        contact1.setStatus("En clase");
        contact1.setDevice("MOVIL");
        contact1.setPhoto("https://i.pinimg.com/originals/2f/4d/2e/2f4d2e7eb9e448ef6aa86fd54d0ebdb6.jpg");
        contacts.add(contact1);

        Contact contact2 = new Contact();
        contact2.setNombres("Otro fulano");
        contact2.setStatus("sin tarea");
        contact2.setDevice("WEB");
        contact2.setPhoto("https://images-na.ssl-images-amazon.com/images/I/41kmcFsj33L.jpg");
        contacts.add(contact2);

        lstContacts = (ListView) findViewById(R.id.lstWhatsapp);
        ContactAdapter adapter = new ContactAdapter(this,contacts);
        lstContacts.setAdapter(adapter);

    }





}
