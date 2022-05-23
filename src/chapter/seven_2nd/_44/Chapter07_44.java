package chapter.seven_2nd._44;

public class Chapter07_44 {

  /** ◆ 내부 클래스의 선언
   *
   * 아래의 코드에는 외부 클래스(Outer) 에 3개의 서로 다른 종류의 내부 클래스가 선언되어 있다. 두 코드를 비교해보면 내부 클래스의 선언위치가 변수의 선언위치와 동일함
   * 을 알 수 있다. 변수가 선언된 위치에 따라 인스턴스 변수, 클래스 변수(static 변수), 지역 변수로 나뉘듯이 내부 클래스도 이와 마찬가지로 선언된 위치에 따라 나뉜다.
   * 그리고, 각 내부 클래스의 선언 위치에 따라 같은 선언 위치의 변수와 동일한 유효 범위(scope), 접근성(accessibility)을 갖는다.
   *
   * class Outer {
   *   int iv = 0;
   *   static int cv = 0;
   *
   *   void myMethod() {
   *     int lv = 0;
   *   }
   * }
   *        ↓
   *
   * class Outer {
   *   class InstanceInner {} //인스턴스 클래스, 인스턴스 변수와 같은 선언 위치
   *   static class StaticInner {}//스태틱 클래스, 스태틱 변수처럼 static 이 붙음
   *
   *   void myMethod() {
   *     class LocalInner {} //지역 클래스, 지역 변수처럼 메서드 안에 선언됨
   *   }
   * }
   *
   *  ◆ 내부 클래스의 제어자와 접근성
   *
   * 아래 코드에서 인스턴스 클래스(InstanceInner) 와 스태틱 클래스(StaticInner) 는 외부 클래스(Outer) 의 멤버변수(인스턴스 변수, 클래스 변수)와 같은 위치에 선언되며, 또한 멤버변수와 같은 성질을 갖는다.
   * 따라서 내부 클래스가 외부 클래스의 멤버와 같이 간주되고, 인스턴스 멤버와 static 멤버 간의 규칙이 내부 클래스에도 똑같이 적용된다.
   *
   * class Outer {
   *   private int iv = 0;
   *   protected static int cv = 0;
   *
   *   void myMethod() {
   *     int lv = 0;
   *   }
   * }
   *
   *         ↓
   *
   * class Outer {
   *   private class InstanceInner {}
   *   protected static class StaticInner {}
   *
   *   void myMethod() {
   *     class LocalInner {}
   *   }
   * }
   *
   * 그리고 내부 클래스도 클래스이기 때문에 abstract 나 final 과 같은 제어자를 사용할 수 있을뿐만 아니라, 멤버변수들처럼 private, protected 와 같은 접근 제어자도 사용이 가능하다.
   *
   *
   *
   *
   * */

}
