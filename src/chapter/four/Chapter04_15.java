package chapter.four;

public class Chapter04_15 {

  /** ◆ 중첩 for 문
   *
   * for 문 안에 또 다른 for 문을 중첩시키는 것이 가능하며, 중첩 for 문이라고 한다.
   * 중첩 횟수는 거의 제한이 없다. 중첩 for 문을 설명하는데에는 별찍기가 이해하기 쉽다.
   *
   * 다음과 같이 5행 10열의 별'*'을 찍으려면 어떻게 해야 할까?
   *
   *  **********
   *  **********
   *  **********
   *  **********
   *  **********
   *
   *  첫번째로 생각나는 방법은 다음과 같다.
   *
   *  1.
   *  System.out.println("**********");
   *  System.out.println("**********");
   *  System.out.println("**********");
   *  System.out.println("**********");
   *  System.out.println("**********");
   *
   *  그러나 이제 for 문을 배웠으므로 적용해보자.
   *
   *  2.
   *  for (int i = 1; i <= 5; i++) {
   *    System.out.println("**********");
   *  }
   *
   *  그런데 여기서 System.out.println("**********"); 역시 반복적인 일을 하는 문장이므로 이것도 for 문으로 만들어보자.
   *
   *  for (int i = 1; i <= 10 i++) {
   *    System.out.print("*");
   *  }
   *  System.out.println();
   *
   *  이것을 2번에서 만든 for 문 안에 넣으면
   *
   *  for (int i = 1; i <= 5; i++) {
   *    for (int j = 1; j <= 10; j++) {
   *      System.out.print("*");
   *    }
   *    System.out.println();
   *  }
   *
   *  그러면, 이번에는 삼각형 모양의 별을 출력해보자.
   *
   *  *
   *  **
   *  ***
   *  ****
   *  *****
   *
   *  1.
   *  for (int i; i <= 1; i++) {System.out.print("*");}System.out.println();
   *  for (int i; i <= 2; i++) {System.out.print("*");}System.out.println();
   *  for (int i; i <= 3; i++) {System.out.print("*");}System.out.println();
   *  for (int i; i <= 4; i++) {System.out.print("*");}System.out.println();
   *  for (int i; i <= 5; i++) {System.out.print("*");}System.out.println();
   *
   *  2. 위 문장을 자세히 보면 조건식의 숫자만 변화할 뿐 나머지는 똑같다. 그러므로 다시 한번
   *  for 문을 적용해볼 수 있다. 어떻게 하면 좋을까?
   *
   *  for (int i = 1; i <= 5; i++) {
   *    for (int j = 1; j <= i; j++) {
   *      System.out.print("*");
   *    }
   *    System.out.println();
   *  }
   *
   *
   * */
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
