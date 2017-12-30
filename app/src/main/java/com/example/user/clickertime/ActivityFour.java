package com.example.user.clickertime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityFour extends AppCompatActivity {
    TextView textView3;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        textView3 = (TextView) findViewById(R.id.textView3);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button3:
                        Intent intent = new Intent( ActivityFour.this, ActivityFive.class);
                        startActivity(intent);
                        break;
                    default:
                        break;

                }

            }
        });
    }

    public void click(View view) {
    }
}
