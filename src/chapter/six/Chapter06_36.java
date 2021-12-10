package chapter.six;

class Bike {
  String color;
  String gearType;
  int door;

  Bike() {
    this("white", "auto", 4);// 생성자 호출
  }

  Bike(String color) {
    this(color, "auto", 4); //생성자 호출
  }

  Bike(String color, String gearType, int door) {
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }

}
public class Chapter06_36 {

  /** ◆ 생성자에서 다른 생성자 호출하기 - this()
   *
   * 같은 클래스 멤버들 간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출이 가능하다.
   * 단, 다음 두 가지 조건을 만족시켜야 한다.
   *
   * ---------------------------------------------------------------------
   * 1. 생성자의 이름으로 클래스이름 대신 this 를 사용한다.
   * 2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서 호출하도록 한다.
   * ---------------------------------------------------------------------
   *
   * 생성자에서 다른 생성자를 호출할 때 첫 줄에서만 호출이 가능한 이유는 초기화 작업 도중에
   * 다른 생성자를 호출하게 되면 호출된 다른 생성자도 멤버변수들의 값을 초기화하게 될텐데 그러면
   * 생성자를 호출하기 전에 수행했던 변수 초기화 작업이 무의미해지기 때문이다.
   *
   *
   * */

  public static void main(String[] args) {
    Bike bike1 = new Bike();
    Bike bike2 = new Bike("blue");

    System.out.printf("bike1 의 color = %s, gearType = %s, door = %d 이다.%n", bike1.color, bike1.gearType, bike1.door);
    System.out.printf("bike2 의 color = %s, gearType = %s, door = %d 이다.%n", bike2.color, bike2.gearType, bike2.door);
  }

  /**
   * 이처럼 같은 클래스 내의 생성자들은 일반적으로 서로 관계가 깊은 경우가 많기 때문에
   * 서로 호출하도록 하여 유기적으로 연결해주면 더욱 좋은 코드를 작성할 수 있을 것이다.
   *
   * */

}
