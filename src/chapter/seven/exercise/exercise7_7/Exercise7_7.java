package chapter.seven.exercise.exercise7_7;

import chapter.seven.exercise.exercise7_7.Outer.Inner;

public class Exercise7_7 {
  /*
  * 내부 클래스 Inner 의 멤버변수 iv 의 값을 출력하시오.
  * 스태틱 클래스(static class)는 인스턴스 클래스와 달리 외부 클래스의 인스턴스를 생성하지 않고도 사용할 수 있다.
  *  일반 클래스에서 static 멤버를 인스턴스 생성 없이 사용할 수 있는 것과 같다.
  *
  * */

  public static void main(String[] args) {
    Outer.Inner inner = new Inner();
    System.out.println(inner.iv);
  }
}

class Outer {

  static class Inner {

    int iv = 200;

  }

}
