package id.undip.headfirstapp.perbab.bab8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import id.undip.headfirstapp.Bab;
import id.undip.headfirstapp.MainActivity;
import id.undip.headfirstapp.R;

public class Bab8MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab8_main);
        Intent intent = getIntent();
        int indexArray = intent.getIntExtra(MainActivity.KODE_BAB,0);
        //mendapatkan nilai bab
        Bab bab = Bab.arrayBab[indexArray];
        Toast.makeText(this,bab.getDescription(),Toast.LENGTH_LONG).show();
    }
}
