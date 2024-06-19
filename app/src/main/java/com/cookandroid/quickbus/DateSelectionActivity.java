package com.cookandroid.quickbus;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class DateSelectionActivity extends AppCompatActivity {

    CalendarView calendarView;
    Button btnConfirm;
    String selectedDate;
    String departure, destination, time, duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_selection);
        setTitle("날짜 선택");

        calendarView = findViewById(R.id.calendarView);
        btnConfirm = findViewById(R.id.btnConfirm);

        departure = getIntent().getStringExtra("departure");
        destination = getIntent().getStringExtra("destination");
        time = getIntent().getStringExtra("time");
        duration = getIntent().getStringExtra("duration");

        Calendar calendar = Calendar.getInstance();
        long now = calendar.getTimeInMillis();
        calendar.add(Calendar.MONTH, 1);
        long oneMonthLater = calendar.getTimeInMillis();

        calendarView.setMinDate(now);
        calendarView.setMaxDate(oneMonthLater);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                selectedDate = year + "/" + (month + 1) + "/" + dayOfMonth;
            }
        });

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedDate != null) {
                    Intent intent = new Intent(DateSelectionActivity.this, SeatSelectionActivity.class);
                    intent.putExtra("departure", departure);
                    intent.putExtra("destination", destination);
                    intent.putExtra("time", time);
                    intent.putExtra("duration", duration);
                    intent.putExtra("date", selectedDate);
                    startActivity(intent);
                } else {
                    Toast.makeText(DateSelectionActivity.this, "날짜를 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
