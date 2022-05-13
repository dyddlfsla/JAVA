package chapter.seven_2nd._16;
import static java.lang.System.out;
import static java.lang.Math.*;

public class Chapter07_16 {

  /** ◆ static import 문
   *
   * import 문을 사용하면 클래스의 패키지명을 생략할 수 있는 것과 같이 static import 문을 사용하면 static 멤버를 호출할 때
   * 클래스 이름을 생략할 수 있다. 특정 클래스의 static 멤버를 자주 사용할 때 편리하다. 그리고 코드도 더 간결해진다.
   *
   * import static java.lang.Integer.*; //Integer 클래스의 모든 static 메서드를 클래스 이름 생략하여 사용 가능.
   * import static java.lang.Math.random; //Math.random() 만 이름 생략해서 사용 가능.
   * import static java.lang.System.out; //System.out 을 out 만으로 참조 가능
   *
   * 만일 위와 같이 import 문을 작성하였다면, 아래의 코드처럼 간략하게 할 수 있다.
   *
   * System.out.println(Math.random());  →  out.println(random());

   *
   * */

}

class Ex7_6 {

  public static void main(String[] args) {
    //원래라면 System.out.println(Math.random());
    out.println(random());

    //System.out.println("Math.PI :" + PI);
    out.println("Math.PI :" + PI);
  }
}
