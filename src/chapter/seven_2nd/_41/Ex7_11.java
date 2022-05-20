package chapter.seven_2nd._41;

public class Ex7_11 {

  public static void main(String[] args) {
    Child child = new Child();
    child.method1();
    child.method2();
    MyInterface.staticMethod();
    MyInterface2.staticMethod();
  }

}

interface MyInterface {
  default void method1() {
    System.out.println("method1() in MyInterface");
  }

  default void method2() {
    System.out.println("method2() in MyInterface");
  }

  static void staticMethod() {
    System.out.println("staticMethod() in MyInterface");
  }
}

interface MyInterface2 {
  default void method1() {
    System.out.println("method1() in MyInterface2");
  }
  static void staticMethod() {
    System.out.println("staticMethod() in MyInterface2");
  }
}

class Parent {
  public void method2() {
    System.out.println("method2() in Parent ");
  }
}

class Child extends Parent implements MyInterface, MyInterface2 {

  @Override
  public void method1() { //MyInterface, MyInterface2 로부터 이름이 같은 method1() 메서드를 상속받았으므로 중복되어 어떤 메서드를 실행시킬지 정할 수 없어 에러가 발생한다.
    System.out.println("method1() in Child"); //즉, 여러 인터페이스의 디폴트 메서드가 간의 충돌이다. 그래서 method1() 를 오버라이딩해야 한다.
  }

  //이외에도 child 클래스가 가진 멤버를 살펴보면 Parent 로부터 물려받은 method2() 가 있고 MyInterface 로부터 물려받은 method2() 가 있으므로 둘이
  //충돌하여 컴파일 에러가 날 같지만 그렇지 않다. 디폴트 메서드와 조상 클래스의 메서드가 충돌하는 경우 조상 클래스의 메서드가 상속되고 디폴트 메서드는 무시되기 때문이다.

}
