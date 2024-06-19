package com.cookandroid.quickbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TicketInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_info);
        setTitle("탑승 정보");

        TextView tvName = findViewById(R.id.tvName);
        TextView tvPhone = findViewById(R.id.tvPhone);
        TextView tvSeat = findViewById(R.id.tvSeat);
        TextView tvDeparture = findViewById(R.id.tvDeparture);
        TextView tvDestination = findViewById(R.id.tvDestination);
        TextView tvTime = findViewById(R.id.tvTime);
        TextView tvDuration = findViewById(R.id.tvDuration);
        TextView tvDate = findViewById(R.id.tvDate);
        Button btnConfirmBooking = findViewById(R.id.btnConfirmBooking);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String phone = intent.getStringExtra("phone");
        String selectedSeat = intent.getStringExtra("selectedSeat");
        String departure = intent.getStringExtra("departure");
        String destination = intent.getStringExtra("destination");
        String time = intent.getStringExtra("time");
        String duration = intent.getStringExtra("duration");
        String date = intent.getStringExtra("date");

        tvName.setText("이름: " + name);
        tvPhone.setText("전화번호: " + phone);
        tvSeat.setText("좌석: " + selectedSeat);
        tvDeparture.setText("출발지: " + departure);
        tvDestination.setText("도착지: " + destination);
        tvTime.setText("출발시간: " + time);
        tvDuration.setText("소요시간: " + duration);
        tvDate.setText("탑승날짜: " + date);

        btnConfirmBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TicketInfoActivity.this, BookingCompleteActivity.class);
                startActivity(intent);
            }
        });
    }
}
