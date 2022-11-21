package com.example.bai_kt1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navigationView =findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        Toast.makeText(Home.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_listview:
                        Toast.makeText(Home.this, "ListView", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Home.this, MainActivity2.class);
                        startActivity(intent);
                        break;
                    case R.id.action_profile:
                        Toast.makeText(Home.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent hieu = new Intent(Home.this,Profile.class);
                        startActivity(hieu);
                        break;
                    case R.id.action_user:
                        Toast.makeText(Home.this, "User", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}