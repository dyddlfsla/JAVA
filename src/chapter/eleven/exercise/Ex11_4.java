package chapter.eleven.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class BanNoAscending implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    if(o1 instanceof Student && o2 instanceof Student) {
      Student s1 = (Student)o1;
      Student s2 = (Student)o2;
      return s1.ban==s2.ban ? s1.no - s2.no : s1.ban - s2.ban;
    }
    return -1;
  }
}

class Student2 {
  String name;
  int ban;
  int no;
  int kor, eng, math;

  Student2(String name, int ban, int no, int kor, int eng, int math) {
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
    return "Student2{" +
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
}

public class Ex11_4 {

  /*
  * ArrayList 에 담긴 Student 인스턴스들이 반(ban) 과 번호(no) 로 오름차순 정렬되게 하시오.
  * (반이 같은 경우, 번호를 비교해서 정렬한다.)
  *
  *
  *
  *
  * */

  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(new Student("이자바", 2, 1, 70, 90, 70));
    list.add(new Student("안자바", 2, 2, 60, 100, 80));
    list.add(new Student("이자바", 1, 3, 100, 100, 70));
    list.add(new Student("이자바", 1, 1, 90, 70, 80));
    list.add(new Student("이자바", 1, 2, 80, 80, 90));

    Collections.sort(list, new BanNoAscending());
    Iterator iterator = list.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}
