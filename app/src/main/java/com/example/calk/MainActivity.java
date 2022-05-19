package com.example.calk;

import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText text;
    String oper = "";
    int result = 0;
    @Override
    public void onClick(View view) {
        String numS = "";
        String numS1 = "";
        int num1 = 0;
        int num2 = 0;
        String txt = "";

        switch (view.getId()){
            case R.id.one:
                numS += "1";
                txt = numS;
                text.setText(txt);
                break;
            case R.id.two:
                numS += "2";
                txt = numS;
                text.setText(txt);
                break;
            case R.id.three:
                numS += "3";
                txt = numS;
                text.setText(txt);
                break;
            case R.id.four:
                numS += "4";
                txt = numS;
                text.setText(txt);
                break;
            case R.id.five:
                numS += "5";
                txt = numS;
                text.setText(txt);
                break;
            case R.id.six:
                numS += " 6";
                txt = numS;
                text.setText(txt);
                break;
            case R.id.seven:
                numS += "7";
                txt = numS;
                text.setText(txt);
                break;
            case R.id.eight:
                numS += "8";
                txt = numS;
                text.setText(txt);
                break;
            case R.id.nine:
                numS += "9";
                txt = numS;
                text.setText(txt);
                break;
            case R.id.zero:
                numS += "0";
                txt = numS;
                text.setText(txt);
                break;
            default:
                break;

        }

        switch (view.getId()){
            case R.id.plus:
                oper = "+";
                txt = oper;
                text.setText(txt);
                break;
            case R.id.minus:
                oper = "-";
                txt = oper;
                text.setText(txt);
                break;
            case R.id.share:
                oper = "÷";
                txt = oper;
                text.setText(txt);
                break;
            case R.id.multiply:
                oper = "×";
                txt = oper;
                text.setText(txt);
                break;

            default:
                break;
        }

        switch (view.getId()){
            case R.id.one:
                numS1 += "1";
                txt = numS1;
                text.setText(txt);
                break;
            case R.id.two:
                numS1 += "2";
                txt = numS1;
                text.setText(txt);
                break;
            case R.id.three:
                numS1 += "3";
                txt = numS1;
                text.setText(txt);
                break;
            case R.id.four:
                numS1 += "4";
                txt = numS1;
                text.setText(txt);
                break;
            case R.id.five:
                numS1 += "5";
                txt = numS1;
                text.setText(txt);
                break;
            case R.id.six:
                numS1 += " 6";
                txt = numS1;
                text.setText(txt);
                break;
            case R.id.seven:
                numS1 += "7";
                txt = numS1;
                text.setText(txt);
                break;
            case R.id.eight:
                numS1 += "8";
                txt = numS1;
                text.setText(txt);
                break;
            case R.id.nine:
                numS1 += "9";
                txt = numS1;
                text.setText(txt);
                break;
            case R.id.zero:
                numS1 += "0";
                txt = numS1;
                text.setText(txt);
                break;
            default:
                break;

        }

        switch (view.getId()){
            case R.id.equals:
                num1 = Integer.parseInt(numS.toString());
                num2 = Integer.parseInt(numS1.toString());
                if(oper.equals("+")){
                    result = num1 + num2;

                }else if (oper.equals("-")){
                    result = num1 + num2;
                }
                else if (oper.equals("÷")){
                    result = num1 / num2;
                }else{
                    result = num1 * num2;
                }
                break;
            default:
                break;
        }

        text.setText(result);


    }
}
