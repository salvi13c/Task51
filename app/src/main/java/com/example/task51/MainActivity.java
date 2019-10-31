package com.example.task51;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(buttonClickListener);
        updateTime();

    }

    OnClickListener buttonClickListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            updateTime();

        }
    };



    public void updateTime() {
        btn.setText(new Date().toString());
    }

}
