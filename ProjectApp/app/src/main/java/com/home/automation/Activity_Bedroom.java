package com.home.automation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity_Bedroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__bedroom);
    }
    public void B_dev_1click(View view) {
            Toast.makeText(this, "device is currently OFF", Toast.LENGTH_LONG).show();
            Toast.makeText(this, "device turning ON ", Toast.LENGTH_LONG).show();

    }
    public void B_dev_2click(View view)
    {
        Toast.makeText(this,"device is on", Toast.LENGTH_LONG).show();
    }

}
