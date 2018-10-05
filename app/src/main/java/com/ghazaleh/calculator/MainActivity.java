package com.ghazaleh.calculator;
import android.widget.Button;
import  android.widget.EditText;
import android.view.View;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import static com.ghazaleh.calculator.R.id.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , button10 , buttonC , buttonEqual ;

    EditText edt1 ;

    float mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = (Button) findViewById(R.id.button_0);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        button6 = (Button) findViewById(R.id.button_6);
        button7 = (Button) findViewById(R.id.button_7);
        button8 = (Button) findViewById(R.id.button_8);
        button9 = (Button) findViewById(R.id.button_9);
        button10 = (Button) findViewById(R.id.button_Dot);
        buttonAdd = (Button) findViewById(R.id.button_addition);
        buttonSub = (Button) findViewById(R.id.button_subtract);
        buttonMul = (Button) findViewById(R.id.button_multiply);
        buttonDivision = (Button) findViewById(R.id.button_divide);
        buttonC = (Button) findViewById(R.id.button_clear);
        buttonEqual = (Button) findViewById(R.id.button_equal);
        edt1 = (EditText) findViewById(EditText);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
           public  void  onClick(View v){
                edt1.setText(edt1.getText()+ "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                edt1.setText(edt1.getText()+ "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                edt1.setText(edt1.getText()+ "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                edt1.setText(edt1.getText()+ "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                edt1.setText(edt1.getText()+ "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                edt1.setText(edt1.getText()+ "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                edt1.setText(edt1.getText()+ "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt1 == null){
                    edt1.setText("");
                }else {
                    mValueOne = Float.parseFloat(edt1.getText() + "");
                    mAddition = true;
                    edt1.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText() == null){
                    mValueOne = -1;
                }
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mSubtract = true ;
                edt1.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText() + "");
                mMultiplication = true ;
                edt1.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edt1.getText()+"");
                mDivision = true ;
                edt1.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edt1.getText() + "");

                if (mAddition == true){

                    edt1.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    edt1.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    edt1.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    edt1.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
    }
}
