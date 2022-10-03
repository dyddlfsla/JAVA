package chapter.fourteen._53;

public class Chapter14_53 {

  /*
  * ◆ 스트림의 그룹화 - groupingBy()
  *
  * Collectors 클래스의 메서드 중 groupingBy() 메서드를 사용하면 스트림을 그룹화 할 수 있다.
  *
  * Map<Integer, List<Student>> stuByBan = stuStream.collect(Collectors.groupingBy(Student::getBan));
  *
  * groupingBy() 로 그룹화를 하면 그룹화된 객체는 기본적으로 List<T> 에 담긴다. 그래서 toList() 를 생략할 수 있는 것이다.
  * 만일 List 가 아닌 다른 컬렉션을 지정하고 싶다면, toList() 나 toSet() 대신 toCollection() 을 이용해 지정할 수 있다.
  * 단, Map 은 키와 값의 한쌍이기 때문에 Map 의 제네릭 타입도 적절히 변경해주어야 한다.
  *
  * Map<Integer, List<Student>> stuByBan = stuStream
  *       .collect(Collectors.groupingBy(Student::getBan), toList()); // List 형태가 기본이기 때문에 toList() 를 생략할 수 있다.
  *
  * Map<Integer, HashSet<Student>> stuByBan = stuStream
  *       .collect(Collectors.groupingBy(Student::getBan), toCollection(HashSet::new)));
  *
  * 일차적인 groupingBy() 를 이제 응용하여, 이번엔 stuStream 을 성적의 등급(Student.Level) 으로 그룹화해보자.
  *
  * Map<Student.Level, Long> stuByLevel = stuStream
  *       .collect(Collectors.groupingBy(s -> {
  *                                 if (s.getScore > 200) return Student.Level.HIGH;
  *                                 else if (s.getScore >= 100) return Student.Level.MID;
  *                                 else return Student.Level.LOW;
  *                               }, counting())
  *
  * //[MID] - 8명, [HIGH] - 8명, [LOW] - 2명
  *
  * 앞서 partitioningBy() 처럼 groupingBy() 도 중첩하여 사용할 수 있다
  * 예를 들어, 학년별로 그룹화 한 후, 다시 반별로 그룹화하고 싶다면 다음과 같이 할 수 있다.
  *
  * Map<Integer, Map<Integer, List<Student>> stuByHakAndBan = stuStream
  *         .collect(Collectors.groupingBy(Student::getHak, groupingBy(Student::getBan)));
  *
  *
  * 여기서 한층 더 나아가, 각 반의 1등을 출력하고 싶다면 collectingAndThen() 와 maxBy() 를 사용할 수 있다.
  *
  * Map<Integer, Map<Integer, List<Student>> topStuByHakAndBan = stuStream
  *             .collect(Collectors.groupingBy(Student::getHak, groupingBy(Student::getBan, Collectors.collectingAndThen(maxBy(comparingInt(Student::getScore)), Optional::get))));
  *
  *
  *
  *
  * */

}
