package com.example.resultintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = findViewById(R.id.t2);
        e2 = findViewById(R.id.t1);
        b1 = findViewById(R.id.b1);
        Intent intent = getIntent();
        e1.setText(intent.getStringExtra("num1"));
        e2.setText(intent.getStringExtra("num2"));
        int a =Integer.parseInt(e1.getText().toString());
        int b =Integer.parseInt(e2.getText().toString());
        int c =a+b;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity.class);
                intent1.putExtra("res", String.valueOf(c));
                setResult(RESULT_OK, intent1);
                finish();
            }
        });
    }
}