package com.example.samplelibrary;

import android.content.Context;
import android.widget.Toast;

public class testMessage {

    public static void s(Context c, String message){
        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}
