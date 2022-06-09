package chapter.eight._15;

public class Chapter08_15 {
  /** ◆ 사용자 정의 예외 만들기
   *
   * 기존에 정의된 예외 클래스 외에 필요에 따라 프로그래머가 새로운 예외 클래스를 정의하여 사용할수 있다. 보통 Exception 클래스 또는
   * RuntimeException 클래스로부터 상속받는 클래스를 만들지만, 이 또한 알맞은 예외 클래스를 선택할 수 있다.
   *
   * class MyException extends Exception {
   *   MyException (String msg) {
   *     super(msg); //조상인 Exception 클래스의 생성자를 호출한다.
   *   }
   * }
   *
   * Exception 클래스로부터 상속받아서 MyException 클래스를 만들었다. 필요하다면, 멤버변수나 메서드를 추가할 수 있다. Exception 클래스는
   * 생성 시에 String 값을 받아서 메시지로 저장할 수 있다. 여러분이 만든 사용자 정의 클래스도 메시지를 저장할 수 있으려면, 위에서 보는 것과 같이
   * String 을 매개변수로 받는 생성자를 추가해주어야 한다.
   *
   * class MyException extends Exception {
   *   private final int ERR_CODE;
   *
   *   MyException(String msg, int errCode) {
   *     super(msg);
   *     ERR_CODE = errCode;
   *   }
   *
   *   MyException(String msg) {
   *     this(msg, 100); //ERR_CODE 값을 100으로 초기화한다.
   *   }
   *
   *   public int getErrCode() {
   *     return ERR_CODE;
   *   }
   * }
   *
   * 이전의 코드를 좀 더 개선하여 메시지뿐만 아니라 에러코드 값도 저장할 수 있도록 ERR_CODE 와 getErrCode() 를 MyException 클래스의 멤버로 추가했다.
   * 이렇게 함으로써 에러코드와 메세지를 모두 얻을 수 있을 것이다.
   * 기존의 예외 클래스는 주로 Exception 을 상속받아서 'checked 예외' 로 작성하는 경우가 많았지만, 요즘은 예외처리를 선택적으로 할 수 있도록
   * RuntimeException 을 상속받아서 작성하는 쪽으로 바뀌어가고 있다. 'checked 예외'는 반드시 예외 처리를 해주어야 하기 때문에
   * 예외 처리가 불필요한 경우에도 try-catch 문을 넣어서 코드가 복잡해지기 때문이다.
   *
   *
   * */

}
