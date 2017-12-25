package com.example.dell_pc.activity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.dell_pc.activity1.R.id.email;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Intent intent = getIntent();
        TextView name = (TextView) findViewById(R.id.name);
        TextView age = (TextView) findViewById(R.id.Email);
       name.setText(getIntent().getStringExtra("name"));
       name.setText(getIntent().getStringExtra("email"));
        String s = intent.getStringExtra("Name");
        String s1 = intent.getStringExtra("email");
    }
}
