package chapter.seven_2nd._48;

public class Outer {
  private int outerIv = 0;
  static int outerCv = 0;

  class InstanceInner { //외부 클래스의 인스턴스 멤버와 정적 멤버 모두 접근 가능하다.
    int iiv = outerIv;
    int iiv2 = outerCv;
  }

  static class StaticInner { //내부 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.

    //    int siv = outerIv;
    static int scv = outerCv;
  }

  void myMethod() {
    int Iv = 0;
    final int Lv = 0; //JDK 1.8 부터 final 생략 가능

    class LocalInner {
      int liv = outerIv;
      int liv2 = outerCv;
      //외부 클래스의 지역변수는 final 이 붙은 변수(상수)만 가능하다.
      int liv3 = Iv;
      int liv4 = Lv;
    }
  }

  /*
  * 내부 클래스에서 외부 클래스의 변수들에 대한 접근성을 보여주는 예제이다. 인스턴스 클래스(InstanceInner) 는 외부 클래스(Outer) 의 인스턴스 멤버이기 때문에 인스턴스 변수 outerIv 와 스태틱 변수 outerCv 모두 사용할 수 있다.
  * 심지어는 outerIv 의 접근 제어자가 private 일지라도 사용이 가능하다. 스태틱 클래스(StaticInner) 는 외부 클래스(Outer) 의 static 멤버이기 때문에  외부 클래스의 인스턴스 멤버인 outerIv 와 InstanceInner 를 사용할 수 없다.
  * 단지 static 멤버인 outerCv 만 사용할 수 있다.
  *
  * 지역 클래스(LocalInner) 는 외부 클래스의 인스턴스 멤버와 static 멤버 모두 사용할 수 있으며, 지역 클래스가 포함된 메서드에 정의된 지역 변수도 사용할 수 있다. 단 final 이 붙은 지역변수만 접근 가능한데
  * 이유는 메서드가 수행을 마쳐서 지역 변수가 소멸된 시점에도, 지역 클래스의 인스턴스가 소멸된 지역 변수를 참조하려는 경우가 발생할 수 있기 때문이다. JDK 1.8 부터 지역 클래스에서 접근하는 지역 변수 앞에 final 을 생략할 수 있게 바뀌었다.
  * 대신 컴파일러가 자동으로 붙여준다. 즉, 편의상 final 을 생략할 수 있게 한 것일 뿐 해당 변수의 값이 바뀌는 문장이 있으면 컴파일 에러가 발생한다. (상수이기 때문에)
  *
  *
  *
  *
  * */

}
