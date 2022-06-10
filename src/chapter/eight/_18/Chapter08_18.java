package chapter.eight._18;

public class Chapter08_18 {

  /** ◆ 연결된 예외 (chained exception)
   *
   * 한 예외가 다른 예외를 발생시킬 수도 있다. 예를 들어 예외 A 가 예외 B 를 발생시켰다면, A를 B 의 '원인 예외(cause exception)' 라고 한다.
   * 아래의 코드는 앞선 예제를 일부 변형한 것이다. SpaceException 을 원인 예외로 하는 InstallException 을 발생시키는 것을 보여준다.
   *
   * try {
   *   startInstall(); //SpaceException 발생
   *   copyFiles();
   * } catch (Exception e) {
   *   InstallException ie = new InstallException("설치 중 예외발생"); //예외 생성
   *   ie.initCause(e); e 는 SpaceException 의 인스턴스이다. //ie 의 원인 예외를 SpaceException 으로 지정한다.
   *   throw ie; //InstallException 을 발생시킨다.
   * } catch (MemoryException me) {
   *   ...
   * }
   *
   * 먼저 InstallException 을 생성한 후에, initCause() 로 SpaceException 을 InstallException 의 원인 예외로 등록한다.
   * 그리고 'throw' 로 이 예외를 던진다. initCause() 는 Exception 클래스의 조상인 Throwable 클래스에 정의되어 있기 떄문에
   * 모든 예외에서 사용 가능하다.
   *
   * ① Throwable initCause(Throwable cause) : 지정한 예외를 원인 예외로 등록
   * ② Throwable getCause() : 원인 예외를 반환
   *
   * 발생한 예외를 그냥 처리하면 될 텐데, 왜 원인 예외로 등록해서 다시 예외를 발생시키는지 궁금할 것이다. 그 이유는 여러가지 예외를
   * 하나의 큰 분류의 예외로 묶어서 다루기 위해서이다. 그렇다고 InstallException 을 SpaceException 과 MemoryException 의 조상으로
   * 해서 catch 블럭을 작성하면, 실제로 발생한 예외가 어떤 것인지 알 수 없다는 문제가 생긴다. 그리고 SpaceException 과
   * MemoryException 의 상속 관계를 변경해야 한다는 것도 부담이다.
   *
   * try {
   *   startInstall(); //SpaceException 발생
   * }
   *
   *
   *
   * */
}

