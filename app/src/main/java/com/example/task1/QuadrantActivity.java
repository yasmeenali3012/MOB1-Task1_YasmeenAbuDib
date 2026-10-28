package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class QuadrantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrant);

        LinearLayout box1 = findViewById(R.id.box1);
        LinearLayout box2 = findViewById(R.id.box2);
        LinearLayout box3 = findViewById(R.id.box3);
        LinearLayout box4 = findViewById(R.id.box4);

        int nightModeFlags = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;

        if (box1 != null && box2 != null && box3 != null && box4 != null) {
            if (nightModeFlags == Configuration.UI_MODE_NIGHT_YES) {

                box1.setBackgroundColor(Color.parseColor("#5D4037"));
                box2.setBackgroundColor(Color.parseColor("#3E2723"));
                box3.setBackgroundColor(Color.parseColor("#4E342E"));
                box4.setBackgroundColor(Color.parseColor("#6D4C41"));
            } else {

                box1.setBackgroundColor(Color.parseColor("#FAD5B8"));
                box2.setBackgroundColor(Color.parseColor("#FDE4D3"));
                box3.setBackgroundColor(Color.parseColor("#F9E1D4"));
                box4.setBackgroundColor(Color.parseColor("#FCDAC6"));
            }
        }
    }
}