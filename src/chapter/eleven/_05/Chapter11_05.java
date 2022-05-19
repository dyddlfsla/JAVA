package chapter.eleven._05;

import java.util.ArrayList;
import java.util.List;

public class Chapter11_05 {

  /**
   * ◆ Set 인터페이스
   * <p>
   * Set 인터페이스는 중복을 허용하지 않고 저장 순서가 유지되지 않는 컬렉션 클래스를 구현하는 데 사용된다. Set 인터페이스를 구현한 클래스로는 HashSet,
   * TreeSet 이 있다.
   * <p>
   * Set 인터페이스에는 다음과 같은 메서드들이 있는데, 모두 Collection 인터페이스로부터 상속받은 것이다.
   * <p>
   * ========================================================================================== 1.
   * boolean add(Object o) :지정된 객체(o) 또는 Collection(c) 의 객체들을 Collection 에 추가한다. boolean
   * addAll(Collection c)
   * <p>
   * 2. void clear(): Collection 의 객체들을 전부 삭제한다.
   * <p>
   * 3. boolean contains(Object o): 지정된 객체(o) 또는 Collection 의 객체들이 Collection 에 포함되어 있는지 확인한다.
   * boolean containsAll(Collection c)
   * <p>
   * 4. boolean equals(Object o): 동일한 Collection 인지 비교한다.
   * <p>
   * 5. int hashCode(): Collection 의 hash Code 를 반환한다.
   * <p>
   * 6. boolean isEmpty(): Collection 이 비어있는지 확인한다.
   *
   * 7. Iterator iterator(): Collection 의 Iterator 를 얻어서 반환한다.
   *
   * 8. boolean remove(Object o): 지정된 객체를 삭제한다. boolean removeAll(Collection c): 지정된 Collection 에
   * 포함된 객체들을 삭제한다.
   *
   * 9. boolean retainAll(Collection c): 지정된 Collection 에 포함된 객체만 남기고 다른 객체들은 Collection 에서 삭제한다. 이
   * 작업으로 Collection 에 변화가 있으면 true, 그렇지 않으면 false 를 반환한다.
   *
   * 10. int size(): Collection 에 저장된 객체의 개수를 반환한다.
   *
   * 11. Object[] toArray(): Collection 에 저장된 객체들을 객체배열(Object[]) 로 반환한다.
   *
   * 12. Object[] toArray(Object[] a): 지정된 배열에 Collection 객체들을 저장해서 반환한다.
   *
   */



  public static void main(String[] args) {
    List test = new ArrayList();
    test.add(new String("tes1t"));
    System.out.println(test);
  }

}
