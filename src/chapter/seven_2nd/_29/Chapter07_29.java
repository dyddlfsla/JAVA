package chapter.seven_2nd._29;

public class Chapter07_29 {

  /** ◆ 여러 종류의 객체를 배열로 다루기
   *
   * 조상 타입의 참조변수로 자손 타입의 인스턴스를 참조하는 것이 가능하므로, Product 클래스가 Tv, Computer, Audio 클래스의 조상일 때,
   * 다음과 같이 할 수 있는 것을 이미 배웠다.
   *
   * Product p1 = new Tv();
   * Product p2 = new Computer();
   * Product p3 = new Audio();
   *
   * 위의 코드를 Product 타입의 참조변수 배열로 처리하면 아래와 같다.
   *
   *  Product[] p = new Product[3];
   *  p[0] = new Tv();
   *  p[1] = new Computer();
   *  p[2] = new Audio();
   *
   *  이처럼 조상 타입의 참조변수 배열을 사용하면, 공통의 조상을 가진 서로 다른 종류의 인스턴스들을 배열로 묶어서 하나로 다룰 수 있게 된다.
   *  또는 묶어서 다루고 싶은 인스턴스들이 있다면, 그 인스턴스들의 상속관계를 따져서 공통 조상을 찾아낸 뒤, 공통조상 클래스 타입의 참조변수 배열을
   *  생성해서 인스턴스들을 저장하면 된다.
   *
   *  이러한 특징을 이용해서 앞서 예제에서 만들었던 Buyer 클래스에 구입한 제품을 저장하기 위한 Product 배열을 추가해보도록 하자.
   *
   *  class Buyer {
   *    int money = 1000;
   *    int bonusPoint = 0;
   *
   *    Product[] car = new Product[10]; //구입한 제품을 담기 위한 배열
   *    int i = 0;
   *
   *    void buy(Product p) {
   *      if (this.money < p.price) {
   *        System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
   *        return;
   *      }
   *
   *      money -= p.price;
   *      bonusPoint += p.bonusPoint;
   *      cart[i++] = p; //제품을 카트에 저장한다.
   *      ...
   *    }
   *  }
   *
   * 구입한 제품을 담기 위해 Buyer 클래스에 Product 배열인 cart 를 추가해주었다. 그리고 buy 메서드에 'cart[i++] = p;' 문장을 추가함으로써
   * 물건을 구입하면, 배열 cart 에 저장되도록 했다. 이렇게 함으로써, 모든 제품 클래스의 조상인 Product 클래스 타입 배열을 만들고 구입한 제품을
   * 하나의 배열로 다룰 수 있게 되었다.
   *
   *
   * */

}
