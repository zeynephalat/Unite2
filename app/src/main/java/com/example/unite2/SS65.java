package com.example.unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SS65 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss65);
    }

    public void Onayla(View view) {
        Toast.makeText(this, "Merhaba ben onayla metoduyum ", Toast.LENGTH_LONG).show();
    }
}