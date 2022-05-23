package chapter.seven_2nd._46;

public class Ex7_12 {
  class InstanceInner {
    int iv= 100;
    //static int cv = 100; 실행 시 에러 발생. 내부 클래스에서 스태틱 변수를 사용하려면 static 으로 선언된 내부 클래스에서만 사용할 수 있다.
    final static int CONST = 100;
  }

  static class StaticInner {
    int iv = 200;
    static int cv = 200;
  }

  void myMethod() {
    class LocalInner {
      int iv = 300;
//      static int cv = 300; 실행 시 에러 발생. 내부 클래스에서 스태틱 변수를 사용하려면 static 으로 선언된 내부 클래스에서만 사용할 수 있다.
      final static int CONST = 300;
    }
  }

  public static void main(String[] args) {
    System.out.println(InstanceInner.CONST);
    System.out.println(StaticInner.cv);
  }

  /*
  * 내부 클래스 중에서도 스태틱 클래스(StaticInner) 에서만 static 멤버를 가질 수 있다. 드문 경우지만 내부 클래스에 static 변수를 선언해야 한다면
  * 우선 스태틱 클래스로 선언해야 한다. 다만 static final 이 동시에 붙은 변수는 상수(constant) 이므로 모든 내부 클래스에서 선언할 수 있다.
  *
  *
  * */
}
