package chapter.eight._02;

public class Chapter08_02 {

  /** 자바에서는 실행 시 발생할 수 있는 오류(Exception 과 Error ) 를 클래스로 정의하였다. 앞서 배운 것처럼 모든 클래스의 조상은 Object 클래스이므로
   * Exception 클래스와 Error 클래스 역시 Object 클래스의 자손들이다.
   *
   * 모든 예외의 최고 조상은 Exception 클래스이며 상속계층도를 Exception 클래스로부터 도식화 하면 아래와 같다.
   *
   * Exception
   *   |ㅡ IOException
   *   |ㅡ ClassNotFoundException
   *   |ㅡ ...
   *---|ㅡ RuntimeException -----------------------↑ ↓-------------------------
   *             |ㅡ ArithmeticException
   *             |ㅡ ClassCaseException
   *             |ㅡNullPointerException
   *             |ㅡ ...
   *             |ㅡ IndexOutOfBoundsException
   *
   * 위 그림에서 볼 수 있듯이 예외 클래스들은 다음과 같이 두 그룹으로 나눠질 수 있다.
   *
   * 1. Exception 클래스와 그 자손들(RuntimeException 제외)
   * 2. RuntimeException 클래스와 그 자손들
   *
   *
   * */

}
