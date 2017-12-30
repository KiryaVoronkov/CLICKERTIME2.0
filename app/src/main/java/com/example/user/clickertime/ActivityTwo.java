package com.example.user.clickertime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    Button button1;
    TextView textView1;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_two);
            textView1 = (TextView) findViewById(R.id.textView1);
            button1 = (Button) findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.button1:
                            Intent intent = new Intent(ActivityTwo.this, ActivityThree.class);
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



