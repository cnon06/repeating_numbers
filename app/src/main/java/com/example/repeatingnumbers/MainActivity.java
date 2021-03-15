package com.example.repeatingnumbers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;


public class MainActivity extends AppCompatActivity {


    public void msg_box(String msg)
    {

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage(msg);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });


        alertDialog.show();

    }


    public String  repeating_numbers(String number_one, String number_two) {

        //String number_two = "10";
    String er ="";



            try {
                BigDecimal bg = new BigDecimal(number_one);
                MathContext mc = new MathContext(5, RoundingMode.HALF_EVEN);

                er = bg.divide(new BigDecimal(number_two),mc).toString();

            }
    catch (Exception e)
    {
        return e.toString();
    }
        return er;
        //display.setText(number_two);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this method was written to solve repeating number issue in dividing process


        msg_box(repeating_numbers("10","3"));

    }
}