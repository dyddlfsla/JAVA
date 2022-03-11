package chapter.seven;

//class Audio extends Product{
//  Audio() {
//    super(100);
//  }
//}
public class Chapter07_29 {

  /** ◆ 여러 종류의 객체를 배열로 다루기
   *
   * 조상타입의 참조변수로 자손타입의 객체롤 참조하는 것이 가능하므로, Product 클래스가 Television, Computer, Audio 클래스의
   * 조상일 때, 다음과 같이 할 수 있는 것을 이미 배웠다.
   *  Product product1 = new Television();
   *  Product product2 = new Computer();
   *  Product product3 = new Audio();
   *
   * 위의 코드를 Product 타입의 참조변수 배열로 처리하면 아래와 같다.
   *  Product[] products = new Product[3];
   *  products[0] = new Television();
   *  products[1] = new Computer();
   *  products[2] = new Audio();
   *
   * 이처럼 조상타입의 참조변수 배열을 사용하면, 공통의 조상을 가진 서로 다른 종류의 객체를 배열로 묶어서 다룰 수 있다.
   * 또는 묶어서 다루고 싶은 객체들의 상속관계를 따져서 가장 가까운 공통조상 클래스 타입의 참조변수 배열을 생성해서 객체들을 저장하면 된다.
   * 이러한 특징을 이용해서 예제 7-8 Buyer 클래스에 구입한 제품을 저장하기 위한 Product 배열을 추가해보도록 하자.
   * 이렇게 모든 제품 클래스의 조상인 Product 타입의 배열을 사용함으로써 구입한 제품을 하나의 배열로 간단하게 다룰 수 있게 된다.
   *
   * */
}
