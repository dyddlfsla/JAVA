package chapter.fourteen._26;

public class Chapter14_26 {


  /*
  * ◆ 스트림의 중간 연산 - skip(), limit()
  *
  * skip() 과 limit() 는 스트림의 일부를 잘라낼 때 사용하며, 사용법은 아주 간단하다.
  * skip(3) 은 처음 3개의 요소를 건너뛰고, limit(5) 스트림의 요소를 5개로 제한한다.
  *
  * Stream<T> skip(long n)
  * Stream<T> limit(long maxSize)
  *
  * 예를 들어 10개의 요소를 가진 스트림에 skip(3) 과 limit(5) 을 순서대로 적용하면 4번째 요소부터 5개의 요소를 가진 스트림이 반환된다.
  *
  * IntStream intStream = IntStream.rangeClosed(1, 10); // 1 ~ 10 의 요소를 가진 스트림.
  * intStream.skip(3).limit(5).forEach(System.out::println); // 45678
  *
  * 기본형 스트림에도 skip() 과 limit() 가 정의되어 있는데, 반환타입이 기본형 스트림이라는 점만 다르다.
  *
  * ◆ 스트림의 중간 연산 - filter(), distinct()
  *
  * distinct() 는 스트림에서 중복된 요소들을 제거하고, filter() 는 주어진 조건(predicate)에 맞지 않는 요소들을 골라낸다.
  *
  * Stream<T> filter(Predicate<? super T> predicate)
  * Stream<T> distinct()
  *
  * distinct() 의 사용법은 다음과 같다.
  *
  * IntStream intStream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
  * intStream.distinct().forEach(System.out::println); //중복된 요소는 삭제된다. 1, 2, 3, 4, 5, 6
  *
  * filter() 는 매개변수로 Predicate 를 필요로 하는데, 아래와 같이 연산결과가 boolean 인 람다식을 사용해도 좋다.
  *
  * IntStream intStream = IntStream.rangeClosed(1, 10); // 1 ~ 10
  * intStream.filter(i -> i%2 == 0).forEach(System.out::println); // 2의 배수만 골라낸다. 2, 4, 6, 8, 10
  *
  * 필요하다면 filter 를 다른 조건으로 여러 번 사용할 수도 있다.
  *
  * intStream.filter(i -> i%2 != 0 && i%3 != 0).forEach(System.out::println); // 2의 배수가 아니고 3의 배수도 아닌 수
  * intStream.filter(i -> i%2 != 0).filter(i -> i%3 != 0).forEach(System.out::println); // 둘 문장 모두 동일한 결과를 얻는다.
  *
  * */

}
