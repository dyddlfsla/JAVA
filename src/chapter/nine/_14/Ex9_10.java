package chapter.nine._14;

public class Ex9_10 {

  public static void main(String[] args) {
    int iVal = 100;
    String strVal = String.valueOf(iVal);

    double dVal = 200.0;
    String strVal2 = dVal + "";

    double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
    double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

    System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
    System.out.println(strVal + "+" + strVal2 + "=" + sum2);
  }

  /*
  * 이 예제는 문자열과 기본형간의 변환의 예를 보여준다. parseInt() 나 parseFloat() 같은 메서드는 문자열에 공백 또는 문자가 포함되어 있는 경우
  * 변환 시 예외(NumberFormatException) 가 발생할 수 있으므로 주의해아 한다. 그래서 문자열 양 끝의 공백을 제거해주는 trim() 을 습관적으로 사용하기도 한다.
  *
  * int val = Integer.parseInt(" 123 ".trim()); // 문자열 양 끝 공백을 제거하고 변환
  *
  * 그러나 부호를 의미하는 '+' 나 소수점을 의미하는 '.' 과 float 형 값을 뜻하는 f 와 같은 자료형접미사는 허용된다. 단 자료형에 알맞는 변환을 하는 경우에만 허용된다.
  * 만일 '1.0f' 를 int 형 변환 메서드인 Integer.parseInt(String s) 를 사용해서 변환하려하면 예외가  발생하지만, Float.parseFloat(String s) 를 사용하면
  * 아무런 문제가 없다.
  *
  * 이처럼 문자열을 숫자로 변환하는 과정에서는 예외가 발생하기 쉽기 떄문에 주의를 기울여야 하고, 예외가 발생했을 때의 처리를 적절히 해주어야 한다.
  *
  *
  *
  * */

}
