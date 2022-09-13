package chapter.twelve._08;

public class Chapter12_08 {

  /*
  * ◆ HashMap<K, V>
  *
  * HashMap 처럼 데이터를 키(key) 와 값(value) 의 형태로 저장하는 컬렉션 클래스는 지정해줘야할 타입이 두 개이다.
  * 그래서 '<K, V>' 와 같이 두 개의 타입을 콤마, 로 구분해서 적어줘야한다. 여기서 'K' 와 'V' 는 각각 key 와 value 의 첫 글자에서
  * 따온 것일 뿐, 앞서 본 'T' 나 'E' 와 마찬가지로 임의의 참조형 타입(reference type) 을 의미하는 것이다.
  *
  * public class HashMap<K, V> extends AbstractMap<K, V> {
  *   ...
  *   public V get(Object key) {}
  *   public V put(K key, V value) {}
  *   public V remove(Object key) {}
  *   ...
  * }
  *
  * 만일 key 의 타입이 String 이고 value 값의 타입이 Student 인 HashMap 을 생성하려면 다음과 같이 한다.
  *
  * HashMap<String, Student> map = new HashMap<String, Student>(); // map 생성
  * map.put("자바왕", new Student("자바왕", 1, 1,)); //데이터 저장
  *
  * 위와 같이 HashMap 을 생성했다면, HashMap 의 실제 소스는 'K' 대신 String 이, 'V' 대신 Student 가 사용되어 아래와 같이 바뀌는 셈이다.
  *
  * public class HashMap<K, V> extends AbstractMap<K, V> {
  *   ...
  *   public Student get(Object key) {}
  *   public Student put(String key, Student value) {}
  *   public Student remove(Object key) {}
  *   ...
  * }
  *
  * 그래서 HashMap 에서 값을 꺼내오는 get(Object key) 을 사용할 때, 그리고 저장된 키와 값들을 꺼내오는 keySet() 과 values()를 사용할 때
  * 형변환을 하지 않아도 된다.
  *
  * Student student = (Student) map.get("자바왕"); → Student student = map.get("자바왕");
  *
  *
  * */

}
