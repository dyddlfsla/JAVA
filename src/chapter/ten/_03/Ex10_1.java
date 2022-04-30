package chapter.ten._03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex10_1 {

  public static void main(String[] args) {
    //기본적으로 getInstance() 는 현재 날짜와 시간 정보를 가져온다.
    Calendar calendar = Calendar.getInstance();
    System.out.printf("이 해의 연도 : %d\n", calendar.get(Calendar.YEAR));
    System.out.printf("월(0 ~ 11, 0:1월) : %d\n", calendar.get(Calendar.MONTH));
    System.out.printf("이 해의 몇 번째 주 : %d\n", calendar.get(Calendar.WEEK_OF_YEAR));
    System.out.printf("이 달의 몇 번째 주: %d\n", calendar.get(Calendar.WEEK_OF_MONTH));

    System.out.printf("이 달의 몇 일: %d\n", calendar.get(Calendar.DATE));
    System.out.printf("이 달의 몇 일: %d\n", calendar.get(Calendar.DAY_OF_MONTH));
    // DATE 와 DAY_OF_MONTH 는 같다.
    System.out.printf("이 해의 몇 일: %d\n", calendar.get(Calendar.DAY_OF_YEAR));
    System.out.printf("요일(1 ~ 7, 1:일요일): %d\n", calendar.get(Calendar.DAY_OF_WEEK));
    System.out.printf("이 달의 몇 째 요일: %d\n", calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    System.out.printf("오전_오후(0: 오전, 1: 오후) : %d\n", calendar.get(Calendar.AM_PM));
    System.out.printf("시간(0 ~ 11): %d\n", calendar.get(Calendar.HOUR));
    System.out.printf("시간(0 ~ 23): %d\n", calendar.get(Calendar.HOUR_OF_DAY));
    System.out.printf("분(0 ~ 59) : %d\n", calendar.get(Calendar.MINUTE));
    System.out.printf("초(0 ~ 59) : %d\n", calendar.get(Calendar.SECOND));
    System.out.printf("1000분의 1초(0 ~ 999) : %d\n", calendar.get(Calendar.MILLISECOND));
    // 1000분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.
    System.out.printf("TimeZone(-12 ~ +12) : %d\n", calendar.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000));
    System.out.printf("이 달의 마지막 날 : %d\n", calendar.getActualMaximum(Calendar.DATE));

  }

  /**
   * getInstance() 메서드를 통해 얻은 인스턴스는 기본적으로 현재 시스템의 날짜와 시간에 대한 정보를 담고 있다. 원하는 날짜나 시간으로 설정하려면
   * set 메서드를 사용하면 된다.
   *
   * get 메서드의 매개변수로 사용되는 int 값들은 Calendar 에 정의된 static 상수이다. 이 예제에서는 자주 쓰이는 것들만 골라놓은 것인데
   * 실제로는 더 많은 필드들이 정의되어 있으니 보다 자세한 내용은 Java API 문서를 참고하자.
   *
   * 한 가지 주의해야 할 점은 get(Calendar.MONTH) 로 이 달이 몇 월인지 표시할 때 값의 범위가 1 ~ 12 가 아니라 0 ~ 11 이라는 것이다.
   * 즉 get(Calendar.MONTH) 의 값이  0 이라면 그것은 1월을 가리키는 것이고 11이라면 12월을 가리키는 것이다.
   *
   * */

}
