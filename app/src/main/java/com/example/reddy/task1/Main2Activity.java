package com.example.reddy.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1;
    Button b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b3 = findViewById(R.id.Act3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(i);
            }
        });


        String str = getIntent().getStringExtra("Key");


        ((TextView) findViewById(R.id.txtViewac2)).setText(str);


        String str1 = getIntent().getStringExtra("Key1");
        {
            ((TextView) findViewById(R.id.txtViewac2)).setText(str1 + "");
        }
        t1 = findViewById(R.id.txtViewac2);
        b2 = findViewById(R.id.button2A);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setVisibility(View.VISIBLE);
            }
        });

    }

}
