package chapter.eleven._06;

public class Chapter11_06 {

  /** ◆ Map 인터페이스
   *
   * Map 인터페이스는 키(key) 와 값(value) 을 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스를 구현하는데 사용된다. 키는 중복될 수 없지만 값은 중복될 수 있다.
   * 기존에 저장된 데이터와 중복된 키와 값을 저장하면 기존의 값은 없어지고 마지막에 저장된 값이 남게 된다.
   *
   * ※ Map 이란 개념은 어떤 두 값을 연결한다는 의미에서 붙여진 이름이다.
   *
   *                   Map
   *              ↗     ↑       ↖
   *     Hashtable    HashMap   SortedMap
   *                    ↑           ↑
   *              LinkedHashMap   TreeMap
   *
   * =====================================================================================================
   * 1. void clear() : Map 의 모든 객체를 삭제한다.
   *
   * 2. boolean containsKey(Object key) : 지정된 key 객체와 일치하는 Map 의 Key 객체가 있는지 확인한다.
   *
   * 3. boolean containsValue(Object value): 지정된 value 객체와 일치하는 Map 의 value 객체가 있는지 확인한다.
   *
   * 4. Set entrySet(): Map 에 저장되어 있는 key-value 쌍을 Map.Entry 타입의 객체로 저장한 Set 으로 반환한다.
   *
   * 5. boolean equals(Object o) : 동일한 Map 인지 비교한다.
   *
   * 6. Object get(Object Key): 지정한 Key 객체에 대응하는 value 객체를 찾아서 반환한다.
   *
   * 7. int hashCode(): 해시코드를 반환한다.
   *
   * 8. boolean isEmpty(): Map 이 비어 있는지 확인한다.
   *
   * 9. Set keySet(): Map 에 저장된 모든 Key 객체를 반환한다.
   *
   * 10. Object put(Object key, Object value): Map 에 value 객체를 key 객체에 연결하여(mapping)하여 저장한다.
   *
   * 11. void putAll(Map t): 지정된 Map 의 모든 Key-value 쌍을 추가한다.
   *
   * 12. Object remove(Object key): 지정된 key 객체와 일치하는 key-value 쌍을 삭제한다.
   *
   * 13. int size(): Map 에 저장된 key-value 쌍의 개수를 반환한다.
   *
   * 14. Collection values(): Map 에 저장된 모든 value 객체를 반환한다.
   *
   * =====================================================================================================
   *
   * values() 에서는 반환타입이 Collection 이고, keySet() 에서는 반환타입이 Set 인 것에 주목하자. Map 인터페이스에서 값(value) 은 중복을 허용하기 때문에
   * Collection 타입으로 반환하고 키(key)는 중복을 허용하지 않기 떄문에 Set 타입으로 반환한다.
   *
   *
   * */

}
