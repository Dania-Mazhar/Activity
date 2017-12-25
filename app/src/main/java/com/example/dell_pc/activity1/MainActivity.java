package com.example.dell_pc.activity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private Button enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        email=(EditText) findViewById(R.id.email);
        enter=(Button) findViewById(R.id.enter);

             enter.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     validate(name.getText().toString(), email.getText().toString());
                 }


             });


    }

    private void validate(String s, String s1) {
        Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        intent.putExtra("Name", "Your  Name Here");
        intent.putExtra("email", "Your email Here");
        startActivity(intent);

    }
}
