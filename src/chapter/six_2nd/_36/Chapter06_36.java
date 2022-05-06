package chapter.six_2nd._36;

public class Chapter06_36 {
  /** ◆ 생성자에서 다른 생성자 호출하기 - this()
   *
   * 같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출이 가능하다. 단, 다음의 두 조건을 만족시켜야 한다.
   *
   * ============================================================
   * 1. 생성자의 이름으로 클래스이름 대신 this 를 사용한다.
   * 2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
   * =============================================================
   *
   * 아래 코드는 생성자를 작성할 때 지켜야 하는 조건을 모두 만족시키지 못해 에러가 발생한다.
   *
   * Car(String color) {
   *   door = 5;
   *   Car(color, "auto", 4); // ① 다른 생성자를 호출할 때  첫번째 줄에서 호출하지 않음.
   *                          // ② 클래스이름 대신 this 를 써야하지만 그렇지 않음. this(color, "auto", 4); 로 작성.
   * }
   *
   * 생성자에서 다른 생성자를 호출할 때는 클래스이름인 'Car' 대신 'this' 를 사용해야하는데 그렇지 않아 에러가 발생하고, 또한 생성자 호출이
   * 첫번째 줄이 아닌 두번째 줄에 작성되었으므로 에러이다.
   *
   * 생성자에서 다른 생성자를 호출할 때 첫 줄에서만 가능하도록 한 것은 생성자 내에서 초기화 작업도중에 다른 생성자를 호출하게 되면, 호출된 다른
   * 생성자 내에서도 멤버변수들의 값을 초기화 할 것이므로 다른 생성자를 호출하기 이전에 수행했던 초기화 작업이 무의미해질 수 있기 때문이다.
   *
   *
   * */

}

class Car2 {
  String color;
  String gearType;
  int door;

  Car2() {
    this("white", "auto", 4); // 생성자 Car2(String color, String gearType, int door) 를 호출하고 있다.
  }

  Car2(String color) {
    this(color, "auto", 4); // 생성자 Car2(String color, String gearType, int door) 를 호출하고 있다.
  }

  Car2(String color, String gearType, int door) {
    this.color = color;
    this.gearType = gearType;
    this.door = door;
  }
}

class Ex6_13 {

  public static void main(String[] args) {
    Car2 c1 = new Car2();
    Car2 c2 = new Car2("blue");

    System.out.printf("c1 의 color = %s, gearType = %s, door = %d 입니다만, \n", c1.color, c1.gearType, c1.door);
    System.out.printf("c2 의 color = %s, gearType = %s, door = %d 입니다만, \n", c2.color, c2.gearType, c2.door);
  }

  /**
   * 생성자 Car2() 에서 또 다른 생성자 Car2(String color, String gearType, int door) 를 호출하였다. 이처럼 생성자 간의 호출에는
   * 생성자 이름 대신 this 를 사용해야만 하므로 'Car2' 대신 'this' 를 사용했다. 그리고 생성자 Car2() 의 첫째 줄에서 호춣하였다는 점 역시 뵈두어야 한다.
   *
   * Car2() {
   *   color = "white";
   *   gearType = "auto";
   *   door = 4;
   * }
   *
   *      ↓
   *
   * Car2() {
   *   this("white", "auto", 4);
   * }
   *
   * 위 코드는 둘 다 같은 일을 하지만 아래쪽의 코드는 생성자 Car2(String color, String gearType, int door) 를 활용해서
   * 더욱 간략히 한 것이다. Car2 c1 = new Car2(); 와 같이 생성자 Car2() 를 사용해서 Car2 인스턴스를 생성한 경우에, 인스턴스 변수는
   * color 는 "white", gearType 은 "auto", door 는 4 로 초기화 될 것이다.
   *
   * 이것은 마치 실생활에서 자동차(Car2 인스턴스)를 생성할 때, 아무런 옵션도 주지 않으면 기본적으로 흰색(white), 자동변속기어(auto), 문의 개수(4) 인
   * 자동차가 생산되도록 하는 것에 비유할 수 있다.
   *
   * 같은 클래스 내의 생성자들은 일반적으로 서로 관계가 깊은 경우가 많아서 이처럼 서로 호출하도록 하여 유기적으로 연결해주면 더 좋은 코드를 얻을 수 있다.
   * 그리고 수정이 필요한 경우에 보다 적은 코드를 변경하여 같은 효과를 낼 수 있게 되므로 유지보수에도 유리해진다.
   *
   *
   * */
}
