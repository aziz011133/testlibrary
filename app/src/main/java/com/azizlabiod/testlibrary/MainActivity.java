package com.azizlabiod.testlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.azizlabiod.mylibrary.newToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newToast newToast=new newToast();
        newToast.simpletoast(this,"hitii");

    }
}