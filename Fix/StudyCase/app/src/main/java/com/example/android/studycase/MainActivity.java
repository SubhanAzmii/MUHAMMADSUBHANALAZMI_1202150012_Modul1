package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText menu;
    private EditText porsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (EditText) findViewById(R.id.editmenu);
        porsi = (EditText) findViewById(R.id.editporsi);

    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);


        String mmenu = menu.getText().toString();
        String mporsi = porsi.getText().toString();

        intent.putExtra("tempat", "EatBus");
        intent.putExtra("menu", mmenu);
        intent.putExtra("porsi", mporsi);
        intent.putExtra("harga", "50000");



        startActivity(intent);


    }


    public void launchThirdActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String mmenu = menu.getText().toString();
        String mporsi = porsi.getText().toString();

        intent.putExtra("tempat", "Abnormal");
        intent.putExtra("menu", mmenu);
        intent.putExtra("porsi", mporsi);
        intent.putExtra("harga", "30000");

        startActivity(intent);


    }
}
