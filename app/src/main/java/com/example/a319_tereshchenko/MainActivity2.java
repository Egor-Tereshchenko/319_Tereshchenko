package com.example.a319_tereshchenko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText text3 = findViewById(R.id.txt3);
        EditText text4 = findViewById(R.id.txt4);
        Button nazvanie = (Button) findViewById(R.id.button2);
        nazvanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text3.getText().toString().equals("") || text4.getText().toString().equals("")){
                    Toast.makeText(MainActivity2.this, "Ошибка регистрации.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent j = new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(j);
                }
            }
        });

    }


}
