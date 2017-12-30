package com.example.user.clickertime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityFive extends AppCompatActivity {
    TextView textView4;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        textView4 = (TextView) findViewById(R.id.textView4);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button4:
                        Intent intent = new Intent( ActivityFive.this, ActivitySix.class);
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

