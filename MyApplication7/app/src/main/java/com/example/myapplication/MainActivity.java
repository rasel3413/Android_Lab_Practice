package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnAdd,btnMin,btnMulti,btnDiv,btnDot,btnEqual,btnDel,btnAc;
    EditText edt1;
    float mvalueOne,mvalueTwo;
    boolean Addition,Subtract,Multiplication,Division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne=findViewById(R.id.button1);
        btnTwo=findViewById(R.id.button2);
        btnThree=findViewById(R.id.button3);
        btnFour=findViewById(R.id.button4);
        btnFive=findViewById(R.id.button5);
        btnSix=findViewById(R.id.button6);
        btnSeven=findViewById(R.id.button7);
        btnEight=findViewById(R.id.button8);
        btnNine=findViewById(R.id.button9);
        btnZero=findViewById(R.id.button0);
        btnAdd=findViewById(R.id.button_Add);
        btnMin=findViewById(R.id.button_minus);
        btnMulti=findViewById(R.id.button_mul);
        btnDiv=findViewById(R.id.button_DIV);
        btnDot=findViewById(R.id.button_dot);
        edt1=findViewById(R.id.edt1);
        btnEqual=findViewById(R.id.buttonequal);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"9");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+".");
            }
        });

        btnAc=findViewById(R.id.buttonAC);
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt1==null){
                    edt1.setText("");
                }
                else{
                    mvalueOne=Float.parseFloat(edt1.getText()+"");
                    Addition=true;
                    edt1.setText(null);
                }
            }
        });
        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalueOne=Float.parseFloat(edt1.getText()+"");
                Subtract=true;
                edt1.setText(null);
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalueOne=Float.parseFloat(edt1.getText()+"");
                Multiplication=true;
                edt1.setText(null);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalueOne=Float.parseFloat(edt1.getText()+"");
                Division=true;
                edt1.setText(null);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalueTwo=Float.parseFloat(edt1.getText()+"");

                if(Addition==true){
                    edt1.setText(mvalueOne+mvalueTwo+"");
                    Addition=false;
                }
                if(Subtract=true){
                    edt1.setText(mvalueOne-mvalueTwo+"");
                    Subtract=false;
                }
                if(Multiplication=true){
                    edt1.setText(mvalueOne*mvalueTwo+"");
                    Multiplication=false;
                }
                if(Division=true){
                    edt1.setText(mvalueOne/mvalueTwo+"");
                    Division=false;
                }
            }
        });


    }
}