package chapter.twelve.exercise._03;

class Tree {

}

class Fruit extends Tree {


}

class Apple extends Fruit {


}

class Box<T extends Fruit> {
  T item;

  void setItem(T item) {
    this.item = item;
  }

  T getItem() {
    return item;
  }

}

public class Ex12_3 {

  /*
   * 12-3. 다음 중 올바르지 않은 문장을 모두 고르시오.
   *
   * sol:
   * Box<?> b = new Box(); → 정상. <?> 와일드카드는 모든 타입을 허용하는 것으로 제네릭에서 타입 매개변수로 Object 가 적용된 것과 같으며,
   *                         new Box(); 역시 제네릭 타입을 생략하면 기본적으로 Object 가 지정되므로 대입에 문제가 없다.
   * Box<?> b = new Box<>(); → 정상. <>(); 에서 <?> 가 생략된 것으로 문제가 없다.
   * Box<?> b = new Box<Object>(); → 에러. Box 클래스에서 타입 변수는 <T extends Fruit> 로써 이미 제한되어 있다.
   *                                 따라서 Box<?> 는 Box<Object> 가 아닌 Box<? extends Fruit> 가 생략된 것이라고 볼 수 있다.
   *                                 당연히 생성자의 Object 타입은 Fruit 의 하위타입이 아니므로 에러가 발생한다.
   *
   * Box<Object> b = new Box<Fruit>(); → 에러. 기본적으로 제네릭 타입 간의 다형성은 성립하지 않으므로 에러가 발생한다.
   * Box<? extends Fruit> b = new Box<Apple>(); →  정상. 생성자의 타입 변수로 Fruit 과 그 자손들이 가능하므로 문제가 없다.
   * Box<? extends Object> b = new Box<? extends Fruit>(); → 에러. new 연산자를 호출할 때는 지정된 타입이 명확해야 하는데 <? extends Fruit> 는 명확하지 않다.
   *
   *
   *
   * */

  public static void main(String[] args) {
    Box<? extends Fruit> box = new Box<Apple>();
    System.out.println(box.getClass());
  }
}
