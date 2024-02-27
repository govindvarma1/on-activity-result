package com.example.resultintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    EditText e1, e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        e1 = findViewById(R.id.editTextText4);
        e2 = findViewById(R.id.editTextText5);
        b1 = findViewById(R.id.button3);
        Intent intent = getIntent();
        e1.setText(intent.getStringExtra("num1"));
        e2.setText(intent.getStringExtra("num2"));
        int a = Integer.parseInt(e1.getText().toString());
        int b = Integer.parseInt(e2.getText().toString());
        int d = a - b;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity3.this, MainActivity.class);
                intent1.putExtra("res", String.valueOf(d));
                setResult(RESULT_OK, intent1);
                finish();
            }
        });
    }
}