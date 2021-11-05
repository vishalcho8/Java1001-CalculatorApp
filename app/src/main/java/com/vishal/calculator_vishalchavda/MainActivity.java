/*
Author: Vishal Upendra Chavda
App: Calculator App
Description: This app will perform following basic mathmatic operations:
           1. Addition
           2. Subtraction
           3. Multiplication
           4. Division
           5. Suqare
           6. Square Root
           7. Inverse (1 Divided by given number.)
           Note:
            1. User is expected to click on Clear button before proceeding for the next operation after each operation is done.
            2. If CLear button is not clicked, result of previous operation will be used as a first input.
            Ex. When clear button is not clicked:
                //First time
                Edit text: 0 (Initially)
                30+40
                O/P: 70

                //Second time
                - 40    (No need to provide first input. Here 70 will be used as the first input from previous result)
                O/P: 30 (70 - 40)


            Ex. When clear button is clicked:
                //First time
                Edit text: 0 (Initially)
                30+40
                O/P: 70

               //Second time
               70 - 40    (Explicitly need to provide first input i.e 70 in this case since previous result has been vanished.)
               O/P: 30

History:
04/11/2021 -    v1.0    -   Added onCreate() and onClick()  -   Initial version
*/
package com.vishal.calculator_vishalchavda;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    //Create required fields to map with UI
    EditText etInput;
    Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix,
            buttonSeven, buttonEight, buttonNine, buttonAdd, buttonSub,buttonMul,buttonDiv,
            buttonClear, buttonEqual, buttonDecimal, buttonSquare, buttonSqrt, buttonInverse;



    //Crate and Initialize required variables
    double inputOne = 0.0, inputTwo = 0.0;
    boolean opAdd = false, opSub = false, opMul = false, opDiv = false, opClear = false, opSq = false, opSqrt = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find and store required fields from the layout
        etInput         =   findViewById(R.id.etInput);
        buttonZero      =   findViewById(R.id.btnZero);
        buttonOne       =   findViewById(R.id.btnOne);
        buttonTwo       =   findViewById(R.id.btnTwo);
        buttonThree     =   findViewById(R.id.btnThree);
        buttonFour      =   findViewById(R.id.btnFour);
        buttonFive      =   findViewById(R.id.btnFive);
        buttonSix       =   findViewById(R.id.btnSix);
        buttonSeven     =   findViewById(R.id.btnSeven);
        buttonEight     =   findViewById(R.id.btnEight);
        buttonNine      =   findViewById(R.id.btnNine);
        buttonAdd       =   findViewById(R.id.btnAdd);
        buttonSub       =   findViewById(R.id.btnSub);
        buttonMul       =   findViewById(R.id.btnMul);
        buttonDiv       =   findViewById(R.id.btnDiv);
        buttonClear     =   findViewById(R.id.btnClear);
        buttonEqual     =   findViewById(R.id.btnCalc);
        buttonDecimal   =   findViewById(R.id.btnDecimal);
        buttonSquare    =   findViewById(R.id.btnSquare);
        buttonSqrt      =   findViewById(R.id.btnSqrt);
        buttonInverse   =   findViewById(R.id.btnInverse);

        //Passing current instance to the onclick listener based on the button clicked.
        buttonZero.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonSqrt.setOnClickListener(this);
        buttonSquare.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonDecimal.setOnClickListener(this);
        buttonInverse.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        //depending on which Button is clicked, execute the case and perform neccessary actions.
        switch(view.getId()){
            case R.id.btnZero:      //if(pressedButton == 0)
                etInput.setText(etInput.getText() + String.valueOf(0));
                break;
            case R.id.btnOne:       //if(pressedButton == 1)
                etInput.setText(etInput.getText() + String.valueOf(1));
                break;
            case R.id.btnTwo:       //if(pressedButton == 2)
                etInput.setText(etInput.getText() + String.valueOf(2));
                break;
            case R.id.btnThree:     //if(pressedButton == 3)
                etInput.setText(etInput.getText() + String.valueOf(3));
                break;
            case R.id.btnFour:      //if(pressedButton == 4)
                etInput.setText(etInput.getText() + String.valueOf(4));
                break;
            case R.id.btnFive:      //if(pressedButton == 5)
                etInput.setText(etInput.getText() + String.valueOf(5));
                break;
            case R.id.btnSix:       //if(pressedButton == 6)
                etInput.setText(etInput.getText() + String.valueOf(6));
                break;
            case R.id.btnSeven:     //if(pressedButton == 7)
                etInput.setText(etInput.getText() + String.valueOf(7));
                break;
            case R.id.btnEight:     //if(pressedButton == 8)
                etInput.setText(etInput.getText() + String.valueOf(8));
                break;
            case R.id.btnNine:      //if(pressedButton == 9)
                etInput.setText(etInput.getText() + String.valueOf(9));
                break;
            case R.id.btnDecimal:   //if(pressedButton == Decimal)
                if (etInput.getText().toString().contains(".")){
                    //Do nothing as number should not have more than one decimal.
                }
                else{
                    etInput.setText(etInput.getText() + ".");
                }
                break;
            case R.id.btnClear:     //if(pressedButton == CLear)
                etInput.setText(null);
                break;
            case R.id.btnAdd:       //if(pressedButton == +)
                inputOne = Double.parseDouble(etInput.getText().toString());
                opAdd = true;
                etInput.setText(null);
                break;
            case R.id.btnSub:       //if(pressedButton == -)
                inputOne = Double.parseDouble(etInput.getText().toString());
                opSub = true;
                etInput.setText(null);
                break;
            case R.id.btnMul:       //if(pressedButton == *)
                inputOne = Double.parseDouble(etInput.getText().toString());
                opMul = true;
                etInput.setText(null);
                break;
            case R.id.btnDiv:       //if(pressedButton == /)
                inputOne = Double.parseDouble(etInput.getText().toString());
                opDiv= true;
                etInput.setText(null);
                break;
            case R.id.btnSquare:    //if(pressedButton == SQUARE)
                inputOne = Double.parseDouble(etInput.getText().toString());
                etInput.setText(String.valueOf(Math.pow(inputOne,2)));

                /* Get the current edit text value again to use the current result for next operation.
                    Applicable only when operation involves only one input i.e SQ,SQRT, and 1/X
                */
                inputOne = Double.parseDouble(etInput.getText().toString());

                break;
            case R.id.btnSqrt:      //if(pressedButton == SQUARE ROOT)
                inputOne = Double.parseDouble(etInput.getText().toString());
                etInput.setText(String.valueOf(Math.sqrt(inputOne)));

               /* Get the current edit text value again to use the current result for next operation.
                    Applicable only when operation involves only one input i.e SQ,SQRT, and 1/X
                */
                inputOne = Double.parseDouble(etInput.getText().toString());

                break;
            case R.id.btnInverse:   //if(pressedButton == 1/X)
                inputOne = Double.parseDouble(etInput.getText().toString());
                etInput.setText(String.valueOf(1/(inputOne)));

                /* Get the current edit text value again to use the current result for next operation.
                    Applicable only when operation involves only one input i.e SQ,SQRT, and 1/X
                */
                inputOne = Double.parseDouble(etInput.getText().toString());

                break;
            case R.id.btnCalc:      //if(pressedButton == EQUAL)
                inputTwo = Double.parseDouble(etInput.getText().toString());

                //Perform Addition
                if (opAdd == true) {
                    etInput.setText(String.valueOf(inputOne + inputTwo));
                    opAdd = false;
                }

                //Perform Subtraction
                if (opSub == true) {
                    etInput.setText(String.valueOf(inputOne - inputTwo));
                    opSub = false;
                }

                //Perform Multiplication
                if (opMul == true) {
                    etInput.setText(String.valueOf(inputOne * inputTwo));
                    opMul = false;
                }

                //Perform Division
                if (opDiv == true) {
                    etInput.setText(String.valueOf(inputOne / inputTwo));
                    opDiv = false;
                }
                break;
            default: //else
                Log.e("ClickEvent", "You clicked the wrong button");
                break;      //Optional

        }
    }

}
