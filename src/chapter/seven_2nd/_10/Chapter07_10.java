package chapter.seven_2nd._10;

public class Chapter07_10 {
  /** ◆ 참조변수 super
   *
   * super 는 자손 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다. 멤버변수와 지역변수의 이름이
   * 같을 때 this 를 붙여서 구별했듯이 상속받은 멤버와 자신의 멤버와 이름이 같을 때는 super 를 붙여서 구별할 수 있다.
   *
   *
   *
   * */


}

class Ex7_2 {

  public static void main(String[] args) {
    Child child = new Child();
    child.method();
  }
}

class Parent {

  int x = 10; //super.x
}

class Child extends Parent {

  int x = 20; //this.x

  void method() {
    System.out.println("x = " + x);
    System.out.println("this.x = " + this.x);
    System.out.println("super.x = " + super.x);
  }
  /** 위의 예제에서 Child 클래스는 조상인 Parent 클래스로부터 x 를 상속받는데, 공교롭게도 자신의 멤버인 x 와 이름이 같아서
   * 이 둘을 구분할 방법이 없다. 바로 이럴 때 사용하는 것이 super 이다.
   *
   *
   * */

}

class Ex7_3 {

  public static void main(String[] args) {
    Child2 child2 = new Child2();
    child2.method();
  }
}

class Parent2 {
  int x = 10; //super.x
}

class Child2 extends Parent2 {
  void method() {
    System.out.println("x= " + x);
    System.out.println("this.x= " + this.x);
    System.out.println("super.x= " + super.x);
  }

  /**
   * 위의 예제는 자손 클래스에는 자신의 인스턴스 변수 x는 없고 상속받은 x 만 있는 경우이다.
   * 이런 경우에는 사실상 x, this.x, super.x 이 셋 변수가 같은 변수를 의미하게 되고 모두 같은 값이 출력된다.
   *
   * 모든 인스턴스 메서드에는 this 와 super 가 지역변수로 존재하는데, 이들에는 자신이 속한 인스턴스의 주소가 자동으로 저장된다.
   * 조상의 멤버와 자신의 멤버를 구별하는데 사용된다는 점만 제외하면 this 와 super 는 근본적으로 같다.
   *
   * */
}
