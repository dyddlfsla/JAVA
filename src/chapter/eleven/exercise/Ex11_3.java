package chapter.eleven.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
  String name;
  int ban;
  int no;
  int kor, eng, math;

  Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  int getTotal() {
    return kor + eng + math;
  }

  float getAverage() {
    return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", ban=" + ban +
        ", no=" + no +
        ", kor=" + kor +
        ", eng=" + eng +
        ", math=" + math +
        ", getTotal()=" + getTotal() +
        ", getAverage()=" + getAverage() +
        '}';
  }

  @Override
  public int compareTo(Student student) {
    return this.name.compareTo(student.name);
  }
}

public class Ex11_3 {

  /*
  * Comparable 인터페이스를 구현하도록 변경해서 이름(name) 이 기본 정렬 기준이 되도록 하시오.
  *
  * sol:
  * Comparator 과 Comparable 은 모두 인터페이스로서 컬렉션을 정렬하는데 필요한 메서드를 정의하고 있으며, Comparable 을 구현하고
  * 있는 클래스들, 주로 Integer 와 같은 wrapper 클래스와 String, Date, File 과 같은 것들이며 기본적으로 오름차순,
  * 즉 작은 값에서부터 큰 값의 순으로 정렬되도록 구현되어 있다. 그래서 Comparable 을 구현한 클래스는 정렬이 가능하다는 것을 의미한다.
  * 참고로 Java API 문서에서 Comparable 을 찾아보면, 이를 구현한 클래스의 목록을 볼 수 있다.
  *
  * compare() 와 compareTo() 는 선언 형태와 이름이 약간 다를 뿐 두 객체를 비교한다는 같은 기능을 목적으로 고안된 것이다.
  * compareTo() 의 반환값은 int 이지만 실제로는 비교하는 두 객체가 같으면 0, 비교하는 값보다 작으면 음수, 크면 양수를 반환하도록 구현해야 한다.
  * 이와 마찬가지로 compare()도 역시 객체를 비교해서 음수, 0, 양수를 반환하도록 구현해야 한다.
  *
  * Comparable → 기본 정렬기준을 구현하는데 사용.
  * Comparator → 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용.
  *
  * Comparable 과 Comparator 의 실제 소스를 보면 다음과 같다.
  *
  *
  * */

  public static void main(String[] args) {
    ArrayList list = new ArrayList<>();

    list.add(new Student("홍길동", 1, 1, 100, 100, 100));
    list.add(new Student("남궁성", 1, 2, 90, 70, 80));
    list.add(new Student("김자바", 1, 3, 80, 80, 90));
    list.add(new Student("이자바", 1, 4, 70, 90, 70));
    list.add(new Student("안자바", 1, 5, 60, 100, 80));

    Collections.sort(list);
    Iterator iterator = list.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
