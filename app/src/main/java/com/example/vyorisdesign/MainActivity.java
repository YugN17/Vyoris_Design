package com.example.vyorisdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.settings);
        DrawerLayout drawer=findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,0,0);

        if (drawer != null) {
            drawer.addDrawerListener(toggle);
        }
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navi_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }

        LinearLayout layout=findViewById(R.id.transfer_money);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Accepted_Activity.class);
                startActivity(intent);
            }
        });


    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.focus:
                // Handle the camera import action (for now display a toast).
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(this,"Favorite",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_share:
                // Handle the gallery action (for now display a toast).
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(this,"Share",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_send:
                // Handle the slideshow action (for now display a toast).
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(this,"Send",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer != null) {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
    }

}