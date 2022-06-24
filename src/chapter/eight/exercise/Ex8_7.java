package chapter.eight.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8_7 {

  /*
  * 숫자가 아닌 영문자를 입력하는 경우 InputMismatchException 이 발생하고 있다.
  * 예외 처리를 통해 숫자가 아닌 경우 다시 입력받도록 수정.
  *
  *
  * */

  public static void main(String[] args) {
    int answer = (int) (Math.random() * 100) + 1;
    int input = 0; //사용자 입력
    int count = 0; // 시도 횟수
    boolean isCorrect = false;

    do {
      count++;
      System.out.print(" 1과 100 사이의 값을 입력하세요. : ");

      try {
      input = new Scanner(System.in).nextInt();
      } catch (InputMismatchException e) {
        System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
        continue;
      }

      if (answer > input) {
        System.out.println(" 더 큰 수를 입력하세요. ");
      }
      if (answer < input) {
        System.out.println(" 더 작은 수를 입력하세요. ");
      }
      if (answer == input) {
        System.out.println("정답입니다!");
        System.out.println("시도한 횟수는 " + count + " 번 입니다.");
        isCorrect = true;
      }
    } while (!isCorrect);
  }
}
