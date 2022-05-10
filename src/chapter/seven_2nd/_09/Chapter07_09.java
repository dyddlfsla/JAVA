package chapter.seven_2nd._09;

public class Chapter07_09 {

  /** ◆ 오버로딩 vs. 오버라이딩
   *
   * 오버로딩과 오버라이딩을 서로 혼동하기 쉽지만 사실 그 차이는 명백하다. 오버로딩은 기존에 없는 새로운 메서드를 추가하는 것이고,
   * 오버라이딩은 조상으로부터 상속받은 메서드의 내용을 변경하는 것이다.
   *
   * 1. 오버로딩(overloading) : 기존에 없는 새로운 메서드를 정의하는 것이다. → new
   * 2. 오버라이딩(Overriding) : 상속받은 메서드의 구현부를 자신에 맞게 재정의하는 것이다. → modified
   *
   *
   * 아래의 코드를 보고 오버로딩과 오버라이딩을 구별할 수 있어야 한다.
   *
   * class Parent {
   *   void parentMethod() {}
   * }
   *
   * class Child {
   *   void parentMethod() {} //오버라이딩
   *   void parentMethod(int i) {} //오버로딩
   *
   *   void childMethod() {}
   *   void childMethod(int i) {} //오버로딩
   *   void childMethod() {} //에러 발생. 메서드를 중복 정의하였다.
   * }
   *
   *
   * */

}
