package chapter.six_2nd._34;

public class Chapter06_34 {
  /** ◆ 매개변수가 있는 생성자
   *
   * 생성자도 메서드처럼 매개변수를 선언하여 호출 시 값을 넘겨받아서 인스턴스의 초기화 작업에 사용할 수 있다. 인스턴스마다 각기 다른
   * 값으로 초기화되어야 하는 경우가 많기 때문에 매개변수를 사용한 초기화는 매우 유용하다.
   *
   * 아래의 코드는 자동차를 클래스로 정의한 것인데, 단순히 color, gearType, door 세 개의 인스턴스 변수와와 두 개의 생성자만을 가지고 있다.
   *
   * class Car {
   *   String color; //색상
   *   String gearType; //변속기 종류
   *   int door; //문의 개수
   *
   *   Car() {}
   *   Car(String c, String g, int d) {
   *    color = c;
   *    gearType = g;
   *    door = d;
   *   }
   *
   *   Car 인스턴스를 생성할 때, 생성자 Car() 를 사용한다면, 인스턴스를 생성한 다음에 인스턴스 변수들을 따로 초기화해주어야 하지만,
   *   매개변수가 있는 생성자 Car(String color, String gearType, int door) 를 사용한다면 인스턴스를 생성하는 동시에 원하는 값으로
   *   초기화를 할 수 있게 된다.
   *
   *   인스턴스를 생성한 다음에 인스턴스 변수의 값을 변경하는 것보다 매개변수를 갖는 생성자를 사용하는 것이 코드를 보다 간결하고 직관적으로 만든다.
   *
   *   Car c = new Car();
   *   c.color = "white";
   *   c.gearType = "auto";
   *   c.door = 4;
   *
   *        ↓
   *
   *   Car c = new Car("white", "auto", 4);
   *
   *   위의 두 코드 모두 같은 내용이지만, 아래쪽의 코드가 더 간결하고 직관적이다. 이처럼 클래스를 작성할 때 다양한 생성자를 제공함으로써
   *   인스턴스 생성 후에 별도로 초기화를 하지 않아도 되게 하는 것이 바람직하다.
   * }
   *
   *
   *
   * */


}
