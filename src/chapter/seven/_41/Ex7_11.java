package chapter.seven._41;

public class Ex7_11 {

  public static void main(String[] args) {
    Child3 child3 = new Child3();
    child3.method1(); //1. 여러 인터페이스의 디폴트 메서드들이 충돌하는 경우 구현 클래스에서 오버라이딩 해주어야 함.
    child3.method2(); //2. 인터페이스의 디폴트 메서드와 조상 클래스의 메서드가 충돌하는 경우에는 디폴트 메서드가 무시되고 조상 메서드가 우선함.
    MyInterface.staticMethod();
    MyInterface2.staticMethod();
  }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {

  @Override
  public void test(int x) {}

  @Override
  public void test(String x) {}

  public void method1() {
    System.out.printf("method1() in Child3 %n");
  }

  @Override
  public void method2() {
    System.out.printf("method2() in Child3 %n");
  }
}

class Parent3 {
   void method2() {
    System.out.printf("method2() in Parent3 %n");
  }
}

interface MyInterface {

  void test(int x);

  default void method1() {
    System.out.printf("method1() in MyInterface %n");
  }

  default void method2() {
    System.out.printf("method2() in MyInterface %n");
  }
  static void staticMethod() {
    System.out.printf("staticMethod() in MyInterface %n");
  }
}

interface MyInterface2 {

  void test(String x);

  default void method1() {
    System.out.printf("method1() in MyInterface2 %n");
  }

  static void staticMethod() {
    System.out.printf("staticMethod() in MyInterface2 %n");
  }
}