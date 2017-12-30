package com.example.user.clickertime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityThree extends AppCompatActivity {
    Button button2;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        textView2 = (TextView) findViewById(R.id.textView2);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button2:
                        Intent intent = new Intent( ActivityThree.this, ActivityFour.class);
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

