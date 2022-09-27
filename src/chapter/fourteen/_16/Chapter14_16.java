package chapter.fourteen._16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter14_16 {

  /*
   * ◆ 스트림의 특징
   *
   * 1. 스트림은 데이터 소스를 변경하지 않는다.
   * 스트림은 데이터 소스로부터 데이터를 읽기만할 뿐, 데이터 소스를 변경하지 않는다.
   * 필요하다면, 정렬된 결과를 컬렉션이나 배열에 담아 반환할 수도 있다.
   *
   * String[] strArr= { "aaa", "ddd", "ccc"};
   * List<String> strList = Arrays.asList(strArr);
   *
   * Stream<String> strStream1 = strList.stream(); //스트림을 생성.
   * Stream<String> strStream2 = Arrays.stream(strArr); // 스트림을 생성.
   *
   *
   * // 정렬된 결과를 새로운 List 에 담아 반환했다. 기존의 strStream2 를 만들 때 사용되었던 배열 strArr 는 변경되지 않는다.
   * List<String> sortedList = strStream2.sorted().collect(Collectors.toList());
   *
   * 2. 스트림은 일회용이다.
   * 스트림은 Iterator 처럼 일회용이다. Iterator 로 컬렉션의 요소를 모두 읽고 나면 다시 사용할 수 없는 것처럼, 스트림도 한번 사용하면 닫혀서 다시 사용할 수 없다.
   * 필요하다면, 스트림을 다시 생성해야 한다.
   *
   * strStream1.sorted().forEach(System.out::println);
   * int numOfStr = strStream1.count(); // count() 는 스트림이 가진 요소의 갯수를 반환하는 메소드인데, forEach 로 인해 스트림의 요소는 모두 소모되었으며 닫혀버렸기 때문에 에러가 발생한다.
   *
   * 3. 스트림은 작업을 내부 반복으로 처리한다.
   * 스트림을 이용한 작업이 간결할 수 있는 비결 중의 하나가 바로 '내부 반복' 이다. 내부 반복이라는 것은 반복문을 메서드의 내부에 숨겼다는 것을 의미한다. forEach() 는 스트림에 정의된 메서드 중의 하나로
   * 매개변수에 대입된 람다식을 스트림에 있는 모든 요소에 적용하도록 한다.
   *
   * for (String str : strList) {
   *    System.out.println(str);
   * }
   *
   *                ↓
   *
   * stream.forEach(System.out::println);
   *
   * 즉, forEach() 메서드는 안으로 for 문을 넣은 것이다. 반복해야할 작업 내용은 매개변수로 받는다.
   *
   * void forEach(Consumer<? super T> action) {
   *    Objects.requireNonNull(action); // 매개변수의 Null 체크
   *    for (T t : src) {
   *      action.accept(t);
   *    }
   * }
   *
   * 4. 지연된 연산
   * 스트림 연산에서 한 가지 중요한 점은 최종 연산이 수행되기 전까지는 중간 연산이 수행되지 않는다는 것이다. 스트림에 대해 distinct() 나 sort() 같은 중간 연산을
   * 호출해도 즉각적인 연산이 수행되지 않는다. 중간 연산을 호출하는 것은 단지 어떤 작업이 수행되어야 하는지를 지정해주는 것일 뿐이다. 최종 연산이 수행되어야 비로소
   * 스트림의 요소들이 중간 연산을 거쳐 최종 연산에서 소모된다.
   *
   * 5. Stream<Integer> 와 IntStream
   * 요소의 타입이 'T'인 스트림은 기본적으로 Stream<T> 이지만 오토박싱 & 언박싱 으로 인한 비효율을 줄이기 위해 자바에서는 데이터 소스의 요소를 기본형으로 다루는 스트림인
   * IntStream, LongStream, DoubleStream 이 미리 제공된다. 일반적으로 Stream<Integer> 대신 IntStream 을 사용하는 것이 더 효율적이고,
   * IntStream 에는 int 타입의 값으로 작업하는데 유용한 메서드들이 포함되어 있다.
   *
   * 6. 병렬 스트림
   * 스트림으로 데이터를 다룰 때의 장점 중 하나가 바로 병렬 처리가 쉽다는 것이다. 병렬 스트림은 내부적으로 Java 에서 제공하는 fork & join 프레임워크를 이용해서
   * 자동적으로 연산을 병렬로 수행한다. 개발자가 직접 해야하는 일은 그저 해당 스트림에 parallel() 이라는 메서드를 호출해서 병렬 연산을 지시하기만 하면 된다.
   * 반대로 병렬로 처리되지 않게 하려면 sequential() 을 호출하면 된다. 모든 스트림은 기본적으로 병렬 스트림이 아니므로 먼저 sequential() 을 호출할 필요는 없으며,
   * parallel() 먼저 호출한 상황에서 병렬 처리를 취소할 때 사용한다.
   *
   * ※ parallel() 와 sequential() 새로운 스트림을 생성하는 것이 아니라 스트림의 속성을 변경하는 것이다.
   *
   * int sum = strStream.parallel()
   *                    .mapToInt(s -> s.length())
   *                    .sum();
   *
   *
   *
   *
   * */
  public static void main(String[] args) {
    String[] strArr = {"aaa", "ddd", "ccc"};
    List<String> strList = Arrays.asList(strArr);

    Stream<String> strStream1 = strList.stream(); //스트림을 생성.
    Stream<String> strStream2 = Arrays.stream(strArr); // 스트림을 생성.

    List<String> sortedList = strStream2.sorted().collect(Collectors.toList());

    System.out.println(Arrays.toString(strArr)); //원본 데이터는 그대로 [aaa, ddd, ccc] 이다.
    System.out.println(sortedList);
  }
}
