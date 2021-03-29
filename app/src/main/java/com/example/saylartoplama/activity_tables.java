package com.example.saylartoplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class activity_tables extends AppCompatActivity {

    private ImageView imgBack;
    private TextView tvText,tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    private List<TextView> textViews =new ArrayList<>();
    private int tablo=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
        findView();

        textViews.add(tv1);
        textViews.add(tv2);
        textViews.add(tv3);
        textViews.add(tv4);
        textViews.add(tv5);
        textViews.add(tv6);
        textViews.add(tv7);
        textViews.add(tv8);
        textViews.add(tv9);
        textViews.add(tv10);
    }

    public void onClick(View view){
        switch (view.getId())
        {
            case R.id.btn1:
                tablo=1;
                break;
            case R.id.btn2:
                tablo=2;
                break;
            case R.id.btn3:
                tablo=3;
                break;
            case R.id.btn4:
                tablo=4;
                break;
            case R.id.btn5:
                tablo=5;
                break;
            case R.id.btn6:
                tablo=6;
                break;
            case R.id.btn7:
                tablo=7;
                break;
            case R.id.btn8:
                tablo=8;
                break;
            case R.id.btn9:
                tablo=9;
                break;
            case R.id.btn10:
                tablo=10;
                break;
            default:
                tablo=1;
                break;
        }
        setTablo();

    }
    public void onLeftClick(View view){
        onBackPressed();
    }

    private void setTablo() {
        for (int i=0; i<10; i++){
            textViews.get(i).setText(tablo+""+"+"+(i+1)+""+"="+(tablo+(i+1)));
        }
    }

    private void findView() {
        imgBack=findViewById(R.id.imgBack);
        tvText=findViewById(R.id.tvText);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        tv7=findViewById(R.id.tv7);
        tv8=findViewById(R.id.tv8);
        tv9=findViewById(R.id.tv9);
        tv10=findViewById(R.id.tv10);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);

    }
}