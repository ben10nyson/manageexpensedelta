package com.example.jasper.manageexpense;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class TabHistory_week extends Activity{
    ListView list;
    List<TabHistory_Week_List> listWeek;
    TabHistory_Week_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabhistory_week);

        list = (ListView) findViewById(R.id.listview_week);
        loadListView();

    }

    private void loadListView(){
        DBHelper db = new DBHelper(getApplicationContext());
        listWeek = db.getHistoryList();
        adapter = new TabHistory_Week_Adapter(getApplicationContext(), listWeek);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parentAdapter, View row,    int position, long rowid)
            {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "HI",Toast.LENGTH_SHORT).show();
            }
        });
    }



}
