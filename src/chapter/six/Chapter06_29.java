package chapter.six;

public class Chapter06_29 {

  /** ◆ 메서드 간의 호출과 참조
   *
   * 같은 클래스에 속한 멤버들 간에는 별도의 인스턴스를 생성하지 않고도 서로 참조 또는 호출이 가능하다.
   * 단, 클래스 멤버가 인스턴스 멤버를 참조 또는 호출하고자 하는 경우에는 인스턴스를 생성해야 한다.
   *
   * 그 이유는 "인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재하지만, 반대로 클래스 멤버가 존재하는 시점
   * 에는 인스턴스 멤버가 존재하지 않을수도 있기 때문"이다.
   *
   *  class TestClass{
   *
   *    void instanceMethod(){} //인스턴스 메서드
   *    static void staticMethod(){} //static 메서드
   *
   *    void instanceMethod2(){
   *      instanceMethod(); //인스턴스 메서드에서 또 다른 인스턴스 메서드를 호출한다.
   *      staticMethod(); // 인스턴스 메서드에서 static 메서드를 호출한다.
   *    }
   *
   *    static void staticMethod2() {
   *      instanceMethod(); //에러 발생. static 메서드는 인스턴스 메서드를 호출할 수 없다.
   *      staticMethod(); //같은 static 메서드는 호출할 수 있다.
   *    }
   *
   *
   *  }
   *
   * 변수와 메서드간의 호출 관계에서도 마찬가지이다. 인스턴스메서드는 같은 인스턴스 변수를 호출할 수 있지만
   * 클래스메서드는 인스턴스 변수를 호출할 수 없다.
   *
   *  class TestClass2{
   *    int iv; //인스턴스 변수
   *    static int cv; //클래스 변수
   *
   *    void instanceMethod(){
   *      System.out.println(iv);//인스턴스 메서드는 인스턴스 변수를 호출할 수 있다.
   *      System.out.println(cv);//인스턴스 메서드는 클래스 변수 역시 호출할 수 있다.
   *    }
   *
   *    static void staticMethod() {
   *      System.out.println(iv); //클래스 메서드는 인스턴스 변수를 호출할 수 없다.
   *      System.out.println(cv); //클래스 메서드는 같은 클래스변수를 호출할 수 없다.
   *    }
   *
   *    메서드와 변수들 간의 호출에서 중요한 것은 어떤 대상을 사용하려고 할때 그 대상이 이미 생성되어서 사용 가능한 상태인지
   *    아닌지인 것이다. 인스턴스 멤버는 인스턴스가 생성될 때 같이 생성되므로 생성시기가 클래스 멤버보다 늦을 수 밖에 없다.
   *    따라서 인스턴스 멤버가 존재할때는 클래스 멤버가 항상 존재하지만 클래스 멤버가 존재할 때는 인스턴스 멤버가 없을수도 있는 것이다.
   *    그렇기 때문에 클래스 멤버가 인스턴스 멤버를 호출하려고 할 때 에러가 발생하는 것이다.
   *
   *  }
   *
   * */

}
