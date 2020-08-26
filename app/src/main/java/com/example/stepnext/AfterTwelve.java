package com.example.stepnext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

public class AfterTwelve extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_twelve);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showPop(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu1);
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
            case R.id.item4:
                return true;
            case R.id.item5:
                return true;
            case R.id.item6:
                return true;
            case R.id.item7:
                return true;
            case R.id.item8:
                return true;
            case R.id.item9:
                return true;
            case R.id.item10:
                return true;
            case R.id.item11:
                return true;
            case R.id.item12:
                return true;
            case R.id.item13:
                return true;
            case R.id.item14:
                return true;
            case R.id.item15:
                return true;
            case R.id.item16:
                return true;
            case R.id.item17:
                return true;
            default:
                return false;
        }

    }

    public void showPo(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu2);
        popup.show();
    }

    public void showp(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu3);
        popup.show();
    }

    public void show(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu4);
        popup.show();
    }

    public void showP(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu5);
        popup.show();
    }

    public void sho(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu6);
        popup.show();
    }

    public void sh(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu7);
        popup.show();
    }

    public void s(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu8);
        popup.show();
    }

    public void sp(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu9);
        popup.show();
    }
}