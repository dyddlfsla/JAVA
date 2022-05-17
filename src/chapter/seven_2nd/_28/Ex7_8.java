package chapter.seven_2nd._28;

class Product {
  int price;
  int bonusPoint;

  public Product(int price) {
    this.price = price;
    this.bonusPoint = (int) (price / 10.0); //보너스 점수는 제품 가격의 10%
  }
}

class Tv extends Product {

  Tv() {
    super(100);
  }

  @Override
  public String toString() {
    return "[Tv]";
  }
}

class Computer extends Product {

  Computer() {
    super(200);
  }

  @Override
  public String toString() {
    return "[Computer]";
  }
}

class Buyer {
  int money = 1000;
  int bonusPoint = 0;

  void buy(Product p) {
    if (this.money < p.price) {
      System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
      return;
    }
    this.money -= p.price;
    this.bonusPoint += p.bonusPoint;
    System.out.println(p + " 을/를 구입하셨습니다. ");
    //참조변수 + 문자열은 참조변수를 문자열로 변환 후 연산을 하게 되는데, 이때 참조변수를 문자열로 변환할 때 사용되는 메서드가 toString() 이다
    //즉, 참조변수 + 문자열 → 참조변수.toString() + 문자열로 처리된다.
  }

  void showFinanceStatus() {
    System.out.printf("현재 남은 돈은 %d 원입니다.\n", this.money);
    System.out.printf("현재 적립된 포인트는 %d 점입니다.\n", this.bonusPoint);
  }
}


public class Ex7_8 {

  public static void main(String[] args) {
    Buyer buyer = new Buyer();
    buyer.buy(new Tv());
    buyer.buy(new Computer());
    buyer.showFinanceStatus();
  }

}
