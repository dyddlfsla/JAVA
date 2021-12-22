package chapter.seven;

class Product {
  int price;
  int bonusPoint;

  Product() {

  }

  Product(int price) {
    this.price = price;
    bonusPoint = (int) (price / 10.0);
  }
}

class Television extends Product {
  Television() {
    super(100);
  }

  public String toString() {
    return "Television";
  }
}

class Computer extends Product{
  Computer() {
    super(200);
  }

  public String toString() {
    return "Computer";
  }
}

class Audio extends Product {
  Audio() {
    super(50);
  }

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
      System.out.printf("잔액이 부족하여 물건을 살 수 없습니다.%n");
      return;
    }

    money -= product.price;
    bonusPoint += product.bonusPoint;
    cart[i++] = product;
    System.out.printf("%s 을/를 구입하였습니다.%n", product.toString());
  }

  void summary() {          //구매한 물품에 대한 정보를 요약해서 보여준다.
    int sum = 0;            //구매한 물품의 총금액
    String itemList = "";   //구매한 물품 목록

    //for 문을 사용하여 구입한 물품의 총 가격과 목록을 만든다.
    for (int i = 0; i < cart.length; i++) {
      if (cart[i] == null) {
        break;
      }
      sum += cart[i].price;
      itemList += cart[i].toString() + ", ";
    }

    System.out.printf("구입하신 물품의 총 금액은 %d 입니다.%n", sum);
    System.out.printf("구입하신 물품은 %s 입니다.%n", itemList);
  }
}
public class Ex7_9 {

  public static void main(String[] args) {
    Buyer buyer = new Buyer();

    buyer.buy(new Television());
    buyer.buy(new Computer());
    buyer.buy(new Audio());
    buyer.summary();
  }

  /** 위 예제에서 구매한 물품을 배열 cart 에 담을 수 있도록 했지만, 배열의 크기를 10으로 했기 때문에 11개 이상의 제품을 구입할 수 없는 것이 문제다.
   * 그렇다고 해서 배열의 크기를 무조건 크게 설정할 수만도 없는 노릇이다.
   * 이런 경우, Vector 클래스를 사용하면 된다. Vector 클래스는 내부적으로 Object 타입의 배열을 가지고 있어서, 이 배열에 객체를 추가하거나 제거할 수 있게 작성되어 있다.
   * 그리고 배열의 크기를 알아서 관리해주기 때문에 저장할 인스턴스의 개수에 신경쓰지 않아도 된다.
   *
   * */
}
