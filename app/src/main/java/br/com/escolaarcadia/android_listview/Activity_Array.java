package br.com.escolaarcadia.android_listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Activity_Array extends Activity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_array);


        listView = (ListView) findViewById(R.id.listView);
        String[] valores = new String[]{"Joao",
                "Maria",
                "Paulo",
                "Pedro",
                "Raquel",
                "Judite",
                "Lucas",
                "Marcos"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, // Contexto
                android.R.layout.simple_list_item_1, // Layout de cada linha
                android.R.id.text1, // ID do objeto para cada linha
                valores); // Valores

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicao, long id) {
                int itemposicao = posicao; // Linha que clicada
                String valorDoItem = (String) listView.getItemAtPosition(posicao);
                Toast.makeText(getApplicationContext(),
                        "posicao :" + itemposicao + "  ListItem : " + valorDoItem, Toast.LENGTH_LONG)
                        .show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity__list_view__array, menu);
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
