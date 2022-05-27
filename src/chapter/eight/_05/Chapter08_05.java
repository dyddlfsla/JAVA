package chapter.eight._05;

public class Chapter08_05 {

  /** ◆ try - catch 문에서의 흐름
   *
   * try - catch 문에서, 예외가 발생한 경우와 발생하지 않았을 때 흐름이 달라진다.
   *
   * 1. try 블럭 내에서 예외가 발생한 경우,
   * - 발생한 예외와 일치하는 catch 블럭이 있는지 확인한다.
   * - 일치하는 catch 블럭을 찾게되면, 그 catch 블럭 내의 문장들을 수행하고 전체 try - catch 문을 빠져나가서 그 다음 문장을 계속해서 수행한다.
   *   만일 일치하는 catch 블럭을 찾지 못한 경우, 예외는 처리되지 못하며 JVM 의 예외처리기가 예외를 받고 해당 내용을 표시한다.
   *
   * 2. try 블럭 내에서 예외가 발생하지 않은 경우,
   * - catch 블럭을 거치지 않고 전체 try - catch 블럭을 빠져나가서 수행을 계속한다.
   *
   *
   * */

}

class Ex8_1 {
  public static void main(String[] args) {
    System.out.println(1);
    try {
      System.out.println(2);
      System.out.println(3);
    } catch (Exception e) {
      System.out.println(4); //try-catch 문에서 catch 블럭은 try 블럭 수행 중 예외가 발생했을 때 해당 예외의 종류에 맞는 catch 블럭이 수행되는 것이다.
                             // 따라서 예외가 발생하지 않는다면 catch 블럭 역시 수행되지 않는다.
    }
  }
}

class Ex8_2 {

  public static void main(String[] args) {
    System.out.println(1);
    try {
      System.out.println(0/0); // 0 으로 나누어서 고의로 ArithmeticException 을 발생시킨다.
      System.out.println(2); //문장 수행 중 에러가 발생되면 바로 catch 블럭을 찾아 수행하므로 에러에 해당되는 문장 아래로는 수행되지 않는다. (2는 나오지 않음.)
    } catch (ArithmeticException e) {
      System.out.println(3);
    }
    System.out.println(4);
  }

}
