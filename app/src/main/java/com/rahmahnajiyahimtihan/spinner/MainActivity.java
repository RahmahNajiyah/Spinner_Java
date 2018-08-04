package com.rahmahnajiyahimtihan.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    TextView tekspilih;
    ImageView img;
    //access modifiers : public,private,protected
    private String[] list = {
            "Alpukat", "Apel", "Ceri", "Durian", "Jambu Air", "Manggis", "Strawberry",
    };

    private int[] listgambar = {
            R.drawable.alpukat, R.drawable.apel, R.drawable.ceri, R.drawable.durian,
            R.drawable.jambuair, R.drawable.manggis, R.drawable.strawberry
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        tekspilih = (TextView) findViewById(R.id.txtbuah);
        img = (ImageView) findViewById(R.id.imgbuah);

        spinner.setOnItemSelectedListener(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


      tekspilih.setText(list[i]);
      img.setImageResource(listgambar[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
