package com.example.list_view_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {














    EditText mensajeE;


    public void buttonPress(View view){

        mensajeE = findViewById(R.id.mensaje);
        String mensaje=mensajeE.getText().toString();
        Toast.makeText(this,""+mensaje,Toast.LENGTH_SHORT).show();
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}