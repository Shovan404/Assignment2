package com.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.assignment2.fragments.FifthFragment;
import com.assignment2.fragments.FirstFragment;
import com.assignment2.fragments.FourthFragment;
import com.assignment2.fragments.SecondFragment;
import com.assignment2.fragments.SixthFragment;
import com.assignment2.fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnFragment1, btnFragment2, btnFragment3, btnFragment4, btnFragment5, btnFragment6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment1=findViewById(R.id.btnFragment1);
        btnFragment2=findViewById(R.id.btnFragment2);
        btnFragment3=findViewById(R.id.btnFragment3);
        btnFragment4=findViewById(R.id.btnFragment4);
        btnFragment5=findViewById(R.id.btnFragment5);
        btnFragment6=findViewById(R.id.btnFragment6);

        btnFragment1.setOnClickListener(this);
        btnFragment2.setOnClickListener(this);
        btnFragment3.setOnClickListener(this);
        btnFragment4.setOnClickListener(this);
        btnFragment5.setOnClickListener(this);
        btnFragment6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.btnFragment1:
                 FirstFragment firstFragment= new FirstFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnFragment2:
                SecondFragment secondFragment= new SecondFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,secondFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnFragment3:
                ThirdFragment thirdFragment= new ThirdFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,thirdFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnFragment4:
                FourthFragment fourthFragment= new FourthFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,fourthFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnFragment5:
                FifthFragment fifthFragment= new FifthFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,fifthFragment);
                fragmentTransaction.commit();
                break;

            case R.id.btnFragment6:
                SixthFragment sixthFragment= new SixthFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,sixthFragment);
                fragmentTransaction.commit();
                break;



        }

    }
}
