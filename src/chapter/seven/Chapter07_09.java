package chapter.seven;

public class Chapter07_09 {

  /** ◆ 오버로딩 vs. 오버라이딩
   *
   * 오버로딩과 오버라이딩은 서로 혼동하기 쉽지만 사실 그 차이는 명백하다. 오버로딩은 기존에 없는 새로운 메서드를 추가하는 것이고
   * 오버라이딩은 조상으로부터 상속받은 메서드의 내용을 변경하는 것이다.
   *
   *  ※ 오버로딩(overloading) : 기존에 없는 '새로운' 메서드를 정의한다. (new)
   *  ※ 오버라이딩(overriding) : 상속 받은 메서드의 내용을 '변경' 한다. (change, modify)
   *
   *  class Parent {
   *    void parentMethod() {
   *
   *    }
   *  }
   *
   *  class Child {
   *    void parentMethod() {} //오버라이딩
   *    void parentMethod(int i) {} //오버로딩
   *
   *    void childMethod() {}
   *    void childMethod(int i) {} //오버로딩
   *    void childMethod() {} //에러. 이미 정의된 메서드가 존재함.
   *  }
   * */

}
