package chapter.seven._46;

public class Ex7_12 {

  class InstanceInner {

    int iv = 100;
//    static int cv = 100; 에러 발생. 내부 클래스 중 인스턴스 클래스는 static 변수를 선언할 수 없다.
    final static int CONST = 100; //그러나 final static 의 경우 상수이므로 사용 가능.
  }

  static class StaticInner {

    int iv = 200;
    static int cv = 200; //내부 클래스 중 스태틱 클래스만 static 변수를 선언할 수 있다.
  }

  void myMethod() {
    class LocalInner {

      int iv = 300;
//      static int cv = 300;
      final static int CONST = 300; //마찬가지로 내부 클래스 중 지역 클래스는 static 변수를 가질 수 없다.
    }
  }

  public static void main(String[] args) {
    Ex7_12 ex7_12 = new Ex7_12();
    Ex7_12.InstanceInner instanceInner = ex7_12.new InstanceInner();
    System.out.printf("인스턴스 클래스의 변수 iv 출력: %d%n", instanceInner.iv);
    System.out.printf("인스턴스 클래스의 상수 CONST 출력: %d%n", InstanceInner.CONST);
    System.out.printf("스태틱 클래스의 변수 cv 출력: %d%n", StaticInner.cv);
  }

  /*
  * 내부 클래스 중에서 스태틱 클래스(static class)만 static 멤버를 가질 수 있다. 드문 경우지만 내부 클래스에 static 변수를 선언해야 한다면
  * 해당 내부 클래스를 static 클래스로 선언해야 한다. 다만 final 과 static 이 동시에 붙은 변수는 상수(constant)이므로 모든 내부 클래스에서 정의 가능하다.
  *
  * */
}
