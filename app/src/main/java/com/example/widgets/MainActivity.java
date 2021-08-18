package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Accessing tatic array declared in string.xml
        Resources res=getResources();
        String [] countries=res.getStringArray(R.array.countries);
        for(int i=0;i<countries.length;i++)
            Log.d("Loop testing",countries[i]);
    }
}
