package chapter.seven.exercise.exercise7_8;

public class Exercise7_8 {

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
      System.out.println(value);
      System.out.println(this.value);
      System.out.println(Outer.this.value);
    }
    /*
    * 외부 클래스와 내부 클래스에 같은 이름의 인스턴스 변수(value) 가 선언되었을 때 어떻게 구별할 것인가에 대한 문제이다.
    * 외부 클래스의 인스턴스 변수는 내부 클래스에서 '외부클래스이름.this.변수이름' 으로 접근할 수 있다.
    * 내부 클래스가 스태틱 클래스가 아닌 인스턴스 클래스이므로 먼저 외부 클래스의 인스턴스를 생성해야만 내부 클래스의 인스턴스를 생성할 수 있다.
    *
    * */
  }
}


