package chapter.ten._05;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Ex10_3 {

  public static void main(String[] args) {
    final int[] TIME_UNIT = {3600, 60, 1};
    final String[] TIME_UNIT_NAME = {"시간", "분 ", "초 "};

    Calendar time1 = Calendar.getInstance();
    Calendar time2 = Calendar.getInstance();
    Calendar time3 = Calendar.getInstance();
    LocalDateTime localDateTime = LocalDateTime.now();

    time1.set(Calendar.HOUR_OF_DAY, 10); // time1 을 10시 20분 30초로 설정.
    time1.set(Calendar.MINUTE, 20);
    time1.set(Calendar.SECOND, 30);

    time2.set(Calendar.HOUR_OF_DAY, 20); // time2 를 20시 30분 10초로 설정.
    time2.set(Calendar.MINUTE, 30);
    time2.set(Calendar.SECOND, 10);

    time3.set(Calendar.YEAR, 2020);
    time3.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);

    System.out.println(time3.get(Calendar.DAY_OF_WEEK));
    System.out.println(time3.get(Calendar.MONTH));

    System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시 " + time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초 ");
    System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "시 " + time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초 ");

    long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
    System.out.println("time1 과 time2 의 차이는 " + difference + "초 입니다.");

    String tmp = "";
    for(int i = 0; i < TIME_UNIT.length; i++) {
      tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
      difference %= TIME_UNIT[i];
    }
    System.out.println("시분초로 변환하면 " + tmp + "입니다.");
  }

  /**
   * 두 개의 시간 데이터로부터 초 단위로 차이를 구한 다음, 시분초로 바꿔 출력하는 예제이다.
   * 가장 큰 시간 단위인 3600초로 나누고 남은 나머지를 다시 분단위로 나누면 남은 나머지는 초단위가 되는 것이다.
   *
   *
   * */
}
