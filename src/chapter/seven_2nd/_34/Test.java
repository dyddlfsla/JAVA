package chapter.seven_2nd._34;

class A {
  void method() {
    System.out.println("메서드 A 입니다.");
  }
}

class B extends A {
  void method() {
    System.out.println("메서드 B 입니다.");
  }
}

class C extends A {
  void method() {
    System.out.println("메서드 C 입니다.");
  }
}

public class Test {

  public static void main(String[] args) {
    A a1 = new B();
    A a2 = new C();
    a1.method();
    a2.method();
  }
}
