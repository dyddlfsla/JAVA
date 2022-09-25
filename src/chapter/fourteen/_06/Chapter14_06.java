package chapter.fourteen._06;

public class Chapter14_06 {


  /*
  * ◆ 함수형 인터페이스 타입의 매개변수, 반환타입
  *
  * 함수형 인터페이스 MyFunction 이 아래와 같이 정의되어 있을 때,
  *
  * @FunctionalInterface
  * interface MyFunction {
  *   void myMethod(); //추상 메서드
  * }
  *
  * 메서드의 매개변수가 MyFunction 타입이면, 이 메서드를 호출할 때 람다식을 참조하는 참조변수를 매개변수로 지정해야한다는 뜻이다.
  *
  * void aMethod(MyFunction f) { //매개변수 타입이 함수형 인터페이스이다.
  *   f.myMethod(); //MyFunction 에 정의된 메서드 호출
  * }
  *
  * MyFunction f = () -> System.out.println("myMethod()"); //람다식을 참조변수 f 에 저장.
  * aMethod(f);
  *
  * 또는 참조변수 없이 아래와 같이 직접 람다식을 매개변수로 지정하는 것도 가능하다.
  *
  * aMethod(() -> System.out.println("meMethod()")); //람다식을 직접 매개변수로 전달.
  *
  * 그리고 메서드의 반환타입이 함수형 인터페이스타입이라면, 이 함수형 인터페이스의 추상메서드와 동등한 람다식을 가리키는 참조변수를 반환하거나
  * 람다식 자체를 반환할 수 있다.
  *
  * MyFunction myMethod() {
  *   MyFunction f = () -> {...};
  *   return f; // 한 줄로 줄인다면, return () -> {...}
  * }
  *
  * 람다식을 참조변수로 다룰 수 있다는 것은 메서드를 통해 람다식을 주고 받을 수 있다는 것을 의미한다.
  * 즉, 변수처럼 메서드를 주고받는 것이 가능해지는 것이다.
  *
  * 사실, 람다식을 주고 받는 것은 자바 규칙으로 보았을 때는 익명 클래스를 구현한 객체를 주고 받는 것이기 때문에 근본적으로 달라진 것은 아무것도 없다.
  * 하지만 람다식 덕분에 코드가 더 간결하고 이해하기 쉬워진다.
  *
  * */
  static void execute(MyFunction function) { //매개변수 타입이 함수형 인터페이스타입이다.
    function.run();
  }

  static MyFunction getMethod() { //메서드의 반환타입이 함수형 인터페이스 타입이다.
    MyFunction function = () -> System.out.println("f3.run()");
    return function;
  }

  public static void main(String[] args) {
    MyFunction f1 = () -> System.out.println("f1.run()"); //람다식으로 MyFunction 의 run() 을 구현.

    MyFunction f2 = new MyFunction() { //익명 클래스로 run() 을 구현
      @Override
      public void run() { //외부에서 호출할 수 있도록 반드시 public 을 붙여야 함
        System.out.println("f2.run()");
      }
    };

    MyFunction f3 = getMethod();

    f1.run();
    f2.run();
    f3.run();

    execute(f1);
    execute(() -> System.out.println("run()"));
  }




}

@FunctionalInterface
interface MyFunction {

  void run(); // public abstract void run(); 추상 메서드 선언.

}