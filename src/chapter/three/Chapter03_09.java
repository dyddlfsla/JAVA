package chapter.three;

public class Chapter03_09 {

  /** ◆ 사칙 연산자
   *
   * 사칙 연산자는 프로그램 개발 도중 가장 자주 쓰이는 연산자 중에 하나일 것이다.
   * 이미 알고 있는 바와 같이 곱셈(*), 나눗셈(/), 나머지(%) 연산자는 덧셈(+), 뺄셈(-)연산자 보다 우선순위가 높으므로 먼저 처리된다.
   *
   * 또한, 피연산자가 정수형인 경우 나누는 수로 0을 사용할 수 없다.
   * */

  public static void main(String[] args) {
    int a = 10;
    int b = 4;

    System.out.printf("%d + %d = %d%n", a, b, a + b);
    System.out.printf("%d - %d = %d%n", a, b, a - b);
    System.out.printf("%d * %d = %d%n", a, b, a * b);
    System.out.printf("%d / %d = %d%n", a, b, a / b);
    System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
  }

  /**
   * 위 두 변수 a, b에 각각 10, 4를 저장한 후 사칙연산을 수행하였다. 한 가지 주목할 것은 10을 4로 나눈 결과가 2.5가 아닌 2라는 것이다.
   * 나누기 연산자의 두 피연산자가 모두 int 타입인 경우, 연산결과 역시 int 타입이다. 그래서 실제 값이 2.5라고 하더라도 int 타입인 2를 결과로 얻는다.
   * int 타입은 소수점을 저장하지 못하므로 정수만 남기고 나머지는 버리기 때문이다. 이때 반올림이 발생하지 않는다는 점 역시 주의하자.
   *
   * 그래서 올바른 연산결과를 얻기 위해서는 두 피연산자 중 어느 한 쪽을 실수형으로 형변환을 해야 한다. 그래야만 다른 한 쪽도 실수형으로 자동 형변환되고
   * 결과 값도 실수형의 값이 될 수 있다.
   *
   *  int  float       float  float     float
   *  10 / 4.0f    →   10.0f / 4.0f  →  2.5f
   *
   * */
}
