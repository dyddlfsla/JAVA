package chapter.nine._02;

public class Chapter09_2 {

  /** ◆ Object 클래스의 메서드 - equals()
   *
   * 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean 값으로 알려주는 역할을 한다. 아래의 코드는 Object 클래스에 정의된
   * equals() 메서드의 실제 내용이다.
   *
   *  public boolean equals(Object obj) {
   *    return (this == obj);
   *  }
   *
   * 위의 코드에서 알 수 있듯이 두 객체의 같고 다름을 참조변수의 값으로 판단한다. 그렇기 때문에 서로 다른 두 객체를 equals() 로 비교하면
   * 항상 false 를 얻게 된다.
   *
   * ※ 객체를 생성할 때 메모리의 비어있는 공간을 찾아 생성하므로 서로 다른 두 객체가 같은 주소를 갖는 일은 있을 수 없다.
   *   그러나 두 개 이상의 참조변수가 같은 주소값을 갖는 것(한 객체를 참조하는 것)은 가능하다.
   *
   *
   * */
  public static void main(String[] args) {
    Value v1 = new Value(10);
    Value v2 = new Value(10);

    if (v1.equals(v2)) {
      System.out.println("v1 과 v2 는 같습니다.");
    } else {
      System.out.println("v1 과 v2 는 다릅니다.");
    }

    /*
    * value 라는 멤버변수를 갖는 Value 클래스를 정의하고 두 개의 Value 클래스의 인스턴스를 생성한 다음
    * equals 를 이용해서 두 인스턴스를 비교하도록 하였다. equals 메서드는 주소값으로 비교를 하기 때문에
    * 두 Value 인스턴스의 멤버변수 value 값이 10으로 서로 같을지라도 equals 로 비교한 결과는 false 일 수 밖에 없다.
    *
    *
    * */

  }
}

class Value {
  int value;

  public Value(int value) {
    this.value = value;
  }
}