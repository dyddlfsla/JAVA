package chapter.fourteen._41;

public class Chapter14_41 {

  /*
  * ◆ 스트림의 최종 연산 - 조건 검사
  *
  * 스트림의 요소에 대해 지정된 조건에 모든 요소가 일치하는지, 일부가 일치하는지 아니면 어떤 요소도 일치하지 않는지 등을
  * 확인할 수 있는 메서드들이다. 이 메서드들은 모두 매개변수로 Predicate 를 요구하며, 연산결과로 boolean 을 반환한다.
  *
  * 1. boolean allMatch(Predicate<? super T> predicate): 모든 요소가 일치하면 true
  * 2. boolean anyMatch(Predicate<? super T> predicate): 하나의 요소라도 일치하면 true
  * 3. boolean noneMatch(Predicate<? super T> predicate): 모든 요소가 다 불일치하면 true
  *
  * 예를 들어 학생들의 성적 정보 스트림 stuStream 에서 총점이 낙제점(총점 100점 이하)인 학생이 있는지 확인하는 방법은 다음과 같다.
  *
  * boolean noFailed = stuStream.anyMatch(student -> student.getTotalScore() <= 100)
  *
  * 이외에도 스트림의 요소 중에서 조건에 일치하는 첫 번째 것을 반환하는 findFirst() 메서드가 있는데
  * 주로 filter() 와 같이 사용되어 조건에 맞는 스트림의 요소가 있는지 확인하는데 사용된다.
  * 그러나 만약 병렬 스트림이라면 findAny() 를 사용해야 한다.
  *
  * Optional<Student> student = stuStream.filter(student -> student.getTotalScore() <= 100).findFirst();
  * Optional<Student> student = parallelStream.filter(student -> student.getTotalScore() <= 100).findAny();
  *
  * findAny() 와 findFirst() 의 반환 타입은 Optional<T> 이며, 스트림의 요소가 없을 때는 비어 있는 Optional 객체를 반환한다.
  * ※ 비어있는 Optional 객체는 내부적으로 null 가지고 있다. 즉 값을 꺼낼때에는 get() 보다는 null 을 대비한 메서드를 사용해야 한다.
  *
  * 1. Optional<T> findFirst(): 조건에 일치하는 첫 번째 요소를 반환
  * 2. Optional<T> findAny(): 조건에 일치하는 요소를 하나 반환
  *
  * */

}
