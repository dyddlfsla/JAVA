package chapter.fourteen._17;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
   * ◆ 스트림 만들기 - ③ 임의의 수 소스
   *
   * 난수를 생성하는데 사용하는 Random 클래스에는 아래와 같은 인스턴스 메서드들이 포함되어 있다. 이 메서드들은 해당 타입의 난수들로 이루어진 스트림을 반환한다.
   *
   *   IntStream ints()
   *   LongStream longs()
   *   DoubleStream doubles()
   *
   * 이 메서드들이 반환하는 스트림은 크기가 정해지지 않은 '무한 스트림(infinite stream)' 이므로 limit() 도 같이 사용해서 스트림의 크기를 제한해 주어야 한다.
   * limit() 은 스트림의 개수를 지정하는데 사용되며, 무한 스트림을 유한 스트림으로 만든다.
   *
   *   IntStream intStream = new Random().ints(); // 무한 스트림
   *   intStream.limit(5).forEach(System.out::println) // 5개의 요소만 가지도록 제한한 후, 출력
   *
   * 아래의 메서드들은 매개변수로 스트림의 크기를 같이 지정해서 '유한 스트림' 을 생성해서 반환하므로 limit() 를 따로 쓰지 않아도 된다.
   *
   *  IntStream ints(long streamSize)
   *  LongStream longs(long streamSize)
   *  DoubleStream doubles(long streamSize)
   *
   *  IntStream intStream = new Random().ints(5); // 크기가 5인 난수 스트림을 반환한다.
   *
   * 위 메서드들에 의해 생성된 스트림의 난수는 다음과 같은 범위를 갖는다.
   * IntStream 은 int 형 타입이 가질 수 있는 범위와 같고, LongStream 도 각 자료형이 가진 범위와 일치한다.
   *
   *   Integer.MIN_VALUE <=  ints() <= Integer.MAX_VALUE
   *   Long.MIN_VALUE <= longs() <= Long.MAX_VALUE
   *   0.0 <= doubles() < 1.0
   *
   *
   * ◆ 스트림 만들기 - ④ 특정 범위의 연속된 정수 소스
   *
   * IntStream 과 LongStream 은 다음과 같이 지정된 범위의 연속된 정수를 스트림으로 생성해서 반환하는 range() 와 rangeClosed() 를 가지고 있다.
   *
   * IntStream IntStream.range(int begin, int end)
   * IntStream IntStream.rangeClosed(int begin, int end)
   *
   * range() 의 경우 경계의 끝인 end 가 범위에 포함되지 않고, rangeClosed() 는 end 를 포함한다.
   *
   *   IntStream intStream = IntStream.range(1, 5); // 1, 2, 3, 4
   *   IntStream intStream = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5
   *
   * int 보다 큰 범위의 스트림을 생성하려면, LongStream 에 있는 동일한 이름의 메서드를 사용하면 된다.
   * 지정된 범위(begin ~ end) 의 난수를 발생시키는 스트림을 얻는 메서드는 다음과 같다. 단, end 는 포함되지 않는다.
   *
   * IntStream ints(int begin, int end)
   * LongStream longs(int begin, int end)
   * DoubleStream doubles(int begin, int end)
   *
   * IntStream ints(long streamSize, int begin, int end)
   * LongStream longs(long streamSize, int begin, int end)
   * DoubleStream doubles(long streamSize, int begin, int end)
   *
   *
   * ◆ 스트림 만들기 - ⑤ 람다식 iterate(), generate()
   *
   * Stream 클래스의 iterate() 와 generate() 는 람다식을 매개변수로 받아서, 이 람다식에 의해 계산되는 값들들 요소로 하는 무한 스트림을 생성해낸다.
   *
   * static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
   * static <T> Stream<T> generate(Supplier<T> s)
   *
   * iterate() 는 씨앗값(seed) 으로 지정된부터 시작해서, 람다식 f 에 의해 계산된 결과를 다시 seed 값으로 넣어 계산하고 이를 계속 반복한다.
   * 예를 들어, 아래의 evenStream 은 0부터 시작해서 값이 계속 2씩 증가한다.
   *
   * Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2); // seed 가 0이므로 0부터 시작 0, 2, 4, 6, 8, ...
   *
   * generate() 도 iterate() 처럼, 람다식에 의해 계산되는 값을 요소로 하는 무한 스트림을 생성해서 반환하지만,
   * iterate() 와 달리 이전 결과를 이용해서 다음 요소를 계산하지 않는다.
   *
   * Stream<Double> randomStream = Stream.generate(Math::random);
   * Stream<Integer> oneStream = Stream.generate(() -> 1);
   *
   * 그리고 generate() 에 정의된 매개변수의 타입은 Supplier<T> 이므로 매개변수가 없는 람다식만 허용된다는 점이 중요하다.
   * 또한 한 가지 중요한 점은, iterate() 와 generate() 에 의해 생성된 스트림을 아래와 같이 기본형 스트림 타입의 참조변수로 다룰 수 없다는 것이다.
   *
   * IntStream evenStream = Stream.iterate(0, n -> n + 2); // 에러. 기본형 타입의 스트림으로 받을 수 없다.
   * DoubleStream randomStream = Stream.generate(Math::random); // 에러. 기본형 타입의 스트림으로 받을 수 없다.
   *
   * 굳이 필요하다면, 이런 상황에서는 다음과 같이 mapToInt() 와 같은 메서드를 이용해 변환하는 과정을 거쳐야 한다.
   *
   * IntStream evenStream = Stream.iterate(0, n -> n + 2).mapToInt(Integer::valueOf);
   * Stream<Integer> stream = evenStream.boxed(); // IntStream 을 Stream<Integer> 로 변환
   *
   * ◆ 스트림 만들기 - 파일과 빈 스트림
   *
   * java.nio.Files 는 파일을 다루는데 필요한 유용한 메서드들을 제공하는데, list() 는 지정된 디렉토리(dir) 에 있는 파일의 목록을 소스로 하는 스트림을 생성해서 반환한다.
   *
   *  Stream<Path> Files.list(Path dir)
   *
   *  그리고 파일의 한 행(line) 을 요소로 하는 스트림을 생성하는 메서드도 있다. 아래의 세 번째 메서드는 BufferedReader 클래스에 속한 것인데, 파일뿐만 아니라 다른 입력대상으로부터 데이터를 행단위로 읽어올 수 있다.
   *
   * Stream<String> Files.lines(Path path)
   * Stream<String> Files.lines(Path path, Charset cs)
   * Stream<String> lines()
   *
   * 빈 스트림
   * 요소가 하나도 없는 비어있는 스트림을 생성할 수 도 있다. 스트림에 연산을 수행한 결과가 하나도 없을 때, null 보다는 빈 스트림을 반환하는 것이 낫다.
   * Stream emptyStream = Stream.empty(); // empty() 메서드는 비어있는 스트림을 생성해 반환한다.
   * long count = emptyStream.count(); // count 의 값은 0 이다.
   *
   *
   *
   *
   *
   *  */

  public static void main(String[] args) {
    List<Integer> list = new Random()
        .ints(5, 1, 10)
        .boxed()
        .collect(Collectors.toList());

    List<Fruit> list2 = IntStream.range(1, 5)
        .mapToObj(fruit -> new Fruit())
        .collect(Collectors.toList());

//    list.forEach(System.out::println);
    MyInterface myInterface = (person) -> System.out.println(person);
//    list2.forEach();
    Fruit fruit = new Fruit("apple");
    myInterface.test(fruit);

    IntStream evenStream = Stream.iterate(0, n -> n + 2).mapToInt(Integer::valueOf);
    List<Integer> list3 = evenStream.boxed().collect(Collectors.toList());



  }

}

@FunctionalInterface
interface MyInterface<T> {
  void test(T t);
}

class Fruit {
  String name;

  public Fruit() {
  }

  public Fruit(String name) {
    this.name = name;
  }
}

class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }
}
