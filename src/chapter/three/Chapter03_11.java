package chapter.three;

public class Chapter03_11 {

  /** ◆ Math.round()로 반올림하기
   *
   * 반올림을 하려면 Math.round()를 사용하면 좋다. 이 메서드는 소수점 첫째 자리에서 반올림한 결과를 정수로 반환한다.
   *
   *  long result = Math.round(4.52); // result에 5가 저장된다.
   *
   *  만일 소수점 첫째 자리가 아닌 다른 자리에서 반올림을 하려면 10의 n제곱으로 적절히 곱하고 다시 나누어야 한다.
   * */

  public static void main(String[] args) {
    double pi = 3.141592;
    double shortPi = Math.round(pi * 1000) / 1000.0;
    System.out.println(shortPi);
  }

}
