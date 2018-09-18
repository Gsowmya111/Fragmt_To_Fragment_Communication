/*
package com.example.edisonoffice.fragmt_to_fragment_communication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Inter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fram1, new Fragm1());
        ft.replace(R.id.fram2, new FragmentOne());
        ft.addToBackStack(null);
        ft.commit();

    }


*/
/*
public void data(String str) {
        Fragm1 sf = (Fragm1)getSupportFragmentManager()
                .findFragmentById(R.id.fram1);
        sf.data
    }
*//*




    @Override
    public void setResult(String s) {
        Fragm1 sf = (Fragm1)getSupportFragmentManager()
                .findFragmentById(R.id.fram1);
        sf.setResult(str);
    }
}
*/
