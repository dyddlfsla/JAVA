package chapter.four;

public class Chapter04_02 {

  /** ◆ 조건식의 다양한 예
   *
   * if 문에 사용되는 조건식은 일반적으로 비교 연산자와 논리 연산자를 조합하여 구성한다. 자주 사용되는 몇 가지 예를 살펴보자.
   *
   *  ① 90 <= x && x <= 100 // x가 90이상 100이하 일 때
   *  ② x < 0 || x > // x가 0보다 작거나 100보다 클 때
   *  ③ x%3 && x%2! == 0 // x가 3의 배수이지만 2의 배수는 아닐 때
   *  ④ ch == 'y' || ch == 'Y' // 문자 ch가 'y' 또는 'Y'일 때
   *  ⑤ ch == ' ' || ch == '\t' || ch == '\n' // 문자 ch가 공백이거나 탭 또는 개행 문자일 때
   *  ⑥ 'A' <= ch && ch <= 'Z' // 문자가 영어 대문자일 때
   *  ⑦ 'a' <= ch && ch <= 'z' // 문자가 영어 소문자일 때
   *  ⑧ '0' <= ch && ch <= '9' // 문자가 1 ~ 9 사이 숫자일 때
   *  ⑨ str.equals("yes") // 문자열 내용이 "yes"일 때
   *  ⑩ str.equalsIgonoreCase("yes") // 문자열 내용이 대소문자 상관없이 "yes"일 때
   *
   * 조건식을 작성할 때 가장 많이 실수하는 것이 등가비교 연산자 '==' 대신 대입 연산자'='를 사용하는 것이다.
   * 자바에서 조건식의 결과는 반드시 true 또는 false 이어야 한다는 것을 잊지 말자.
   *
   * */

  public static void main(String[] args) {
    int x = 0;
    System.out.printf("x = %d 일 때, 참인 것은 %n", x);

    if ( x == 0) {
      System.out.println("x == 0");
    }
    if (x != 0) {
      System.out.println("x != 0");
    }
    if (!(x == 0)) {
      System.out.println("!(x == 0)");
    }
    if (!(x != 0)) {
      System.out.println("!(x != 0)");

    x = 1;
    System.out.printf("x = %d 일 때, 참인 것은 %n", x);

    }if ( x == 0) {
      System.out.println("x == 0");
    }
    if (x != 0) {
      System.out.println("x != 0");
    }
    if (!(x == 0)) {
      System.out.println("!(x == 0)");
    }
    if (!(x != 0)) {
      System.out.println("!(x != 0)");
    }
  }

}
