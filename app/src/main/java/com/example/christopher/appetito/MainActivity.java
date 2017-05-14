package com.example.christopher.appetito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingredientes_de (View view){
        Intent a= new Intent(this,Main2Activity.class);
        startActivity(a);
    }
    public void ingredientes_al (View view){
        Intent e= new Intent(this,Main2Activity.class);
        startActivity(e);
    }
    public void ingredientes_on (View view){
        Intent i= new Intent(this,Main2Activity.class);
        startActivity(i);
    }
    public void ingredientes_ce (View view){
        Intent o= new Intent(this,Main2Activity.class);
        startActivity(o);
    }
}
