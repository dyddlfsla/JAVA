package chapter.three;

public class Chapter03_07 {

  /** ◆ 형변환 연산자 ()
   *
   * 프로그램을 작성하다 보면 같은 타입뿐만 아니라 서로 다른 타입 간의 연산을 수행해야 하는 때도 발생한다.
   * 이럴 때는 연산을 수행하기 전에 타입을 일치시켜야 하는데, 변수나 리터럴의 타입을 다른 타입으로 변환하는 것을 '형변환(Casting)'이라고 한다.
   *
   *  [형변환이란, 변수 또는 상수의 타입을 다른 타입으로 변환하는 것]
   *
   * 형변환 방법은 간단하다. 형변환하고자 하는 변수나 리터럴 앞에 변환하고자 하는 타입을 괄호()와 함께 붙여주기만 하면 된다.
   *
   *  형변환 방법 :  (타입)피연산자
   *
   * 여기에 사용되는 괄호()는 '캐스트 연산자' 또는 '형변환 연산자'라고 한다.
   *
   *  double d = 85.4;
   *  int score = (int)d;
   *  위 연산을 살펴보면 다음과 같다.
   *
   *  int score = (int)d; → int score = (int)85.4; → int score = 85;
   *
   * */

  public static void main(String[] args) {
    double d = 85.4;
    int score = (int)d;
    System.out.println("score = " + score);
    System.out.println("d = " + d);
  }

}
