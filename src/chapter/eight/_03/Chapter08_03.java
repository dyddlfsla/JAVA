package chapter.eight._03;

public class Chapter08_03 {

  /** ◆ Exception 과 RuntimeException 의 차이
   *
   * 앞으로 RuntimeException 클래스와 그 자손들을 'RuntimeException 클래스들' 이라 하고, RuntimeException 클래스들을 제외한
   * 나머지 클래스들을 'Exception 클래스들' 이라 하겠다.
   *
   * 1. Exception 클래스들 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
   * 2. RuntimeException 클래스들 : 개발자의 실수로 발생하는 예외
   *
   * RuntimeException 클래스들은 주로 개발자의 실수에 의해서 발생될 수 있는 예외들로 자바의 프로그래밍 요소들과 관계가 깊다. 예를 들면,
   * 배열의 범위를 벗어난다던가, 값이 null 인 참조변수의 멤버를 호출하려 했다던가 클래스 간의 형변환을 잘못했다던가, 정수를 0으로 나누려고 하는 경우에 발생한다.
   *
   * 반면에 Exception 클래스들은 주로 외부의 영향으로 발생할 수 있는 것들로서, 프로그램의 사용자들의 동작에 의해서 발생하는 경우가 많다. 예를 들면,
   * 존재하지 않는 파일의 이름을 입력했다던가, 실수로 클래스의 이름을 잘못 적었다던가, 또는 입력한 데이터의 형식이 잘못된 경우에 발생한다.
   *
   *
   *
   *
   * */

}
