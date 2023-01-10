package com.example.ex091;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout DG;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DG = (LinearLayout)findViewById(R.id.dg);
        si = new Intent(this,MainActivity2.class);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        String st = item.getTitle().toString();
        if(st.equals("Red"))
            DG.setBackgroundColor(Color.RED);
        if(st.equals("Blue"))
            DG.setBackgroundColor(Color.BLUE);
        if(st.equals("White"))
            DG.setBackgroundColor(Color.WHITE);
        return true;
    }

    public void go(View view) {
        startActivity(si);
    }
}