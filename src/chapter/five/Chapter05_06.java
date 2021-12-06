package chapter.five;

public class Chapter05_06 {

  /** ◆ 배열의 출력
   *
   * 배열에 저장되어 있는 값을 출력하고 싶다면 다음과 같이 for 문을 이용할 수 있다.
   *
   * int[] iArr = { 100, 95, 80, 70, 60};
   * for (int i = 0; i < iArr.length; i++) {
   *   System.out.println(score[i]);
   * }
   *
   * 더 간단한 방법은 'Arrays.toString(배열이름)'메서드를 사용하는 것이다. 이 메서드는 배열의 모든 요소를
   * '[첫번째 요소, 두번째 요소, ....]'와 같은 형식의 문자열로 만들어서 반환한다.
   *
   *  int[] iArr = { 100, 95, 80, 70, 60};
   *  System.out.print(Arrays.toString(iArr));
   *  //배열 iArr 의 모든 요소를 출력한다. [100, 95, 80, 70, 60]이 출력된다.
   *
   * 예외적으로 배열의 타입이 char 일 때는 각 요소가 구분자 없이 그대로 출력되는데, 이것은
   * print 메서드가 char 배열일때만 그렇게 작동하도록 만들어졌기 때문이다.
  *
   *
   * */

}
