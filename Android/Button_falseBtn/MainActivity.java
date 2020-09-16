package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button trueBtn;
    private Button falseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueBtn = findViewById(R.id.trueBtn); //находим id в папке с ресурсами
        falseBtn = findViewById(R.id.falsBtn);

        trueBtn.setOnClickListener(new View.OnClickListener() {//метод будет слушать клик, устаноили слушателя на наш элекмент
            @Override
            public void onClick(View v) {// действия которые будут производиться по нажатию на кнопку trueBtn
               Toast.makeText(MainActivity.this,"Правильно",Toast.LENGTH_SHORT).show(); // всплывает уведомление Правильно при нажатии на  кнопку trueBtn
            }
        });
        falseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Неправильно",Toast.LENGTH_SHORT).show(); // Дз сделать уведомление на кнопку falseBtn
            }
        });

    }
}
