package chapter.twelve._27;

public class Chapter12_27 {


  /*
  * ◆ @FunctionalInterface
  *
  * 함수형 인터페이스(Functional interface) 를 선언할 때, 이 애너테이션을 붙이면 컴파일러가 '함수형 인터페이스'를 올바르게 선언했는지
  * 확인하고, 잘못된 경우 에러를 발생시킨다. 문법적으로 필수인 애너테이션은 아니지만 실수를 방지할 수 있으므로 꼭 붙이는 습관을 들이도록 하자
  *
  * @FunctionalInterface
  * public interface Runnable {
  *   public abstract void run();
  * }
  *
  *
  * ◆ @SuppressWarnings
  *
  * 컴파일러가 보여주는 경고 메세지나 나타나지 않게 억제해준다. 이전 예제에서처럼 컴파일러의 경고 메세지는 무시하고 넘어갈 수도 있지만,
  * 모두 확인하고 해결해서 컴파일 후에 어떠한 메세지도 나타나지 않아야 한다.
  *
  * 그러나 때에 따라서는 경고가 발생할 것을 알면서도 묵인해야 할 때가 있는데, 이 경고를 그대로 놔두면 컴파일 할 때마다 메세지가 나타난다.
  * 이때에는 반드시 '@SuppressWarnings' 를 붙여서 어떤 경고 메세지도 나타나지 않게 해야 한다.
  *
  * 이 애너테이션을 통해 억제할 수 있는 경고는 종류가 몇 가지 정해져 있는데, JDK 의 버전이 올라갈수록 당연히 점점 늘어날 것이다.
  *
  * 억제하려는 경고 메세지를 애너테이션 뒤 괄호() 안에 문자열로 지정하면 된다.
  *
  * @SuppressWarnings("unchecked") // 제네릭스와 관련된 경고를 억제
  * ArrayList list = new ArrayList(); //제네릭 타입을 지정하지 않음
  * list.add(obj);
  *
  *
  *
  * */

}
