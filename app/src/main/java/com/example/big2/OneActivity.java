package com.example.big2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        final TextView textView = (TextView)findViewById(R.id.textView);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                textView.setText("지역구는 : "+parent.getItemAtPosition(position));
            }
            @Override
            public void onNothingSelected(AdapterView<?>parent){}
        });

        Button button = (Button)findViewById(R.id.One);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OneActivity.this, OneOne.class);
                startActivity(intent);
            }
        });

    }
    }

