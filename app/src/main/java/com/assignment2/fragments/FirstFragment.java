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
public class FirstFragment extends Fragment implements View.OnClickListener{

    private Button btnCircle;
    private EditText etCircle;
    private TextView tvCircle;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        etCircle=view.findViewById(R.id.etCircle);
        btnCircle=view.findViewById(R.id.btnCircle);
        btnCircle.setOnClickListener(this);
        tvCircle=view.findViewById(R.id.tvCircle);
        return view;

    }

    @Override
    public void onClick(View v) {
        float radius = Float.parseFloat(etCircle.getText().toString());
        float area = 3.14f*radius*radius;

        tvCircle.setText("The are of the circle is"+ area);

    }
}
