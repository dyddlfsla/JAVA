package chapter.twelve.exercise._03;

class Fruit {


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
   * Box<?> b = new Box<Object>(); → 정상. <?> 는 모든 타입을 허용하므로 문제가 없다.
   * Box<Object> b = new Box<Fruit>(); → 에러. 기본적으로 제네릭 타입 간의 다형성은 성립하지 않으므로 에러가 발생한다.
   * Box<? extends Fruit> b = new Box<Apple>(); →  정상. 생성자의 타입 변수로 Fruit 과 그 자손들이 가능하므로 문제가 없다.
   * Box<? extends Object> b = new Box<? extends Fruit>(); → 정상. 생성자의 타입변수로 모든 타입이 가능하므로 <? extends Fruit> 도 가능하다.
   *
   *
   *
   * */
}
