package chapter.four;

public class Chapter04_21 {

  /** ◆ continue 문
   *
   * continue 문은 반복문 내부에서만 사용될 수 있으며, 반복이 진행되는 도중에 continue 문을 만나면
   * 반복문의 끝으로 이동하여 다음 반복으로 넘어가게 된다. 예를 들어 for 문이라면 증감식으로 이동하고
   * while, do-while 문이라면 조건식으로 이동하게 된다.
   *
   * continue 문이 break 문과 다른 점은 반복문 '전체'를 벗어나는 것이 아니라 다음 반복을 계속 수행한다는 것이다.
   * 주로 if 문과 사용되어 특정 조건을 만족하는 경우에 continue 문 이후의 문장을 수행하지 않고 다음 반복으로 넘어
   * 가도록 한다. 즉, 전체 반복 중에서 특정 조건을 만족하는 경우를 제외하고자 할 때 유용하다.
   *
   * */

  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
      if (i%3 == 0) {
        continue;
      }
      System.out.println(i);
    }
    //1부터 10사이의 숫자를 순서대로 출력하되, 3의 배수인 경우는 제외하도록 하였다.
  }

}
