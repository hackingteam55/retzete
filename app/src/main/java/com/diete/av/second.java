package com.diete.av;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {

    public Button but2;

     public void init(){

        but2 = (Button)findViewById(R.id.retete);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                Intent bla = new Intent(second.this, third.class);
                startActivity(bla);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }
}
