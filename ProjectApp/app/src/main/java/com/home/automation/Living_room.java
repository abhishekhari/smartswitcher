package com.home.automation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Living_room extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_room);
    }

   /* public void buttonClick(View view){
        Toast.makeText(this, "here", Toast.LENGTH_SHORT).show();
    }*/
    public void L_dev_1click(View view)
    {
        Toast.makeText(this,"device is on", Toast.LENGTH_LONG).show();
    }
    public void L_dev_2click(View view)
    {
        Toast.makeText(this,"device is on", Toast.LENGTH_LONG).show();
    }
}
