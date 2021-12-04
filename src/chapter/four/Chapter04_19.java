package chapter.four;

import java.util.Scanner;

public class Chapter04_19 {

  /** ◆ do-while 문
   *
   * do-while 문은 while 문의 변형으로 기본적인 구조는 while 문과 같으나 조건식과 블럭{}의
   * 순서를 바꿔 놓은 것이다. 그래서 while 문과 반대로 일단 블럭{} 먼저 수행한 후에 조건식을 평가한다.
   * while 문은 조건에 따라 블럭{}이 한번도 수행되지 않을 수 있지만 do-while 문은 최소한
   * 한번은 블럭{}이 수행될 것임을 보장한다.
   *
   *  do {
   *
   *  } while(조건식); //; 을 빼먹지 않도록 주의.
   *
   *
   *  do-while 문은 그렇게 많이 사용되는 문법은 아니지만 다음처럼 반복적으로 사용자의 입력을 받아서
   *  처리하는 경우에 유용하다.
   * */

  public static void main(String[] args) {
    int input = 0, answer = 0;

    answer = (int) (Math.random() * 100) + 1;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("1과 100사이의 정수를 하나 입력하세요.>");
      input = scanner.nextInt();

      if (input > answer) {
        System.out.println("더 작은 수로 다시 시도해보세요.");
      } else if (input < answer) {
        System.out.println("더 큰 수로 다시 시도해보세요.");
      }

    } while (input != answer);
    System.out.println("정답입니다.");
  }
}
