package chapter.seven._45;

public class Chapter07_45 {

  /** ◆ 내부 클래스의 제어자와 접근성
   *
   * 아래 코드에서 인스턴스 클래스(InstanceInner) 와 스태틱 클래스(StaticInner)는 외부 클래스(Outer)의 멤버변수(인스턴스 변수와 클래스 변수)와
   * 같은 위치에 선언되며, 또한 멤버변수와 같은 성질을 갖는다. 따라서 내부 클래스가 외부 클래스의 멤버와 같이 간주되고,
   * 인스턴스 멤버와 static 멤버 간의 규칙이 내부 클래스에도 똑같이 적용된다.
   *
   *  class Outer {
   *    private int iv = 0;
   *    protected static int cv = 0;
   *
   *    void myMethod() {
   *      int lv = 0;
   *    }
   *  }
   *
   *       ↓
   *
   *  class Outer {
   *    private class InstanceInner {}
   *    protected static class StaticInner {}
   *
   *    void myMethod() {
   *      class LocalInner {}
   *    }
   *  }
   *
   *  그리고 내부 클래스도 클래스이기 때문에 abstract 나 final 같은 제어자를 사용할 수 있을 뿐만 아니라, 멤버변수들처럼
   *  private, protected 와 같은 접근제어자도 사용이 가능하다.
   *
   *
   * */

}
