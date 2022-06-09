package chapter.eight._12;

public class Ex8_9 {

  public static void main(String[] args) throws Exception {
    method1();
  }

  static void method1() throws Exception {
    method2();
  }

  static void method2() throws Exception {
    throw new Exception();
  }

}

/**
 * 위 실행 결과를 보면 프로그램의 실행 도중 java.lang.Exception 이 발생하여 비정상적으로 종료했다는 것과
 * 예외가 발생했을 때 호출스택(call stack) 의 내용을 알 수 있다.
 *
 * 1) 예외가 발생했을 때, 모두 3개의 메서드(main, method1, method2) 가 호출스택에 있었으며,
 * 2) 예외가 발생한 곳은 제일 윗줄에 있는 method2() 라는 것과
 * 3) main 메서드가 method1()을, method1()가 method2()를 호출했다는 것을 알 수 있다.
 *
 * 위의 예제를 보면, method2() 에서 'throw new Exception();' 이라는 문장에 의해 예외가 강제적으로 발생했으나,
 * try-catch 문으로 예외 처리를 해주지 않았으므로 method2()는 종료되면서 예외를 자신을 호출한 method1() 에게 넘겨준다.
 * method1() 에서도 역시 예외처리를 해주지 않았으므로 종료되면서 해당 예외를 main 메서드에게 넘겨준다.
 * 그러나 main 메서드에서 조차 예외 처리를 해주지 않았으므로 main 메서드가 종료되어 프로그램이 예외로 비정상적으로 종료되는 것이다.
 *
 * 이처럼 예외가 발생한 메서드에서 예외 처리를 하지 않고 자신을 호출한 메서드에게 예외를 넘겨줄 수는 있지만, 이것은 예외 처리된 것이 아니라
 * 그저 예외를 단순히 전달만 하는 것이다. 결국 어느 한 곳에서는 반드시 try-catch 문으로 예외 처리를 해주어야 한다.
 *
 * public static void main(String[] args) throws Exception {
 *   method1();
 * }
 *
 * 메서드에 예외가 선언되어 있으면 Exception 과 같은 checked 예외를 try-catch 문으로 처리하지 않아도 컴파일 에러가 발생하지 않는다.
 *
 *
 *
 * */
