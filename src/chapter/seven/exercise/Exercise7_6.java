package chapter.seven.exercise;

public class Exercise7_6 {
  /*
  * Outer 클래스의 내부 클래스 Inner 의 멤버변수 iv 를 출력하시오.
  * 내부 클래스(인스턴스 클래스)의 인스턴스를 생성하기 위해서는 먼저 외부 클래스의 인스턴스를 생성해야 한다.
  * 왜냐하면 '인스턴스 클래스' 는 외부 클래스의 '인스턴스 변수' 처럼 외부 클래스의 인스턴스가 생성되어야 쓸 수 있기 떄문이다.
  *
  * */

  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    System.out.println(inner.iv);
  }
}

class Outer {

  class Inner {
    int iv = 100;
  }

}
