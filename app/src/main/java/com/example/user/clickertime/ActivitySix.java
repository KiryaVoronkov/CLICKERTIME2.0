package com.example.user.clickertime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;

public class ActivitySix extends AppCompatActivity {
    private TextView helloTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        helloTv = (TextView) findViewById(R.id.hello_tv);
        Button helloBtn = (Button) findViewById(R.id.hello_btn);

        helloBtn.setOnClickListener(onClickListener);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date date = new Date();

            String stringDate = DateFormat.getTimeInstance().format(date);
            helloTv.setText("Time: " + stringDate);

        }
    };
}

