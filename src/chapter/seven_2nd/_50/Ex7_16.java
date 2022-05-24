package chapter.seven_2nd._50;

public class Ex7_16 {

  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    inner.method1();
  }

}

class Outer {

  int value = 10;

  class Inner {

    int value = 20;

    void method1() {
      int value = 30;
      System.out.println("              value : " + value);
      System.out.println("         this.value : " + this.value);
      System.out.println("    Outer.this.value: " + Outer.this.value);
    }
  }

  /*
  * 위의 예제는 내부 클래스와 외부 클래스에 선언된 변수의 이름이 같을 때 변수 앞에 'this' 또는 '외부클래스명.this' 를 붙여서 서로 구별할 수 있다는 것을 보여주는 예시이다.
  *
  *
  * */
}
