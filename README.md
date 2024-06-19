프로젝트 설명
----
프로젝트 이름: QuickBus

프로젝트 설명: 사용자가 버스 시간표를 확인하고, 편리하게 버스 티켓을 예약할 수 있도록 도와주는 안드로이드 애플리케이션. 이 앱은 버스 시간표를 빠르게 확인하고, 여행을 위한 좌석을 예약하는 과정을 간소화하는 것을 목표로 한다.



코드 설명
------
MainActivity.java

- QuickBus 앱의 주요 기능에 대한 접근 제공
- 버스 시간표 보기 버튼: 버스 시간표 확인
- 고속버스 예매하기 버튼: 예매 절차 시작


SelectLocationActivity.java 

- 사용자가 출발지와 도착지 선택 

BusSelectionActivity.java 

- 선택한 출발지와 도착지에 따라 이용 가능한 버스 시간표 표시
- 버스 출발 시간, 소요 시간 정보 제공

DateSelectionActivity.java 

- 사용자가 여행 날짜를 선택할 수 있도록 캘린더 뷰 제공
- 한 달 내의 범위에서 선택 가능

SeatSelectionActivity.java

- 버스 좌석 배치도에 따라 좌석 선택
- 선택된 좌석은 시각적으로 강조되어 표시

UserInfoActivity.java 

- 예약 확인을 위한 사용자 정보 입력
- 이름, 전화번호, 확인용 비밀번호 입력

TicketInfoActivity.java 

- 사용자가 선택한 티켓 정보 데이터 전달 받아 수행
- 사용자와 티켓 정보 표시

BookingCompleteActivity.java 

- 예약이 완료되었음을 확인하는 메시지 표시
- 모두 확인 후 홈 화면으로 돌아가는 버튼 제공

실행화면
----
<b>처음화면</b>
<br><br>
<img src="https://github.com/nulbose/android_QuickBus/assets/126133845/298269ff-6169-4237-ad51-341ae2b14946" width="100" height="200"/> 

<br>
<b>버스 시간표 확인</b>
<br><br>
<p align="LEFT">
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/0f1a5fe4-cf42-4ad3-9cba-cfecdbdf7f9b" width="100" height="200" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/97fbbf9f-dbee-44f5-b3f9-1af57e6417d9" width="100" height="200" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/9c19fafb-0dc2-4724-9a4e-8c2979c1c495" width="100" height="200" />
</p>
<p align="LEFT">
출발지 선택 전 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
도착지 선택 후 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
시간표 출력 화면
</p>
<br>
<b>고속버스 예매하기</b>
<br><br>
<p align="LEFT">
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/0f1a5fe4-cf42-4ad3-9cba-cfecdbdf7f9b" width="100" height="200" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/97fbbf9f-dbee-44f5-b3f9-1af57e6417d9" width="100" height="200" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/911bd490-7a87-43f7-946a-fae4fbf94188"  width="100" height="200" />
</p>
<p align="LEFT">
출발지 선택 전 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
도착지 선택 후 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
버스 선택 화면
</p>
<br><br>
<p align="LEFT">
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/a6177fda-0f79-4f3f-941e-f13ec0fcbd25"  width="100" height="200" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/d2291a36-91cb-46aa-9f2c-866fa1a1f763"  width="100" height="200" />  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="https://github.com/nulbose/android_QuickBus/assets/126133845/b2dc2c0e-04cd-4704-9f7b-8ab96dd80d8e"  width="100" height="200" />
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="https://github.com/nulbose/android_QuickBus/assets/126133845/1944fd29-4f1b-408c-9c67-27ea1ca49351"  width="100" height="200" />

</p>
<p align="LEFT">
날짜 선택 화면     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
좌석 선택 화면    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
사용자 정보 입력 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
예매 정보 확인
</p>
<br><br>
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/532a22c9-fa20-4966-ae5b-c0df22347fc7" width="100" height="200" />
  <br>
  예매 완료 화면
