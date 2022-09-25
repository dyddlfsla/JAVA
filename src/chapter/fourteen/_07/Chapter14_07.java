package chapter.fourteen._07;

public class Chapter14_07 {

  /*
  * ◆ java.util.function 패키지
  *
  * 대부분의 메서드는 타입이 비슷하다. 매개변수가 없거나 한 개 또는 두 개, 반환 값은 없거나 한 개. 게다가 제네릭 메서드로 정의하면
  * 매개변수나 반환 타입이 달라도 문제가 되지 않는다. 그래서 java.util.function 패키지에 일반적으로 자주 쓰이는 형식의 메서드를
  * 함수형 인터페이스로 미리 정의해 놓았다. 매번 새로운 함수형 인터페이스를 정의하지 말고, 가능하면 이 패키지의 인터페이스를 활용하는 것이 좋다.
  *
  * 그래야 함수형 인터페이스에 정의된 메서드 이름도 통일되고, 재사용성이나 유지보수 측면에서도 좋다. 자주 쓰이는 가장 기본적인 함수형 인터페이스는 다음과 같다.
  *
  * |함수형 인터페이스        |         메서드                 |                  설 명                              |
  * ===============================================================================================================
  * 1. java.lang.Runnable|           void run()         |    매개변수도 없고 반환값도 없음.
  * 2. Supplier<T>       |           T get()            |    매개변수는 없고 반환값만 존재한다.
  * 3. Consumer<T>       |   T →  void accept(T t)      |   Supplier 와 반대로 매개변수만 있고 반환값이 없다.
  * 4. Function<T, R>    |   T →   R   apply(T t)       |  가장 일반적인 함수. 하나의 매개변수를 받아서 하나의 반환값을 내놓는다.
  * 5. Predicate<T>      |   T →  boolean test(T t)     |  조건식을 표현하는데 사용함. 매개변수는 하나이고 결과값이 boolean 타입
  * ===============================================================================================================
  *
  * 매개변수와 반환값의 유무에 따라 4개의 함수형 인터페이스가 정의되어 있고, Function 의 변형으로 Predicate 가 있는데, 반환값이 boolean 이라는 것만 제외하면
  * Function 과 동일하다. Predicate 는 조건식을 함수로 표현할 때 사용한다.
  * ※ 타입 문자 'T' 는 Type 을, 'R' 은 Return type 의 앞글자를 딴 것이다.
  *
  * Predicate 는 Function 의 변형으로, 반환타입이 boolean 이라는 것만 다르다. Predicate 는 조건식을 람다식으로 표현하는데 사용된다.
  *
  * Predicate<String> isEmptyStr = s -> s.length() == 0;
  * String s = "";
  *
  * if (isEmptyStr.test(s)) {
  *       System.out.println("This is an empty String.");
  *    }
  *
  *
  * ◆ 매개변수가 두 개인 함수형 인터페이스
  *
  * 매개변수의 개수가 2개인 함수형 인터페이스는 이름 앞에 접두사 'Bi' 가 붙는다.
  * ※ 매개변수 타입으로 보통 'T' 를 사용하므로, 알파벳에서 'T' 다음 문자인 'U', 'V', 'W' 를 매개변수의 타입으로 사용하는 것일 뿐 큰 의미는 없다.
  *
  * 1. BiConsumer<T, U>:  T, U → void accept(T t, U u) 두 개의 매개변수만 있고 반환값은 없음.
  * 2. BiPredicate<T, U>: T, U → boolean test(T t, U u) 두 개의 매개변수가 있고 반환값은 boolean 임. 조건식을 표현하는데 사용.
  * 3. BiFunction<T, U, R>: T, U → R apply(T t, U u) 두 개의 매개변수가 있고 하나의 반환값이 존재.
  *
  * ※ Supplier 의 경우 매개변수는 없고 하나의 반환값이 존재하는 인터페이스인데, 자바에서 메서드는 2개 이상의 반환값을 가질 수 없다.
  *   따라서 BiSupplier 도 존재하지 않는다.
  *
  * 만약 두 개의 이상의 매개변수를 갖는 함수형 인터페이스가 필요하다면 직접 만들어서 써야한다.
  * 3개의 매개변수를 갖는 함수형 인터페이스를 선언한다면 다음과 같을 것이다.
  *
  * @FunctionalInterface
  * interface TriFunction<T, U, V, R> {
  *   R apply(T t, U u, V v);
  * }
  *
  * UnaryOperator 와 BinaryOperator
  * Function 의 또 다른 변형으로써, 매개변수의 타입과 반환값의 타입이 모두 일치한다는 점만 제외하고는 Function 과 다를 것이 없다.
  * ※ UnaryOperator 의 조상은 Function, BinaryFunction 의 조상은 BiFunction 이다.
  *
  * 1. UnaryOperator<T>: T → T apply(T t)  함수형 인터페이스 Function 의 자손. 매개변수와 반환값의 타입이 T 로 동일하다.
  * 2. BinaryOperator<T>: T → T apply(T t, T t) 함수형 인터페이스 BiFunction 의 자손. 매개변수과 반환값의 타입이 T 로 동일하다.
  *
  *
  *
  *
  *
  * */

}
