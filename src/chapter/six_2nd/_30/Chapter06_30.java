package chapter.six_2nd._30;

public class Chapter06_30 {
  /** ◆ 오버로딩 (overloading)
   *
   * 메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 구별될 수 있어야 하기 때문에 각기 다른 이름을 가져야 한다.
   * 그러나 자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도 매개변수의 개수 또는 타입이 다르면,
   * 같은 이름을 사용해서 메서드를 정의할 수 있다.
   *
   * 이처럼, 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 '메서드 오버로딩(method overloading)' 또는 간단히 '오버로딩' 이라 한다.
   * 같은 이름의 메서드를 정의한다고 해서 무조건 오버로딩인 것은 아니다. 오버로딩이 성립하기 위해서는 다음과 같은 조건을 만족해야 한다.
   *
   * 1. 메서드의 이름이 같아야 한다.
   * 2. 메서드 매개변수의 타입, 개수, 순서가 달라야 한다.
   *
   * 비록 메서드의 이름이 같다 하더라도 매개변수가 다르면 서로 구별될 수 있기 때문에 오버로딩이 가능한 것이다. 위의 조건을 만족시키지 못하는
   * 메서드는 중복 정의로 간주되어 컴파일 시 에러가 발생한다. 그리고 오버로딩된 메서드들은 매개변수에 의해서만 구별될 수 있으므로 반환 타입은
   * 오버로딩을 구현하는데 아무런 영향을 주지 못한다는 것에 주의하자.
   *
   * 오버로딩의 예로 가장 대표적인 것은 println() 메서드이다. 지금까지 println() 메서드의 괄호 안에 값만 지정해주면 화면에 출력하는데
   * 아무런 어려움이 없었다. 하지만 실제로는 println() 메서드를 호출할 때 매개변수로 지정하는 값의 타입에 따라서 호출되는 println 메서드가 달라진다.
   * PrintStream 클래스에는 여러 종류의 매개변수를 지정해도 출력할 수 있도록 아래와 같이 10개의 오버로딩 된 println 메서드를 정의해놓고 있다.
   *
   *  void println()
   *  void println(boolean x)
   *  void println(char x)
   *  void println(char[] x)
   *  void println(double x)
   *  void println(float x)
   *  void println(int x)
   *  void println(long x)
   *  void println(Object x)
   *  void println(String x)
   *
   * println 메서드를 호출할 때 매개변수로 넘겨주는 값의 타입에 따라서 위의 오버로딩된 메서드들 중의 하나가 선택되어 실행되는 것이다.
   * 몇 가지 예를 들어 오버로딩에 대해 좀 더 알아보자.
   *
   *  ex1) int add(int a, int b) {...}
   *       int add(int b, int a) {...}
   *
   * 위의 두 메서드는 매개변수의 이름만 다를 뿐 매개변수의
   * */
  public static void main(String[] args) {
    System.out.println(test(10L));
  }

  static long test(long a) {
    return a;
  }

}
