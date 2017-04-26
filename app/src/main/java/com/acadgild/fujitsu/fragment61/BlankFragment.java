package com.acadgild.fujitsu.fragment61;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

TextView mgettext;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_blank, container, false);

        mgettext = (TextView) view.findViewById(R.id.takevalue);

        MainActivity activity = (MainActivity) getActivity();
        String strtext = activity.getMyData();

        mgettext.setText(strtext);


        return  view;


    }

}
