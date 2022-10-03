package chapter.fourteen._51;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter14_51 {

  /*
  * ◆ 스트림의 분할 - partitioningBy()
  *
  * Collectors 클래스가 가지고 있는 static 메서드 중 partitioningBy() 라는 메서드를 사용하면
  * 스트림을 분할 하는 것이 가능해진다.
  *
  * 아래의 코드를 보자. 아래 코드는 학생들을 성별에 따라 나누어 분할하는 예를 보여준다.
  *
  * // 1. 기본 분할
  * Map<Boolean, List<Student>> stuBySex = stuStream.collect(Collectors.partitioningBy(Student::isMale));
  *
  * List<Student> malesStudent = stuBySex.get(true); // Map 에서 남학생 목록
  * List<Student> femalesStudent = stuBySex.get(false); // Map 에서 여학생 목록
  *
  * 여기서 counting() 을 추가해서 남학생과 여학생의 수를 구해보자.
  *
  * Map<Boolean, Long> stuNumBySex = stuStream.collect(Collectors.partitioningBy(Student::isMale, counting()));
  *
  * counting() 대신 summingLong() 을 사용하면 남학생과 여학생의 총점을 구할 수 있다.
  * 그러면 남학생 1등과 여학생 1등은 어떻게 구할 수 있을까?
  *
  * Map<Boolean, Optional<Student>> topScoreBySex = stuStream.collect(Collectors.partitioningBy(Student::isMale, Collectors.maxBy(comparingInt(Student::getScore))));
  *
  * ※ maxBy() 는 반환타입이 Optional<Student> 라서 위의 결과가 나왔다.
  * 만약 Optional<Student> 가 아닌 그냥 Student 로 받고 싶다면, 다음과 같이 collectingAndThen() 과 Optional::get 을 함께 사용하면 된다.
  *
  * Map<Boolean, Student> topScoreStudentBySex = stuStream
  *                                           .collect(Collectors.partitioningBy(Student::isMale, Collectors.collectingAndThen(maxBy(comparingInt(Student::getScore)), Optional::get)));
  *
  * 성적이 150점 아래인 학생들은 불합격처리하고 싶다. 불합격자를 성별로 분류하여 얻어내려면 어떻게 해야 할까?
  * partitioningBy() 를 중첩하여 사용하는 것을 고려해볼 수 있다.
  *
  * Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = stuStream
  *                                                              .collect(Collectors.partitioningBy(Student::isMale,
  *                                                                                       Collectors.partitioningBy(s -> s.getScore() < 150)));
  *
  *
  *
  *
  * */
  public static void main(String[] args) {
    Student[] stuArr = {
        new Student("나자바", true, 1, 1, 300),
        new Student("김지미", false, 1, 1, 250),
        new Student("김자바", true, 1, 1, 200),
        new Student("이지미", false, 1, 2, 150),
        new Student("남자바", true, 1, 2, 100),
        new Student("안지미", false, 1, 2, 50),
        new Student("황지미", false, 1, 3, 100),
        new Student("강지미", false, 1, 3, 150),
        new Student("이자바", true, 1, 3, 200),
        new Student("나자바", true, 2, 1, 300),
        new Student("김지미", false, 2, 1, 250),
        new Student("김자바", true, 2, 1, 200),
        new Student("이지미", false, 2, 2, 150),
        new Student("남자바", true, 2, 2, 100),
        new Student("안지미", false, 2, 2, 50),
        new Student("황지미", false, 2, 3, 100),
        new Student("강지미", false, 2, 3, 150),
        new Student("이자바", true, 2, 3, 200)
    };
    System.out.println("1. 단순분할(성별로 분할)");
    Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr)
        .collect(Collectors.partitioningBy(Student::isMale));

    List<Student> malesStudent = stuBySex.get(true);
    List<Student> femalesStudent = stuBySex.get(false);

    malesStudent.forEach(System.out::println);
    femalesStudent.forEach(System.out::println);

    System.out.println("2. 단순분할 + 통계(성별 학생 수)");
    Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
        .collect(Collectors.partitioningBy(Student::isMale, Collectors.counting()));

    System.out.println("남학생의 수: " + stuNumBySex.get(true));
    System.out.println("여학생의 수: " + stuNumBySex.get(false));

    System.out.println("3. 단순분할 + 통계(성별 1등)");
    Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
        .collect(Collectors.partitioningBy(Student::isMale,
            Collectors.maxBy(Comparator.comparingInt(Student::getScore))));

    System.out.println("남학생 1등" + topScoreBySex.get(true));
    System.out.println("여학생 1등" + topScoreBySex.get(false));

    Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
        .collect(Collectors.partitioningBy(Student::isMale, Collectors.collectingAndThen(
            Collectors.maxBy(Comparator.comparingInt(Student::getScore)), Optional::get)));

    System.out.println("남학생 1등" + topScoreBySex2.get(true));
    System.out.println("여학생 1등" + topScoreBySex2.get(false));

    System.out.println("4. 다중분할(성별 불합격자, 100점 이하)");

    Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = Stream.of(stuArr)
        .collect(Collectors.partitioningBy(Student::isMale,
            Collectors.partitioningBy(student -> student.getScore() <= 100)));

    List<Student> failedMaleStudent = failedStuBySex.get(true).get(true);
    List<Student> failedFeMaleStudent = failedStuBySex.get(false).get(true);


    System.out.println("100점 이하의 남학생");
    failedMaleStudent.forEach(System.out::println);

    System.out.println("100점 이하의 여학생");
    failedFeMaleStudent.forEach(System.out::println);
  }
}

class Student {
  String name;
  boolean isMale;
  int hak;
  int ban;
  int score;

  public Student(String name, boolean isMale, int hak, int ban, int score) {
    this.name = name;
    this.isMale = isMale;
    this.hak = hak;
    this.ban = ban;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public boolean isMale() {
    return isMale;
  }

  public int getHak() {
    return hak;
  }

  public int getBan() {
    return ban;
  }

  public int getScore() {
    return score;
  }

  @Override
  public String toString() {
    return String.format("[이름: %s, 성별: %s, %d학년, %d반, %d점]", name, isMale ? "남" : "여", hak, ban, score);
  }

  enum Level {
    HIGH, MID, LOW
  }
}



