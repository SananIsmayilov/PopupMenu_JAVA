package com.example.sananismayilov.myapplicationpopup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show(View v){
        PopupMenu popupMenu = new PopupMenu(this,v);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.item1){
                    Toast.makeText(MainActivity.this, "item1 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }else if (item.getItemId() == R.id.item2){
                    Toast.makeText(MainActivity.this, "item2 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item.getItemId() == R.id.item3) {
                    Toast.makeText(MainActivity.this, "item3 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }else {
                    return false;
                }

            }
        });
        popupMenu.inflate(R.menu.popupmenu);
        popupMenu.show();

    }

}