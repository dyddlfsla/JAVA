package chapter.four;

import java.util.Scanner;

public class Chapter04_04 {

  /** ◆ if - else 문
   *
   * if문의 변형인 if - else문의 구조는 다음과 같다. if 문에 'else'블럭이 더 추가되었다. 'else'의 뜻은 그 밖에 다른 이라는
   * 뜻이므로 조건식의 결과가 참이 아닐 때, 즉 거짓일 때 else 블럭의 문장을 수행하라는 뜻이다.
   *
   *  if (조건식) {
   *    //조건식이 true일 때 실행되는 문장
   *  } else {
   *    //조건식이 false일 때 실행되는 문장
   *  }
   *
   *  조건식의 결과에 따라 두 개의 블럭 중 어느 하나의 블럭이 실행되고 if문을 벗어나게 된다. 이때 두 블럭이 모두 실행되거나
   *  모두 수행되지 않는 경우는 있을 수 없다.
   *
   * */

  public static void main(String[] args) {
    System.out.print("숫자를 하나 입력하세요.");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    if (input == 0) {
      System.out.println("입력하신 숫자는 0입니다.");
    } else {
      System.out.println("입력하신 숫자는 0이 아닙니다.");
    }
  }
}
