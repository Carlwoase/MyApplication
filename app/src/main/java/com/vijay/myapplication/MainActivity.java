package com.vijay.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private RecyclerView postList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=(DrawerLayout) findViewById(R.id.drawable_layout);
        navigationView=(NavigationView) findViewById(R.id.navigation_view);
        View navView=navigationView.inflateHeaderView(R.layout.navigation_header);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                UserMenuSelector(menuItem);



                return false;
            }
        });


    }

    private void UserMenuSelector(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.nav_post:
                Toast.makeText(this, "Post",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_profile:
                Toast.makeText(this, "Profile",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_home:
                Toast.makeText(this, "Home",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_freinds:
                Toast.makeText(this, "Freinds",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_find_freinds:
                Toast.makeText(this, "Find Freinds",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_messages:
                Toast.makeText(this, "Messages",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_settings:
                Toast.makeText(this, "Settings",Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_logout:
                Toast.makeText(this, "Log Out",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}