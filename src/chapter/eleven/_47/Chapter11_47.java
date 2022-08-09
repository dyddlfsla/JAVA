package chapter.eleven._47;

public class Chapter11_47 {

  /*
  * HashMap 은 키와 값을 각각 Object 타입으로 저장한다. 즉 (Object, Object) 의 형태로 저장하기 때문에
  * 어떤 객체도 저장할 수 있지만 키는 주로 String 을 대문자 또는 소문자로 통일해서 사용하곤 한다.
  *
  * ----------------------------------------------------------------------------
  * 1. 키(key): 컬렉션 내의 키(key) 중에서 유일해야 한다.
  * 2. 값(value): 키와 달리 데이터의 중복을 허용한다.
  * ----------------------------------------------------------------------------
  *
  * 키는 저장된 값을 찾는데 사용되는 것이기 때문에 컬렉션 내에서 유일(unique) 해야 한다. 즉, HashMap 에 저장된 데이터를 하나의 키로 검색했을 때
  * 결과가 단 하나이어야 함을 뜻한다. 만일 하나의 키에 대해 여러 검색결과 값을 얻는다면 원하는 값이 어떤 것인지 알 수 없기 때문이다.
  *
  * 예를 들어 사용자ID 가 키(key)로, 비밀번호가 값(value) 로 연결되어 저장된 데이터 집합이 있다고 가정하다. 로그인 시에 비밀번호를 확인하기 위해서
  * 입력된 사용자ID 에 대한 비밀번호를 검색했을 때, 단 하나의 결과를 얻어야만 올바른 비밀번호를 입력했는지 확인이 가능할 것이다. 만일 하나의 사용자ID 에 대해서
  * 두 개 이상의 비밀번호를 얻는다면 어떤 비밀번호가 맞는 것인지 알 수가 없다.
  *
  * ◆ HashMap 의 메서드
  *
  * 1. HashMap(): HashMap 객체를 생성.
  * 2. HashMap(int initialCapacity): 지정된 값을 초기용량으로 하는 HashMap 객체를 생성
  * 3. HashMap(int initialCapacity, float loadFactor): 지정된 초기용량과 load factor 의 HashMap 객체를 생성.
  * 4. HashMap(Map m): 지정된 Map 의 요소를 모두 포함하는 HashMap 을 생성
  * 5. void clear(): HashMap 에 저장된 모든 객체를 제거
  * 6. Object clone(): 현재 HashMap 을 복제해서 반환
  * 7. boolean containsKey(Object key): HashMap 에 지정된 키(key)가 포함되어 있는지 알려준다.
  * 8. boolean containsValue(Object value): HashMap 에 지정된 값(value) 가 포함되어 있는지 알려준다.
  * 9. Set entrySet(): HashMap 에 저장된 키와 값을 entry (키와 값의 결합) 형태로 Set 에 저장한 뒤 반환.
  * 10. Object get(Object key): 지정된 키(key) 의 값(객체)을 반환. 못 찾으면 null 을 반환.
  * 11. Object getOrDefault(Object key, Object defaultValue): 지정된 키(key) 의 값을 반환한다. 키를 못 찾으면, 기본 값(defaultValue)으로 지정된 객체를 반환
  * 12. boolean isEmpty(): HashMap 이 비어있는지 알려준다.
  * 13. Set keySet(): HashMap 에 저장된 모든 키를 Set 에 저장한 뒤 반환
  * 14. Object put(Object key, Object value): 지정된 키(key) 와 값(value)을 HashMap 에 저장한다.
  * 15. void putAll(Map m): m 에 저장된 모든 요소를 HashMap 에 저장.
  * 16. Object remove(Object key): HashMap 에서 지정된 키로 저장된 값을 제거.
  * 17. Object replace(Object key, Object value): 지정된 키의 값을 지정된 객체(value)로 대체한다.
  * 18. boolean replace(Object key, Object oldValue, Object newValue): 지정된 키(key) 와 값(oldValue) 이 모두 일치하는 경우에만 새로운 객체(newValue)로 대체한다.
  * 19. int size(): HashMap 에 저장된 요소의 개수를 반환
  * 20. Collection values(): HashMap 에 저장된 모든 값을 컬렉션의 형태로 반환.
  *
  *
  *
  *
  * */

}