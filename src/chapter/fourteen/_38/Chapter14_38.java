package chapter.fourteen._38;

public class Chapter14_38 {

  /*
  * ◆ OptionalInt, OptionalLong, OptionalDouble
  *
  * IntStream 과 같은 기본형 스트림의 최종 연산의 일부는 Optional 대신 기본형을 값으로 하는 OptionalInt, OptionalLong, OptionalDouble
  *  을 반환한다. 아해는 IntStream 에 정의된 메서드들이다.
  *
  * OptionalInt findAny()
  * OptionalInt findFirst()
  * OptionalInt reduce(IntBinaryOperator operator)
  * OptionalInt max()
  * OptionalInt min()
  * OptionalDouble average()
  *
  * 반환 타입이 Optional<T> 가 아니라는 것을 제외하고는 Stream 에 정의된 것과 유사하지만 기본형 Optional 에 저장된 값을 꺼낼 때
  * 사용하는 메서드는 이름이 약간씩 다르다는 것을 주의하자.
  *
  * Optional<T>: T get()
  * OptionalInt: int getAsInt()
  * OptionalLong: long getAsLong()
  * OptionalDouble: double getAsDouble()
  *
  * OptionalInt 는 다음과 같이 정의되어 있다.
  *
  * public final class OptionalInt {
  *   ...
  *   private final boolean isPresent; // 값이 저장되어 있으면 true
  *   private final int value; // int 타입의 변수
  * }
  *
  * 그런데 기본형 int 의 값은 초기화 되지 않으면 기본적으로 0이다. 따라서 아무런 값도 갖지 않는 OptionalInt 에 저장되는 값도 0일 것이다.
  * 그러면, 아래의 두 OptionalInt 의 객체는 같은 것일까?
  *
  * OptionalInt opt = OptionalInt.of(0); // 0 을 저장.
  * OptionalInt opt2 = OptionalInt.empty(); // 빈 값으로 초기화한다.
  *
  * 그러나 저장된 값이 없는 것과 0 이 저장된 것은 isPresent 라는 인스턴스 변수로 구분이 가능하다. isPresent() 이 인스턴스 변수의 값을 반환한다.
  *
  * opt.isPresent() → true
  * opt2.isPresent() → false
  *
  *
  * */

}
