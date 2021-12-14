package chapter.seven;

class Parent {
  int x = 10; //super.x
}

class Child extends Parent {
  int x = 20; //this.x
  void method() {
    System.out.printf("x = %d%n", x);
    System.out.printf("this.x = %d%n", this.x);
    System.out.printf("super.x = %d%n", super.x);
  }
}

public class Ex7_2 {

  public static void main(String[] args) {
    Child child = new Child();
    child.method();
  }
}
