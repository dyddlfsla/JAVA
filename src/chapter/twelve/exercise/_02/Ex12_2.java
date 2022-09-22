package chapter.twelve.exercise._02;


import java.util.ArrayList;

public class Ex12_2 {
  /*
  * 제네릭 메서드가 makeJuice() 가 아래와 같이 정의되어 있을 때, 이 메서드를 올바르게 호출하는 문장을 모두 고르시오.
  *  Juicer.<Apple>makeJuice(new FruitBox<Fruit>()); → 매개변수로 new FruitBox<Fruit>
  *  Juicer.<Fruit>makeJuice(new FruitBox<Grape>()); → Fruit 과 그 하위타입만 메서드의 매개변수가 될 수 있다. 정상.
  *  Juicer.<Fruit>makeJuice(new FruitBox<Fruit>()); → Fruit 과 그 하위타입만 메서드의 매개변수가 될 수 있다. 정상.
  *  Juicer.makeJuice(new FruitBox<Apple>()); →
  *  Juicer.makeJuice(new FruitBox<Object>());
  *
  * */
  public static void main(String[] args) {
    Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
    Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
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
