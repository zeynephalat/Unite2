package com.example.unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Uyg2Goster(View view) {
        Intent i  = new Intent (MainActivity.this, Uyg2Activity.class);
        startActivity(i);
    }
    public void uyg4Goster(View view) {
        Intent i  = new Intent (MainActivity.this, Uyg4Activity.class);
        startActivity(i);
    }

    public void ss64Goster(View view) {
        Intent i  = new Intent (MainActivity.this, Activity_ss_64.class);
        startActivity(i);
    }

    public void tamamGoster(View view) {
        Intent i  = new Intent (MainActivity.this, SS65.class);
        startActivity(i);

    }
}