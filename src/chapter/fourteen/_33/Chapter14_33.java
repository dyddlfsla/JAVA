package chapter.fourteen._33;

public class Chapter14_33 {

  /*
  * ◆ 스트림의 중간연산 - flatMap()
  *
  * 스트림의 타입이 Stream<T[]> 인 경우, Stream<T> 로 변환해야 작업이 더 편리할 때가 있다.
  * 그럴 때 flatMap() 을 사용한다. 예를 들어 아래와 같이 요소가 문자열 배열(String[]) 인 스트림이 있을 때,
  *
  * Stream<String[]> strStream = Stream.of(
  *                                   new String[]{"abc", "def", "ghi"},
  *                                   new String[]{"ABC", "GHI", "JKLMN"}
  *                                                     );
  *
  * 각 요소의 문자열들을 합쳐서 문자열이 요소인 스트림, 즉 Stream<String> 으로 만드려면 어떻게 해야할까?
  * 먼저 스트림의 요소를 변환해야 하니까 일단 map() 을 써야할 것이고, 여기에 배열을 스트림으로 만들어주는 Arrays.stream(T[]) 을 사용해본다.
  *
  *  Stream<Stream<String>> strStrStream = strStream.map(Arrays::stream));
  *
  * 예상한 것과 달리, Stream<String[]> 을 'map(Arrays::stream)' 으로 변환한 결과는 Stream<String> 이 아니라 Stream<Stream<String>> 이다.
  * 즉, 스트림 속에 스트림이 또 들어간 형태인 것이다. 각 요소의 문자열이 합쳐지지 않고 스트림의 스트림 형태가 되어버렸다.
  *
  * 이때 사용할 수 있는 것이 flatMap() 이다.
  * flatMap() 이란 쉽게 말해, 요소를 대체하는 복수 개의 요소들로 새로운 스트림을 구성하여 리턴한다.
  * 스트림에서 A 라는 요소가 a1, a2 요소로 대체되고, B 라는 요소는 b1, b2 로 대체된다고 가정했을 경우,
  * a1, a2, b1, b2 를 요소로 가지는 새로운 스트림이 반환되는 것이다.
  *
  *
  *
  *
  *
  * */

}
