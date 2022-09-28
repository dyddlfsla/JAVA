package chapter.fourteen._23;

public class Chapter14_23 {

  /*
  * ◆ 스트림의 연산
  *
  * 스트림이 제공하는 다양한 연산을 이용하면 복잡한 작업들을 간단히 처리할 수 있다.
  * ※ 스트림에 정의된 메서드 중에서 데이터 소스를 다루는 작업을 수행하는 것을 연산(operation) 이라고 한다.
  *
  * 스트림이 제공하는 연산은 크게 중간 연산과 최종 연산으로 분류할 수 있는데, 중간 연산은 연산 결과를 스트림으로 반환하기 때문에 중간 연산을 계속해서 연결할 수 있다.
  * 반면에 최종 연산은 스트림의 요소를 소모하면서 연산을 수행하므로 단 한번만 연산이 가능하다.
  *
  * 1. 중간 연산: 연산 결과가 스트림인 연산, 스트림에 연속해서 중간 연산할 수 있음.
  * 2. 최종 연산: 연산 결과가 스트림이 아닌 연산, 스트림의 요소를 소모하므로 단 한번만 가능.
  *
  * stream
  *   .distinct() //중간 연산
  *   .limit(5) //중간 연산
  *   .sorted() //중간 연산
  *   .forEach(System.out::println) //최종 연산
  *
  * 모든 중간 연산의 결과는 스트림이지만, 연산 전의 스트림과 같은 것은 아니다.
  * 각 연산이 진행되면서 스트림의 요소는 계속 변화하기 때문이다.
  *
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
