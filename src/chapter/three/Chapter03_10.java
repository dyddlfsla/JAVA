package chapter.three;

public class Chapter03_10 {

  /** ◆ 산술 변환
   *
   * 이항 연산자는 두 피연산자의 타입이 일치해야 연산이 가능하므로, 피연산자의 타입이 다르다면 연산 전에 형변환 연산자로 타입을 일치시켜야 한다.
   * 이처럼 연산 전에 피연산자의 타입의 일치를 위해 자동 형변환되는 것을 '산술 변환'이라고 하며 규칙은 다음과 같다.
   *
   *   ① 두 피연산자의 타입을 같게 일치시킨다. (※ 두 타입 중 큰 타입으로 일치)
   *   long + int → long + long → long
   *   float + int → float + float → float
   *   double + float → double + double → double
   *
   *   ② 피연산자의 타입이 int보다 작은 경우에는 int로 변환된다.
   *   byte + short → int + int → int
   *   char + short → int + int → int
   *
   *  여기서 주목할 것은, 연산결과의 타입은 피연산자의 타입과 일치한다는 것이다. 예를 들어 int와 int의 나눗셈 연산결과는 int이다.
   *  만약 연산결과 값으로 어떤 타입을 얻고 싶다면, 피연산자를 해당 타입으로 형변환 시켜주어야 한다.
   *
   * 결국, 산술 변환이란 그저 연산 직전에 발생하는 자동 형변환일 뿐이다.
   *
   *
   * */
  public static void main(String[] args) {
    System.out.println(5 / 2);
    System.out.println(5 / (float)2);
  }
}
