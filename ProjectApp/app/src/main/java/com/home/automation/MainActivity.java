package com.home.automation;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import static com.home.automation.R.id.room_2;

public class MainActivity extends AppCompatActivity {
   View view;


private Button room_1;
private Button room_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        view= this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.grey);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        room_1= (Button) findViewById(R.id.room_1);
        room_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openliving_room();
            }

        });

        room_2 = (Button) findViewById(R.id.room_2);
        room_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c)
            {
                openActivity_bedroom();
            }

        });
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openliving_room()
    {
        Intent intent = new Intent(this, Living_room.class);
        startActivity(intent);
    }

    public void openActivity_bedroom()
    {
        Intent intent = new Intent(this, Activity_Bedroom.class);
        startActivity(intent);
    }
}
