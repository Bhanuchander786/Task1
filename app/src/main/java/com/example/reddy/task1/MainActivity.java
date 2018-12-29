package com.example.reddy.task1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText e1, e2, e3;
    //aButton b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.eTxt);
        e2 = findViewById(R.id.eTxt2);
        e3 = findViewById(R.id.eTxt3);
        // b1 = findViewById(R.id.button);
     //   b2 = findViewById(R.id.button2);
        t1 = findViewById(R.id.txtView);

        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        /*if (v.getId() == R.id.button2) {
            Intent i = new Intent(this, Main2Activity.class);
            i.putExtra("Key","This is second activity");
            //startActivity(i);
        } */

        if (v.getId() == R.id.button2) {

            try {


                int s1 = Integer.parseInt(e1.getText().toString());
                int s2 = Integer.parseInt(e2.getText().toString());
                int s3 = Integer.parseInt(e3.getText().toString());
                int s4 = s1 + s2 + s3;
                t1.setText(s4 + "");
                if (v.getId() == R.id.button2) {
                    Intent i = new Intent(this, Main2Activity.class);
                    i.putExtra("Key1", s4 + "");
                    startActivity(i);
                }
            } catch (Exception e) {
                Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_LONG).show();
            }
        }
        if (v.getId() == R.id.button) {
            try {
                int s1 = Integer.parseInt(e1.getText().toString());
                int s2 = Integer.parseInt(e2.getText().toString());
                int s3 = Integer.parseInt(e3.getText().toString());
                int s4 = s1 + s2 + s3;
                t1.setText(s4 + "");
            } catch (Exception e) {

                Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_LONG);
            }
        }


    }


    public void buttonThree(View view) {
        Toast.makeText(MainActivity.this, "this is Button three", Toast.LENGTH_LONG).show();
    }

}
