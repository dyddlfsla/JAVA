package chapter.twelve._15;

class Box<T> {

}
public class Chapter12_15 {

  /*
  * ◆ 제네릭 타입의 형변환
  *
  * 제네릭 타입과 원시 타입(primitive type) 간의 형변환이 가능할까?
  *
  *  Box box = null;
  *  Box<Object> objBox = null;
  *
  *  Box box = null;
  *  Box<Object> objBox = new Box<>();
  *
  *  box = (Box) objBox;
  *  objBox = (Box<Object>) box;
  *
  * 위에서 알 수 있듯이, 제네릭 타입과 논제네릭 타입 간의 형변환은 항상 가능하다. 그러면 대입된 타입이 다른 제네릭 타입 간에는
  * 형변환이 가능할까?
  *
  * objBox = (Box<String>) stringBox;
  * stringBox = (Box<Object>) objBox;
  *
  * 불가능하다. 이 사실은 앞서 배운 바 있다. 아래의 코드가 안된다는 것은 Box<String> 이 Box<Object> 로 형변환이 되지 않는다는 것을 의미했기 때문이다.
  *
  * Box<Object> objBox = (Box<Object>) new Box<String>(); // 에러. 형변환 불가능
  *
  * 그러면 다음의 코드는 어떨까? Box<String> 이 Box<? extends Object> 로 형변환이 가능할까?
  *
  * Box<? extends Object> wBox = new Box<String>();
  *
  * 가능하다. 이것을 가능하게 하기 위해 와일드 카드가 도입된 것이기 때문이다.
  *
  * static Juice makeJuice(FruitBox<? extends Fruit> box) {...}
  * // 해당 메서드의 매개변수로 Fruit 의 자식타입이 모두 가능하다.
  * // FruitBox<Apple> box, FruitBox<Fruit> box, FruitBox<Grape> box...
  *
  * ◆ 제네릭 타입의 제거
  *
  * 컴파일러는 제네릭 타입을 이용해서 소스파일을 체크하고, 필요한 곳에 형변환을 넣어준다.
  * 그리고 나서 제네릭 타입을 제거한다. 즉, 컴파일된 파일(*.class) 에는 제네릭 타입에 대한 정보가 없는 것이다.
  * 이렇게 하는 이유는 제네릭이 도입되기 이전 (JDK1.5) 의 소스 코드의 호환성을 지키기 위해서이다.
  *
  * 제네릭 타입의 제거 과정은 상당히 복잡하고, 컴파일러에 대한 깊은 이해를 필요로 하기 때문이다. 자세히 설명하기는 어렵다.
  * 기본적인 제거 과정에 대해서만 알고 넘어가도록 한다.
  *
  * 1. 제네릭 타입의 경계(bound) 를 제거한다.
  * 제네릭 타입이 <T extends Fruit> 라면 T 는 Fruit 으로 치환된다. <T> 인 경우는 T 는 Object 로 치환된다. 그리고 나서 클래스 옆의 제네릭 타입은 제거된다.
  *
  * class Box<T extends Fruit> {
  *   void add(T t) {
  *   ...
  *   }
  * }
  *       ↓
  *
  * class Box {
  *   void add(Fruit t) {
  *   ...
  *   }
  * }
  *
  * 2. 제네릭 타입을 제거한 후에 타입이 일치하지 않으면, 형변환을 추가한다.
  * List 의 get() 은 Object 타입을 반환하므로 형변환이 필요하다.
  *
  *  T get(int i) {
  *     return list.get(i);
  *  }
  *
  *        ↓
  * Fruit get(int i) {
  *   return (Fruit)list.get(i);
  * }
  *
  *
  * */
  public static void main(String[] args) {
    Box<Object> objBox = new Box<>();
    Box<String> stringBox = new Box<>();

  }

}
