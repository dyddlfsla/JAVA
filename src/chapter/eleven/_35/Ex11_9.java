package chapter.eleven._35;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {

  public static void main(String[] args) {
    Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
    Set set = new HashSet();

    for (int i = 0; i < objArr.length; i++) {
      set.add(objArr[i]);
    }

    System.out.println(set);

    Iterator iterator = set.iterator();

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
  /*
  * 결과에서 알 수 있듯이 중복된 값은 저장되지 않았다. add 메서드는 객체를 추가할 때 HashSet 에 이미 같은 객체가 있으면 중복으로 간주하고
  * 저장하지 않는다. 그리고는 작업이 실패했다는 의미로 false 를 반환한다.
  *
  * 그러나 '1' 이 두 번 출력되었는데, 둘 다 '1' 로 보이기 때문에 구별이 안 되지만, 사실 하나는 String 인스턴스이고 다른 하나는 Integer 인스턴스로
  * 서로 다른 객체이므로 중복으로 간주하지 않고 둘 다 저장되었다.
  *
  * Set 을 구현한 컬렉션 클래스는 List 를 구현한 컬렉션 클래스와 달리 순서를 유지하지 않기 때문에 저장한 순서와 다를 수 있다.
  * 만일 중복을 제거하는 동시에 저장한 순서를 유지하고자 한다면 HashSet 대신 LinkedHashSet 을 사용해야 한다.
  *
  *
  * */
}
