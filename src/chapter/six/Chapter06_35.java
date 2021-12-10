package chapter.six;

public class Chapter06_35 {

  /** ◆ 매개변수가 있는 생성자 예제
   *
   * 지금까지 생성자에 대해 모르고도 프로그래밍이 가능했다는 것을 생각해보면 생성자는 그리 중요하지 않은 것처럼
   * 보인다. 하지만, 지금까지 본 것처럼 생성자를 잘 활용하면 보다 간결하고 직관적인, 객체지향적인 코드를
   * 작성할 수 있을 것이다.
   *
   * ※ 인스턴스를 생성할 때에는 다음의 2가지 사항을 결정해야 한다.
   *   1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
   *   2. 생성자 - 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가?
   *
   * */

}

class Car {
  String color;
  String gearType;
  int door;

  Car() {}

  Car(String c, String g, int d) {
    color = c;
    gearType = g;
    door = d;
  }

  public static void main(String[] args) {
    Car car1 = new Car();
    car1.color = "white";
    car1.gearType = "auto";
    car1.door = 4;

    Car car2 = new Car("white", "auto", 4);

    System.out.printf("car1의 color = %s, gearType = %s, door = %d 이다.%n", car1.color, car1.gearType, car1.door);
    System.out.printf("car2의 color = %s, gearType = %s, door = %d 이다.%n", car2.color, car2.gearType, car2.door);
  }
}
