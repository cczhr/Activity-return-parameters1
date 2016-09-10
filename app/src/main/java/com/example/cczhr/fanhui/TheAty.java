package com.example.cczhr.fanhui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by cczhr on 2016/9/10.
 */

public class TheAty extends AppCompatActivity {
    private TextView tv;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_aty);
        editText=(EditText)findViewById(R.id.editText);
        tv=(TextView)findViewById(R.id.tv);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.putExtra("data",editText.getText().toString());
                setResult(1,i);
                //finish();
            }
        });
    }

}
