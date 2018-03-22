package com.smx.engrbalogungift.covenantuniversitypq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Year_Test1 extends AppCompatActivity {
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
        setContentView(R.layout.activity_year__test1);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.subject_test1));
        mListView = (ListView) findViewById(R.id.listview);
        adapter myAdapter = new adapter(Year_Test1.this, year, subjectcolor);
        mListView.setAdapter(myAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(Year_Test1.this, test1chm111.class);
                mIntent.putExtra("year", year[i]);
                mIntent.putExtra("subjectcolor", subjectcolor[i]);
                startActivity(mIntent);
            }
        });
    }
}
