package chapter.seven;

//class Product {
//  int price;      //제품의 가격
//  int bonusPoint; //제품 구매 시 제공하는 보너스점수
//}
//
//class Television extends Product {}
//class Computer extends Product {}
//
//class Buyer {          //고객, 물건을 사는 사람
//  int money = 1000;    //소유금액
//  int bonusPoint = 0;  //보너스 점수
//
//  void buy(Television television) {
//    money -= television.price; //buyer 가 가진 돈에서 제품의 가격만큼 뺀다.
//    bonusPoint += television.bonusPoint; // buyer 의 보너스 점수는 구매한 물건의 보너스 점수만큼 증가한다.
//  }
//
//  void buy(Computer computer) {
//    money -= computer.price;
//    bonusPoint += computer.bonusPoint;
//  }
//
//  void buy(Product product) {
//    money -= product.price;
//    bonusPoint += product.bonusPoint;
//  }
//}

public class Chapter07_27 {

  /** ◆ 매개변수의 다형성
   *
   * 참조변수의 다형적인 특징은 메서드의 매개변수에도 적용된다. 아래와 같이 Product, Tv, Computer, Buyer 클래스가 정의되어 있다고 하자.
   * Product 클래스는 Television 과 Computer 클래스의 조상이며, Buyer 클래스는 제품(Product)구입하는 사람을 클래스로 표현한 것이다.
   *
   * Buyer 클래스에 물건을 구입하는 기능의 메서드를 추가해보자. 구입할 대상이 필요하므로 메서드의 매개변수로 구입할 제품을 넘겨받아야 한다. Television 을 살 수 있도록
   * 매개변수를 Television 타입으로 하였다.
   *
   * 그런데 buy(Television television) 로는 television 밖에 살 수 없기 때문에 아래와 같이 다른 제품도 구입할 수 있는 메서드가 추가로 필요하다.
   * 이렇게 되면, 제품의 종류가 늘어날 때마다 Buyer 클래스에는 새로운 buy 메서드를 추가해주어야 할 것이다. 그러나 메서드의 매개변수에 다형성을 적용하면
   * 아래와 같이 하나의 메서드로 간단히 처리할 수 있다.
   *
   * 매개변수가 Product 타입의 참조변수라는 것은, 메서드의 매개변수로 Product 클래스의 자손타입의 참조변수면 어느 것이든 매개변수로 받아들일 수 있다는 것이다.
   * 그리고 Product 클래스에 price 와 bonusPoint 가 선언되어 있기 때문에 참조변수 product 로 인스턴스의 price 와 bonusPoint 를 사용할 수 있다.
   *
   * 앞으로 다른 제품 클래스를 추가할 때는 Product 클래스를 상속 받기만 하면 buy(Product product) 메서드의 매개변수로 받아들여질 수 있다.
   * */

//  public static void main(String[] args) {
//    Buyer buyer = new Buyer();
//    Television television = new Television();
//    Computer computer = new Computer();
//
//    buyer.buy(television);
//    buyer.buy(computer);
//    System.out.printf("%d%n", buyer.money);
//  }
}
