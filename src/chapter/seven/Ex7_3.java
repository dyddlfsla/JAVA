package chapter.seven;

class Parent2 {
  int x = 10;
}

class Child2 extends Parent2 {
  void method() {
    System.out.printf("x = %d%n", x);
    System.out.printf("this.x = %d%n", this.x);
    System.out.printf("super.x = %d%n", super.x);
  }
}

public class Ex7_3 {

  public static void main(String[] args) {
    Child2 child2 = new Child2();
    child2.method();
  }
}
