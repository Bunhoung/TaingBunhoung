package com.example.taingbunhoung;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ChangeFragment (View view){
        Fragment fragment;

        if ( view == findViewById(R.id.button)) {
            fragment = new HomeFragment();

            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
        if ( view == findViewById(R.id.button)) {
            fragment = new Categlory();
            FragmentManager fm = getFragmentManager();
           FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
        if ( view == findViewById(R.id.button)) {
            fragment = new Search();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
        if ( view == findViewById(R.id.button)) {
            fragment = new Account();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
        if ( view == findViewById(R.id.button)) {
            fragment = new Setting();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }
    }
}