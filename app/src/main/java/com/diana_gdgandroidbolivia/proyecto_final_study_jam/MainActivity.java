package com.diana_gdgandroidbolivia.proyecto_final_study_jam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void accion (View view){
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
    }
    public void accion1 (View view){
        Intent i=new Intent(this,Main3Activity.class);
        startActivity(i);
    }
    public void accion2 (View view){
        Intent i=new Intent(this,Main4Activity.class);
        startActivity(i);
    }
}
