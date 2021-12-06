package com.example.withdog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text123 = (TextView) findViewById(R.id.text123);

        String text = "";
        for(int i=0; i<100; i++)
            text += i + "\n";
        text123.setText(text);
    }
}