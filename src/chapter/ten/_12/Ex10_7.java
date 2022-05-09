package chapter.ten._12;

import java.text.DecimalFormat;

public class Ex10_7 {

  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#,###.##");
    DecimalFormat df2 = new DecimalFormat("#.###E0");

    try {
      Number num = df.parse("1,234,567.89");
      System.out.printf("1,234,567.89 → ");

      double d = num.doubleValue();
      System.out.print(d + " → ");

      System.out.printf("%s", df2.format(num));

    } catch (Exception e) {}
  }

  /**
   * 패턴을 이용해서 숫자로 변환하는 예제이다. parse 메서드를 이용하면 기호와 문자가 포함된 문자열을 숫자로 쉽게 변환할 수 있다.
   * ※ Integer.parseInt 메서드는 콤마(,) 가 포함된 문자열을 숫자로 변환하지 못한다.
   *
   * parse(String source) 는 DecimalFormat 의 조상인 NumberFormat 에 정의된 메서드이며, 이 메서드의 선언부는 다음과 같다.
   * public Number parse(String source) throws ParseException
   *
   * Number 클래스는 Integer, Double 과 같은 숫자를 저장하는 래퍼 클래스의 조상이며, doubleValue() 는 Number 에 저장된 값을 double 형의 값으로 변환하여 반환한다.
   * 이외에도 intValue(), floatValue() 등의 메서드가 Number 클래스에 정의되어 있다.
   *
   *
   * */

}
