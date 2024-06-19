2291074 김시은<br><br><br>
프로젝트 설명
----
프로젝트 이름: QuickBus

프로젝트 설명: 사용자가 고속버스 시간표를 확인하고, 고속버스 티켓을 예매할 수 있도록 도와주는 안드로이드 앱. 


코드 설명
------
<b>MainActivity.java</b>

- QuickBus 앱의 주요 기능에 대한 접근 제공
- 버스 시간표 보기 버튼: 고속버스 시간표 확인
- 고속버스 예매하기 버튼: 예매 절차 시작


<b>SelectLocationActivity.java</b>

- 사용자가 출발지와 도착지 선택 

<b>BusSelectionActivity.java</b>

- 선택한 출발지와 도착지에 따라 이용 가능한 고속버스 시간표 표시
- 고속버스 출발 시간, 소요 시간 정보 제공

<b>DateSelectionActivity.java</b>

- 사용자가 여행 날짜를 선택할 수 있도록 캘린더 뷰 제공
- 한 달 내의 범위에서 선택 가능

<b>SeatSelectionActivity.java</b>

- 고속버스 좌석 배치도에 따라 좌석 선택
- 선택된 좌석은 시각적으로 강조되어 표시

<b>UserInfoActivity.java</b>

- 예약 확인을 위한 사용자 정보 입력
- 이름, 전화번호, 확인용 비밀번호 입력

<b>TicketInfoActivity.java</b>

- 사용자가 선택한 티켓 정보 데이터 전달 받아 수행
- 사용자와 티켓 정보 표시

<b>BookingCompleteActivity.java</b>

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
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/67f8e4d5-2bd9-4219-822e-3073b6edafa8" width="100" height="200" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/208e9b05-7007-4ce6-be22-888338a7da39" width="100" height="200" />  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/e08ab614-37f7-4998-b436-f8fc97d45ec1" width="100" height="200" />
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
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/67f8e4d5-2bd9-4219-822e-3073b6edafa8" width="100" height="200" />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="https://github.com/nulbose/android_QuickBus/assets/126133845/208e9b05-7007-4ce6-be22-888338a7da39" width="100" height="200" />
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/911bd490-7a87-43f7-946a-fae4fbf94188"  width="100" height="200" />
</p>
<p align="LEFT">
출발지 선택 전 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
도착지 선택 후 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
버스 선택 화면
</p>
<br><br>
<p align="LEFT">  
  <img src="https://github.com/nulbose/android_QuickBus/assets/126133845/62eccc03-8f37-49bd-90dc-fffed3ace494" width="100" height="200"/>
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



실행영상
----
https://youtu.be/F0PH5PK3sok
