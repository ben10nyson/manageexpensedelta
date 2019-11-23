package com.example.jasper.manageexpense;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Techsoft - 001 on 4/25/2017.
 */


public class Update_AddExpense extends AppCompatActivity{

    EditText t,tt,ttt;
    TextView yyy;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_expense);

       // listView = (ListView) findViewById(R.id.listView_edit_expense);
        t=(EditText)findViewById(R.id.editText3) ;
        tt=(EditText)findViewById(R.id.editText8) ;
        ttt=(EditText)findViewById(R.id.editText) ;
        yyy=(TextView) findViewById(R.id.textView4) ;
        b = (Button) findViewById(R.id.button);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g=t.getText().toString();
                String h=tt.getText().toString();
                String hh=ttt.getText().toString();

                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(t.getWindowToken(), 0);
                InputMethodManager immm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                immm.hideSoftInputFromWindow(tt.getWindowToken(), 0);
                InputMethodManager imnm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imnm.hideSoftInputFromWindow(ttt.getWindowToken(), 0);
               // int jg=Integer.parseInt(g);
                DBHelper db = new DBHelper(getApplicationContext());

               int gg=db.deleteAddCategory(h,g,hh);
                                               startActivity(new Intent(getApplicationContext(), MainActivity.class));
                /*Graph_all fragment = new Graph_all();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame, fragment, "Graphs");
                fragmentTransaction.commit();*/



            }
        });
    }


}

