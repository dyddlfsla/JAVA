package chapter.three;

public class Chapter03_16 {

  /** ◆ 논리 부정 연산자 !
   *
   * 이 연산자는 피연산자가 true 이면 false, false이면 true를 결과로 반환한다.
   * 간단히 말해서, true 와 false 를 반대로 바꾸는 것이다.
   *
   * 이러한 성질을 잘 이용하면 TV의 전원버튼 같은 '토글 버튼(toggle button)'을 논리적으로 구현할 수 있다.
   *
   *  ch < 'a' || ch > 'Z' → !('a' <= ch && ch <= 'z')
   *
   * 논리 부정 연산자를 적절히 활용하여 보다 이해하기 쉬운 식이 되도로 노력하자.
   *
   *
   * */
  public static void main(String[] args) {
    boolean b = true;
    char ch = 'C';

    System.out.printf("b = %b%n", b);
    System.out.printf("!b = %b%n", !b);
    System.out.printf("!!b = %b%n", !!b);
    System.out.printf("!!!b = %b%n", !!!b);
    System.out.println();

    System.out.printf("ch = %c%n", ch);
    System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z');
    System.out.printf("!('a' <= ch || ch <= 'z') = %b%n", !('a' <= ch && ch <= 'z'));
    System.out.printf("'a' <= ch && ch <= 'z' = %b%n", 'a' <= ch && ch <= 'z');
  }
}
