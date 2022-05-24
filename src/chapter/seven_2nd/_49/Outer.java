package chapter.seven_2nd._49;

import chapter.seven_2nd._49.Outer.StaticInner;

public class Outer {

  class InstanceInner {

    int iv = 100;
  }

  static class StaticInner {

    int iv = 200;
    static int cv = 300;
  }

  void myMethod() {
    class LocalInner {

      int iv = 400;
    }
  }

}

class Ex7_15 {

  public static void main(String[] args) {
    //인스턴스 클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야 한다.
    Outer outer = new Outer();
    Outer.InstanceInner instanceInner = outer.new InstanceInner();

    System.out.println("instance.iv = " + instanceInner.iv);
    System.out.println("Outer.StaticInner.cv = " + Outer.StaticInner.cv);

    //스태틱 내부 클래스의 인스턴스는 외부 클래스의 인스턴스를 먼저 생성하지 않아도 된다.
    Outer.StaticInner staticInner = new Outer.StaticInner();
    System.out.println("staticInner.iv = " + staticInner.iv);
  }

  /*
  * 외부 클래스가 아닌 제 3자 클래스에서 내부 클래스의 인스턴스를 생성하고 내부 클래스의 멤버에 접근하는 예제이다. 실제로 이런 경우가 발생했다는 것은 내부 클래스로 선언해서는 안되는 클래스를
  * 내부 클래스로 선언했다는 의미이다. 참고로만 봐두고 가볍게 넘어가자.
  *
  * */
}
