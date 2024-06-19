package com.cookandroid.quickbus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import java.util.HashSet;

public class SelectLocationActivity extends AppCompatActivity {
    LinearLayout linearLayoutDeparture, linearLayoutDestination;
    Button btnConfirm;
    TextView selectedRoute, destinationLabel;
    String selectedDeparture, selectedDestination;
    boolean isBooking;

    String[][] busTimetable = {
            {"서울", "부산", "7:40", "4시간"},
            {"서울", "부산", "8:40", "4시간"},
            {"서울", "부산", "8:50", "4시간"},
            {"서울", "부산", "9:20", "4시간"},
            {"서울", "부산", "10:30", "4시간"},
            {"서울", "부산", "11:00", "4시간"},
            {"서울", "부산", "11:20", "4시간"},
            {"서울", "부산", "13:40", "4시간"},
            {"서울", "부산", "13:50", "4시간"},
            {"서울", "부산", "15:00", "4시간"},
            {"서울", "부산", "16:20", "4시간"},
            {"서울", "부산", "17:20", "4시간"},
            {"서울", "부산", "17:30", "4시간"},
            {"서울", "부산", "20:00", "4시간"},
            {"서울", "부산", "20:30", "4시간"},
            {"서울", "부산", "20:50", "4시간"},
            {"서울", "부산", "21:10", "4시간"},
            {"서울", "부산", "21:30", "4시간"},
            {"서울", "부산", "21:40", "4시간"},
            {"서울", "부산", "22:30", "4시간"},
            {"서울", "경주", "7:00", "3시간 30분"},
            {"서울", "경주", "8:30", "3시간 30분"},
            {"서울", "경주", "8:40", "3시간 30분"},
            {"서울", "경주", "9:00", "3시간 30분"},
            {"서울", "경주", "9:20", "3시간 30분"},
            {"서울", "경주", "9:30", "3시간 30분"},
            {"서울", "경주", "9:40", "3시간 30분"},
            {"서울", "경주", "9:50", "3시간 30분"},
            {"서울", "경주", "10:10", "3시간 30분"},
            {"서울", "경주", "11:30", "3시간 30분"},
            {"서울", "경주", "11:50", "3시간 30분"},
            {"서울", "경주", "13:20", "3시간 30분"},
            {"서울", "경주", "13:30", "3시간 30분"},
            {"서울", "경주", "14:10", "3시간 30분"},
            {"서울", "경주", "14:30", "3시간 30분"},
            {"서울", "경주", "15:30", "3시간 30분"},
            {"서울", "경주", "16:30", "3시간 30분"},
            {"서울", "경주", "17:50", "3시간 30분"},
            {"서울", "경주", "19:50", "3시간 30분"},
            {"서울", "경주", "22:00", "3시간 30분"},
            {"서울", "강릉", "6:40", "2시간 50분"},
            {"서울", "강릉", "7:10", "2시간 50분"},
            {"서울", "강릉", "7:20", "2시간 50분"},
            {"서울", "강릉", "7:40", "2시간 50분"},
            {"서울", "강릉", "7:50", "2시간 50분"},
            {"서울", "강릉", "8:00", "2시간 50분"},
            {"서울", "강릉", "9:00", "2시간 50분"},
            {"서울", "강릉", "10:40", "2시간 50분"},
            {"서울", "강릉", "13:10", "2시간 50분"},
            {"서울", "강릉", "13:20", "2시간 50분"},
            {"서울", "강릉", "14:00", "2시간 50분"},
            {"서울", "강릉", "14:50", "2시간 50분"},
            {"서울", "강릉", "15:20", "2시간 50분"},
            {"서울", "강릉", "16:10", "2시간 50분"},
            {"서울", "강릉", "17:50", "2시간 50분"},
            {"서울", "강릉", "18:50", "2시간 50분"},
            {"서울", "강릉", "19:10", "2시간 50분"},
            {"서울", "강릉", "20:10", "2시간 50분"},
            {"서울", "강릉", "20:50", "2시간 50분"},
            {"서울", "강릉", "22:50", "2시간 50분"},
            {"서울", "용인", "6:30", "40분"},
            {"서울", "용인", "7:00", "40분"},
            {"서울", "용인", "7:30", "40분"},
            {"서울", "용인", "7:40", "40분"},
            {"서울", "용인", "8:40", "40분"},
            {"서울", "용인", "9:30", "40분"},
            {"서울", "용인", "9:40", "40분"},
            {"서울", "용인", "10:10", "40분"},
            {"서울", "용인", "11:10", "40분"},
            {"서울", "용인", "11:20", "40분"},
            {"서울", "용인", "11:50", "40분"},
            {"서울", "용인", "12:40", "40분"},
            {"서울", "용인", "15:10", "40분"},
            {"서울", "용인", "15:50", "40분"},
            {"서울", "용인", "19:10", "40분"},
            {"서울", "용인", "20:20", "40분"},
            {"서울", "용인", "20:50", "40분"},
            {"서울", "용인", "21:30", "40분"},
            {"서울", "용인", "21:50", "40분"},
            {"서울", "용인", "22:40", "40분"},
            {"서울", "대전", "6:00", "1시간 50분"},
            {"서울", "대전", "6:50", "1시간 50분"},
            {"서울", "대전", "7:30", "1시간 50분"},
            {"서울", "대전", "7:40", "1시간 50분"},
            {"서울", "대전", "8:00", "1시간 50분"},
            {"서울", "대전", "10:20", "1시간 50분"},
            {"서울", "대전", "10:30", "1시간 50분"},
            {"서울", "대전", "10:40", "1시간 50분"},
            {"서울", "대전", "11:40", "1시간 50분"},
            {"서울", "대전", "12:10", "1시간 50분"},
            {"서울", "대전", "12:30", "1시간 50분"},
            {"서울", "대전", "12:40", "1시간 50분"},
            {"서울", "대전", "14:10", "1시간 50분"},
            {"서울", "대전", "15:00", "1시간 50분"},
            {"서울", "대전", "15:20", "1시간 50분"},
            {"서울", "대전", "17:20", "1시간 50분"},
            {"서울", "대전", "19:00", "1시간 50분"},
            {"서울", "대전", "21:20", "1시간 50분"},
            {"서울", "대전", "22:50", "1시간 50분"},
            {"서울", "대전", "23:10", "1시간 50분"},
            {"부산", "서울", "6:10", "4시간"},
            {"부산", "서울", "7:30", "4시간"},
            {"부산", "서울", "9:00", "4시간"},
            {"부산", "서울", "9:20", "4시간"},
            {"부산", "서울", "9:50", "4시간"},
            {"부산", "서울", "10:00", "4시간"},
            {"부산", "서울", "11:10", "4시간"},
            {"부산", "서울", "12:50", "4시간"},
            {"부산", "서울", "13:30", "4시간"},
            {"부산", "서울", "14:10", "4시간"},
            {"부산", "서울", "14:50", "4시간"},
            {"부산", "서울", "15:00", "4시간"},
            {"부산", "서울", "16:10", "4시간"},
            {"부산", "서울", "18:50", "4시간"},
            {"부산", "서울", "19:10", "4시간"},
            {"부산", "서울", "19:30", "4시간"},
            {"부산", "서울", "20:50", "4시간"},
            {"부산", "서울", "21:20", "4시간"},
            {"부산", "서울", "22:30", "4시간"},
            {"부산", "서울", "23:40", "4시간"},
            {"부산", "여수", "6:30", "3시간 10분"},
            {"부산", "여수", "6:50", "3시간 10분"},
            {"부산", "여수", "7:10", "3시간 10분"},
            {"부산", "여수", "9:10", "3시간 10분"},
            {"부산", "여수", "10:10", "3시간 10분"},
            {"부산", "여수", "11:20", "3시간 10분"},
            {"부산", "여수", "11:30", "3시간 10분"},
            {"부산", "여수", "11:50", "3시간 10분"},
            {"부산", "여수", "12:10", "3시간 10분"},
            {"부산", "여수", "12:50", "3시간 10분"},
            {"부산", "여수", "13:00", "3시간 10분"},
            {"부산", "여수", "17:30", "3시간 10분"},
            {"부산", "여수", "20:10", "3시간 10분"},
            {"부산", "여수", "21:10", "3시간 10분"},
            {"부산", "여수", "21:30", "3시간 10분"},
            {"부산", "여수", "22:00", "3시간 10분"},
            {"부산", "여수", "22:20", "3시간 10분"},
            {"부산", "여수", "22:40", "3시간 10분"},
            {"부산", "여수", "23:40", "3시간 10분"},
            {"부산", "여수", "23:50", "3시간 10분"},
            {"부산", "대구", "6:00", "1시간 15분"},
            {"부산", "대구", "6:20", "1시간 15분"},
            {"부산", "대구", "6:40", "1시간 15분"},
            {"부산", "대구", "7:50", "1시간 15분"},
            {"부산", "대구", "9:10", "1시간 15분"},
            {"부산", "대구", "10:00", "1시간 15분"},
            {"부산", "대구", "10:20", "1시간 15분"},
            {"부산", "대구", "12:30", "1시간 15분"},
            {"부산", "대구", "14:20", "1시간 15분"},
            {"부산", "대구", "15:00", "1시간 15분"},
            {"부산", "대구", "15:30", "1시간 15분"},
            {"부산", "대구", "17:40", "1시간 15분"},
            {"부산", "대구", "17:50", "1시간 15분"},
            {"부산", "대구", "18:20", "1시간 15분"},
            {"부산", "대구", "18:30", "1시간 15분"},
            {"부산", "대구", "20:20", "1시간 15분"},
            {"부산", "대구", "21:00", "1시간 15분"},
            {"부산", "대구", "21:10", "1시간 15분"},
            {"부산", "대구", "22:30", "1시간 15분"},
            {"부산", "대구", "23:20", "1시간 15분"},
            {"부산", "용인", "6:10", "4시간 5분"},
            {"부산", "용인", "6:30", "4시간 5분"},
            {"부산", "용인", "6:40", "4시간 5분"},
            {"부산", "용인", "7:40", "4시간 5분"},
            {"부산", "용인", "10:00", "4시간 5분"},
            {"부산", "용인", "12:50", "4시간 5분"},
            {"부산", "용인", "13:40", "4시간 5분"},
            {"부산", "용인", "13:50", "4시간 5분"},
            {"부산", "용인", "14:50", "4시간 5분"},
            {"부산", "용인", "15:10", "4시간 5분"},
            {"부산", "용인", "17:00", "4시간 5분"},
            {"부산", "용인", "17:20", "4시간 5분"},
            {"부산", "용인", "18:00", "4시간 5분"},
            {"부산", "용인", "20:10", "4시간 5분"},
            {"부산", "용인", "20:30", "4시간 5분"},
            {"부산", "용인", "20:40", "4시간 5분"},
            {"부산", "용인", "20:50", "4시간 5분"},
            {"부산", "용인", "22:50", "4시간 5분"},
            {"부산", "용인", "23:30", "4시간 5분"},
            {"부산", "용인", "23:40", "4시간 5분"},
            {"부산", "대전", "6:20", "4시간 10분"},
            {"부산", "대전", "8:10", "4시간 10분"},
            {"부산", "대전", "8:20", "4시간 10분"},
            {"부산", "대전", "8:30", "4시간 10분"},
            {"부산", "대전", "9:40", "4시간 10분"},
            {"부산", "대전", "11:30", "4시간 10분"},
            {"부산", "대전", "11:50", "4시간 10분"},
            {"부산", "대전", "12:30", "4시간 10분"},
            {"부산", "대전", "12:50", "4시간 10분"},
            {"부산", "대전", "13:10", "4시간 10분"},
            {"부산", "대전", "14:10", "4시간 10분"},
            {"부산", "대전", "14:50", "4시간 10분"},
            {"부산", "대전", "16:20", "4시간 10분"},
            {"부산", "대전", "16:40", "4시간 10분"},
            {"부산", "대전", "16:50", "4시간 10분"},
            {"부산", "대전", "17:00", "4시간 10분"},
            {"부산", "대전", "17:40", "4시간 10분"},
            {"부산", "대전", "18:40", "4시간 10분"},
            {"부산", "대전", "20:40", "4시간 10분"},
            {"부산", "대전", "22:50", "4시간 10분"},
            {"전주", "서울", "8:10", "2시간 35분"},
            {"전주", "서울", "11:30", "2시간 35분"},
            {"전주", "서울", "15:50", "2시간 35분"},
            {"전주", "서울", "20:00", "2시간 35분"},
            {"전주", "서울", "22:30", "2시간 35분"},
            {"전주", "광주", "8:50", "1시간 30분"},
            {"전주", "광주", "11:20", "1시간 30분"},
            {"전주", "광주", "14:20", "1시간 30분"},
            {"전주", "광주", "16:00", "1시간 30분"},
            {"전주", "광주", "19:40", "1시간 30분"},
            {"전주", "부산", "7:00", "3시간"},
            {"전주", "부산", "10:30", "3시간"},
            {"전주", "부산", "15:20", "3시간"},
            {"전주", "부산", "19:00", "3시간"},
            {"전주", "부산", "21:40", "3시간"},
            {"전주", "성남", "8:15", "2시간 30분"},
            {"전주", "성남", "11:35", "2시간 30분"},
            {"전주", "성남", "15:50", "2시간 30분"},
            {"전주", "성남", "20:00", "2시간 30분"},
            {"전주", "성남", "22:30", "2시간 30분"},
            {"전주", "대전", "6:20", "1시간 20분"},
            {"전주", "대전", "17:10", "1시간 20분"},
            {"전주", "대전", "19:00", "1시간 20분"},
            {"전주", "대전", "19:20", "1시간 20분"},
            {"전주", "대전", "21:40", "1시간 20분"},
            {"성남", "부산", "6:00", "3시간 55분"},
            {"성남", "부산", "10:10", "3시간 55분"},
            {"성남", "부산", "20:00", "3시간 55분"},
            {"성남", "부산", "21:40", "3시간 55분"},
            {"성남", "부산", "23:00", "3시간 55분"},
            {"성남", "전주", "1:10", "2시간 30분"},
            {"성남", "전주", "5:40", "2시간 30분"},
            {"성남", "전주", "7:50", "2시간 30분"},
            {"성남", "전주", "15:10", "2시간 30분"},
            {"성남", "전주", "15:20", "2시간 30분"},
            {"성남", "창원", "8:00", "3시간 40분"},
            {"성남", "창원", "10:50", "3시간 40분"},
            {"성남", "창원", "16:00", "3시간 40분"},
            {"성남", "창원", "17:10", "3시간 40분"},
            {"성남", "창원", "22:20", "3시간 40분"},
            {"성남", "대구", "2:10", "3시간 25분"},
            {"성남", "대구", "4:20", "3시간 25분"},
            {"성남", "대구", "7:50", "3시간 25분"},
            {"성남", "대구", "14:40", "3시간 25분"},
            {"성남", "대구", "22:10", "3시간 25분"},
            {"성남", "광주", "2:20", "3시간 15분"},
            {"성남", "광주", "16:20", "3시간 15분"},
            {"성남", "광주", "18:40", "3시간 15분"},
            {"성남", "광주", "21:10", "3시간 15분"},
            {"성남", "광주", "23:20", "3시간 15분"},
            {"광주", "부산", "11:10", "3시간"},
            {"광주", "부산", "11:50", "3시간"},
            {"광주", "부산", "12:50", "3시간"},
            {"광주", "부산", "18:40", "3시간"},
            {"광주", "부산", "19:10", "3시간"},
            {"광주", "창원", "6:00", "2시간 50분"},
            {"광주", "창원", "14:10", "2시간 50분"},
            {"광주", "창원", "16:20", "2시간 50분"},
            {"광주", "창원", "19:30", "2시간 50분"},
            {"광주", "창원", "22:30", "2시간 50분"},
            {"광주", "서울", "8:20", "3시간 30분"},
            {"광주", "서울", "12:50", "3시간 30분"},
            {"광주", "서울", "13:10", "3시간 30분"},
            {"광주", "서울", "20:50", "3시간 30분"},
            {"광주", "서울", "23:50", "3시간 30분"},
            {"광주", "용인", "8:00", "3시간 25분"},
            {"광주", "용인", "10:50", "3시간 25분"},
            {"광주", "용인", "16:00", "3시간 25분"},
            {"광주", "용인", "17:10", "3시간 25분"},
            {"광주", "용인", "22:20", "3시간 25분"},
            {"광주", "대전", "9:00", "2시간 10분"},
            {"광주", "대전", "15:10", "2시간 10분"},
            {"광주", "대전", "21:10", "2시간 10분"},
            {"광주", "대전", "22:40", "2시간 10분"},
            {"광주", "대전", "23:20", "2시간 10분"},
            {"대전", "당진", "7:10", "1시간 30분"},
            {"대전", "당진", "7:50", "1시간 30분"},
            {"대전", "당진", "11:40", "1시간 30분"},
            {"대전", "당진", "13:10", "1시간 30분"},
            {"대전", "당진", "13:20", "1시간 30분"},
            {"대전", "인천", "8:20", "2시간"},
            {"대전", "인천", "12:50", "2시간"},
            {"대전", "인천", "13:10", "2시간"},
            {"대전", "인천", "20:50", "2시간"},
            {"대전", "인천", "23:50", "2시간"},
            {"대전", "서울", "7:30", "2시간"},
            {"대전", "서울", "13:50", "2시간"},
            {"대전", "서울", "17:00", "2시간"},
            {"대전", "서울", "19:20", "2시간"},
            {"대전", "서울", "20:50", "2시간"},
            {"대전", "강릉", "10:20", "3시간 20분"},
            {"대전", "강릉", "14:20", "3시간 20분"},
            {"대전", "강릉", "16:40", "3시간 20분"},
            {"대전", "강릉", "18:30", "3시간 20분"},
            {"대전", "강릉", "22:40", "3시간 20분"},
            {"대전", "광주", "11:10", "2시간 20분"},
            {"대전", "광주", "11:50", "2시간 20분"},
            {"대전", "광주", "12:50", "2시간 20분"},
            {"대전", "광주", "18:40", "2시간 20분"},
            {"대전", "광주", "19:10", "2시간 20분"}
    };


    String[] departures = {"서울", "부산", "전주", "성남", "광주", "대전"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_location);
        setTitle("출발지 및 도착지 선택");

        linearLayoutDeparture = findViewById(R.id.linearLayoutDeparture);
        linearLayoutDestination = findViewById(R.id.linearLayoutDestination);
        btnConfirm = findViewById(R.id.btnConfirm);
        selectedRoute = findViewById(R.id.selectedRoute);

        isBooking = getIntent().getBooleanExtra("isBooking", false);

        for (String departure : departures) {
            Button button = new Button(this);
            button.setText(departure);
            button.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
            button.setTextColor(ContextCompat.getColor(this, android.R.color.white));
            button.setTypeface(null, android.graphics.Typeface.BOLD); // 텍스트 굵게 설정
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedDeparture = button.getText().toString();
                    showDestinationOptions(selectedDeparture);
                    selectedRoute.setText("선택한 출발지: " + selectedDeparture + "\n도착지를 선택하세요.");
                }
            });
            linearLayoutDeparture.addView(button);
        }

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedDeparture != null && selectedDestination != null) {
                    Intent intent = new Intent(SelectLocationActivity.this, BusSelectionActivity.class);
                    intent.putExtra("departure", selectedDeparture);
                    intent.putExtra("destination", selectedDestination);
                    intent.putExtra("isBooking", isBooking);
                    startActivity(intent);
                } else {
                    Toast.makeText(SelectLocationActivity.this, "출발지와 도착지를 모두 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void showDestinationOptions(String departure) {
        linearLayoutDestination.removeAllViews();
        HashSet<String> destinations = new HashSet<>();

        TextView destinationLabel = new TextView(this);
        destinationLabel.setText("도착지");
        destinationLabel.setTextSize(18);
        destinationLabel.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        destinationLabel.setPadding(8, 8, 8, 8);
        linearLayoutDestination.addView(destinationLabel);

        for (String[] schedule : busTimetable) {
            if (schedule[0].equals(departure) && !destinations.contains(schedule[1])) {
                destinations.add(schedule[1]);
                Button button = new Button(this);
                button.setText(schedule[1]);
                button.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
                button.setTextColor(ContextCompat.getColor(this, android.R.color.white));
                button.setTypeface(null, android.graphics.Typeface.BOLD); // 텍스트 굵게 설정
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        selectedDestination = button.getText().toString();
                        selectedRoute.setText("선택한 출발지: " + selectedDeparture + "\n선택한 도착지: " + selectedDestination);
                    }
                });
                linearLayoutDestination.addView(button);
            }
        }
    }
}
