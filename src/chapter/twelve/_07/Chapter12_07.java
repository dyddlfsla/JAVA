package chapter.twelve._07;

import java.util.ArrayList;
import java.util.Iterator;

public class Chapter12_07 {

  /*
  * ◆ Iterator<E>

  * 다음은 Iterator 의 실제 소스인데, 컬렉션 클래스뿐만 아니라 Iterator 에도 제네릭스가 적용되어 있는 것을 알 수 있다.
  * 제네릭스가 도입되면서 기존의 소스에 Object 가 들어간 클래스는 전부 이렇게 바뀌었다고 보면 된다.
  *
  * ※ 제네릭스가 잘 이해되지 않을 때에는 타입 변수를 Object 로 바꾸어서 생각해보면 된다.
  *
  * public interface Iterator<E> {
  *   boolean hasNext();
  *   E next();
  *   void remove();
  * }
  *
  *
  *
  *
  *
  * */
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student("자바왕", 1, 1));
    list.add(new Student("자바짱", 1, 2));
    list.add(new Student("홍길동", 2, 1));

    Iterator<Student> iterator = list.iterator();

    while (iterator.hasNext()) {
//      Student student = (Student) iterator.next(); Iterator 에 제네릭을 적용하지 않으면 이처럼 형변환이 필요함.
      Student student = iterator.next();
      System.out.println(student.name);
    }
  }
}

class Student {

  String name = "";
  int ban;
  int no;

  public Student(String name, int ban, int no) {
    this.name = name;
    this.ban = ban;
    this.no = no;
  }
}
