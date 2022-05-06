package chapter.six_2nd._35;

public class Chapter06_35 {

  /** ◆ 매개변수가 있는 생성자 예제
   *
   * 지금까지 생성자에 대해서 모르고도 자바프로그래밍이 가능했던 것을 생각한다면, 생성자는 그리 중요하지 않은 것으로 생각될지도 모른다.
   * 하지만, 지금까지 본 것처럼 생성자를 잘 활용하면 보다 간결하고 직관적인, 객체지향적인 코드를 작성할 수 있을 것이다.
   *
   * 인스턴스를 생성할 때는 다음의 2가지 사항을 결정해야 한다.
   *
   * =====================================================
   * 1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
   * 2. 생성자 - 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가?
   * =====================================================
   * */
}

class Car {
  String color;
  String gearType;
  int door;

  Car() {}

  Car(String color, String gearType, int door) {
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }
}

class Ex6_12 {
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.color = "white";
    c1.gearType = "auto";
    c1.door = 4;

    Car c2 = new Car("white", "auto", 4);

    System.out.printf("c1 의 color = %s, gearType = %s, door = %d 입니다. \n", c1.color, c1.gearType, c1.door);
    System.out.printf("c2 의 color = %s, gearType = %s, door = %d 입니다. \n", c2.color, c2.gearType, c2.door);
  }
}
