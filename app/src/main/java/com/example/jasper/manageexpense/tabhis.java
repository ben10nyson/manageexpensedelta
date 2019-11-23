package com.example.jasper.manageexpense;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tabhis {
    //private int id;
    //private String name;
    private int amount;
  //  private String date;
    //private String note;

    public tabhis( int amount) {

        this.amount = amount;

    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
