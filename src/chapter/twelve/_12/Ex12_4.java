package chapter.twelve._12;

import java.util.ArrayList;

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

class Juicer {

  static Juice makeJuice(FruitBox<? extends Fruit> fruitBox) {
    String tmp = "";
    for (Fruit fruit : fruitBox.getList()) {
      tmp += fruit + " ";
    }
    return new Juice(tmp);
  }
}

class FruitBox<T extends Fruit> extends Box<T> {

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

public class Ex12_4 {

  public static void main(String[] args) {
    FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
    FruitBox<Apple> appleBox = new FruitBox<Apple>();

    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    appleBox.add(new Apple());
    appleBox.add(new Apple());

    System.out.println("Juicer.makeJuice(fruitBox) = " + Juicer.makeJuice(fruitBox));
    System.out.println("Juicer.makeJuice(appleBox) = " + Juicer.makeJuice(appleBox));
  }
}
