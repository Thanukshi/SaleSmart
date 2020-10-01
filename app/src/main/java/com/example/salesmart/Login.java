package com.example.salesmart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;

public class Login extends AppCompatActivity {

    RelativeLayout relLay1, relLay2, relLay3;
//create a handler
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            relLay1.setVisibility( View.VISIBLE );
            relLay2.setVisibility( View.VISIBLE );
            relLay3.setVisibility( View.VISIBLE );
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        relLay1 = (RelativeLayout)findViewById( R.id.rl1Login );
        relLay2 = (RelativeLayout)findViewById( R.id.rl2Login );
        relLay3 = (RelativeLayout)findViewById( R.id.rl3Login );

        handler.postDelayed( runnable, 1000 );


    }
}
