package chapter.fourteen._55;

public class Chapter14_55 {

  /*
  * ◆ 스트림의 변환
  *
  * 스트림을 처음 공부하게 되면 스트림 변환 자체가 어렵다기 보다는 언제 어떤 메서드를 써서 변환하는지 매번 찾아봐야 보는 것이 힘들다.
  * 따라서, 여기에 스트림의 변환 형태와 메서드를 정리해서 틈틈히 익숙해지도록 하자.
  *
  * 1. 스트림 → 기본형 스트림
  * Stream<T> | 메서드: mapToInt(), mapToLong(), mapToDouble() 결과: IntStream, LongStream, DoubleStream
  *
  * 2. 기본형 스트림 → 스트림
  * IntStream, LongStream, DoubleStream | 메서드: boxed(), mapToObj() 결과: Stream<Integer>, Stream<Long>, Stream<Double>, Stream<U>
  *
  * 3. 기본형 스트림 → 기본형 스트림
  * IntStream, LongStream, DoubleStream | 메서드: asLongStream(), asDoubleStream() 결과: LongStream, DoubleStream
  *
  * 4. 스트림 → 부분 스트림
  * Stream<T>, IntStream | 메서드: skip(), limit() 결과: Stream<T>, IntStream
  *
  * 5. 두 개의 스트림 → 하나의 스트림
  * Stream<T>, IntStream, LongStream, DoubleStream | 메서드: concat(Stream<T> a, Stream<T> b) 결과: Stream<T>, IntStream, LongStream, DoubleStream
  *
  * 6. 스트림의 스트림(스트림 속에 또 스트림이 담긴 형태) → 스트림
  * Stream<Stream<T>>, Stream<IntStream>, Stream<LongStream>, Stream<DoubleStream> | 메서드:flatMap(), flatMapToInt(), flatToLong(), flatMapToDouble() 결과: Stream<T>, IntStream, LongStream, DoubleStream
  *
  * 7. 스트림 → 병렬 스트림
  * Stream<T>, IntStream, LongStream, DoubleStream | 메서드: parallel()//병렬 스트림, sequential()//원래 스트림으로 되돌리기
  *
  * 8. 스트림 → 컬렉션
  * Stream<T>, IntStream, LongStream, DoubleStream | 메서드: collect(Collectors.toList(), toSet() 또는 toCollection(컬렉션 지정) 결과: List<T>, Set<T>, Collection<T>

  * 9. 컬렉션 → 스트림
  * Collection<T>, List<T>, Set<T> | 메서드: stream() 결과: Stream<T>

  * 10. 스트림 → Map
  * Stream<T>, IntStream, LongStream, DoubleStream | 메서드: collect(Collectors.toMap(Function key, Function value))
  *
  * 11. 스트림 → 배열
  *
  * Stream<T>, IntStream, LongStream, DoubleStream | 메서드: toArray(생성 배열의 생성자 참조)
  *
  *
  *
  *
  * */

}
