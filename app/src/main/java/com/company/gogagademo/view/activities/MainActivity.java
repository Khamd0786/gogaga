package com.company.gogagademo.view.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.company.gogagademo.R;
import com.company.gogagademo.view.fragments.AlertFragment;
import com.company.gogagademo.view.fragments.ChatFragment;
import com.company.gogagademo.view.fragments.HomeFragment;
import com.company.gogagademo.view.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * Created by Hammad Khan on 1, Sep 2020
 */
public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

        private Toolbar toolbar;
        private BottomNavigationView navigationView;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            toolbar = findViewById(R.id.main_tool_bar);
            setSupportActionBar(toolbar);
            navigationView = findViewById(R.id.navigation);
            navigationView.setOnNavigationItemSelectedListener(this);
            onLoadFragment(new HomeFragment());

        }

        private boolean onLoadFragment(Fragment fragment) {
            if (fragment != null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, fragment)
                        .commit();
                return true;
            }
            return false;
        }

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment fragment = new Fragment();
            switch (item.getItemId()){

                case R.id.nav_home:
                    fragment = new HomeFragment();
                    toolbar.setTitle(item.getTitle());
                    break;

                case R.id.nav_chat:
                    fragment = new ChatFragment();
                    toolbar.setTitle(item.getTitle());
                    break;

                case R.id.nav_alert:
                    fragment = new AlertFragment();
                    toolbar.setTitle(item.getTitle());
                    break;

                case R.id.nav_profile:
                    fragment = new ProfileFragment();
                    toolbar.setTitle(item.getTitle());
                    break;
            }
            return onLoadFragment(fragment);
        }
}