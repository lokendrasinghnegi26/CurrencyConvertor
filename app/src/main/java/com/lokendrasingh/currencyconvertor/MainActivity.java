package com.lokendrasingh.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void btnclick(View view)
    {
        EditText dollarAmount= (EditText) findViewById(R.id.dollarAmount);
         String dollars=dollarAmount.getText().toString();
        Double doubleDollar = Double.parseDouble(dollars);
        Double InrAmount= 70.21* doubleDollar;
         String toasttext= "= "  + InrAmount.toString()+ " rupees";
        Toast.makeText(this, toasttext, Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}