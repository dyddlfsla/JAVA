package chapter.seven;

//class Product {
//  int price;
//  int bonusPoint;
//
//  Product(int price) {
//    this.price = price;
//    bonusPoint = (int) (price / 10.0);
//  }
//}
//
//class Television extends Product{
//  Television() {
//    super(100); //Television 의 가격을 100으로 한다.
//  }
//  //Object 클래스의 toString()을 오버라이딩한다.
//  public String toString() {
//    return "Television";
//  }
//}
//
//class Computer extends Product {
//  Computer() {
//    super(200);
//  }
//
//  public String toString() {
//    return "Computer";
//  }
//}
//
//class Buyer {
//  int money = 1000;
//  int bonusPoint = 0;
//  Product[] cart = new Product[10];// 구입한 제품을 저장하기 위한 배열(카트)
//  int i = 0;
//
//  void buy(Product product) {
//    if (money < product.price) {
//      System.out.printf("잔액이 부족하여 물건을 구매할 수 없습니다.%n");
//      return;
//    }
//
//    money -= product.price;
//    bonusPoint += product.bonusPoint;
//    cart[i++] = product; //구입한 제품을 Product[] cart 에 저장한다.
//    System.out.printf("%s 을/를 구입하셨습니다.%n", product.toString());
//  }
//}

public class Ex7_8 {

//  public static void main(String[] args) {
//    Buyer buyer = new Buyer();
//    buyer.buy(new Television());
//    buyer.buy(new Computer());
//
//    System.out.printf("현재 남은 돈은 %d 입니다.%n", buyer.money);
//    System.out.printf("현재 보너스 점수는 %d 입니다.%n", buyer.bonusPoint);
//  }
}
