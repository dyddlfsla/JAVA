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
    String dateToString;
    while (true) {
      try {
        date = dateFormat.parse(consoleInput.nextLine());
        break;
      } catch (Exception e) {
        System.out.println("입력이 잘못 되었습니다. 날짜를 다시 입력하세요. ex) 2010/09/29");
      }
    }

    switch(date.getDay()) {
      case 0 : dateToString = "월";
      case 1 :
    }

    System.out.println("입력하신 날짜는 " + date.getDay());

  }

}
