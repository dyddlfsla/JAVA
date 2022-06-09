package chapter.eight._14;

public class Chapter08_14 {

  /** ◆ finally 블럭
   *
   * finally 블럭은 예외의 발생 여부에 상관없이 실행되어야 할 코드를 작성하기 위해 사용된다. try-catch 문의 끝에 선택적으로
   * 덧붙여 사용할 수 있으며, try-catch-finally 의 순서로 구성된다.
   *
   * try {
   *   ...
   * } catch (Exception e1) {
   *   ...
   * } finally {
   *   // 예외와 관계없이 항상 실행되어야 하는 문장들을 넣는다.
   *   // finally 블럭은 try-catch 문의 맨 마지막에 위치해야 한다.
   * }
   *
   * 예외가 발생한 경우에는 try-catch-finally 순으로 실행되고, 예외가 발생되지 않은 경우에는 'try-finally' 의 순으로 실행된다.
   * 아래와 같이 프로그램을 설치하는 코드가 있을 때, 설치를 정상적으로 마쳐도 임시파일을 삭제해야 하고 중간에 예외가 발생해도 임시파일을 삭제해야 한다.
   *
   * try {
   *   startInstall(); //프로그램 설치에 필요한 준비를 한다.
   *   copyFiles(); //파일들을 복사한다.
   *   deleteTempFiles(); //프로그램 설치에 사용된 임시파일들을 삭제한다.
   * } catch (Exception e) {
   *   e.printStackTrace();
   *   deleteTempFiles(); //임시 파일을 삭제한다.
   * }
   *
   * 이럴 때 위처럼 try 블럭과 catch 블럭 모두에 deleteTempFiles() 코드를 넣기보다는 아래와 같이 finally 블럭에 넣는 것이 낫다.
   *
   * try {
   *   startInstall();
   *   copyFiles();
   * } catch (Exception e) {
   *   e.printStackTrace();
   * } finally {
   *   deleteTempFiles();
   * }
   *
   * ※ try 블럭 안에 return 문이 있어서 try 블럭을 벗어날 때 finally 블럭이 생성된다.
   *
   * */

}
