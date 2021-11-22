package chapter.four;

import java.util.Scanner;

public class Chapter04_07 {

  /** ◆ 중첩 if 문
   *
   * if문의 블럭 내에 또 다른 if문을 포함시키는 것이 가능한데 이것을 중첩 if문이라고 부르며 중첩 횟수에는 거의 제한이 없다.
   *
   *  if (조건식1) {
   *    //조건식1이 참일 때 수행되는 문장.
   *    if (조건식2) {
   *      //조건식1은 참이고 조건식2는 참일 때 수행되는 문장.
   *    } else {
   *      //조건식1은 참이고 조건식2는 거짓일 때 수행되는 문장.
   *    }
   *  } else {
   *    //조건식1이 거짓일 때 수행되는 문장
   *  }
   *
   *  중첩 if문을 작성할 때에는 두 if문의 범위가 명확히 구분될 수 있도록 작성해야 한다.
   *
   * */

  public static void main(String[] args) {
    int score = 0;
    char grade = ' ', opt = '0';

    System.out.print("점수를 입력해주세요.>");
    Scanner scanner = new Scanner(System.in);
    score = scanner.nextInt();

    System.out.printf("당신의 점수는 %d입니다.%n", score);

    if (score >= 90) {
      grade = 'A';
      if(score >= 98) {
        opt = '+';
      } else if (score < 94) {
        opt = '-';
      }
    } else if (score >= 80) {
      grade = 'B';
      if (score >= 88) {
        opt = '+';
      } else if (score < 84) {
        opt = '-';
      }
    } else {
      grade = 'C';
    }

    System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
  }

}
