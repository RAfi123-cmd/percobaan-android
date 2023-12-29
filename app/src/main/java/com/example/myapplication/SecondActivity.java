package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewWelcome;
    private TextView textViewFirstName;
    private TextView textViewSelectedUserName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewWelcome = findViewById(R.id.textViewWelcome);
        textViewFirstName = findViewById(R.id.textViewFirstName);
        textViewSelectedUserName = findViewById(R.id.textViewSelectedUserName);



        // Retrieve data from the first screen
        Intent intent = getIntent();
        if (intent != null) {
            String firstName = intent.getStringExtra("FIRST_NAME");
            textViewFirstName.setText(firstName);
        }
    }


}
