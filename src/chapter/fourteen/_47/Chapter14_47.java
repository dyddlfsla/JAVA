package chapter.fourteen._47;

public class Chapter14_47 {

  /*
  * ◆ 스트림 최종 연산 - collect() 의 활용
  *
  * 앞서 살펴보았던 최종 연산들이 제공하는 count(), sum() 메서드들은 collect() 를 사용해서도 똑같은 결과를 얻을 수 있다.
  * collect() 를 사용하지 않고도 쉽게 얻을 수 있는데, 굳이 collect() 를 사용한 방법을 보여주는 것은 collect() 의 사용법을 알려주기 위한 것이다.
  *
  *
  * long count = stuStream.count();
  * long count = stuStream.collect(Collectors.counting());
  *
  * long totalScore = stuStream.mapToInt(Student::getTotalScore).sum();
  * long totalScore = stuStream.collect(Collectors.summingInt(Student::getTotalScore));
  *
  * Optional<Student> topStudent = stuStream.max(Comparator.comparingInt(Student::getTotalScore));
  * Optional<Student> topStudent = stuStream.collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
  *
  *
  * 리듀싱 역시 collect() 메서드를 통해 구현하는 것이 가능하다. IntStream 에는 매개변수 3개짜리 collect() 만 정의되어 있으므로
  * boxed() 를 통해 IntStream 을 Stream<Integer> 로 변환해야 매개변수 1개짜리 collect() 를 사용할 수 있다.
  *
  * IntStream intStream = new Random().ints(1, 46).distinct().limit(6);
  *
  * OptionalInt max = intStream.reduce(Integer::max);
  * Optional<Integer> max = intStream.boxed().collect(Collectors.reducing(Integer::max));
  *
  * long sum = intStream.reduce(0, (a, b) -> a + b);
  * long sum = intStream.boxed().collect(Collectors.reducing(0, (a, b) -> a + b));
  *
  * int grandTotal = stuStream.map(Student::getTotalScore).reduce(0, Integer::sum);
  * int grandTotal = stuStream.collect(Collectors.reducing(0, Student::getTotalScore, Integer::sum));
  *
  *
  *
  *
  *
  *
  *
  * */

}
