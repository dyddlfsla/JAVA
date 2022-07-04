package chapter.nine._01;

public class Chapter09_1 {

  /** ◆ Object 클래스
   *
   * java.lang 패키지는 자바프로그래밍에 가장 기본이 되는 클래스들을 포함하고 있다. 그렇기 때문에 java.lang 패키지의 클래스들은
   * import 문 없어도 사용할 수 있게 되어 있다. 그 동안 String 클래스나 System 클래스를 import 문 없이 사용할 수 있었던 이유가
   * 바로 java.lang 패키지에 속한 클래스들이었기 때문이다. 우선 java.lang 패키지의 여러 클래스들 중에서도 자주 사용되는 클래스
   * 몇 가지만을 골라서 학습해보자.
   *
   * 1. Object 클래스
   * Object 클래스에 대해서는 클래스의 상속을 학습할 때 배웠지만, 여기서는 보다 자세히 알아본다. Object 클래스는 모든 클래스의 최고 조상이기 때문에
   * Object 클래스의 멤버들은 모든 클래스에서 바로 사용이 가능하다.
   *
   * - protected Object clone(): 객체 자신의 복사본을 반환한다.
   * - public boolean equals(Object obj): 객체 자신과 객체 obj 가 같은 객체인지 알려준다.
   * - protected void finalize(): 객체가 소멸될 때 가비지 콜렉터에 의해 자동적으로 호출된다.
   * - public Class getClass(): 객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환한다.
   * - public int hashCode(): 객체 자신의 해시코드를 반환한다.
   * - public String toString(): 객체 자신의 정보를 문자열로 반환한다.
   * - public void notify(): 객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다.
   * - public void notifyAll(): 객체 자신을 사용하려고 기다리는 모든 쓰레드를 꺠운다.
   * - void wait(): 다른 쓰레드가 notify(), notifyAll() 을 호출할 때까지 현재 쓰레드를 지정된 시간동안 기다리게 한다.
   *
   * Object 클래스는 멤버변수는 없고 오직 11개의 메서드만 가지고 있다. 이 메서드들은 모든 인스턴스가 가져야할 기본적인 것들이다.
   *
   * */
}
