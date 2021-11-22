package chapter.four;

import java.util.Scanner;

public class Chapter04_05 {

  /** ◆ if - else if 문
   *
   * if - else 문은 두 가지 경우 중 하나가 수행되는 구조인데, 처리해야 할 경우의 수가 셋 이상인 경우에는 어떻게 해야할까?
   * 그럴 때는 한 문장에 여러 개의 조건식을 쓸 수 있는 'if - else if'문을 사용하면 된다.
   *
   *  if (조건식1) {
   *    //조건식1이 참일 때 수행되는 문장.
   *  } else if (조건식2) {
   *    //조건식2가 참일 때 수행되는 문장.
   *  } else if (조건식3) {
   *    //조건식3이 참일 떄 수행되는 문장.
   *  } else {
   *    //위의 조건식 어느 것도 참이 아닐 때 실행되는 문장. 생략 가능하다.
   *  }
   *
   *  첫 번째 조건식부터 순서대로 평가해서 결과가 참인 조건식을 만나면 해당 블럭{}을 수행하고 if - else if문' 전체를 벗어난다.
   *  만일 참인 조건식이 하나도 없다면 마지막에 있는 else 블럭이 수행된다. 여기서 else블럭은 생략이 가능하기 때문에
   *  조건에 따라 if - else if 문의 어느 블럭도 실행되지 않을 수 있다.
   *
   * */

  public static void main(String[] args) {
    int score = 0;
    char grade = ' ';

    System.out.print("점수를 입력하세요.");
    Scanner scanner = new Scanner(System.in);
    score = scanner.nextInt();

    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else {
      grade = 'D';
    }
    System.out.println("당신의 학점은 " + grade + " 입니다.");
  }

}
