package chapter.eight._08;

public class Chapter08_08 {

  /** ◆ 멀티 catch 블럭
   *
   * JDK 1.7 부터 여러 catch 블럭을 '|' 기호를 이용해서 하나의 catch 블럭으로 합칠 수 있게 되었으며, 이를 '멀티 catch 블럭' 이라 한다.
   * 아래의 코드에서 알 수 있듯이 '멀티 catch 블럭' 을 이용하면 중복된 코드를 줄일 수 있다. 그리고 '|' 기호로 연결할 수 있는
   * 예외 클래스의 개수에는 제한이 없다.
   *
   * try {
   *   ...
   * } catch (ExceptionA e) {
   *   e.printStackTrace()
   * } catch (ExceptionB e2) {
   *   e2.printStackTrace()
   * }
   *
   *          ↓
   *
   * try {
   *   ...
   * } catch (ExceptionA | ExceptionB e) {
   *   e.printStackTrace()
   * }
   *
   * 만일 멀티 catch 블럭의 '|' 기호로 연결된 예외 클래스가 조상과 자손의 관계에 있다면 컴파일러 에러가 발생한다.
   *
   *
   * try {
   *   ...
   * } catch (ParentException | ChildException e) { // 에러 발생.
   *
   * } catch (ParentException e) { //멀리 블럭 안의 예외 클래스들이 조상 - 자손 관계라면 멀티 블럭의 의미 자체가 없으므로 컴파일 에러가 발생한다.
   *
   * }
   *
   * 두 예외 클래스가 조상-자손 관계에 있다면, 그냥 조상 클래스만 써주는 것과 사실상 똑같기 떄문이다.
   * 그리고 멀티 catch 블럭은 하나의 catch 블럭으로 여러 예외를 처리하는 것이기 때문에, 발생한 예외를 멀티 catch 블럭으로 처리하게 되었을 때,
   * 멀티 블럭 내에서 실제로 어떤 예외가 발생한 것인지 알 수 없다. 그래서 참조변수 e 로 멀티 catch 블럭에 '|' 기호로 연결된 예외 클래스들의
   * 공통분모인 조상 예외 클래스에 선언된 멤버만 사용할 수 있다.
   *
   * try {
   *   ...
   * } catch (ExceptionA | ExceptionB e) {
   *   e.methodA(); // 에러 발생. ExceptionA 에 선언된 methodA() 사용 불가
   *   if (e instanceof ExceptionA) {
   *     ExceptionA e1 = (ExceptionA) e;
   *     e1.methodA(); //형변환 한 후에 해당 멤버를 사용할 수 있다.
   *   }
   * }
   * */

}
