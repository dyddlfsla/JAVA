package chapter.ten.exercise._01;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex10_1 {

  /**
   * 1. Calendar 클래스와 SimpleDateFormat 클래스를 이용해서 2020년의 매월 두 번째 일요일의 날짜를 출력하세요.
   */

  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2020, 0, 1);

    while (calendar.get(Calendar.YEAR) == 2020) {
      if (calendar.get(Calendar.DAY_OF_WEEK) == 1 && calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 2) {
        System.out.println(
            new SimpleDateFormat("YYYY-MM-dd 은 2번째 일요일입니다.").format(calendar.getTime()));
      }
      calendar.add(Calendar.DATE, 1);
    }
  }
}
