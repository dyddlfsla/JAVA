package chapter.twelve._11;

public class Chapter12_11 {

  /*
  * ◆ 제네릭스의 제약
  *
  * 제네릭 클래스 Box 의 객체를 생성할 때, 객체 별로 다른 타입을 지정하는 것은 적절하다. 제네릭스는 이처럼 인스턴스별로 다르게 동작하도록 만든 기능이니까.
  *
  *  Box<Apple> appleBox = new Box<Apple>(); // Apple 객체만 저장한다.
  *  Box<Grape> grapeBox = new Box<Grape>(); // Grape 객체만 저장한다.
  *
  * 그러나 모든 객체에 대해 동일하게 동작해야 하는 static 멤버에는 타입 변수 T 를 사용할 수 없다. T 는 인스턴스 변수로 간주되기 때문이다.
  * 앞서 배운 것처럼 static 멤버는 인스턴스 변수를 참조할 수 없다.
  *
  * class Box<T> {
  *   static T item; // 에러
  *   static int compare(T t1, T t2) {...} //에러
  * }
  *
  * static 멤버는 타입 변수에 저장된 타입, 즉 대입된 타입의 종류에 관계없이 동일한 것이어야 하기 때문이다.
  * 즉 Box<Apple>.item 과 Box<Grape>.item 이 다른 것이어서는 안된다는 뜻이다.
  *
  * 또한, 제네릭 타입의 배열을 생성하는 것도 허용되지 않는다. 제네릭 배열 타입의 참조변수를 선언하는 것 자체는 가능하지만 'new T[10]' 과 같이 배열을 생성하는 것은 안된다.
  *
  * class Box<T> {
  *   T[] itemArr; // 가능.
  *   ...
  *   T[] toArray() {
  *     T[] tmpArr = new T[itemArr.length]; // 에러 발생. 제네릭 배열 생성 불가
  *     ...
  *     return tmpArr;
  *   }
  *
  *  }
  *
  * 제네릭 배열을 생성할 수 없는 것은 new 연산자 때문인데, 이 연산자는 컴파일 시점에 타입 T 가 무엇인지 정확히 알아야 한다.
  * 그런데 위의 코드에 정의된 Box<T> 클래스를 컴파일 하는 과정에서는 T 가 어떤 타입이 될지 전혀 알 수 없다. 따라서 컴파일 에러가 발생하는 것이다.
  * instanceOf 연산자 역시 같은 이유로 T 를 피연산자로 사용할 수 없다.
  *
  *
  *
  *
  *
  * */

}
