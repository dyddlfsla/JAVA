package chapter.ten.exercise._04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex10_4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    while (true) {
      System.out.print("birth day = ");
      String birthDay = scanner.nextLine();
      System.out.print("today = ");
      String today = scanner.nextLine();
      try {
        Date birthDate = sdf.parse(birthDay);
        Date todayDate = sdf.parse(today);
        long dayDiff = (todayDate.getTime() - birthDate.getTime()) / (1000 * 60 * 60 * 24);
        System.out.println(dayDiff + " days");
        break;
      } catch (Exception e) {
        System.out.println("잘못된 날짜 형식입니다. 다시 입력해주세요. ex)yyyy-MM-dd ");
      }
    }
  }
}
