package chapter.seven._50;

public class Outer3 {

  int value = 10; //Outer3.this.value
  class inner {

    int value = 20; //this.value

    void method() {
      int value = 30;
      System.out.printf("value: %d %n", value);
      System.out.printf("this.value: %d %n", this.value);
      System.out.printf("Outer3.this.value: %d %n", Outer3.this.value);
    }
  } //Inner 클래스의 끝
}// Outer3 클래스의 끝

class Ex7_16 {

  public static void main(String[] args) {
    Outer3 outer3 = new Outer3();
    Outer3.inner inner = outer3.new inner();
    inner.method();
  }

  /*
  * 위의 예제는 내부 클래스와 외부 클래스에 선언된 변수의 이름이 같을 때 변수 앞에 'this' 또는 '외부클래스명.this' 를 붙여서
  * 서로를 구별할 수 있다는 것을 보여준다.
  * */
}
