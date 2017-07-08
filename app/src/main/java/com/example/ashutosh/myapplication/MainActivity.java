package com.example.ashutosh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnbutton;
    Button btnbutton2;

    TextView txtCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbutton= (Button)findViewById(R.id.button);
        btnbutton2= (Button)findViewById(R.id.button2);

        txtCount= (TextView)findViewById(R.id.textViewCount);
        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue=txtCount.getText().toString();

                int intCountValue=Integer.parseInt(countValue);
                intCountValue++;

                txtCount.setText(String.valueOf(intCountValue));







            }
        });
    }
}
