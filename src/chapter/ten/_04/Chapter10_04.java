package chapter.ten._04;

import java.util.Calendar;

public class Chapter10_04 {

  public static void main(String[] args) {
    final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
    //요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워둔다.
    Calendar date1 = Calendar.getInstance();
    Calendar date2 = Calendar.getInstance();

    //month 의 경우 0부터 시작하기 때문에 4월인 경우, 3으로 지정한다.
    //date1.set(2019, Calendar.APRIL, 29); 와 같이 할수도 있다.
    date1.set(2019, 3, 29); // 2019년 4월 29로 날짜를 설정한다.
    System.out.printf("date1은 %s %s요일 이고, \n", toString(date1), DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
    System.out.printf("오늘(date2)는 %s %s요일 입니다. \n", toString(date2), DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);

    //두 날짜 간의 차이를 얻으려면 getTimeInMillis() 를 이용한다. → 밀리초 값을 반환하기 때문에 1000으로 나누면 초 단위 값이 된다.
    long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
    System.out.printf("그 날(date1)로부터 지금(date2)까지 시간이 %d 초가 지났습니다. \n", difference);
    System.out.printf("이 시간을 일(Day)로 계산한다면 %d 일입니다. \n", difference / (24 * 60 * 60));

  }
  public static String toString(Calendar date) {
    return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(
        Calendar.DATE) + "일 ";
  }

  /**
   * getInstance() 로 얻은 인스턴스에는 기본적으로 현재 날짜에 대한 정보가 담겨져 있다. 만약 현재 날짜가 아닌
   * 어느 특정 날짜에 대한 정보를 가지게 하고 싶다면 set 메서드를 이용할 수 있다.
   *
   * void set(int field, int value)
   * void set(int year, int month, int date)
   * void set(int year, int month, int date, int hourOfDay, int minute)
   * void set(int year, int month, int date, int hourOfDay, int minute, int second)
   *
   * 두 날짜의 차이를 구하기 위해서는 두 날짜를 최소 단위인 초단위로 변경한 다음 그 차이를 구하면 된다. getTimeInMillis 는 1 / 1000 초인
   * 밀리초 단위로 값을 반환하기 때문에 초 단위로 얻기 위해서는 1000으로 나누어 주어야 하고 일 단위로 얻고 싶다면 '24(시간) * 60(분) * 60(초) * 1000(밀리초)' 로 나누어야 한다.
   * 예제에서는 변수 difference 에 저장할 때 이미 1000으로 한번 나누었기 때문에 일 단위로 변경할 떄는 24 * 60 * 60 까지만 계산하여 나누었다.
   *
   * */
}
