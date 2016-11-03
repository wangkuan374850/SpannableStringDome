package com.example.wangkuan.spannablestringdome;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (EditText) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        //1
        setTv();
        setTV2();
    }

    private void setTV2() {


        // String trim = tv1.getText().toString().trim();
        SpannableString msp = new SpannableString("按时打算打算打打打打阿打算打算打啊实打实大师啊实打实大师大鞍山市达大厦");
        msp.setSpan(new TypefaceSpan("monospace"), 0, 3, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        //设置字体大小(绝对值，单位：像素)
        msp.setSpan(new AbsoluteSizeSpan(30, true), 4, 8, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        //设置字体前景色
        msp.setSpan(new ForegroundColorSpan(Color.CYAN), 10, 14, Spanned.SPAN_INCLUSIVE_INCLUSIVE);//设置前景色为洋红色
        //设置字体样式正常，粗体，斜体，粗斜体
        msp.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 16, 20, Spanned.SPAN_INCLUSIVE_INCLUSIVE);//粗体
        //设置下划线
        msp.setSpan(new UnderlineSpan(), 22, 25, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv2.setText(msp);

    }

    private void setTv() {

        String trim = tv1.getText().toString().trim();
        SpannableString msp = new SpannableString(trim);
        msp.setSpan(new TypefaceSpan("monospace"), 0, trim.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        //设置字体大小(绝对值，单位：像素)
        msp.setSpan(new AbsoluteSizeSpan(30, true), 0, trim.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        //设置字体前景色
        msp.setSpan(new ForegroundColorSpan(Color.CYAN), 0, trim.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);//设置前景色为洋红色
        //设置字体样式正常，粗体，斜体，粗斜体
        msp.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0, trim.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);//粗体
        //设置下划线
        msp.setSpan(new UnderlineSpan(), 0, trim.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        tv1.setText(msp);
    }

}
