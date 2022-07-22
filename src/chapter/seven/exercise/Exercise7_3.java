package chapter.seven.exercise;

public class Exercise7_3 {
  /*
  * 부모가 없이 자식이 있을 수는 없기 때문에 자식 클래스의 인스턴스를 생성한다는 것은 부모 클래스의 인스턴스를 선행적으로 생성한다는 것을 전제로 하는 일이다.
  * 그러나 현재 부모 클래스인 Product 클래스를 보면 Product(int price) 라는 별도의 생성자가 이미 작성되어 있고 또 이 생성자가 있기에
  * 컴파일러는 기본 생성자 코드를 만들어주지 않는다. 따라서 자식의 인스턴스를 생성하기 위해서는 직접 부모의 생성자를 호출해주어야만 한다.
  *
  * 부모 생성자를 호출하는 방법은 다음과 같이 2가지가 존재한다.
  *
  * 1. Product 클래스에 직접 기본 생성자를 추가해준다.
  *    그렇게 한다면 Tv 클래스의 생성자를 호출할 때 컴파일러가 자동적으로 부모(Product)의 기본 생성자를 호출하게 되고 자식(Tv) 인스턴스가 생성될 수 있다.
  *
  * 2. Product 클래스가 이미 가지고 있는 Product(int price) 생성자를 자식 클래스의 생성자에서 호출하게 한다.
  *
  * */
  public static void main(String[] args) {
    Tv tv = new Tv();
    System.out.println(tv);
  }
}

class Product {
  int price;
  int bonusPoint;

//  Product() {  1. 부모의 기본 생성자를 만들어준다.
//  }

  Product(int price) {
    this.price = price;
    this.bonusPoint = (int) (price / 10.0);
  }
}

class Tv extends Product {

  Tv() {
    super(0); // 2. 부모가 가지고 있는 별도의 생성자를 선택해 자식 클래스에서 직접 호출한다.
  }

  @Override
  public String toString() {
    return "Tv";
  }
}

