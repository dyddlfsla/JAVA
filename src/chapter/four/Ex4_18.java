package chapter.four;

import java.util.Scanner;

public class Ex4_18 {

  public static void main(String[] args) {
    int menu = 0;
    int num = 0;

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("(1) square");
      System.out.println("(2) square root");
      System.out.println("(3) log");
      System.out.print("원하는 메뉴를 1~3사이에서 선택해주세요.(종료하고 싶다면 0)>");

      menu = scanner.nextInt();

      if (menu == 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else if (!(1 <= menu && menu <= 3)) {
        System.out.println("메뉴를 잘못 선택하셨습니다. (종료하고 싶다면 0)>");
        continue;
      }
      System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
    }
  }

}
