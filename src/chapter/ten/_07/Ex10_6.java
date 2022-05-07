package chapter.ten._07;

import java.util.Calendar;

public class Ex10_6 {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Usage: java Ex10_5 2019 9");
      return;
    }
    int year = Integer.parseInt(args[0]);
    int month = Integer.parseInt(args[1]);
    int START_DAY_WEEK = 0;
    int END_DAY = 0;

    Calendar sDay = Calendar.getInstance(); // 시작일
    Calendar eDay = Calendar.getInstance(); // 끝일

    sDay.set(year, month-1, 1);
    eDay.set(year, month, 1);

    //다음달의 첫날(12월 1일)에서 하루를 빼면 현재 달의 마지막 날(11월 30일)이 된다.
    eDay.add(Calendar.DATE, -1);
    //첫 번째 요일이 무슨 요일인지 알아낸다.
    START_DAY_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

    //eDay 에 지정된 날짜를 얻어온다.
    END_DAY = eDay.get(Calendar.DATE);

    System.out.printf("    %s 년, %s 월\n", args[0], args[1]);
    System.out.printf("  SUN MON TUE WED THU FRI SAT \n");

    //해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
    //만일 1일이 수요일이라면 공백을 세번 찍는다.(일요일부터 시작)
    for (int i = 1; i < START_DAY_WEEK; i++) {
      System.out.printf("   ");
    }
    for (int i = 1, n = START_DAY_WEEK; i <= END_DAY; i++, n++) {
      System.out.printf((i < 10) ? "   %d" : "  %d", i);
      if (n % 7 == 0) {
        System.out.printf("\n");
      }
    }
  }
  /**
  * args 로 년, 월을 전달해주면 해당 월을 달력으로 출력하는 예제이다.
  * 다음 달의 1일에서 하루를 빼면 그 전달의 마지막 일을 알 수 있다는 것을 기억하면 된다.
  * 예를 들어 2월의 마지막 날을 알고 싶으면 3월 1일에서 하루를 빼면 되는 것이다.
  *
  * ※ getActualMaximum(Calendar.DATE) 를 이용해도 해당 월의 마지막 날을 알 수 있다.
  *
  * */
}
