package com.example.ex091;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {
    Intent gi;
    LinearLayout DG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        DG = (LinearLayout)findViewById(R.id.dg2);
        gi = getIntent();
    }

    public void doneActivity(View view)
    {
        finish();
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
        if(st.equals("Yellow"))
            DG.setBackgroundColor(Color.YELLOW);
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add("Yellow");
        return true;
    }

    public void back(View view) {
        doneActivity(view);
    }
}