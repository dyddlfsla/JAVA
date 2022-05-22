package chapter.eleven._24;

public class Chapter11_24 {

  /** ◆ Map 과 Iterator
   *
   * Map 인터페이스를 구현한 컬렉션 클래스는 키(key) 와 값(value)을 쌍(pair)으로 저장하고 있기 때문에
   * iterator() 를 직접 호출할 수 없고, 그 대신 keySet() 이나 entrySet() 과 같은 메서드를 통해서 키와 값을 각각
   * 따로 Set 의 형태로 얻어 온 후에 다시 iterator() 를 호출해야 Iterator 를 얻을 수 있다.
   *
   * Map map = new HashMap();
   * ...
   * Iterator iterator = map.entrySet().iterator();
   *
   *
   * 문장 Iterator iterator = map.entrySet().iterator(); 는 아래와 같이 두 문장을 하나로 합친 것이라고 이해하면 된다.
   *
   * Set set = map.entrySet();
   * Iterator iterator = set.iterator();
   *
   * 조금 더 풀어서 보면
   *
   * 1. map.entrySet() 의 결과가 Set 이므로
   *   Iterator iterator = map.entrySet().iterator();
   *                     = Set 인스턴스.iterator();
   *
   * 2. Set 인스턴스의 iterator() 를 호출해서 Iterator 를 얻는다.
   *  Iterator iterator = Iterator 인스턴스;
   *
   *  iterator 에는 Iterator 인스턴스의 주소값이 저장된다.
   *
   *
   *
   * */

}
