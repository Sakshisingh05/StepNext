package com.example.stepnext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.PopupMenu;
import android.widget.Spinner;

public class AfterTenth extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {


    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_tenth);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public void showPop(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }





    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.item1:
                return true;
            case R.id.item2:
                return true;
            case R.id.item3:
                return true;
            default:
                return false;
        }
    }

    public void showPopUp(View view) {
        PopupMenu pop = new PopupMenu(this, view);
        pop.setOnMenuItemClickListener(this);
        pop.inflate(R.menu.pop_menu);
        pop.show();
    }

    public void showPo(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.pop_menu1);
        popup.show();
    }

    public void showP(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.pop_menu2);
        popup.show();
    }

    public void show(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.pop_menu3);
        popup.show();
    }

    public void sho(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.pop_menu4);
        popup.show();
    }
}






