package com.example.edisonoffice.fragmt_to_fragment_communication;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by edison office on 9/18/2018.
 */

public class SearchActivity extends AppCompatActivity implements Inter{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.search, new SearchFragment());
        ft.replace(R.id.search_result, new SearchResultsFragment());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void setResult(String str){
        SearchResultsFragment sf = (SearchResultsFragment)getSupportFragmentManager()
                .findFragmentById(R.id.search_result);
        sf.setResult(str);
    }
}