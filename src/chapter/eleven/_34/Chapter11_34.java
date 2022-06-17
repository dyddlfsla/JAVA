package chapter.eleven._34;

public class Chapter11_34 {

  /** ◆ HashSet
   *
   * HashSet 은 Set 인터페이스를 구현한 가장 대표적인 컬렉션이며, Set 인터페이스의 특징대로 HashSet 은 중복된 요소를 저장하지 않는다.
   * HashSet 에 새로운 요소를 추가할 떄는 add 메서드나 addAll 메서드를 사용하는데, 만일 HashSet 에 이미 저장되어 있는 요소와 중복된 요소를
   * 추가하고자 한다면 이 메서드들은 false 를 반환함으로써 중복된 요소이기 때문에 추가에 실패했다는 것을 알린다.
   *
   * 이러한 HashSet 의 특징을 이용하면, 컬렉션 내의 중복된 요소들을 쉽게 제거할 수 있다.
   *
   * ArrayList 와 같이 List 인터페이스를 구현한 컬렉션과 달리 HashSet 은 저장 순서를 유지하지 않으므로 저장순서를 유지하고자 한다면
   * LinkedHashSet 을 사용해야 한다.
   *
   * 1. 메서드
   *
   * HashSet() : HashSet 객체를 생성한다.
   * HashSet(Collection c) : 주어진 컬렉션을 포함하는 HashSet 객체를 생성한다.
   * HashSet(int initialCapacity) : 주어진 값을 초기용량으로 하는 HashSet 객체를 생성한다.
   * HashSet(int initialCapacity, float loadFactor) : 초기 용량과 loadFactor 를 지정하는 생성자.
   * boolean add(Object o) : 새로운 객체를 저장한다. (성공하면 true, 실패하면 false)
   * boolean addAll(Collection c) : 주어진 컬렉션에 저장된 모든 객체들을 추가한다. (합집합)
   * void clear() : 저장된 모든 객체를 삭제한다.
   * Object clone() : HashSet 을 복제해서 반환한다.( 얕은 복사)
   * boolean contains(Object o) : 지정된 객체를 포함하고 있는지 알려준다.
   * boolean containsAll(Collection c) :주어진 컬렉션에 저장된 모든 객체들을 포함하고 있는지 알려준다.
   * boolean isEmpty() : HashSet 이 비어있는지 알려준다.
   * Iterator iterator() : Iterator 를 반환한다.
   * boolean remove(Object o) : 지정된 객체를 HashSet 에서 삭제한다. (성공하면 true, 실패하면 false)
   * boolean removeAll(Collection c) : 주어진 컬렉션에 저장된 모든 객체와 동일한 것들을 HashSet 에서 삭제한다. (차집합)
   * boolean retainAll(Collection c) : 주어진 컬렉션에 저장된 객체와 동일한 것만 남기고 나머지는 다 삭제한다. (교집합)
   * int size() : 저장된 객체의 수를 반환한다.
   * Object[] toArray() : 저장된 객체들을 객체 배열의 형태로 반환한다.
   * Object[] toArray(Object[] a) : 저장된 객체들을 주어진 객체배열(a) 에 담는다.
   *
   * ※ load Factor 는 컬렉션 클래스에 저장 공간이 가득 차기 전에 미리 용량을 확보하기 위한 것으로 이 값을 0.8 로 지정하면 저장 공간의 80% 가 채워졌을 때 용량이 두 배로 늘어난다.
   *   기본값은 0.75, 75% 이다.
   * ※ JDK 1.8 부터 추가된 스트림(stream) 과 관련된 메서드들 또한 존재한다.
   *
   *
   *
   * */

}
