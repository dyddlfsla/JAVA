package chapter.eight._06;

public class Chapter08_06 {

  /** ◆ 예외의 발생과 catch 블럭
   *
   * catch 블럭은 괄호() 와 블럭{} 두 부분으로 나눠져 있는데, 괄호() 내에는 처리하고자 하는 예외와 같은 타입의 참조변수 하나를 선언해야 한다.
   * 예외가 발생하면, 발생한 예외에 해당하는 클래스의 인스턴스가 만들어진다. 앞선 예제에서 ArithmeticException 이 발생했으므로 ArithmeticException 인스턴스가 생성된다.
   * 예외가 발생한 문장이 try 블럭에 포함되어 있다면, 이 예외를 처리할 수 있는 catch 블럭이 있는지 찾게 된다.
   *
   * 첫 번째 catch 블럭부터 차례로 내려가면서 catch 블럭의 괄호() 내에 선언된 참조변수의 종류와 생성된 예외 클래스의 인스턴스에 instanceof 연산자를 이용해서 검사하게 되는데,
   * 검사 결과가 true 인 catch 블럭을 만날 때까지 검사는 계속된다.
   * 검사 결과가 true 인 catch 블럭을 찾게 되면 블럭에 있는 문장들을 모두 수행한 후에 try-catch 문을 빠져나가고 예외는 처리되지만, 검사 결과가 true 인 catch 블럭이
   * 하나도 없으면 예외는 처리되지 않는다.
   *
   * 모든 예외 클래스는 Exception 클래스의 자손이므로, catch 블럭의 괄호() 에 Exception 클래스 타입의 참조변수를 선언해 놓으면
   * 어떤 종류의 예외가 발생하더라도 이 catch 블럭에 의해서 처리될 것이다.
   *
   * */

}

class Ex8_3 {

  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(2);
    Object obj1 = new Object();

    try {
      System.out.println(3);
      System.out.println(0/0); //ArithmeticException 발생.
      System.out.println(4); //실행되지 않는다.
    } catch (Exception e) { //ArithmeticException 클래스의 인스턴스는 Exception 클래스의 자식이므로 Exception 타입으로 형변환 될 수 있으며
      System.out.println(5);// ArithmeticException instanceof Exception  의 결과는 true 가 될 것이다.
    }
    System.out.println(6);
  }

}

class Ex8_4 {

  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(2);
    try {
      System.out.println(3);
      System.out.println(0/0);
      System.out.println(4); //실행되지 않음.
    } catch (ArithmeticException ae) {
      if (ae instanceof ArithmeticException) {
        System.out.println("true");
      }
      System.out.println("ArithmeticException");
    } catch (Exception e) {
      System.out.println("Exception");
    }
    System.out.println(6);//1, 2, 3, true, ArithmeticException, 6
  }

  /*
  * 위의 예제에서는 두 개의  catch 블럭, ArithmeticException 타입의 참조변수를 선언한 것과 Exception 타입의 참조변수를 선언한 것을 사용하였다.
  * try 블럭에서 ArithmeticException 이 발생하였으므로 catch 블럭을 하나씩 차례로 검사하게 되는데, 첫 번째 검사에서 일치하는 catch 블럭을 찾았기 때문에
  * 두 번째 catch 블럭은 검사하지 않게 된다. 만일 try 블럭에서 ArithmeticException 이 아닌 다른 종류의 예외가 발생한 경우에는 첫 번째 catch 블럭에서는 false 가
  * 나왔을 것이고 두 번째 catch 블럭에서 처리되었을 것이다. 이처럼, try-catch 문 마지막에 Exception 타입의 참조변수를 선언한 catch 블럭을 사용하면,
  * 어떤 종류의 예외가 발생하더라도 이 catch 블럭에 의해 처리되도록 할 수 있다.
  *
  *
  *
  *
  * */
}
