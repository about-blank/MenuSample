package com.vishal.menusample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);

        registerForContextMenu(textView2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        super.onCreateOptionsMenu(menu);

        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.mymenu1, menu);

        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);

        if(v.getId() == R.id.textView2) {
            MenuInflater menuInflater = new MenuInflater(this);
            menuInflater.inflate(R.menu.mymenu1, menu);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        return super.onOptionsItemSelected(item);


        String text = item.getTitle() + " from options menu selected !!";
        textView.setText(text);
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
//        return super.onContextItemSelected(item);

        String text = item.getTitle() + " from context menu selected !!";
        textView3.setText(text);

        return true;
    }
}
