package chapter.fourteen._17;

public class Chapter14_17 {

  /*
  * ◆ 스트림 만들기 - ① 컬렉션 소스
  *
  * 스트림으로 작업을 하려면, 스트림이 필요하므로 일단 스트림을 생성하는 방법부터 알아보자.
  * 스트림의 소스가 될 수 있는 대상은 배열, 컬렉션, 임의의 수 등 다양하며, 이 다양한 소스들로부터 스트림을 생성할 수 있다.
  *
  * 컬렉션의 최고 조상인 Collection 에 stream() 메서드가 정의되어 있다. 그래서 Collection 의 자손인 List 와 Set 을 구현한 클래스들은
  * 모두 이 메서드를 통해 스트림을 생성할 수 있다. stream() 은 해당 컬렉션을 소스(source) 로 하는 스트림을 반환한다.
  *
  * Stream<T> Collection.stream();
  *
  * 예를 들어 List 로부터 스트림을 생성하는 코드는 다음과 같다.
  *
  * List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // List 생성.
  * Stream<Integer> intStream = list.stream(); // list 를 소스로 하는 스트림을 생성하고 반환.
  *
  * forEach() 는 지정된 작업을 스트림의 모든 요소에 수행하는 메서드이다. 아래의 문장은 스트림의 모든 요소를 화면에 출력한다.
  *
  * intStream.forEach(System.out::println); // 스트림의 모든 요소를 출력한다.
  * intStream.forEach(System.out::println); // 한번 더 호출. 에러. 스트림은 일회용이므로 한번 사용되면 닫혀버린다.
  *
  * 한 가지 주의할 점은 forEach() 가 스트림의 요소를 소모하면서 작업을 수행하므로 같은 스트림에 forEach() 를 두 번 호출할 수 없다는 것이다.
  * 그래서 스트림 요소를 한번 더 출력하려면 스트림을 새로 생성해야 한다. forEach() 에 의해 스트림의 요소가 소모되는 것이지, 데이터 소스의 요소가 소모되는 것은 아니기 때문에
  * 같은 소스로부터 다시 스트림을 생성할 수 있다.
  *
  *
  * ◆ 스트림 만들기 - ② 배열 소스
  *
  * 배열을 소스로 하는 스트림을 생성하는 메서드는 다음과 같이 Stream 과 Arrays 에 static 메서드로 정의되어 있다.
  *
  * Stream<T> Stream.of(T... values)
  * Stream<T> Stream.of(T[])
  * Stream<T> Arrays.stream(T[])
  * Stream<T> Arrays.stream(T[] array, int startInclusive, int endExclusive)
  *
  * 예를 들어, 문자열 배열을 소스로 하는 스트림은 다음과 같이 생성한다.
  *
  * Stream<String> strStream = Stream.of("a", "b", "c"); //가변인자
  * Stream<String> strStream = Stream.of(new String[]{"a", "b", "c"}); //가변인자
  * Stream<String> strStream = Arrays.stream(new String[]{"a", "b", "c"});
  * Stream<String> strStream = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3);
  *
  * 그리고 다음과 같이 int, long, double 과 같은 기본형 배열을 소스로 하는 스트림을 생성하는 메소드도 있다.
  *
  * IntStream IntStream.of(int... values) // Stream 이 아니라 IntStream 이다.
  * IntStream IntStream.of(int[])
  * IntStream Arrays.stream(int[])
  * IntStream Arrays.stream(int[] array, int startInclusive, int endExclusive)
  *
  * 마찬가지로 long 과 double 타입의 배열로부터 LongStream, DoubleStream 을 반환하는 메서드들 역시 존재한다.
  *
  *
  *
  *
  * */

}
