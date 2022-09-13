package chapter.twelve._09;

public class Chapter12_09 {

  /*
   * ◆ 제한된 제네릭 클래스
   *
   * 타입 문자로 사용할 타입을 명시하면 한 종류의 타입만 저장할 수 있도록 제한할 수 있지만 그래도 여전히
   * 모든 종류의 타입을 지정할 수 있다는 것에는 변함이 없다.
   * 그렇다면, 타입 매개변수 T 에 지정할 수 있는 타입의 종류를 제한할 수 있는 방법은 없을까?
   *
   *  FruitBox<Toy> fruitBox = new FruitBox<Toy>();
   *  fruitBox.add(new Toy()); //OK. 타입 변수에 Toy 를 지정함으로써 과일박스이지만 장난감을 담을 수 있다.
   *
   * 다음과 같이 제네릭 타입에 'extends' 를 사용하면, 타입 변수에 특정 타입의 자손들만 대입할 수 있게 제한할 수 있다.
   *
   *  class FruitBox<T extends Fruit> {
   *    ArrayList<T> list = new ArrayList<T>();
   *    ...
   * }
   *
   * 여전히 한 종류의 타입만 담을 수 있지만, 그 타입을 Fruit 클래스와 그 자손으로만 한정해야 한다는 제한이 더 추가된 것이다.
   *
   * FruitBox<Apple> appleBox = new FruitBox<Apple>(); //OK
   * FruitBox<Toy> toyBox = new FruitBox<Toy>(); // 에러. Toy 는 Fruit 클래스의 자손이 아니다.
   *
   * 만일 클래스가 아니라 인터페이스를 구현해야 한다는 제약이 필요하다면, 이때도 'extends' 를 사용한다.
   * 'implement' 키워드를 사용하지 않는다는 점에 주의하자.
   *
   * interface Eatable {}
   * class FruitBox<T extends Eatable> {
   *  ...
   * }
   *
   * 여기서 한 걸음 더 나아가, 클래스 Fruit 의 자손이면서 인터페이스 Eatable 도 구현해야 한다면 아래와 같이 '&' 기호로 연결한다.
   *
   * class FruitBox<T extends Fruit & Eatable>
   *  ...
   * }
   *
   *
   *
   *
   *
   * */

}
