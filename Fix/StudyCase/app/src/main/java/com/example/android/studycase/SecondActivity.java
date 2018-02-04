package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String tampiltempat =
                intent.getStringExtra("tempat");
        TextView ttempat = (TextView) findViewById(R.id.tempat);
        String tampilmenu =
                intent.getStringExtra("menu");
        TextView tmenu = (TextView) findViewById(R.id.menu);
        String tampilporsi =
                intent.getStringExtra("porsi");
        TextView tporsi = (TextView) findViewById(R.id.porsi);
        String tampilharga =
                intent.getStringExtra("harga");
        TextView tharga = (TextView) findViewById(R.id.harga);

        int total = Integer.valueOf(tampilporsi)*Integer.valueOf(tampilharga);

        ttempat.setText(tampiltempat);
        tmenu.setText(tampilmenu);
        tporsi.setText(tampilporsi);
        tharga.setText(String.valueOf(total));

        if (total > 60000){
            Toast toast = Toast.makeText(this,"Jangan Di sini Makan malam, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        }else {
            Toast toast = Toast.makeText(this,"Disini saja makan malamnya !!", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
