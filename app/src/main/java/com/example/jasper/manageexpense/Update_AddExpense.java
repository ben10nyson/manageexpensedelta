package com.example.jasper.manageexpense;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Techsoft - 001 on 4/25/2017.
 */


public class Update_AddExpense extends Activity{

    EditText t,tt;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_expense);

       // listView = (ListView) findViewById(R.id.listView_edit_expense);
        t=(EditText)findViewById(R.id.editText3) ;
        tt=(EditText)findViewById(R.id.editText8) ;
        b = (Button) findViewById(R.id.button);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g=t.getText().toString();
                String h=tt.getText().toString();
               // int jg=Integer.parseInt(g);
                DBHelper db = new DBHelper(getApplicationContext());

               int gg=db.deleteAddCategory(h,g);


            }
        });
    }


}

