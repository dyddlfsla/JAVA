package chapter.nine._23;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Chapter09_23 {

  /*
  * abs(원시형 값): 주어진 값의 절대값을 반환한다.
  * static double ceil(double a): 주어진 값을 올림하여 반환한다.
  * static double floor(double a): 주어진 값을 버림하여 반환한다.
  * static double max(double a, double b): 주어진 두 값을 비교하여 큰 쪽을 반환한다.
  * static double min(double a, double b): 주어진 두 값을 비교하여 작은 쪽을 반환한다.
  * static double random(): 0.0 ~ 1.0 사이에서 임의의 double 값을 반환한다. (1.0 은 포함되지 않음)
  * static double rint(double a): 주어진 double 값과 가장 가까운 정수값을 double 형으로 반환한다. 단, 두 정수 가운데에 있는 값 1.5, 2.5 등은 짝수를 반환.
  * static long round(double a): 소수점 첫째자리에서 반올림한 정수값(long)을 반환한다.
  *
  *
  *
  * */
  public static void main(String[] args) {
    double val = 90.7552;
    out.println("round(" + val + ")= " + round(val)); //반올림

    val *= 100;
    out.println("round(" + val + ")= " + round(val)); //반올림

    out.println("round(" + val + ")/100 = " + round(val)/100);
    out.println("round(" + val + ")/100.0 = " + round(val)/100.0);
    out.println();
    out.printf("ceil(%3.1f)=%3.1f\n", 1.1, ceil(1.1));
    out.printf("floor(%3.1f)=%3.1f\n", 1.5, floor(1.5));
    out.printf("round(%3.1f)=%d\n", 1.1, round(1.1));
    out.printf("round(%3.1f)=%d\n", 1.5, round(1.5));
    out.printf("rint(%3.1f)=%f\n", 1.5, rint(1.5));
    out.printf("round(%3.1f)=%d\n", -1.5, round(-1.5));
    out.printf("rint(%3.1f)=%f\n", -1.5, rint(-1.5));
    out.printf("ceil(%3.1f)=%f\n", -1.5, ceil(-1.5));
    out.printf("floor(%3.1f)=%f\n", -1.5, floor(-1.5));

    /*
    * 음수를 반올림할 때 round(-1.5) 의 결과는 -2가 아니라 -1이다. round() 는 항상 가장 가까운 큰 정수로 반올림하기 때문이다.
    * rint() 도 가장 가까운 정수로 반올림하지만 1.5 와 같이 한가운데 있는 수의 경우 짝수 정수를 결과로 반환한다. 예를 들어, -1.5 는 -1.0
    * -2.0 의 중간에 있으므로 rint(-1.5) 는 -2.0 을 반환한다.
    *
    *
    *
    * */

  }
}
