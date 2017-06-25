package com.example.sakshi.customlistview_acad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mListView; //declaring listview
    ArrayList<Data> contacts;       //declaring arrayList
    CustomAdapter mCustomAdapter;       //decalaring CustomAdapter object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.contacts);  //associating list view
        contacts= new ArrayList<>();
        for(int i =1 ; i<8 ; i++){
            Data data = new Data();     //creating object of data class
            data.setName("Name "+i);
            data.setNumber("PhoneNumber "+i);       //setting Name and PhoneNumber
            contacts.add(data);             //adding these both in cutom ArrayList
        }
        mCustomAdapter = new CustomAdapter(MainActivity.this,contacts);         //constructor calling of CustomAdapter Class
        mListView.setAdapter(mCustomAdapter);       //setting adapter to listview

    }
}
