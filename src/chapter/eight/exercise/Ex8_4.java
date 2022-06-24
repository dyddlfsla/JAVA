package chapter.eight.exercise;

public class Ex8_4 {

  /*
  * sol:
  *
  * catch 문에 return; 이 있다면 finally 블럭까지만 실행한 후 메소드가 종료된다.
  * 1
  * 3
  * 5
  * 6
  * 1
  * 2
  * 5
  * 6
  *
  *
  *
  *
  * */

  static void method(boolean b) {
    try {
      System.out.println(1);
      if (b) {
        throw new ArithmeticException();
      }
      System.out.println(2);
    } catch (RuntimeException r) {
      System.out.println(3);
      return;
    } finally {
      System.out.println(5);
    }
    System.out.println(6);
  }

  public static void main(String[] args) {
    method(true);
    method(false);
  }
}
