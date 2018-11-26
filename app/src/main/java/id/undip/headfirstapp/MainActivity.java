package id.undip.headfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import id.undip.headfirstapp.perbab.bab8.Bab8MainActivity;

public class MainActivity extends Activity {

    public static final String KODE_BAB = "KLIK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //set adapter untuk tampilan menu
        ArrayAdapter<Bab> adapterBab = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Bab.arrayBab);

        //setting untuk ketika list di klik
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(MainActivity.this,Bab8MainActivity.class);
                    intent.putExtra(MainActivity.KODE_BAB,position);
                    startActivity(intent);
            }
        };

        ListView listView = (ListView)findViewById(R.id.appList);
        listView.setAdapter(adapterBab);
        listView.setOnItemClickListener(itemClickListener);
    }
}
