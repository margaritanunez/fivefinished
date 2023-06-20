package com.example.five;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        Button showToast = findViewById(R.id.buttonShowToast);
        Button counter = findViewById(R.id.buttonCounter);
        TextView elTexto= findViewById(R.id.elTexto);
        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "hello Toast", Toast.LENGTH_LONG).show();
            }
        });
    }
}