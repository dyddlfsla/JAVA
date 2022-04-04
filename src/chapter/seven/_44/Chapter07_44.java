package chapter.seven._44;

public class Chapter07_44 {

  /** ◆ 내부 클래스의 선언
   *
   * 아래의 코드에는 외부 클래스(Outer) 에 3개의 서로 다른 종류의 내부 클래스가 선언되어 있다. 코드를 비교해보면
   * 내부 클래스의 선언위치가 변수의 선언위치와 동일함을 알 수 있다.
   * 변수가 선언된 위치에 따라 인스턴스 변수, 클래스 변수(static 변수), 지역 변수로 나뉘듯이 내부 클래스도 이와 마찬가지로
   * 선언된 위치에 따라 나뉜다. 그리고, 각 내부 클래스의 선언위치에 따라 같은 위치에 선언되어 있는 변수와 동일한 유효범위(scope)
   * 와 접근성(accessibility)을 갖는다.
   *
   *    class Outer {
   *
   *      int iv = 0;
   *      static int cv = 0;
   *      void myMethod() {
   *        int iv = 0;
   *      }
   *    }
   *
   *    ↓
   *
   *    class Outer {
   *      class InstanceClass {
   *        //인스턴스 클래스
   *      }
   *      static class StaticInner {
   *        //static 클래스
   *      }
   *
   *      void myMethod() {
   *        class LocalInner{
   *          //지역 클래스
   *        }
   *      }
   *    }
   *
   * */

}

