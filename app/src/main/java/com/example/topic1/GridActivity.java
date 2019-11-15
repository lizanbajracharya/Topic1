package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GridActivity extends AppCompatActivity {
    EditText etNumber;
    TextView tvAnswer;
    Boolean checkadd;
    Boolean checksub;
    Boolean checkmultiply;
    Boolean checkdivide;
    float number;
    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnDivide,btnStop,btnEqual,btnMultiply,btnPlus,btnSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        tvAnswer=findViewById(R.id.tvAnswer);
        etNumber=findViewById(R.id.etNumber);
        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);
        btnZero=findViewById(R.id.btnZero);
        btnPlus=findViewById(R.id.btnPlus);
        btnSub=findViewById(R.id.btnSub);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        btnEqual=findViewById(R.id.btnEqual);
        btnStop=findViewById(R.id.btnStop);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("1");
                    return;
                }
                else
                    {
                    etNumber.setText(etNumber.getText() + "1");
                }
                tvAnswer.setText(etNumber.getText()+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("2");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + "2");
                }
                tvAnswer.setText(etNumber.getText()+"2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("3");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + "3");
                }
                tvAnswer.setText(etNumber.getText()+"3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("4");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + "4");
                }
                tvAnswer.setText(etNumber.getText()+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("5");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + "5");
                }
                tvAnswer.setText(etNumber.getText()+"5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("6");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + "6");
                }
                tvAnswer.setText(etNumber.getText()+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("7");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + "7");
                }
                tvAnswer.setText(etNumber.getText()+"7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("8");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + "8");
                }
                tvAnswer.setText(etNumber.getText()+"8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("9");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + "9");
                }
                tvAnswer.setText(etNumber.getText()+"9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText("0");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + "0");
                }
                tvAnswer.setText(etNumber.getText()+"0");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setError("Enter number");
                    return;
                }
                else {
                    Arithmetic arithmetic = new Arithmetic("Plus");
                    checkadd = arithmetic.Check();
                    number = Float.parseFloat(etNumber.getText().toString());
                    etNumber.setText(null);
                }
                tvAnswer.setText(etNumber.getText()+"+");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setError("Enter number");
                    return;
                }
                else {
                    Arithmetic arithmetic = new Arithmetic("Sub");
                    checksub = arithmetic.Check();
                    Toast.makeText(GridActivity.this, "Status "+ checksub, Toast.LENGTH_SHORT).show();
                    number = Float.parseFloat(etNumber.getText().toString());
                    etNumber.setText(null);
                }
                tvAnswer.setText(etNumber.getText()+"-");
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setText(".");
                    return;
                }
                else
                {
                    etNumber.setText(etNumber.getText() + ".");
                }
                tvAnswer.setText(etNumber.getText()+".");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setError("Enter number");
                    return;
                }
                else {
                    Arithmetic arithmetic = new Arithmetic("Multiply");
                    checkmultiply = arithmetic.Check();
                    number = Float.parseFloat(etNumber.getText().toString());
                    etNumber.setText(null);
                }
                tvAnswer.setText(etNumber.getText()+"*");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setError("Enter number");
                    return;
                }
                else{
                Arithmetic arithmetic=new Arithmetic("Divide");
                checkdivide=arithmetic.Check();
                number=Float.parseFloat(etNumber.getText().toString());
                etNumber.setText(null);
                }
                tvAnswer.setText(etNumber.getText()+"/");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number2=Float.parseFloat(etNumber.getText().toString());
                if(TextUtils.isEmpty(etNumber.getText()))
                {
                    etNumber.setError("Enter number");
                    return;
                }
                else {

                    if (checkadd == true) {
                        Arithmetic arithmetic = new Arithmetic("Plus");
                        Float result = arithmetic.Calculate(number, number2);
                        tvAnswer.setText(number + "+" + number2 + "=" + result);
                        etNumber.setText(null);
                    } else if (checksub == true) {
                        Arithmetic arithmetic = new Arithmetic("Sub");
                        Float result = arithmetic.Calculate(number, number2);
                        tvAnswer.setText(number + "-" + number2 + "=" + result);
                        etNumber.setText(null);
                    } else if (checkmultiply == true) {
                        Arithmetic arithmetic = new Arithmetic("Multiply");
                        Float result = arithmetic.Calculate(number, number2);
                        tvAnswer.setText(number + "*" + number2 + "=" + result);
                        etNumber.setText(null);
                        checkmultiply = false;
                    } else if (checkdivide == true) {
                        Arithmetic arithmetic = new Arithmetic("Divide");
                        Float result = arithmetic.Calculate(number, number2);
                        tvAnswer.setText(number + "/" + number2 + "=" + result);
                        etNumber.setText(null);
                        checkdivide = false;
                    } else {
                        Toast.makeText(GridActivity.this, "MC", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
