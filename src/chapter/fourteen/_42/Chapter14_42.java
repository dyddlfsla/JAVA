package chapter.fourteen._42;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chapter14_42 {

  /*
  * ◆ 스트림의 최종연산 - reduce()
  *
  * reduce() 는 이름에서 짐작할 수 있듯이, 스트림의 요소를 줄여나가면서 연산을 수행하고 최종결과를 반환한다.
  * 그래서 매개변수의 타입이 BinaryOperator<T> 인 것이다. 처음 두 요소를 가지고 연산한 결과를 가지고 그 다음 요소와 연산한다.
  *
  * 이 과정에서 스트림의 요소를 하나씩 소모하며, 스트림의 모든 요소를 소모하게 되면 그 결과를 반환한다.
  *
  * Optional<T> reduce(BinaryOperator<T> accumulator)
  *
  * 이 외에도 연산결과의 초기값(identity) 을 갖는 reduce() 도 있는데, 이 메서드들은 초기값과 스트림의 첫 번째 요소로 연산을 시작한다.
  * 스트림의 요소가 하나도 없는 경우, 초기값이 반환되므로 반환 타입이 Optional<T> 가 아니라 그냥 T 다.
  *
  * T reduce(T identity, BinaryOperator<T> accumulator)
  * U reduce(U identity, BiFunction<U, T, U> accumulator, BinaryOperator<U> combiner)
  *
  * 위의 두번째 메서드 같은 경우, 마지막 매개변수에 combiner 가 필요한데 이것은 병렬 스트림에 의해 처리된 결과를 합칠 때 사용하는 것이다.
  * 앞서 소개한 최종 연산 count() 나 sum() 등은 내부적으로 모두 reduce() 를 이용해서 작성된 것이다.
  *
  * reduce() 가 내부적으로 어떻게 동작하는지 이해를 돕기 위해, reduce() 로 스트림의 모든 요소를 더하는 과정을 for 문으로 표현해보았다.
  *
  * int a = identity; // 초기값을 a 에 저장한다.
  *
  * for(int b : stream) {
  *   a = a + b; // 요소의 값을 a 에 누적시켜 합한다.
  * }
  *
  * 위의 코드를 정리해보면 reduce 는 다음과 같이 작성되어 있을 것이다.
  *
  * T reduce(T identity, BinaryOperator<T> accumulator) {
  *   T a = identity;
  *
  * for (T b : stream) {
  *     a = accumulator.apply(a, b);
  *   }
  *   return a;
  * }
  *
  * reduce() 를 사용하는 방법은 간단하다. 그저 초기값(identity) 와 어떤 연산을(BinaryOperator) 으로 스트림의 요소를 줄여나갈 것인지 정해주기만 하면 된다.
  *
  *
  *
  *
  * */

  public static void main(String[] args) {
    String[] strArr = {
        "Inheritance",
        "Java",
        "Lambda",
        "stream",
        "OptionalDouble",
        "IntStream",
        "count", "sum"
    };

    Stream.of(strArr).forEach(System.out::println);

    boolean noEmptyStr = Stream.of(strArr).noneMatch(string -> string.length() == 0);
    Optional<String> sWord = Stream.of(strArr).filter(string -> string.charAt(0) == 's')
        .findFirst();

    System.out.println("noEmptyStr = " + noEmptyStr);
    System.out.println("sWord.get() = " + sWord.get());

    //String<String[]> 을 IntStream 으로 변환
    IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
    IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
    IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
    IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

    int count = intStream1.reduce(0, (a, b) -> a + 1);
    int sum = intStream2.reduce(0, (a, b) -> a + b);

    OptionalInt max = intStream3.reduce(Integer::max);
    OptionalInt min = intStream4.reduce(Integer::min);

    System.out.println("count = " + count);
    System.out.println("sum = " + sum);
    System.out.println("max = " + max.getAsInt());
    System.out.println("min = " + min.getAsInt());


  }
}
