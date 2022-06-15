package chapter.eleven._32;

public class Chapter11_32 {

  /** ◆ Integer 와 Comparable
   *
   * 아래의 코드는 Integer 클래스의 일부인데, Comparable 의 compareTo(Object o) 를 구현해놓은 것을 볼 수 있다.
   *
   * public final class Integer extends Number implements Comparable {
   *   ...
   *   public int compareTo(Object o) {
   *     return compareTo((Integer) o);
   *   }
   *
   *   public int compareTo(Integer anotherInteger) {
   *     int thisVal = this.value;
   *     int anotherVal = anotherInteger.value;
   *
   *     //비교하는 값이 크면 -1, 같으면 0, 작으면 1을 반환한다.
   *     return (thisVal < anotherVal ? -1 : (thisVal == anotherVal ? 0 : 1));
   *   }
   * }
   *
   * Integer 클래스의 compareTo() 는 두 Integer 객체에 저장된 int 값(value) 을 비교해서 같으면 0, 크면 -1, 작으면 1을 반환한다.
   * Comparable 을 구현한 클래스들이 기본적으로 오름차순으로 정렬되어 있지만, 내림차순으로 정렬한다던가 아니면 다른 기준에 의해서 정렬되도록 하고 싶을 때
   * Comparator 를 구현해서 정렬기준을 제공할 수 있다. 대부분의 경우, 아래와 같이 간단한 뺄셈만으로 compareTo() 를 구현할 수 있다.
   *
   *
   * // Arrays.sort() 와 같은 메서드가 정렬을 수행하는 과정에서 compareTo 를 호출한다.
   * public int compareTo(Integer anotherInteger) {
   *   int thisVal = this.value;
   *   int anotherVal = anotherInteger.value;
   *
   *   //왼쪽 값이 크면 양수, 같으면 0을, 오른쪽 값이 크면 음수를 반환한다.
   *   return thisVal - anotherVal;
   * }
   *
   * Arrays.sort() 와 같은 메서드의 정렬 알고리즘은 이미 훌륭하게 잘 작성되어 있으므로, 우리가 해야할 일은 위와 같이 compareTo() 를 구현해서
   * 어떤 비교기준으로 정렬할지만 알려주는 것으로 충분하다.
   *
   *
   *
   * */

}
