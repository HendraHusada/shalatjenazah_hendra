package com.example.hendra.shalatjenazah;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class hal_00home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_00home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hal_00home, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_hukum) {
            // Handle the camera action
            Toast.makeText(getApplicationContext(),"hukum",Toast.LENGTH_LONG).show();
            Intent intent_hukum = new Intent(hal_00home.this, hal_01hukum.class);
            startActivity(intent_hukum);
        } else if (id == R.id.nav_syarat) {
            Toast.makeText(getApplicationContext(),"syarat",Toast.LENGTH_LONG).show();
            Intent intent_syarat = new Intent(hal_00home.this, hal_02syarat.class);
            startActivity(intent_syarat);
        } else if (id == R.id.nav_rukun) {
            Toast.makeText(getApplicationContext(),"rukun",Toast.LENGTH_LONG).show();
            Intent intent_rukun = new Intent(hal_00home.this, hal_03rukun.class);
            startActivity(intent_rukun);
        } else if (id == R.id.nav_shalat) {
            Toast.makeText(getApplicationContext(),"shalat",Toast.LENGTH_LONG).show();
            Intent intent_shalat = new Intent(hal_00home.this, hal_04cewekcowok.class);
            startActivity(intent_shalat);
        } else if (id == R.id.nav_video) {
            Toast.makeText(getApplicationContext(),"video",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_evaluasi) {
            Toast.makeText(getApplicationContext(),"evaluasi",Toast.LENGTH_LONG).show();
            Intent intent_evaluasi = new Intent(hal_00home.this, hal_06evaluasi.class);
            startActivity(intent_evaluasi);
        } else if (id == R.id.nav_help) {
            Toast.makeText(getApplicationContext(),"help",Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_about) {
            Toast.makeText(getApplicationContext(),"about",Toast.LENGTH_LONG).show();
            Intent intent_about = new Intent(hal_00home.this, hal_07about.class);
            startActivity(intent_about);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
