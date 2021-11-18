package chapter.three;

public class Chapter03_06 {

  /** ◆ 부호 연산자 +, -
   *
   * 부호 연산자 '-'는 피연산자의 부호를 반대로 변경한 결과를 반환한다. 피연산자가 음수면 양수, 양수면 음수가 연산의 결과가 되는 것이다.
   * 부호 연산자 '+'는 하는 일이 없으며 쓰이는 경우도 거의 없다. 형식적으로 '+'를 추가해 놓은 것 뿐이다.
   * 부호 연산자는 boolean형과 char형에는 사용할 수 없고, 숫자 형태의 기본형에만 사용할 수 있다.
   *
   *
   * */

  public static void main(String[] args) {
    int i = -10;
    i = +i;
    System.out.println(i);

    i = -10;
    i = -i;
    System.out.println(i);
  }

}
