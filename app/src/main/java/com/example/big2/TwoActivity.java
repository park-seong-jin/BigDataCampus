package com.example.big2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        Button button = (Button)findViewById(R.id.Two);
           button.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    finish();
                }
        });
    }
}
