package chapter.twelve._13;

public class Chapter12_13 {

  /*
  * ◆ 제네릭 메서드
  *
  * 메서드의 선언부에 제네릭 타입이 선언된 메서드를 제네릭 메서드라 한다. 앞서 살펴본 것처럼, Collections.sort() 가 바로 제네릭 메서드이다.
  * 제네릭 타입의 선언 위치는 메서드의 반환 타입 바로 앞이다.
  *
  *  static <T> void sort(List<T> list, Comparator<? super T> c) {...}
  *
  * 제네릭 클래스에 정의된 타입 매개변수가 T 이고 제네릭 메서드에 정의된 타입 매개변수도 T 이지만 이 둘은 전혀 다른 별개의 것이다.
  * 같은 타입 문자 T 를 사용해도 같은 것이 아니라는 것을 주의해야 한다.
  *
  * ※ 중요, 참고로 제네릭 메서드는 제네릭 클래스가 아닌 클래스에도 정의될 수 있다.
  *
  * class FruitBox<T> {
  *   ...
  *   static <T> void sort(List<T> list, Comparator<? super T> c) {
  *   ...
  *   }
  * }
  *
  * 위의 코드에서 제네릭 클래스 FruitBox 에 선언된 타입 매개변수 T 와 제네릭 메서드 sort() 에 선언된 타입 매개변수 T 는 타입 문자만 같을 뿐
  * 서로 다른 것이다. 그리고 sort() 가 static 메서드라는 것을 주목하자. 앞서 설명한 것처럼, static 멤버에는 타입 매개변수를 사용할 수 없지만
  * 이처럼 메서드에 제네릭 타입을 선언하고 사용하는 것은 가능하다.
  *
  * 메서드에 선언된 제네릭 타입은 지역 변수를 선언한 것과 같다고 생각하면 이해하기 쉬운데,
  * 이 타입 매개변수는 메서드 내에서만 지역적으로 사용될 것이므로 메서드가 static 이건 아니건 상관이 없는 것이다.
  *
  * 앞서 본 makeJuice() 를 제네릭 메서드로 바꾸면 다음과 같다.
  *
  *   static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
  *     String tmp = "";
  *     for (Fruit fruit : box.getList()) {
  *       tmp += fruit + " ";
  *     }
  *     return new Juice(tmp);
  *   }
  *
  *  일단 이렇게 제네릭 메서드로 바꾸게 되면 이제 이 메서드를 호출하려면 아래와 같이 타입 변수에 타입을 대입해야 한다.
  *
  * Juicer.<Fruit>makeJuice(fruitBox);
  * Juicer.<Apple>makeJuice(appleBox);
  *
  * 그러나 대부분의 경우 컴파일러가 대입된 타입을 추정할 수 있기 때문에 생략해도 된다.
  *
  * Juicer.makeJuice(appleBox); // 대입된 타입 변수 생략
  *
  * 여기서 한 가지 주의할 점은, 제네릭 메서드를 호출할 때 대입된 타입을 생략할 수 없는 경우에는 참조변수나 클래스 이름을 생략할 수 없다는 것이다.
  *
  * <Fruit>makeJuice(fruitBox);
  * this.<Fruit>makeJuice(fruitBox);
  * Juicer.<Fruit>makeJuice(fruitBox);
  *
  *
  *
  * */

}
