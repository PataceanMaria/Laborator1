package com.example.lab2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send(View v)
    {
        TextView first_name_text=findViewById(R.id.textView);
        TextView second_name_text=findViewById(R.id.textview2);
        TextView adress_text=findViewById(R.id.textView3);
        EditText first_name_box=findViewById(R.id.Name);
        EditText second_name_box=findViewById(R.id.Secod_name);
        EditText adress_box=findViewById(R.id.Adress);
        first_name_text.setText("My first name is "+first_name_box.getText().toString());
        second_name_text.setText("My second name is "+second_name_box.getText().toString());
        adress_text.setText("My adress is "+adress_box.getText().toString());
    }
}