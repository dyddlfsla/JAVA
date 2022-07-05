package chapter.nine._03;

import java.util.Objects;

public class Chapter09_3 {

  /** ◆ equals() 의 오버라이딩
   *
   * Object 클래스로부터 상속받은 equals() 메서드는 결국 두 개의 참조변수가 같은 객체를 참조하고 있는지, 즉 두 참조변수에 저장된 값(주소값)이
   * 이 같은지를 판단하는 기능밖에 할 수 없다는 것이다. equals() 메서드로 Value 인스턴스가 가지고 있는 value 값을 비교하도록 할 수 없을까?
   * Value 클래스에서 equals() 메서드를 오버라이딩하여 주소가 아닌 객체에 저장된 내용을 비교하도록 변경하면 된다.
   *
   *
   *
   * */

  public static void main(String[] args) {
    Person p1 = new Person(110322968210L);
    Person p2 = new Person(110322968210L);

    if (p1.equals(p2)) {
      System.out.println("p1 와 p2 는 같은 사람입니다.");
      System.out.println(p1.hashCode());
      System.out.println(p2.hashCode());
    } else {
      System.out.println("p1 와 p2 는 다른 사람입니다.");
    }
  }
}

class Person {
  long id;

  public Person(long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return id == person.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}

/*
* equals 메서드가 Person 인스턴스의 주소값이 아닌 멤버변수 id 의 값을 비교하도록 하기위해 equals 메서드를 오버라이딩했다.
* 이렇게 함으로써 서로 다른 인스턴스일지라도 같은 id(주민등록번호)를 가지고 있다면 equals 메서드로 비교했을 때 true 결과를 얻게 할 수 있다.
*
* */