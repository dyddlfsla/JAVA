package chapter.twelve._10;

import java.util.ArrayList;

interface Eatable {}

class Fruit implements Eatable {

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

class Toy {

  @Override
  public String toString() {
    return "Toy";
  }
}

class FruitBox<T> extends Box<T> {

}

class Box<T> {

  ArrayList<? super T> list = new ArrayList<>();

  void add(T item) {
    list.add(item);
  }

//  T get(int i) {
//    return list.get(i);
//  }

  int size() {
    return list.size();
  }

  @Override
  public String toString() {
    return list.toString();
  }
}

public class Ex12_3 {

  public static void main(String[] args) {
    FruitBox<Fruit> fruitBox = new FruitBox<>();
    FruitBox<Apple> appleBox = new FruitBox<>();
    FruitBox<Grape> grapeBox = new FruitBox<>();
//    FruitBox<Grape> grapeFruitBox2 = new FruitBox<Apple>(); 에러 발생. 타입 매개변수와 생성자 타입 불일치
//    FruitBox<Toy> toyFruitBox = new FruitBox<>();

    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    appleBox.add(new Apple());
//    appleBox.add(new Fruit());
//    appleBox.add(new Grape()); 에러 발생. Grape 는 Apple 의 자손이 아님
    grapeBox.add(new Grape());

    System.out.println("fruitBox = " + fruitBox);
    System.out.println("appleBox = " + appleBox);
    System.out.println("grapeBox = " + grapeBox);
  }

}
