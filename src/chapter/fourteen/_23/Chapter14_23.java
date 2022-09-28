package chapter.fourteen._23;

public class Chapter14_23 {

  /*
  * ◆ 스트림의 연산
  *
  *
  *
  *
  *
  * */

  public static void main(String[] args) {
    FruitBox<Apple> appleBox = new FruitBox<>();
    FruitBox<Grape> grapeBox = new FruitBox<>();

    Mixer.mix(appleBox);
    Mixer.mix(grapeBox);

  }

}

class Mixer {

  public static <T> String mix(FruitBox<T> item){
    return item.toString();
  }
}

class FruitBox<T> {

  T item;

  @Override
  public String toString() {
    return item.toString();
  }
}

class Fruit {
  String name;

  public Fruit(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}

class Apple extends Fruit {

  public Apple(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return name;
  }
}

class Grape {
  String name;

  public Grape(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
