package com.example.edisonoffice.fragmt_to_fragment_communication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by edison office on 9/18/2018.
 */
public class SearchFragment extends Fragment {
    private EditText et;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_fragment,
                container, false);
        et = view.findViewById(R.id.search);
        ((Button)view.findViewById(R.id.submit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inter)getActivity()).setResult("results "+et.getText().toString());
            }
        });
        return view;
    }
}