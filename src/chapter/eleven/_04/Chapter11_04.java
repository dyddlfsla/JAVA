package chapter.eleven._04;

public class Chapter11_04 {

  /** ◆ List 인터페이스
   *
   * List 인터페이스는 중복을 허용하면서 저장순서가 유지되는 컬렉션을 구현하는데 사용된다.
   *
   *                    List
   *               ↗     ↑        ↖
   *        Vector    ArrayList  LinkedList
   *          ↑
   *        Stack
   *
   * List 인터페이스에 정의된 메서드는 다음과 같다. Collection 인터페이스로부터 상속받은 것들은 제외하였다.
   *
   * ===========================================================================================================
   * 1. void add(int index, Object element) : 지정된 위치(index)에 객체(element) 또는 컬렉션에 포함된 객체들을 추가한다.
   *    boolean addAll(int index, Collection c)
   *
   * 2. Object get(int index) : 지정된 위치(index) 에 있는 객체를 반환한다.
   *
   * 3. int indexOf(Object o) : 지정된 객체의 위치(index) 를 반환한다. ※ List 의 첫 번째 요소부터 순방향으로 찾는다.
   *
   * 4. int lastIndexOf(Object o) : 지정된 객체의 위치(index) 를 반환한다. ※ List 의 마지막 요소부터 역방향으로 찾는다.
   *
   * 5. ListIterator listIterator() : List 객체에 접근할 수 있는 ListIterator 를 반환한다.
   *    ListIterator listIterator(int index)
   *
   * 6. Object remove(int index) : 지정된 위치(index)에 있는 객체를 삭제하고 삭제된 객체를 반환한다.
   *
   * 7. Object set(int index, Object element) : 지정된 위치(index)에 객체를 저장한다.
   *
   * 8. void sort(Compare c) : 지정된 비교자(Comparator)로 List 를 정렬한다.
   *
   * 9. List subList(int fromIndex, int toIndex) : 지정된 범위 (fromIndex 부터 toIndex) 에 있는 객체를 반환한다.
   *
   * ===========================================================================================================
   *
   *
   * */

}
