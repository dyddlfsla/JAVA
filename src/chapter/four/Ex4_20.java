package chapter.four;

import java.util.Scanner;

public class Ex4_20 {

  public static void main(String[] args) {
    int menu = 0, num = 0;
    Scanner scanner = new Scanner(System.in);

    Outer:
    while (true) {
      System.out.println("(1) square");
      System.out.println("(2) square root");
      System.out.println("(3) log");
      System.out.print("원하시는 메뉴를 1~3 중에 하나 고르세요.(종료를 원하면 0)>");

      menu = scanner.nextInt();

      if (menu == 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else if (!(1 <= menu && menu <= 3)) {
        System.out.println("메뉴를 잘못 선택하셨습니다. (종료를 원하면 0)>");
        continue;
      }

      for(;;) {
        System.out.print("계산할 값을 입력하세요. (계산 종료는 0, 전체 종료는 99)>");
        num = scanner.nextInt();

        if (num == 0) {
          break;
        } else if (num == 99) {
          System.out.println("프로그램을 종료합니다.");
          break Outer;
        }

        switch (menu) {
          case 1:
            System.out.println("result = " + num * num);
            break;
          case 2:
            System.out.println("result = " + Math.sqrt(num));
            break;
          case 3:
            System.out.println("result = " + Math.log(num));
            break;
        }
      }
    }
  }
}
