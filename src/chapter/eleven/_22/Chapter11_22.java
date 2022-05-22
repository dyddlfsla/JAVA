package chapter.eleven._22;

import java.util.ArrayList;
import java.util.Iterator;

public class Chapter11_22 {

  /** ◆ Iterator, ListIterator, Enumeration
   *
   * Iterator, ListIterator, Enumeration 은 모두 컬렉션에 저장된 요소에 접근하는데 사용되는 인터페이스이다.
   * Enumeration 은 Iterator 의 구버전이며, ListIterator 는 Iterator 의 기능을 향상시킨 것이다.
   *
   * ===============================================================================
   * 1. Iterator : 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
   * 2. ListIterator : Iterator 에 양방향 조회 기능을 추가(List 를 구현한 경우만 사용가능)
   * 3. Enumeration : Iterator 의 구버전
   * ===============================================================================
   *
   * 컬렉션 프레임워크에서는 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화하였다. 컬렉션에 저장된 각 요소에 접근하는 기능을 가진
   * Iterator 인터페이스를 정의하고, Collection 인터페이스에는 'Iterator 를 구현한 클래스의 인스턴스' 를 반환하는 iterator() 메서드를 정의하고 있다.
   *
   * public interface Iterator {
   *   boolean hasNext();
   *   Object next();
   *   void remove();
   * }
   *
   * public interface Collection {
   *   ...
   *   public Iterator iterator();
   *   ...
   * }
   *
   * iterator() 은 Collection 인터페이스에 정의된 메서드이므로 Collection 인터페이스의 자손인 List, Set 인터페이스에도 포함되어 있다.
   * 그래서 List 나 Set 인터페이스를 구현하는 컬렉션은 iterator() 가 각 컬렉션의 특징에 알맞게 작성되어 있다. 컬렉션 클래스에 대해 iterator()를
   * 호출하여 Iterator 를 얻은 다음 반복문, 주로 while 문을 사용해서 컬렉션 클래스의 요소들을 읽어 올 수 있다.
   *
   * List list = new ArrayList();
   * Iterator iterator = list.iterator();
   *
   * while (iterator.hasNext()) { //boolean hasNext() : 읽어 올 요소가 있는지 확인
   *   System.out.println(iterator.next()); // Object next() : 다음 요소를 읽어옴
   * }
   *
   * ArrayList 대신 List 인터페이스를 구현한 다른 컬렉션 클래스에 대해서도 이와 동일한 코드를 사용할 수 있다. 첫 줄에서 new ArrayList() 대신
   * List 인터페이스를 구현한 또 다른 컬렉션 클래스를 대입하기만 하면 된다.
   *
   * Iterator 를 이용해서 컬렉션의 요소를 읽어오는 방법을 표준화했기 때문에 이처럼 코드의 재사용성을 높이는 것이 가능하며, 이처럼 공통 인터페이스를 정의해서
   * 표준을 정의하고 구현함으로써 코드의 일관성을 유지할 수 있다. 이것이 객체지향 프로그래밍의 중요한 목적 중 하나이다.
   *
   * */
}

class Ex11_5 {

  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");

    Iterator iterator = list.iterator();

    while (iterator.hasNext()) {
      Object obj = iterator.next();
      System.out.println(obj);
    }
  }

  /*
  * List 클래스들은 저장순서가 유지되기 때문에 Iterator 를 이용해서 읽어 온 결과 역시 저장순서와 동일하지만
  * Set 클래스들은 각 요소간의 순서가 유지되지 않기 때문에 Iterator 를 이용해서 저장된 요소들을 읽어와도 처음에 저장한 순서와 일치하지 않는다.
  *
  *
  * */

}
