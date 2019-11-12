package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnWeb;
    Button btnInOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWeb = findViewById(R.id.btn_web);
        btnWeb.setOnClickListener(this);

        btnInOut = findViewById(R.id.btn_input);
        btnInOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent moveActivity = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveActivity);
                break;
            case  R.id.btn_move_data:
                Intent moveActivityWithData = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_NAME, "Royyan M");
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveActivityWithData);
                break;
            case R.id.btn_dial:
                String phonenumber = "089678152703";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+phonenumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_web:
                String webpolines = "http://www.polines.ac.id";
                Intent startWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(webpolines));
                startActivity(startWeb);
                break;
            case R.id.btn_input:
                Intent MoveInput = new Intent(MainActivity.this, Inputdata.class);
                startActivity(MoveInput);


        }

    }



}
