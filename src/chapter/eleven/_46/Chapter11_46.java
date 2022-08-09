package chapter.eleven._46;

import java.util.ArrayList;
import java.util.HashSet;

public class Chapter11_46 {

  /*
  * Hashtable 과 HashMap 의 관계는 Vector 와 ArrayList 의 관계와 같아서 Hashtable 보다 새로운 버전인 HashMap 을 사용할 것을 권한다.
  *
  * HashMap 은 Map 을 구현하였으므로 앞에서 살펴본 Map 의 특징, 키(key) 와 값(value)을 묶어서 하나의 데이터(entry)로 저장한다는 특징이 있다.
  * 그리고 해싱(hashing) 을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보인다.
  *
  * HashMap 이 데이터를 어떻게 저장하는지 확인하기 위해 실제 소스의 일부를 살펴보면 다음과 같다.
  *
  * public class HashMap extends AbstractMap implements Map, Cloneable, Serializable {
  *   transient Entry[] table;
  *   ...
  *   static class Entry implements Map.Entry {
  *     final Object key;
  *     Object value;
  *     ...
  * }
  *
  * HashMap 은 Entry 라는 내부 클래스를 정의하고, 다시 Entry 타입의 배열을 선언하고 있다. 키(key) 와 값(value) 는 서로 별개의 값이 아니라 서로 관련된 값이기 때문에
  * 각각의 배열로 선언하기 보다는 하나의 클래스로 정의해서 하나의 배열로 다루는 것이 데이터의 무결성(integrity) 측면에서 더 바람직하기 때문이다.
  *
  *
  *
  * */

  public static void main(String[] args) {
    HashSet set = new HashSet();
    set.add("1");
    set.add("1");

    ArrayList arrayList = new ArrayList();
    arrayList.add("1");
    arrayList.add("1");

    System.out.println(set);
    System.out.println(arrayList);
  }

}
