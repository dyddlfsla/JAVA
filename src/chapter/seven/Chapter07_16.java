package chapter.seven;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Chapter07_16 {

  /** ◆ static import 문
   *
   * import 문을 사용하면 클래스의 패키지명을 생략할 수 있다고 했다. 마찬가지로 static import 문을 사용하면
   * static 멤버를 호출할때 클래스 이름을 생략할 수 있게 된다. 특정 클래스의 static 멤버를 자주 사용할 때 편리하다.
   *
   *  import static java.lang.Integer.*; //Integer 클래스의 모든 static 메서드를 클래스 호출 없이 사용할 수 있다.
   *  import static java.lang.Math.random; //Math 클래스의 random 메서드만 클래스 호출 없이 사용할 수 있다.
   *  import static java.lang.System.out; // System.out 을 out 만으로 참조할 수 있게 된다.
   *
   * 위의 세 가지 import 문을 사용하게 되면 아래와 같은 코드를 만들 수 있다.
   *
   *  System.out.println(Math.random());   →   out.println(random());
   *
   * */

  public static void main(String[] args) {
    out.println(random());

    out.println("Math.PI: " + PI);
  }
}
