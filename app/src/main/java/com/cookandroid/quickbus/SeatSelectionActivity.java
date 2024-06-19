package com.cookandroid.quickbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class SeatSelectionActivity extends AppCompatActivity {

    private GridLayout gridLayoutSeats;
    private Button selectedButton;
    private String selectedSeat = null;
    private String departure, destination, time, duration, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_selection);
        setTitle("좌석 선택");

        gridLayoutSeats = findViewById(R.id.gridLayoutSeats);
        Button btnConfirm = findViewById(R.id.btnConfirm);

        departure = getIntent().getStringExtra("departure");
        destination = getIntent().getStringExtra("destination");
        time = getIntent().getStringExtra("time");
        duration = getIntent().getStringExtra("duration");
        date = getIntent().getStringExtra("date");

        createSeatLayout();

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedSeat != null) {
                    Toast.makeText(SeatSelectionActivity.this, "선택된 좌석: " + selectedSeat, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SeatSelectionActivity.this, UserInfoActivity.class);
                    intent.putExtra("seat", selectedSeat);
                    intent.putExtra("departure", departure);
                    intent.putExtra("destination", destination);
                    intent.putExtra("time", time);
                    intent.putExtra("duration", duration);
                    intent.putExtra("date", date);
                    startActivity(intent);
                } else {
                    Toast.makeText(SeatSelectionActivity.this, "좌석을 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void createSeatLayout() {
        int totalRows = 10;
        int totalCols = 4;

        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalCols; col++) {
                if (row == 0) {
                    if (isDriverSeat(col, row)) {
                        createDriverSeat();
                    } else if (isDoor(col, row)) {
                        createDoorSpace();
                    } else {
                        createAisleSpace();
                    }
                } else {
                    if (isAisle(col)) {
                        createAisleSpace();
                    } else {
                        createSeatButton(row - 1, col);
                    }
                }
            }
        }
    }

    private boolean isAisle(int col) {
        return col == 2;
    }

    private boolean isDriverSeat(int col, int row) {
        return (row == 0 && col == 0);
    }

    private boolean isDoor(int col, int row) {
        return (row == 0 && col == 3);
    }

    private void createAisleSpace() {
        View space = new View(this);
        GridLayout.LayoutParams param = new GridLayout.LayoutParams();
        param.width = 0;
        param.height = 0;
        param.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        param.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        space.setLayoutParams(param);
        gridLayoutSeats.addView(space);
    }

    private void createDriverSeat() {
        Button button = new Button(this);
        button.setText("운전석");
        button.setEnabled(false);
        button.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
        GridLayout.LayoutParams param = new GridLayout.LayoutParams();
        param.width = 0;
        param.height = GridLayout.LayoutParams.WRAP_CONTENT;
        param.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        param.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        button.setLayoutParams(param);
        gridLayoutSeats.addView(button);
    }

    private void createDoorSpace() {
        View space = new View(this);
        GridLayout.LayoutParams param = new GridLayout.LayoutParams();
        param.width = 0;
        param.height = 0;
        param.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        param.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        space.setLayoutParams(param);
        gridLayoutSeats.addView(space);
    }

    private void createSeatButton(final int row, final int col) {
        Button button = new Button(this);
        String seatNumber = getSeatNumber(row, col);
        button.setText(seatNumber);
        button.setBackgroundResource(R.drawable.seat_selector);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedButton != null) {
                    selectedButton.setBackgroundResource(R.drawable.seat_selector);
                    selectedButton.setTextColor(ContextCompat.getColor(SeatSelectionActivity.this, android.R.color.black));
                }
                selectedButton = (Button) v;
                selectedSeat = seatNumber;
                selectedButton.setBackgroundResource(R.drawable.seat_selected);
                selectedButton.setTextColor(ContextCompat.getColor(SeatSelectionActivity.this, android.R.color.white));
            }
        });

        GridLayout.LayoutParams param = new GridLayout.LayoutParams();
        param.width = 0;
        param.height = GridLayout.LayoutParams.WRAP_CONTENT;
        param.rowSpec = GridLayout.spec(row + 1, 1f);
        param.columnSpec = GridLayout.spec(col, 1f);
        button.setLayoutParams(param);
        gridLayoutSeats.addView(button);
    }

    private String getSeatNumber(int row, int col) {
        char rowChar = (char) ('A' + row);
        int seatNumber = (col < 2) ? col + 1 : col;
        return rowChar + String.valueOf(seatNumber);
    }
}

