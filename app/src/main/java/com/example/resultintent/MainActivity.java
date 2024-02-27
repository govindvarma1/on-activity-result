package com.example.resultintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    EditText n1, n2, n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        n1 = findViewById(R.id.editTextText);
        n2 = findViewById(R.id.editTextText2);
        n3 = findViewById(R.id.editTextText3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("num1", n1.getText().toString());
                intent.putExtra("num2", n2.getText().toString());
                startActivityIfNeeded(intent, 1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                intent.putExtra("num1", n1.getText().toString());
                intent.putExtra("num2", n2.getText().toString());
                startActivityIfNeeded(intent, 2);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1) {
            if(resultCode == RESULT_OK) {
                n3.setText(data.getStringExtra("res"));
            }
        } else if(requestCode == 2) {
            if(resultCode  == RESULT_OK) {
                n3.setText(data.getStringExtra("res"));
            }
        }
    }
}