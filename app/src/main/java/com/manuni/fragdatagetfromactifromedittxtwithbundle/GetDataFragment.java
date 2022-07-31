package com.manuni.fragdatagetfromactifromedittxtwithbundle;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GetDataFragment extends Fragment {



    public GetDataFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_get_data, container, false);
        Bundle getBundleData = getArguments();
        String data =  getBundleData.getString("key");

        if (getBundleData != null) {
            TextView myTxt = view.findViewById(R.id.setDataTxt);
            myTxt.setText(data);
        }
        return view;
    }
}