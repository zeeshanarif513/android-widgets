package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewImplementation extends AppCompatActivity {
    ListView lv;
    String [] countries={"Pakistan","Iran","Afghanistan","Saudia Arabia","Turkey","UAE","Qatar","Malayshia","Chaina","America","Rusia","Canada","England","Itly","France","South Koria"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_implementation);
        lv=findViewById(R.id.lst);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countries);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You selected "+countries[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
