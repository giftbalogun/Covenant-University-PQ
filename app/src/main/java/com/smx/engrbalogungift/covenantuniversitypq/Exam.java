package com.smx.engrbalogungift.covenantuniversitypq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Exam extends AppCompatActivity {
    Toolbar mToolbar;
    ListView mListView;

    String[] subjects = {"CHM111", "PHY111", "PHY112", "MAT111", "MAT112", "GST111",
            "TMC111", "CIT111","Welcome"};
    int[] subjectcolor = {
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.subject_exam));
        mListView = (ListView) findViewById(R.id.listview);
        adapter myAdapter = new adapter(Exam.this, subjects, subjectcolor);
        mListView.setAdapter(myAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                if(position == 0) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), chm111examyear.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position == 1) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), phy111examyear.class);
                    startActivityForResult(myIntent, 0);
                }

                if(position == 2) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), phy112examyear.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position == 3) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), mat111examyear.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position == 4) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), mat112examyear.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position == 5) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), gst111examyear.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position == 6) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), tmc111examyear.class);
                    startActivityForResult(myIntent, 0);
                }
                if(position == 7) {
                    //code specific to 2nd list item
                    Intent myIntent = new Intent(view.getContext(), cit111examyear.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });
    }
}
