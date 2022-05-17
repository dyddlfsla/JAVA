package chapter.seven_2nd._27;

public class Chapter07_27 {

  /** ◆ 매개변수의 다형성
   *
   * 참조변수의 다형적인 특징은 메서드의 매개변수에도 적용된다. 아래와 같이 Product, Tv, Computer, Buyer 클래스가
   * 정의되어 있다고 하자.
   *
   * class Product {
   *   int price; //제품의 가격
   *   int bonusPoint; //제품구매 시 제공하는 보너스 점수
   * }
   *
   * class Tv extends Product {}
   * class Computer extends Product {}
   *
   * class Buyer { //고객, 물건을 사는 사람
   *  int money = 1000;
   *  int bonusPoint = 0;
   * }
   *
   * Product 클래스는 Tv 와 Computer 클래스의 조상이며, Buyer 클래스는 제품(Product) 를 구입하는 사람을 클래스로 표현한 것이다.
   * Buyer 클래스에 물건을 구입하는 기능의 메서드를 추가해보자. 구입할 대상이 필요하므로 매개변수로 구입할 제품을 넘겨받아야 한다.
   * Tv 를 살 수 있도록 매개변수의 타입을 Tv 로 하였다.
   *
   * void buy(Tv t) {
   *  money = money - t.price //구매자가 가진 돈에서 상품 가격만큼을 뺀다.
   *  bonusPoint = bonusPoint + t.bonusPoint; //제품을 구매한 대가로 보너스를 얻는다.
   * }
   *
   * buy(Tv t) 메서드는 제품을 구입하면 제품을 구입한 사람이 가진 돈에서 제품의 가격을 빼고, 보너스 점수는 추가하는 작업을 하도록 작성되었다.
   * 그런데 buy(Tv t) 로는 Tv 밖에 살 수 없기 때문에 아래와 같이 다른 제품들도 구입할 수 있는 메서드가 추가로 필요하다.
   *
   * void buy(Computer c) {
   *   money = money - c.money;
   *   bonusPoint = bonusPoint - c.bonusPoint;
   * }
   *
   * 이렇게 되면, 제품의 종류가 늘어날 때마다 Buyer 클래스에는 새로운 buy 메서드를 추가해주어야 할 것이다.
   * 그러나 메서드의 매개변수에 다형성을 적용하면 아래와 같이 하나의 메서드로 간단히 처리할 수 있다.
   *
   * void buy(Product p) {
   *   money -= p.money;
   *   bonusPoint += p.bonusPoint;
   * }
   *
   * 매개변수가 Product 타입의 참조변수라는 것은, 메서드의 매개변수로 Product 클래스의 자손 타입의 참조변수면 어느 것이나 매개변수로 받아들일 수 있다는 것이다.
   * 그리고 Product 클래스에 price 와 bonusPoint 가 선언되어 있기 때문에 참조변수 p 로 인스턴스의 price, bonusPoint 멤버를 똑같이 사용할 수 있다.
   *
   * 앞으로 다른 제품 클래스를 추가할 때 Product 클래스를 상속받기만 하면, buy(Product p) 메서드의 매개변수로 받아들여 질 수 있다.
   *
   * Buyer b = new Buyer();
   * Tv t = new Tv();
   * Computer c = new Computer();
   *
   * b.buy(t);
   * b.buy(c);
   *
   * ※ Tv t = new Tv(); 와 b.buy(t) 를 한 문장으로 줄이면 b.buy(new Tv()); 가 된다.
   *
   * Tv 클래스와 Computer 클래스는 Product 클래스의 자손이므로 위의 코드와 같이 buy(Product p) 메서드에 매개변수로 Tv 인스턴스와
   * Computer 인스턴스를 제공하는 것이 가능하다.
   *
   *
   *
   *
   *
   * */

}
