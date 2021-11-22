package chapter.three;

import java.util.Scanner;

public class Chapter03_15 {

  /** ◆ 논리 연산자 && || !
   *
   * 논리 연산자는 둘 이상의 조건을 '그리고(AND)' 나 '또는(OR)'로 연결하여 하나의 식으로 표현할 수 있게 해준다.
   * 논리 연산자 '&&' 는 '그리고'에 해당하며 두 피연산자 모두 true일때만 true를 반환한다.
   *'||'는 '또는'에 해당하며 두 피연산자 중 하나만이라도 true면 true를 반환한다.
   *
   *  활용 방법
   *  ① x는 10보다 크고, 20보다 작다.
   *    x > && x < 20
   *    가독성 측면에서 다음이 더 나을수 있다.
   *    10 < x && x < 20
   *
   *  ② i는 2의 배수 또는 3의 배수이다.
   *  어떤 수가 2의 배수라는 것은 2로 나누었을 때의 몫이 0이라는 뜻이다. 즉
   *    i%2 == 0 || i%3 ==0
   *
   *  ③ i는 2의 배수 또는 3의 배수지만 6의 배수는 아니다.
   *    (i%2 == 0 || i%3 ==3) && i%6 !=0
   *   위의 식에서 괄호를 사용한 이유는 연산자 '&&'가 '||'보다 우선순위가 높기 떄문이다.
   *
   *  ④ 문자 ch는 숫자 ('0' ~ '9')이다.
   *     '0' <= ch && ch <= '9'
   *   유니코드에서 문자'0'부터 '9'까지 연속적으로 배치되어 있기 때문에 가능한 식이다.
   *
   *  ⑤ 문자 ch는 대문자 또는 소문자이다.
   *  ( 'a' <= ch && ch <= 'z') || ( 'A' <= ch && ch < 'Z')
   *
   *
   * */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char ch = ' ';
    System.out.println("문자 하나를 입력해주세요.");

    String input = scanner.nextLine();
    ch = input.charAt(0);

    if ('0' <= ch && ch <= '9') {
      System.out.printf("입력하신 문자는 숫자입니다.%n");
    }
    if ('a' <= ch && ch <= 'z') {
      System.out.printf("입력하신 문자는 영어 소문자입니다.%n");
    }
    if ('A' <= ch && ch <= 'Z') {
      System.out.printf("입력하신 문자는 영어 대문자입니다.%n");
    }
  }
}
