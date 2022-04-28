package chapter.six_2nd._29;

public class Chapter06_29 {

  public static void main(String[] args) {
  }

  /** ◆ 메서드 간의 호출과 참조
   *
   * 같은 클래스에 속한 멤버들 간에는 별도의 인스턴스를 생성하지 않고도 서로 참조 또는 호출이 가능하다. 단, 클래스 멤버가 인스턴스 멤버를 참조 또는
   * 호출하고자 하는 경우에는 인스턴스를 생성해야 한다. 그 이유는 인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 클래스 멤버가 존재하는
   * 시점에 인스턴스 멤버가 존재하지 않을수도 있기 때문이다.
   * */

}

class TestClass {
  void instanceMethod1() {} //인스턴스 메서드1
  static void staticMethod1(){} //클래스 메서드1

  void instanceMethod2() { //인스턴스 메서드2
    instanceMethod1(); //인스턴스 메서드1 을 호출한다.
    staticMethod1(); // 클래스 메서드1을 호출한다.
  }

  static void staticMethod2() {
    //instanceMethod1();  에러 발생. 클래스 메서드는 인스턴스 메서드1를 호출할 수 없다.
    staticMethod1();// 클래스 메서드1 을 호출한다.
  }

  /**
   * 위 코드는 같은 클래스 내의 인스턴스 메서드와 static 메서드 간의 호출에 대해서 설명하고 있다. 같은 클래스 내의 메서드는
   * 서로 객체의 생성이나 참조변수 없이 직접 호출이 가능하지만 static 메서드는 인스턴스 메서드를 호출할 수 없다.
   * */

}

class TestClass3 {
  int iv; //인스턴스 변수
  static int cv; //클래스 변수

  void instanceMethod() { //인스턴스 메서드
    System.out.println(iv); //인스턴스 변수를 호출 가능.
    System.out.println(cv); //클래스 변수를 호출 가능.
  }

  static void staticMethod() { //클래스 메서드
    //System.out.println(iv); 에러 발생. 클래스 메서드에서는 인스턴스 변수를 사용할 수 없다.
    System.out.println(cv); // 클래스 변수를 호출 가능.
  }
}

/**
 * 이번엔 변수와 메서드 간의 호출에 대해서 살펴보면, 메서드 간의 호출에서처럼 인스턴스 메서드는 인스턴스 변수를 사용할
 * 수 있지만 static 메서드는 인스턴스 변수를 사용할 수 없다.
 **/
