package chapter.ten._06;

import java.util.Calendar;

public class Ex10_4 {

  public static void main(String[] args) {
    Calendar date = Calendar.getInstance();
    date.set(2019, 7, 31); //2019 년 8월 31일

    System.out.println(toString(date));
    System.out.println("= 1일 후 =");
    date.add(Calendar.DATE, 1);
    System.out.println(toString(date));

    System.out.println("= 6달 전 =");
    date.add(Calendar.MONTH, -6);
    System.out.println(toString(date));

    System.out.println("= 31일 후(roll) = ");
    date.roll(Calendar.DATE, 31);
    System.out.println(toString(date));

    System.out.println("= 31일 후(add) = ");
    date.add(Calendar.DATE, 31);
    System.out.println(toString(date));

  }

  public static String toString(Calendar date) {
    return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(
        Calendar.DATE) + "일 ";
  }

  /**
   * 'add(int field, int amount)' 를 사용하면 지정한 필드의 값을 원하는 만큼 증가 또는 감소시킬수 있기 때문에 add 메서드를 이용하면
   * 특정 날짜 또는 시간을 기점으로 해서 일정기간 전후의 날짜와 시간을 알아낼 수 있다.
   *
   * 'roll(int field, int amount)' 도 지정한 필드의 값을 증가 또는 감소시킬 수 있는데, add 메서드와의 차이점은 다른 필드에 영향을 미치지 않는다는 것이다.
   * 예를 들어 add 메서드로 날짜 필드(Calendar.DATE) 의 값을 31만큼 증가시켰다면 다음 달로 넘어가므로 월 필드(Calendar.MONTH) 값도 1 증가하지만
   * roll 메서드의 경우에 월 필드의 값은 변하지 않고 일 필드의 값만 바뀐다.
   * 단, 한 가지 예외가 있는데 일 필드(Calendar.DATE) 가 말일(end of Month) 일 때, roll 메서드를 이용해서 월 필드(Calendar.MONTH) 를 변경하면
   * 일 필드(Calendar.DATE)에 영향을 미칠 수 있다.
   *
   *
   * */
}
