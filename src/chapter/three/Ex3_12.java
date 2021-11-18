package chapter.three;

public class Ex3_12 {

  /** ◆ 나머지 연산자
   *
   * 나머지 연산자는 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 결과로 반환한다.
   * 나눗셈에서처럼 0으로 나눌 수 없고, 피연산자로 정수만 허용한다.
   * 나머지 연산자는 주로 짝수, 홀수 또는 배수 검사 등에 사용된다.
   *
   * */

  public static void main(String[] args) {
    int x = 10;
    int y = 8;
    System.out.printf("%d을 %d로 나누면, %n", x, y);
    System.out.printf("몫은 %d이고, 나머지는 %d입니다.", 10 / 8, 10 % 8);
  }

}
