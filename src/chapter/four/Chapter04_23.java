package chapter.four;

public class Chapter04_23 {

  /** ◆ 이름 붙은 반복문
   *
   * break 문은 자신을 포함한 가장 가까운 반복문 하나를 벗어나는 것이므로, 만약 여러 개의 반복문이
   * 중첩되어 있는 경우 break 문으로 중첩 반복문 전체를 벗어날 수 없다. 이때는 중첩 반복문에 이름을 붙이고
   * break 문과 continue 문에 벗어날 반복문 이름을 지정해줌으로써 해결할 수 있다.
   *
   *
   *
   *
   * */
  public static void main(String[] args) {
    Loop1 : for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        if (j == 5) {
          break Loop1;
        }
        System.out.println(i + "*" + j + "=" + i * j);
      }
    }
  }
  /* 구구단을 출력하는 예제이다. 제일 바깥에 있는 for 문에는 Loop1 이라는 이름을 붙였다. 그리고 j == 5일 때
  * break 문을 벗어나도록 하였다. 따라서 구구단은 2단의 4번째 줄까지만 출력되고 나머지는 반복되지 않는다.
  *
  * */
}
