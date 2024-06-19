package com.cookandroid.quickbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class UserInfoActivity extends AppCompatActivity {

    private EditText editTextName, editTextPhone, editTextPassword;
    private String selectedSeat, departure, destination, time, duration, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        setTitle("사용자 정보 입력");

        editTextName = findViewById(R.id.editTextName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextPassword = findViewById(R.id.editTextPassword);
        Button btnConfirm = findViewById(R.id.btnConfirm);

        Intent intent = getIntent();
        selectedSeat = intent.getStringExtra("seat");
        departure = intent.getStringExtra("departure");
        destination = intent.getStringExtra("destination");
        time = intent.getStringExtra("time");
        duration = intent.getStringExtra("duration");
        date = intent.getStringExtra("date");

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String phone = editTextPhone.getText().toString();
                String password = editTextPassword.getText().toString();

                if (name.isEmpty() || phone.isEmpty() || password.isEmpty()) {
                    Toast.makeText(UserInfoActivity.this, "모든 정보를 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(UserInfoActivity.this, TicketInfoActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("phone", phone);
                    intent.putExtra("selectedSeat", selectedSeat);
                    intent.putExtra("departure", departure);
                    intent.putExtra("destination", destination);
                    intent.putExtra("time", time);
                    intent.putExtra("duration", duration);
                    intent.putExtra("date", date);
                    startActivity(intent);
                }
            }
        });
    }
}
