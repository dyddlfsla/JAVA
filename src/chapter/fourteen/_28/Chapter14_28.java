package chapter.fourteen._28;

import java.util.Comparator;
import java.util.stream.Stream;

public class Chapter14_28 {

  /*
   * ◆ 스트림의 중간 연산 - sorted()
   *
   * 스트림을 정렬할 때는 sorted() 를 사용하면 된다.
   * Stream<T> sorted()
   * Stream<T> sorted(Comparator<? super T> comparator
   *
   * sorted() 는 지정된 Comparator 로 스트림을 정렬하는데, Comparator 대신 int 값을 반환하는 람다식을 사용하는 것도 가능하다.
   * Comparator 를 지정하지 않으면 스트림의 요소의 기본 정렬 기준(Comparable) 으로 정렬한다.
   * 단, 스트림의 요소가 Comparable 을 구현한 클래스가 아니라면 예외가 발생한다.
   *
   *
   * Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
   * strStream.sorted().forEach(System.out::print); // CCaaabccdd
   *
   * 위의 코드는 문자열 스트림을 String 에 정의된 기본 정렬(사전순 정렬)로 정렬해서 출력한다.
   * 다음은 문자열 스트림을 다양한 방식으로 정렬한 후에 출력 결과를 보여준다.
   *
   * 1. strStream.sorted() // 기본 정렬
   * 2. strStream.sorted(Comparator.naturalOrder()); // 기본 정렬
   * 3. strStream,sorted((s1, s2) -> s1.compareTo(s2)) // 람다식도 가능하다
   * 4. strStream.sorted(String::CompareTo) // 위의 문장과 동일
   *
   * 5. strStream.sorted(Comparator.reverseOrder()) // 기본 정렬의 역순
   * 6. strStream.sorted(Comparator.<String>naturalOrdered().reverse())
   *
   * 7. strStream.sorted(String.CASE_INSENSITIVE_ORDER) // 대소문자 구분 안함
   * 8. strStream.sorted(String.CASE_INSENSITIVE_ORDER.reverse())
   *
   * 9. strStream.sorted(Comparator.comparing(String::length)) // 문자열 길이 순으로 정렬
   *
   * 스트림의 중간 연산 - Comparator 의 메서드
   *
   * JDK1.8 부터 Comparator 인터페이스에 static 메서드와 디폴트 메서드가 많이 추가되었는데, 이 메서드들을 이용하면 정렬이 쉬워진다.
   * 이 메서드들은 모두 Comparator<T> 를 반환하며, 가장 기본적인 메서드는 comparing() 이다.
   *
   *  comparing(Function<T, U> keyExtractor)
   *  comparing(Function<T, U> keyExtractor, Comparator<U> keyExtractor)
   *
   * 스트림의 요소가 Comparable 을 구현한 경우, 매개변수 하나짜리를 사용하면 되고 그렇지 않은 경우, 추가적인 매개변수로 정렬 기준(Comparator) 을 따로 지정해줘야 한다.
   *
   *  comparingInt(ToIntFunction<T> keyExtractor)
   *  comparingLong(ToLongFunction<T> keyExtractor)
   *  comparingDouble(ToDoubleFunction<T> keyExtractor)
   *
   * 비교 대상이 기본형인 경우, comparing() 대신 위의 메서드를 사용하면 오토박싱과 언박싱 과정이 없어 더 효율적이다.
   * 그리고 정렬 조건을 추가할 때는 thenComparing() 을 사용하다.
   *
   * thenComparing(Comparator<T> other)
   * thenComparing(Function<T, U> keyExtractor)
   * thenComparing(Function<T, U> keyExtractor, Comparator<U> keyComp)
   *
   * 예를 들어, 학생 스트림을 반(ban) 별, 성적(totalScore)순, 그리고 이름(name) 순으로 정렬하여 출력하려면 다음과 같이 한다.
   *
   *  studentStream.sorted(Comparator.comparing(Student::getBan)
   *                   .thenComparing(Student::getTotalScore)
   *                   .thenComparing(Student::getName))
   *                   .forEach(System.out::println);
   *
   *
   *  */

  public static void main(String[] args) {
    Stream<Student> studentStream = Stream.of(
        new Student("이자바", 3, 300),
        new Student("김자바", 1, 200),
        new Student("안자바", 2, 100),
        new Student("박자바", 2, 150),
        new Student("소자바", 1, 200),
        new Student("나자바", 3, 290),
        new Student("김자바", 3, 180)
    );

    studentStream.sorted(Comparator.comparing(Student::getBan)
        .thenComparing(Comparator.naturalOrder()))
        .forEach(System.out::println);
  }

}

class Student implements Comparable<Student> {

  String name;
  int ban;
  int totalScore;

  public Student(String name, int ban, int totalScore) {
    this.name = name;
    this.ban = ban;
    this.totalScore = totalScore;
  }

  @Override
  public String toString() {
    return String.format("[%s, %d, %d]", name, ban, totalScore);
  }

  public String getName() {
    return name;
  }

  public int getBan() {
    return ban;
  }

  public int getTotalScore() {
    return totalScore;
  }

  @Override
  public int compareTo(Student student) {
    return student.totalScore - this.totalScore;
  }
}
