package chapter.seven_2nd._30;

class Product {
  int price;
  int bonusPoint;

  Product(int price) {
    this.price = price;
    this.bonusPoint = (int) (price / 10.0);
  }
}

class Tv extends Product {

  public Tv() {
    super(100);
  }

  @Override
  public String toString() {
    return "Tv";
  }
}

class Computer extends Product {

  public Computer() {
    super(200);
  }

  @Override
  public String toString() {
    return "Computer";
  }
}

class Audio extends Product {

  public Audio() {
    super(50);
  }

  @Override
  public String toString() {
    return "Audio";
  }
}

class Buyer {
  int money = 1000;
  int bonusPoint = 0;
  Product[] cart = new Product[10];
  int i = 0;

  void buy(Product product) {
    if (money < product.price) {
      System.out.printf("잔액이 부족하여 물건을 살 수 없습니다. \n");
      return;
    }
    money -= product.price;
    bonusPoint += product.bonusPoint;
    cart[i++] = product;
    System.out.printf(" %s 을/를 구입하셨습니다. \n", product);
  }

  void summary() {
    int sum = 0;
    String itemList = "";

    for (int i = 0; i < cart.length; i++) {
      if (cart[i] == null) {
        break;
      }
      sum += cart[i].price;
      itemList += (i == 0) ? cart[i] : "," + cart[i];
    }
    System.out.printf("구입하신 물품의 총 금액은 %d 입니다. \n", sum);
    System.out.printf("구입하신 제품 목록은 %s 입니다. \n", itemList);
  }
}

public class Ex7_9 {

  public static void main(String[] args) {
    Buyer buyer = new Buyer();

    buyer.buy(new Tv());
    buyer.buy(new Computer());
    buyer.buy(new Audio());
    buyer.summary();
  }
}

/**
 * 위 예제에서 Product 배열로 구입한 제품들을 저장할 수 있도록 했지만, 배열의 크기를 10으로 했기 때문에 11개 이상의 제품을 구입할 수 없는 것이 문제다.
 * 그렇다고 해서 배열의 크기를 무조건 크게 설정할 수만도 없는 일이다.
 *
 * 이런 경우, Vector 클래스를 사용하면 된다. Vector 클래스는 내부적으로 Object 타입의 배열을 가지고 있어서, 이 배열에 객체를 추가하거나 제거할 수 있게 작성되었다.
 * 그리고 배열의 크기를 알아서 관리해주기 때문에 저장할 인스턴스의 개수에 신경쓰지 않아도 된다.
 *
 *
 * */
