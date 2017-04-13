package com.ignaciojgp.charactersheet.Views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.ignaciojgp.charactersheet.R;

import java.util.UUID;

public class CharacterView extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_character_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        UUID idCharacter = UUID.fromString( getIntent().getExtras().getString( CharacterListActivity.ARG_ITEM_ID));


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener( toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        if(savedInstanceState == null) {
            Fragment f = new ResumeFragment();

            FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
            trans.add( R.id.frame, f );
            trans.commit();
        }



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
        getMenuInflater().inflate(R.menu.character_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment f = null;
        if (id == R.id.nav_resume) {
            f = new ResumeFragment();
            setTitle( getString( R.string.sec_resume ) );
        } else if (id == R.id.nav_class) {
            f = new ClassFragment();
            setTitle( getString( R.string.sec_class ) );
        } else if (id == R.id.nav_skill) {
            f = new SkillsFragment();
            setTitle( getString( R.string.sec_skills ) );
        } else if (id == R.id.nav_mods) {
            setTitle( getString( R.string.sec_mods ) );
        } else if (id == R.id.nav_spells) {
            setTitle( getString( R.string.sec_spells ) );
        } else if (id == R.id.nav_gear) {
            setTitle( getString( R.string.sec_gear ) );
            f = new GearFragment();

        } else if (id == R.id.nav_send) {

        }


        if(f != null) {
            FragmentTransaction trans = getSupportFragmentManager().beginTransaction();

            trans.replace( R.id.frame, f );

            trans.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
