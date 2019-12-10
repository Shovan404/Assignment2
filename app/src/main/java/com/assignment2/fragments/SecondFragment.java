package com.assignment2.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.assignment2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    private EditText etPalindrome;
    private Button btnPalindrome;
    private TextView tvPali;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        etPalindrome=view.findViewById(R.id.etPalindrome);
        btnPalindrome=view.findViewById(R.id.btnPalindrome);
        tvPali=view.findViewById(R.id.tvPalindrome);

        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int originalNum, lastDigit, sum=0;
        int num = Integer.parseInt(etPalindrome.getText().toString());
        originalNum = num;

        while (originalNum>0)
        {
            lastDigit = originalNum%10;
            sum=(sum*10)+lastDigit;
            originalNum = originalNum/10;
        }

        if (sum == num)
        {
            tvPali.setText("The number is Palindrome!");
        }
        else
        {
            tvPali.setText("The number is not Palindrome!");
        }


    }
}
