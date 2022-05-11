package chapter.ten._16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {

  public static void main(String[] args) {
    String pattern = "yyyy/MM/dd";
    DateFormat df = new SimpleDateFormat(pattern);
    Scanner s = new Scanner(System.in);

    Date inDate = null;

    System.out.println("날짜를 " + pattern + "의 형식으로 입력하세요.(예: 2019/12/31)");

    while(s.hasNextLine()) {
      try {
        inDate = df.parse(s.nextLine());
        break;
      } catch(Exception e) {
        System.out.println("입력 형식이 맞지 않습니다. 다시 입력하세요.(예:2019/12/31)");
      }
    }

    Calendar cal = Calendar.getInstance();
    cal.setTime(inDate);
    Calendar today = Calendar.getInstance();
    long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
    System.out.println("입력한 날짜는 현재와 " + Math.abs(day) + " 시간 만큼의 차이가 있습니다.");

  }
  /*
  * 화면으로부터 문자열을 입력받아 날짜 인스턴스로 변환한 후 현재 날짜와 비교하여 그 차이를 시간 단위로 보여주는 예제이다.
  * while 문과 try-catch 문을 이용하여 사용자가 올바른 형식으로 날짜를 입력할 때까지 반복 입력 받도록 하였다.
  * 지정된 패턴으로 입력되지 않은 경우, parse 메서드를 호출하는 부분에서 예외가 발생하게 되고 while 문 밖으로 벗어나지 못한다.
  *
  *
  * */

}
