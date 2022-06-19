package chapter.eleven._36;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Ex11_10 {

  public static void main(String[] args) {
    Set set = new HashSet();

    for (int i = 0; set.size() < 6; i++) {
      int num = (int) (Math.random() * 45) + 1;
      set.add(new Integer(num));
    }

    List list = new LinkedList(set);
    Collections.sort(list);
    System.out.println(list);
  }

  /*
  * 중복된 값은 저장되지 않는 HashSet 의 성질을 이용해서 로또번호를 만드는 예제이다.
  * Math.random() 을 사용했기 때문에 실행할 때마다 결과가 다를 것이다.
  *
  * 번호를 크기 순으로 정렬하기 위해서 Collections 클래스의 sort(List list) 를 사용했다.
  * 이 메서드는 인자로 List 인터페이스 타입을 필요로 하기 때문에 LinkedList 클래스의 생성자 LinkedList(Collection c) 를 이용해서
  * HashSet 에 저장된 객체들을 LinkedList 에 담아서 처리했다.
  *
  * 실행결과의 정렬 기준은, 컬렉션에 저장된 객체가 Integer 이기 때문에 Integer 클래스에 정의된 기본 정렬이 사용되었다. 정렬 기준을 변경하는 방법과
  * Collections 클래스에 대해서는 추후 다룰 것이다.
  *
  * ※ Collection 은 인터페이스고 Collections 는 클래스임에 주의.
  *
  *
  * */

}

class Ex11_11 {

  public static void main(String[] args) {
    HashSet set = new HashSet();
    set.add("abc");
    set.add("abc");
    set.add(new Person("David", 10));
    set.add(new Person("David", 10));

    Iterator iterator = set.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return name + " : " + age;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Person)) {
      return false;
    }
    Person p = (Person) obj;
    return name.equals(p.name) && age == p.age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  /*
  * Person 클래스는 name 과 age 를 멤버변수로 갖는다. 이름과 나이가 같으면 같은 사람으로 인식하도록 하려는 의도로 작성하였다. 하지만 실행 결과를 보면
  * 두 인스턴스의 name 과 age 가 같음에도 불구하고 서로 다른 것으로 인식하여 'David : 10' 이 두 번 출력되었다. 클래스의 작성 의도대로 이 두 인스턴스를
  * 같은 것으로 인식하게 하려면 어떻게 해야할까? 방법은 Person 클래스에 다음과 같이 두 메서드를 추가로 오버라이딩해야 한다.
  *
  * public equals(Object obj) {
  *   if (!(obj instanceof Person)) {
  *   return false;
  *   }
  *   Person p = (Person) obj;
  *   return name.equals(p.name) && age == p.age;
  *
  * public int hashCode() {
  *  return Objects.hash(name, age);
  * }
  *
  *
  * */
}
