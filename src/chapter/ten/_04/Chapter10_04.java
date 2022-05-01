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
    System.out.printf("date1은 %s %");

  }
  public static String toString(Calendar date) {
    return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) + 1) + "월" + date.get(
        Calendar.DATE) + "일";
  }
}
