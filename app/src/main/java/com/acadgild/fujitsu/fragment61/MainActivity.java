package com.acadgild.fujitsu.fragment61;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mgetvalue;
    Button msubmitbtn;
    String getstring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgetvalue = (EditText) findViewById(R.id.getno);
        msubmitbtn = (Button) findViewById(R.id.submitbtn);

        msubmitbtn.setOnClickListener(this);

        BlankFragment fragment = new BlankFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.blankfrag, fragment).addToBackStack("Return Gaddi").commit();

    }

    @Override
    public void onClick(View v) {

       getstring = mgetvalue.getText().toString();

        getMyData();




        BlankFragment fragment = new BlankFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.blankfrag, fragment).addToBackStack("Return Gaddi").commit();

    }


    public String getMyData() {
        return getstring;
    }


}
