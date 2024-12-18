package com.example.newcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class subtarction extends AppCompatActivity {
    Button b1,b2;
    EditText t1,t2;
    String getNum1,getNum2,result;
    int num1,num2,sub;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtarction);
        b1=(Button) findViewById(R.id.backmenu);
        b2=(Button) findViewById(R.id.subb);
        t1=(EditText) findViewById((R.id.num1));
        t2=(EditText) findViewById(R.id.num2);
        tv=(TextView) findViewById(R.id.res);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=t1.getText().toString();
                getNum2=t2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sub=num1-num2;
                result=String.valueOf(sub);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                tv.setText(result);
            }
        });
    }
}