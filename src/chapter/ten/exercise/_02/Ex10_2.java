package chapter.ten.exercise._02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex10_2 {

  public static void main(String[] args) {
    Scanner consoleInput = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    System.out.println("날짜를 yyyy/MM/dd 의 형태로 입력해주세요. ex) 2010/09/29");
    Date date;
    String dateToString = null;
    while (true) {
      try {
        date = dateFormat.parse(consoleInput.nextLine());
        break;
      } catch (Exception e) {
        System.out.println("입력이 잘못 되었습니다. 날짜를 다시 입력하세요. ex) 2010/09/29");
      }
    }

    switch (date.getDay()) {
      case 0:
        dateToString = "일요일";
        break;
      case 1:
        dateToString = "월요일";
        break;
      case 2:
        dateToString = "화요일";
        break;
      case 3:
        dateToString = "수요일";
        break;
      case 4:
        dateToString = "목요일";
        break;
      case 5:
        dateToString = "금요일";
        break;
      case 6:
        dateToString = "토요일";
        break;
    }
    System.out.println("입력하신 날짜는 " + dateToString + "입니다.");
  }

}
