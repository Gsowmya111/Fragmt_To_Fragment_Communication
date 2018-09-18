package com.example.edisonoffice.fragmt_to_fragment_communication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by edison office on 9/18/2018.
 */
public class SearchResultsFragment extends Fragment {
    private TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_result,
                container, false);
        tv = view.findViewById(R.id.search_results);
        return view;
    }
    public void setResult(String result){
        tv.setText(result);
    }
}
