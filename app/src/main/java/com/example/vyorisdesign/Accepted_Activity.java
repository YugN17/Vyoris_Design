package com.example.vyorisdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Accepted_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accepted);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_acc);
        toolbar.inflateMenu(R.menu.settings);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_arrow_back_ios_24));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             onBackPressed();
            }
        });



    }

}