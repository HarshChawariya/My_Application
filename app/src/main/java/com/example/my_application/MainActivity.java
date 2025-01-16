package com.example.my_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    String data;
TextView result, operations;
ImageView add, sub, multiply, divide, back, one, two, three, four, five, six, seven, eight, nine, zero, eql, dot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent magic = new Intent(getApplicationContext(), MagicActivity.class);
        Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        back = findViewById(R.id.clearbtn);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        eql = findViewById(R.id.eql);
        result = findViewById(R.id.result);
        operations = findViewById(R.id.operations);
        dot = findViewById(R.id.dot);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"*");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"/");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
           operations.setText(data+".");
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalResult = "";
                Scriptable scriptable = rhino.initStandardObjects();
                finalResult = rhino.evaluateString(scriptable, data, "javascript",1, null).toString();
                result.setText(finalResult);
                if(data.equals("2074")){
                    startActivity(magic);
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operations.setText("");
                result.setText("");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = operations.getText().toString();
                operations.setText(data+"0");
            }
        });
    }


}