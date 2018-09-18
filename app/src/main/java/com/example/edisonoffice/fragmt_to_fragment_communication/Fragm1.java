package com.example.edisonoffice.fragmt_to_fragment_communication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragm1 extends Fragment {
   @Override
   public View onCreateView(LayoutInflater inflater,
                            ViewGroup container, Bundle savedInstanceState) {

       //Inflate the layout for this fragment



   /*   return inflater.inflate(
    		  R.layout.fragment_one, container, false);*/

       View view = inflater.inflate(R.layout.fragm2,
               container, false);
    //   TextView tv = view.findViewById(R.id.fragmentRightTextView);



       final Button button = (Button) view.findViewById(R.id.btn);
       button.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View v)
           {
               // do something
               ((Inter)getActivity()).data("results "+button.getText().toString());
           }
       });
       return view;

   }
}
