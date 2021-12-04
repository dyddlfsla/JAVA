package chapter.four;

public class Chapter04_16 {

  /** ◆ while 문
   *
   * for 문에 비해 while 문은 구조가 간단하다. if 문처럼 조건식과 블럭{} 으로만 이루어져 있다.
   * 다만, if 문과 달리 while 문은 조건식이 '참(true)인 동안', 즉 조건식이 거짓이 될 때까지
   * 블럭 {} 안의 문장을 반복한다.
   *
   *  while (조건식) {
   *
   *  }
   *
   * while 문은 먼저 조건식을 판단해서 참이면 블럭{} 내부의 문장을 수행하고 다시 조건식으로 돌아간다.
   * 이때 조건식이 거짓이라면 while 문을 벗어나고 그게 아니라 또 참이라면 다시 블럭 {} 내부를 수행하게 된다.
   *
   * 1. for 문과 while 문의 비교
   * 1부터 10까지의 정수를 순서대로 출력하는 for 문을 while 문으로 변경하면 다음과 같다.
   *
   * for (int i = 1; i <= 10; i++) {                int i = 1;
   *   System.out.println(i);               →       while ( i <= 10) {
   *                                                  System.out.println(i);
   *                                                  i++;
   *                                                }
   * }
   *
   * 위 두 코드는 완전히 동일하다. for 문은 초기화, 조건식, 증감식을 한 곳에 몰아넣은 것일 뿐,
   * 본질적으로 while 문과 다르지 않다. 그래서 for 문과 while 문은 항상 서로 변환이 가능하다.
   * 이 경우에 for 문이 보기에 간결해 보이지만, 만일 초기화나 증감식이 필요하지 않은 경우라면
   * while 문이 더 적합할 것이다.
   *
   * */

  public static void main(String[] args) {
    int i = 5;
    while (i-- != 0) {
      System.out.println(i + " - I can do it.");
    }
    // 'i--' 가 후위형이므로 값이 먼저 참조된 후에 1씩 감소한다는 것을 참고하자.
  }
}
