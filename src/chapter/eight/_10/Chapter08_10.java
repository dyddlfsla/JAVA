package chapter.eight._10;

public class Chapter08_10 {
  /** ◆ checked 예외, unchecked 예외
   *
   * */
}

class Ex8_7 {

  public static void main(String[] args) {
//    throw new Exception(); // Exception 을 고의로 발생시킨다.
  }
  /*
  * 이 예제의 경우, 작성한 후 컴파일하게 되면 위와 같은 에러가 발생하며 컴파일이 완료되지 않는다.
  * 예외 처리가 되어 있지 않다는 에러이다. 위의 결과에서 알 수 있는 것처럼, 앞서 본 것처럼
  * 'Exception 클래스와 그 자손들(checked 예외)' 이 발생할 가능성이 있는 문장들에 대해 예외 처리를 해주지 않으면
  * 컴파일조차 되지 않는다.
  *
  * */
}

class Ex8_8 {

  public static void main(String[] args) {
    throw new RuntimeException(); // RuntimeException 을 고의로 발생시킨다.
  }
  /*
  * 이 예제는 예외처리를 하지 않았음에도 불구하고 이전의 예제와는 달리 성공적으로 컴파일 될 것이다. 그러나 실행하면,
  * RuntimeException 이 발생하여 비정상적으로 프로그램이 종료될 것이다. 이 예제가 명백히 RuntimeException 을 발생시키는 코드를
  * 가지고 있고, 이에 대한 예외 처리를 하지 않았음에도 불구하고 성공적으로 컴파일 되었다. 이 장의 앞부분에서 설명한 것과 같이,
  * 'RuntimeException 클래스와 그 자손들(unchecked 예외)' 에 해당하는 예외는 프로그래머의 실수로 발생하는 것들이기 때문에
  * 예외 처리를 강제하지 않는다. 만일 RuntimeException 클래스들에 속하는 예외가 발생할 가능성이 있는 코드에도 예외처리를 강제한다면,
  * 아래와 같이 참조변수와 배열이 사용되는 모든 곳에 예외 처리를 해야할 것이다.
  *
  * try {
  *   int[] arr = new int[10];
  *   System.out.println(arr[0]);
  * } catch (IndexOfBoundsException ie) { //RuntimeException 에 대해서도 예외처리를 강제했다면
  *                                       //배열을 다룰 때 발생할 수 있는 모든 예외에 대해 처리를 해야할 것이다.
  *   ...
  * } catch (NullPointerException ne) {
  *   ...
  * }
  * */

}


