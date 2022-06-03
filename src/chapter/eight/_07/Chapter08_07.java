package chapter.eight._07;

public class Chapter08_07 {

  /** ◆ printStackTrace() 와 getMessage()
   *
   * 예외가 발생했을 때 생성되는 예외 클래스의 인스턴스에는 발생한 예외에 대한 정보가 담겨 있으며, getMessage() 와 printStackTrace()
   * 를 통해서 이 정보들을 얻을 수 있다. catch 블럭의 괄호() 에 선언된 참조변수를 통해 이 인스턴스에 접근할 수 있다. 이 참조변수는
   * 선언된 catch 블럭 내에서만 사용 가능하며, 자주 사용되는 메서드는 다음과 같다.
   *
   * 1. printStackTrace() : 예외 발생 당시의 호출스택(Callstack) 에 있었던 메서드의 정보와 예외 메세지를 화면에 출력한다.
   * 2. getMessage(): 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
   *
   * */
}

class Ex8_5 {

  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(2);

    try {
      System.out.println(3);
      System.out.println(0 / 0);
      System.out.println(4);
    } catch (ArithmeticException ae) {
      ae.printStackTrace(); //참조변수 ae 를 통해 생성된 ArithmeticException 인스턴스에 접근할 수 있다.
      System.out.println("예외 메시지 : " + ae.getMessage());
    }
    System.out.println(6);
  }

  /*
  * 위 예제의 결과는 예외가 발생해서 비정상적으로 종료되었을 때의 결과와 비슷하지만 예외는 try-catch 문에 의해 처리되었으며 프로그램은 정상적으로 종료되었다.
  * 그 대신 ArithmeticException 인스턴스의 printStackTrace() 를 사용해서, 호출스택 (callStack) 에 대한 정보와 예외 메세지를 출력하였다.
  * 이처럼 try-catch 문으로 예외 처리를 하여 예외가 발생해도 비정상적으로 종료하지 않도록 해주는 것과 동시에, printStackTrace() 또는
  * getMessage() 와 같은 메서드를 통해서 예외의 발생 원인을 알 수 있다.
  *
  *
  * */
}
