package com.example.salesmartnew;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class Insertdelivery extends AppCompatActivity {
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertdelivery);

        add = findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
                                  public void onClick(View v) {
                                      Intent i = new Intent(Insertdelivery.this, Adminview.class);
                                      startActivity(i);
                                  }
                              }

        );
    }


}
