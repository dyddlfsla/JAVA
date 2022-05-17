package chapter.eleven._03;

public class Chapter11_03 {

  /** ◆ Collection 인터페이스
   *
   * List 와 Set 의 조상인 Collection 인터페이스에는 다음과 같은 메서드들이 정의되어 있다.
   *
   * ===================================================================================================
   * 1. boolean add(Object o) : 지정된 객체(o) 또는 Collection(c) 의 객체들을 Collection 에 추가한다.
   *    boolean addAll(Collection c)
   *
   * 2. void clear() : Collection 의 모든 객체를 삭제한다.
   *
   * 3. boolean contains(Object o) : 지정된 객체(o) 또는 Collection 의 객체들이 Collection 에 포함되어 있는지 확인한다.
   *    boolean containsAll(Collection c)
   *
   * 4. boolean equals(Object o) : 동일한 Collection 인지 비교한다.
   *
   * 5. int hashCode() : Collection 의 hash code 를 반환한다.
   *
   * 6. boolean isEmpty() : Collection 이 비어있는지 확인한다.
   *
   * 7. Iterator iterator() : Collection 의 Iterator 를 얻어서 반환한다.
   *
   * 8. boolean remove(Object o) : 지정된 객체를 삭제한다.
   *
   * 9. boolean removeAll(Collection c) : 지정된 Collection 에 포함된 객체들을 삭제한다.
   *
   * 10.retainAll(Collection c) : 지정된 Collection 에 포함된 객체만을 남기고 다른 객체들은 Collection 에서 삭제한다.
   *                              이 작업으로 인해 Collection 에 변화가 있으면 true, 없으면 false 를 반환한다.
   *
   * 11. int size() : Collection 에 저장된 객체의 개수를 반환한다.
   *
   * 12. Object[] toArray() : Collection 에 저장된 객체를 객체 배열(Object[]) 로 반환한다.
   *
   * 13. Object[] toArray(Object[] a) : 지정된 배열에 Collection 의 객체를 저장해서 반환한다.
   *
   * ===================================================================================================================
   *
   * Collection 인터페이스는 컬렉션 클래스에 저장된 데이터를 읽고, 추가하고 삭제하는 등 컬렉션을 다루는데 가장 기본적인 메서드들을 정의하고 있다.
   * 위의 표에서 반환 타입이 boolean 인 메서드들은 작업을 성공하거나 사실이면 true 를, 그렇지 않으면 false 를 반환한다.
   *
   * 예를 들어, 'boolean add(Object o)' 를 사용해서 객체를 컬렉션에 추가할 때, 성공하면 true 를 실패하면 false 를 반환한다. 'boolean  isEmpty()' 를 사용해서
   * 객체를 컬렉션에 포함된 객체가 없으면, 즉 컬렉션이 비어 있으면 true 를, 그렇지 않으면 false 를 반환한다.
   *
   * 이외에도 JDK 1.8 부터 추가된 '람다(Lambda)' 와 '스트림(stream)' 에 관련된 메서드들이 더 있는데, 이 메서드들은 추후에 알아본다.
   *
   *
   * */

}
