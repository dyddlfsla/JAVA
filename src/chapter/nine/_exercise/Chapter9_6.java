package chapter.nine._exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter9_6 {
  /*
  * 다음은 화면으로부터 전화번호의 일부를 입력받아 일치하는 전화번호를 주어진 문자열에서 찾아서 출력하는 프로그램이다.
  * 알맞은 코드를 넣어 완성하시오.
  * Pattern, Matcher 클래스를 사용할 것
  *
  * */

  public static void main(String[] args) {
    String[] phoneNumArr = {
        "010-3456-7890",
        "099-2456-7980",
        "088-2346-9870",
        "013-3456-7890"
    };

    ArrayList list = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print(">>");
      String input = scanner.nextLine().trim();

      if (input.equals("")) {
        continue;
      } else if (input.equalsIgnoreCase("Q")) {
        System.exit(0);
      }

      /*
      * 코드 추가
      * */

      if (list.size() > 0) {
        System.out.println(list);
        list.clear();
      } else {
        System.out.println("일치하는 번호가 없습니다.");
      }
    }
  }
}
