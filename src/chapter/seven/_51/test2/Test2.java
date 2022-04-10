package chapter.seven._51.test2;

class A {

  interface B {
    void abc();
  }
}

//class C implements A.B {
//
//  @Override
//  public void abc() {
//    System.out.printf("111111 1 %n");
//  }
//}

public class Test2 {

  public static void main(String[] args) {

    A.B ab = new A.B () {
      @Override
      public void abc() {
        System.out.printf("2222222 %n");
      }
    };
    ab.abc();
  }
}
