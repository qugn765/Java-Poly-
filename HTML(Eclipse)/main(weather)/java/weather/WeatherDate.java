package weather;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WeatherDate {
   // 현재 날짜 가져오기
   public String getDateNow() {
      LocalDateTime now = LocalDateTime.now();
      String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분"));
      return formatedNow + "";
   }

}