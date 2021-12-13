package chapter.seven;

public class Chapter07_08 {

  /** ◆ 오버라이딩의 조건
   *
   * 오버라이딩은 메서드의 내용만을 새로 작성하는 것이므로 메서드의 선언부(메서드 이름, 매개변수, 반환타입)는 조상의 것과
   * 완전히 일치해야 한다. 다만 접근 제어자(Access modifier) 와 예외(exception)는 제한된 조건에 따라 다르게 변경할 수 있다.
   *
   * 1. 접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
   * = 만일 조상 클래스에 정의된 메서드의 접근 제어자가 protected 라면 이를 오버라이딩하는 자손 클래스의 메서드는 접근 제어자가
   * protected 나 public 이어야 한다. 대부분의 경우 조상 메서드와 같은 범위의 접근 제어자를 사용한다.
   * 참고로 다음 순서대로 범위가 좁아진다.
   *
   *  public → protected → (default) → private
   *
   * 2. 조상 클래스의 메서드보다 많은 예외를 선언할 수 없다.
   *
   *  class Parent {
   *    void parentMethod() throws IOException, SQLException {
   *      ...
   *    }
   *  }
   *
   *  class Child extends Parent {
   *    void parentMethod() throws IOException {
   *
   *    }
   *  }
   *
   *  위의 코드를 보면 Child 클래스의 메서드에 선언된 예외는 한 개이고, 조상 클래스의 메서드에 선언된 예외는 2개이다.
   *  오버라이딩이 올바르게 되려면 자손의 예외 수가 조상의 예외 수보다 적어야 한다.
   *
   * 정리하면, 오버라이딩 시 지켜야 할 조건은 다음과 같다.
   *
   *  ① 메서드의 선언부는 오버라이딩 하려는 메서드의 선언부와 일치해야 한다.
   *  ② 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
   *  ③ 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
   * */

}
