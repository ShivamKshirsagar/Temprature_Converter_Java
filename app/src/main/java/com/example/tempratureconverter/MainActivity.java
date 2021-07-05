package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.IntArrayEvaluator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button calF,calC;
    TextView valinf,valinc,resultf,resultc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calC=findViewById(R.id.calC);
        calF=findViewById(R.id.calF);
        valinc=findViewById(R.id.valinc);
        valinf=findViewById(R.id.valinf);
        resultc=findViewById(R.id.resultc);
        resultf=findViewById(R.id.resultf);
        calC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a,b;
                a=Integer.parseInt(valinf.getText().toString());
                b=((a-32)*5)/9;
                resultc.setText(b+" ℃"); /*send values in c*/
                Toast.makeText(getApplicationContext(),"Approximate ℃ Calculated",Toast.LENGTH_LONG).show();
            }
        });
        calF.setOnClickListener(new View.OnClickListener() { /*sk*/
            @Override
            public void onClick(View view) {
                float c,d;
                c=Integer.parseInt(valinc.getText().toString());
                d=(c*9/5)+32;
                resultf.setText(d+" ℉");/*send values in f*/
                Toast.makeText(getApplicationContext(),"Approximate ℉ Calculated",Toast.LENGTH_LONG).show();
            }
        });
    }
}