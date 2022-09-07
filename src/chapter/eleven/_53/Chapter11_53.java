package chapter.eleven._53;

public class Chapter11_53 {

  /*
  * ◆ Collections 의 메서드 - 변경불가, 싱글톤
  *
  * 1. 변경불가 컬렉션 만들기 (immutable)
  *
  * 컬렉션에 저장된 데이터를 보호하기 위해서 컬렉션을 변경할 수 없게, 즉 읽기 전용으로 만들어야할 때가 있다.
  * 주로 멀티쓰레드 프로그래밍에서 여러 쓰레드가 하나의 컬렉션을 공유하는 경우, 데이터가 손상될 우려가 존재하는데
  * 이를 방지하려면 컬렉션을 변경 불가능한 불변 객체로 만들어야 할 것이다.
  * Collections 클래스는 이러한 불변 컬렉션을 반환하는 메서드를 제공한다.
  *
  * static Collection unmodifiableCollection(Collection c)
  * static List unmodifiableList(List list)
  * static Set unmodifiableSet(Set s)
  * static Map unmodifiableMap(Map m)
  * static NavigableSet unmodifiableNavigableSet(Navigable s)
  * static SortedMap unmodifiableSortedMap(SortedMap m)
  *
  *
  * 2. 싱글톤 컬렉션 만들기 (singleton)
  *
  * 단 하나의 객체만을 저장하는 컬렉션을 만들어야 하는 경우가 있다. 이런 경우를 대비해서
  * Collections 클래스는 싱글톤 컬렉션을 반환하는 메서드를 제공하고 있다.
  *
  * static List singletonList(Object o)
  * static Set singleton(Object o) // singletonSet 이 아님
  * static Map singletonMap(Object key, Object value)
  *
  * 매개변수로 저장할 요소를 지정하면, 메서드는 해당 요소를 저장하는 컬렉션을 반환한다. 또한 이 반환된 컬렉션은 변경할 수 없다.
  *
  *
  *
  * */

}
