package chapter.twelve.exercise._02;


import java.util.ArrayList;

public class Ex12_2 {
  /*
  * 제네릭 메서드가 makeJuice() 가 아래와 같이 정의되어 있을 때, 이 메서드를 올바르게 호출하는 문장을 모두 고르시오.
  *
  *  sol:
  *  Juicer.<Apple>makeJuice(new FruitBox<Fruit>()); → 에러. 타입 매개변수로 Apple 이 지정되었으므로 매개변수로 new FruitBox<Apple> 만 가능하다
  *  Juicer.<Fruit>makeJuice(new FruitBox<Grape>()); → 에러. 타입 매개변수로 Fruit 이 지정되었으므로 매개변수로 new FruitBox<Fruit> 만 가능하다
  *  Juicer.<Fruit>makeJuice(new FruitBox<Fruit>()); → 정상. 타입 매개변수로 Fruit 이 지정되었고 매개변수로 new FruitBox<Fruit> 만 가능하다.
  *  Juicer.makeJuice(new FruitBox<Apple>()); → 정상. 타입 매개변수를 생략했지만 new FruitBox<Apple> 을 통해 매개변수가 Apple 로 추정되었고 Apple 타입은 <T extends Fruit> 을 만족한다.
  *  Juicer.makeJuice(new FruitBox<Object>()); → 에러. 타입 매개변수를 생략했으므로 new FruitBox<Object> 을 통해 매개변수가 Object 추정되었지만 Object 타입은 <T extends Fruit> 을 만족하지 못한다.
  *
  * */
  public static void main(String[] args) {
//    Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
//    Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
    Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
    Juicer.makeJuice(new FruitBox<Apple>());
//    Juicer.makeJuice(new FruitBox<Object>());
  }
}

class Juicer {

  static <T extends Fruit> Juice makeJuice(FruitBox<T> fruitBox) {
    String tmp = "";
    for (Fruit fruit : fruitBox.getList()) {
      tmp += fruit + " ";
    }
    return new Juice(tmp);
  }
}

class FruitBox<T extends Fruit> extends Box<T> {

}

class Fruit {

  @Override
  public String toString() {
    return "Fruit";
  }
}
class Apple extends Fruit {

  @Override
  public String toString() {
    return "Apple";
  }
}

class Grape extends Fruit {

  @Override
  public String toString() {
    return "Grape";
  }
}

class Juice {
  String name;

  public Juice(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name + "Juice";
  }
}


class Box<T> {

  private ArrayList<T> list = new ArrayList<>();

  void add(T item) {
    list.add(item);
  }

  T get(int index) {
    return list.get(index);
  }

  ArrayList<T> getList() {
    return list;
  }

  int size() {
    return list.size();
  }

  @Override
  public String toString() {
    return list.toString();
  }
}
