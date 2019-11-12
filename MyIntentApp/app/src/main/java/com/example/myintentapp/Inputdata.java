package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inputdata extends AppCompatActivity {

    EditText Input;
    Button btn_input2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputdata);

        Input = findViewById(R.id.input_edit);

        btn_input2 = findViewById(R.id.btn_input2);
        btn_input2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent input = new Intent(Inputdata.this,Outputdata.class).putExtra('data',Input.getText().toString());
                startActivity(input);
            }
        });
    }
}
