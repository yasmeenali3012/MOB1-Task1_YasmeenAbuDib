package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBirthday = findViewById(R.id.btnBirthday);
        btnBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BirthdayActivity.class));
            }
        });

        Button btnTaskDone = findViewById(R.id.btnTaskDone);
        btnTaskDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TaskDoneActivity.class));
            }
        });

        Button btnQuadrant = findViewById(R.id.btnQuadrant);
        btnQuadrant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QuadrantActivity.class));
            }
        });

        Button btnArticle = findViewById(R.id.btnArticle);
        btnArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ArticleActivity.class));
            }
        });

        Button btnBusinessCard = findViewById(R.id.btnBusinessCard);
        btnBusinessCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BusinessCardActivity.class));
            }
        });
    }
}