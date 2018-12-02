package com.alliance.ex5;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mToolbar=findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Home");



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        RelativeLayout rl=findViewById(R.id.rl);
        switch(item.getItemId()) {
            case R.id.Red:
                rl.setBackgroundColor(getResources().getColor(R.color.Red));
                return true;
            case R.id.Blue:
                rl.setBackgroundColor(getResources().getColor(R.color.Blue));
                return true;
            case R.id.Green:
                rl.setBackgroundColor(getResources().getColor(R.color.Green));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
