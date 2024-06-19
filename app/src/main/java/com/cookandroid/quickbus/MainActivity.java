package com.cookandroid.quickbus;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnStartBooking;
    Button btnViewTimetable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("QuickBus");

        btnStartBooking = findViewById(R.id.btnStartBooking);
        btnViewTimetable = findViewById(R.id.btnViewTimetable);

        btnStartBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectLocationActivity.class);
                intent.putExtra("isBooking", true);
                startActivity(intent);
            }
        });

        btnViewTimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectLocationActivity1.class);
                intent.putExtra("isBooking", false);
                startActivity(intent);
            }
        });
    }
}
