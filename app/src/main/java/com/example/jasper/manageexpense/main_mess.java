package com.example.jasper.manageexpense;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;



public class main_mess extends Activity {
TextView t;
    ListView list;
    TabHistory_Week_Adapter adapter;
    List<TabHistory_Week_List> lists;
    List<tabhis> listss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mess);
        list = (ListView) findViewById(R.id.listt);
        t=(TextView) findViewById(R.id.textView8);
        DBHelper db = new DBHelper(getApplicationContext());
        lists = db.getMessWeek();
        adapter = new TabHistory_Week_Adapter(getApplicationContext(), (ArrayList<TabHistory_Week_List>) lists);
        list.setAdapter(adapter);


        //ArrayList<String>a=new ArrayList<>();
      // a=db.getMess1Week();
       // DBHelper db = new DBHelper(getApplicationContext());
      //  listss = db.getMess1Week();
        //tabhis a=listss.get(0);
      //  adapter = new TabHistory_Week_Adapter(getApplicationContext(), (ArrayList<TabHistory_Week_List>) lists);
       // Toast.makeText(getApplicationContext(), a,Toast.LENGTH_SHORT).show();
        int a=db.getContactsCount();
        String jj=db.getContacts1Count();
        String oo=jj.substring(3,5);
        int yy=Integer.parseInt(oo);
        int gj=30-yy;
        int average=(3800-a)/gj;
        t.setText(Integer.toString(average), TextView.BufferType.EDITABLE);
        Log.d("Name: ", jj);


    }
}
