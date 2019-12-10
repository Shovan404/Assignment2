package com.assignment2.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.assignment2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FifthFragment extends Fragment implements View.OnClickListener{

    private EditText etPrincipal, etRate, etTime;
    private Button btnSimpleinterest;
    private TextView tvSimpleinterest;


    public FifthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fifth, container, false);
        etPrincipal=view.findViewById(R.id.etPrincipal);
        etRate=view.findViewById(R.id.etRate);
        etTime=view.findViewById(R.id.etTime);
        tvSimpleinterest=view.findViewById(R.id.tvSimpleinterest);
        btnSimpleinterest=view.findViewById(R.id.btnSimpleinterest);
        btnSimpleinterest.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float Principal = Float.parseFloat(etPrincipal.getText().toString());
        float Rate = Float.parseFloat(etRate.getText().toString());
        float Time = Float.parseFloat(etTime.getText().toString());
        float Simpleinterest = (Principal*Time*Rate)/100;

        tvSimpleinterest.setText("Simple Interest: "+Simpleinterest);
    }
}
