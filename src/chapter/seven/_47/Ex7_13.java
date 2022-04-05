package chapter.seven._47;

public class Ex7_13 {

  class InstanceInner {}
  static class StaticInner {}

  //인스턴스 멤버 간에는 서로 접근이 가능하다.
  InstanceInner instanceInner = new InstanceInner();
  //static 멤버 간에는 서로 접근이 가능하다
  static StaticInner staticInner = new StaticInner();

  static void staticMethod() {
    //static 메서드는 인스턴스 클래스에 직접 접근할 수 없다.
    //InstanceInner obj1 = new InstanceInner();
    //굳이 접근하려고 한다면 아래와 같이 객체를 먼저 생성한 후 접근해야 한다.
    //인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
    Ex7_13 ex7_13 = new Ex7_13();
    InstanceInner obj1 = ex7_13.new InstanceInner();

    //static 메서드는 자신과 똑같은 static 클래스에만 접근할 수 있다.
    StaticInner obj2 = new StaticInner();
  }

  void instanceMethod() {
    //인스턴스 메서드에서는 인스턴스 클래스와 스태틱 클래스 모두에 접근 가능하다.
    InstanceInner obj1 = new InstanceInner();
    StaticInner obj2 = new StaticInner();
    //메서드 내에 지역 클래스로 선언된 내부 클래스는 어디에서도 접근할 수 없다.
    //LocalInner localInner = new LocalInner();
  }

  void myMethod() {
    class LocalInner {}
    LocalInner localInner = new LocalInner();
  }

  /**
   * 인스턴스 멤버는 같은 클래스에 있는 인스턴스 멤버, static 멤버 모두에게 직접 호출이 가능하지만 static 멤버는
   * 인스턴스 멤버를 직접 호출할 수 없는 것처럼, 인스턴스 클래스는 외부 클래스의 인스턴스 멤버와 스태틱 멤버를 객체 생성 없이 바로 사용할 수 있고
   * 스태틱 클래스는 외부 클래스의 인스턴스 멤버를 객체 생성 없이 사용할 수 없다.
   *
   * 조금만 생각해보면 이것은 당연한 것이다. static 이라는 것은 해당 멤버를 객체로 만들기 이전에 클래스가 메모리가 로딩되는 순간부터
   * 존재한다는 뜻이다. 즉 static 멤버는 객체를 생성하지 않아도 그 이전부터 미리 존재하고 있는 것이다. 그러나 인스턴스 멤버는
   * 객체를 생성하는 순간부터 존재하게 된다. 그렇기 때문에 인스턴스 멤버가 존재할 때는 static 멤버가 항상 존재하지만 static 멤버가 존재할 때는
   * 인스턴스 멤버가 존재할 수도 있고 존재하지 않을 수도 있는 것이다. 따라서 인스턴스 멤버는 항상 존재하고 있는 static 멤버에 언제든지 접근할 수 있다.
   * 그러나 반대로 static 멤버는 존재 유무가 불확실한 인스턴스 멤버에 접근할 수 없다.
   * */

}
