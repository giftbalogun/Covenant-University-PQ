package com.smx.engrbalogungift.covenantuniversitypq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class phy112examyear extends AppCompatActivity {
    Toolbar mToolbar;
    ListView mListView;

    String[] year = {"2017", "2016", "2015", "2014"};
    int[] subjectcolor = {
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy112examyear);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.exam_phy112_year));
        mListView = (ListView) findViewById(R.id.listview);
        adapter myAdapter = new adapter(phy112examyear.this, year, subjectcolor);
        mListView.setAdapter(myAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                if(position == 0) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position == 1) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), Test1.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 2) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), Test2.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position == 3) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(),Exam.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}
