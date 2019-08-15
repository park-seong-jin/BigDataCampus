package com.example.big2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_one);

        Button button = (Button)findViewById(R.id.OneOne);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });


    }
}
