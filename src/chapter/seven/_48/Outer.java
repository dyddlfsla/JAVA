package chapter.seven._48;

public class Outer {

  private int outerIv = 0;
  static int outerCv = 0;

  class InstanceInner {
    //외부 클래스의 private 멤버에게도 접근이 가능하다.
    int iiv = outerIv;
    int iiv2 = outerCv;

  }
  static class StaticInner {

//    int siv = outerIv; 스태틱 클래스는 외부 클래스의 인스턴스 멤버(outerIv)에 접근할 수 없다.
    static int scv = outerCv;
  }

  void myMethod() {
    int lv = 0;
    final int LV = 0; //JDK 1.8부터 final 생략 가능. 컴파일러가 자동으로 final 을 생성한다

    class LocalInner {

      int liv = outerIv;
      int liv2 = outerCv;
      //외부 클래스의 지역변수는 final 이 붙은 변수(상수)만 접근가능하다.
      int liv3 = lv; // JDK 1.8 이하라면 해당 문장은 에러 발생.
                     // 하지만 JDK 1.8부터는 컴파일러가 알아서 지역 클래스에서 접근하는 지역 변수 앞에 final 을 생성한다.
      int liv4 = LV; //OK.
    }
  }

  /*
  * 내부 클래스에서 외부 클래스의 변수들에 대한 접근성을 보여주는 예제이다. 인스턴스 클래스는 외부 클래스의 인스턴스 멤버이기 때문에
  * 인스턴스 변수 outerIv, outerCv 를 모두 사용할 수 있다. 심지어는 outerIv 의 접근 제어자가 private 일지라도 사용이 가능하다.
  *
  * 스태틱 클래스는 외부 클래스의 스태틱 멤버이기 때문에 외부 클래스의 인스턴스 멤버인 outerIv 와 InstanceInner 를 사용할 수 없다.
  * 단지, 같은 스태틱 멤버인 outerCv는 사용할 수 있다.
  *
  * 지역 클래스는 외부 클래스의 인스턴스 멤버와 스태틱 멤버 모두 사용할 수 있으며, 지역 클래스가 포함된 메서드에 정의된 지역 변수도 사용할 수 있다.
  * 단, final 이 붙은 지역 변수만 접근이 가능한데 그 이유는 메서드가 동작을 마치고 지역 변수가 소멸된 시점에도 지역 클래스의 인스턴스가
  * 소멸된 지역 변수를 참조하려는 경우가 발생할 수 있기 때문이다. JDK 1.8부터는 지역 클래스에서 접근하는 지역 변수 앞에 final 을
  * 생략할 수 있도록 바뀌었다. 컴파일러가 대신 final 을 붙여주는 것이다. 즉, 편의상 final 생략할 수 있는 것일뿐 해당 변수의 값을
  * 바꾸는 문장이 있다면 컴파일 에러가 발생한다.
  *
  * */

}
