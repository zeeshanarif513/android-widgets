package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonImplenetation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_implenetation);
        RadioGroup rdbgroup=(RadioGroup)findViewById(R.id.rdbgroup);
        rdbgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdb1=(RadioButton) findViewById(R.id.male);
                if(rdb1.isChecked()){
                    Toast.makeText(RadioButtonImplenetation.this,"Male",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Female",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
