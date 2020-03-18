package com.example.salesmartnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Adminview extends AppCompatActivity {

        Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminview);
        add = findViewById(R.id.button9);

        add.setOnClickListener(new View.OnClickListener() {
                                   public void onClick(View v) {
                                       Intent i = new Intent(Adminview.this, mydelivery.class);
                                       startActivity(i);
                                   }
                               }

        );

    }
}
