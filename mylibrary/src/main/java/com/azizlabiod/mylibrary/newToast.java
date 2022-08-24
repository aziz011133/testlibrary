package com.azizlabiod.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class newToast {

    public void simpletoast(Context context,String s){
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
