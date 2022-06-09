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
   *
   *
   *
   *
   * */

}
