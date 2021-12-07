package chapter.five;

public class Chapter05_24 {

  /** ◆ Arrays 로 배열 다루기
   *
   * Arrays 클래스는 배열을 다루는데 유용한 메서드를 제공하는데, 그 중에서도 자주 사용되는 몇 가지만 먼저 알아보자.
   *
   *
   *  1. 문자열의 비교와 출력 - equals(), toString()
   *
   * toString()은 배열의 모든 요소를 문자열로 편하게 출력할 수 있다. 또한 toString()은 1차원 배열에만 사용할 수 있고
   * 만약 2차원 이상의 배열을 문자열로 출력하고 싶다면 deepToString()을 사용해야 한다.
   *
   * equals()는 두 배열에 저장된 모든 요소를 비교해서 같으면 true, 다르면 false 를 반환한다. equals() 역시 1차원 배열에만
   * 사용할 수 있으므로 2차원 이상의 배열을 비교하고 싶다면 deepEquals()를 사용해야 한다.
   *
   *  2. 배열의 복사 - copyOf(), copyOfRange()
   *
   * copyOf() 는 배열 전체를, copyOfRange()는 배열의 일부를 복사해서 새로운 배열을 만들어 반환한다. 또한
   * subString 과 마찬가지로 마지막 범위는 포함하지 않는다.
   *
   *  3. 배열의 정렬 - sort()
   *
   * 배열을 정렬할 때는 sort()를 사용한다.
   *
   *
   * */

}
