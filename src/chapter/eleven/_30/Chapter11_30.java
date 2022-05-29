package chapter.eleven._30;

public class Chapter11_30 {
  /** ◆ Comparator 와 Comparable
   *
   * Comparator 와 Comparable 은 모두 인터페이스로 컬렉션을 정렬하는데 필요한 메서드를 정의하고 있으며,
   * Comparable 을 구현하고 있는 클래스들은 같은 타입의 인스턴스끼리 서로 비교할 수 있는 클래스들, 주로
   * Integer 와 같은 wrapper 클래스와 String, Date, File 과 같은 것들이며 기본적으로 오름차순, 즉 작은 값에서부터
   * 큰 값의 순으로 정렬되도록 구현되어 있다. 그래서 Comparable 을 구현한 클래스는 정렬이 가능하다는 것을 의미한다.
   *
   * Comparator 와 Comparable 의 실제 소스는 다음과 같다.
   *
   * public interface Comparator {
   *   int compare(Object o1, Object o2); // o1 과 o2 를 비교
   *   boolean equals(Object obj);
   * }
   *
   * public interface Comparable {
   *   int compareTo(Object o); //객체 자신(this) 와 o 를 비교
   * }
   *
   * compare() 와 compareTo() 는 선언 형태와 이름이 약간 다를 뿐 두 객체를 비교한다는 같은 기능을 목적으로 고안된 것이다.
   * compareTo() 의 반환값은 int 이지만 실제로는 비교하는 두 객체가 같으면 0, 비교하는 값보다 작으면 음수, 크면 양수를 반환하도록 구현해야 한다.
   * 이와 마찬가지로 compare() 도 객체를 비교해서 같으면 0, 작으면 음수, 크면 양수를 반환하도록 구현해야 한다.
   *
   * Comparable : 기본 정렬을 구현하는데 사용
   * Comparator : 기본 정렬 외에 다른 기준으로 정렬하고자 할 때 사용
   *
   *
   *
   * */

}
