package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Checkbox extends AppCompatActivity {

    CheckBox cb1,cb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        cb1=(CheckBox)findViewById(R.id.cb1);
        cb2=(CheckBox)findViewById(R.id.cb2);

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked())
                    Toast.makeText(getApplicationContext(),"CheckBox1 is checked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"CheckBox1 is unchecked",Toast.LENGTH_SHORT).show();
            }
        });

        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb2.isChecked())
                    Toast.makeText(getApplicationContext(),"CheckBox2 is checked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"CheckBox2 is unchecked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
