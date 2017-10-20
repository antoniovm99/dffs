package com.netfoxplus.www.netfox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class selectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void boton1(View v){
        Intent inte = new Intent(this,MainActivity.class);
        startActivity(inte);
    }

    public void boton2(View v){
        Intent inte = new Intent(this,MainActivity2.class);
        startActivity(inte);
    }
}
