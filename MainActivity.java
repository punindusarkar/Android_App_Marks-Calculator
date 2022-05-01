package com.example.punindu_micro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // this is subject
        ed1=findViewById(R.id.PWP);
        ed2=findViewById(R.id.MAD);
        ed3=findViewById(R.id.MGT);
        ed7=findViewById(R.id.EDE);
        ed8=findViewById(R.id.NIS);
        ed9=findViewById(R.id.ETI);



        //this is result
        ed4=findViewById(R.id.total);
        ed5=findViewById(R.id.avg);


        // this is button
        btn1=findViewById(R.id.btn1);







        //this is onclick
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markscal();

            }
        });


    }
    public void markscal()
    {
        int m1, m2, m3, m4, m5, m6, tot;
        double avg;
        String grade;


        m1 = Integer.parseInt(ed1.getText().toString());
        m2 = Integer.parseInt(ed2.getText().toString());
        m3 = Integer.parseInt(ed3.getText().toString());
        m4 = Integer.parseInt(ed3.getText().toString());
        m5 = Integer.parseInt(ed3.getText().toString());
        m6 = Integer.parseInt(ed3.getText().toString());

        tot = m1 + m2 + m3 + m4 + m5 + m6;

        ed4.setText(String.valueOf(tot));

        avg = tot / 6;

        ed5.setText(String.valueOf(avg));
    }


}