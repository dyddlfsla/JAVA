package chapter.eight._09;

public class Chapter08_09 {

  /** ◆ 예외 발생시키기
   *
   * 키워드 throw 를 사용해서 프로그래머가 고의로 예외를 발생시킬 수 있으며, 방법은 아래의 순서를 따르면 된다.
   *
   * 1. 연산자 new 를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
   *     Exception e = new Exception("고의로 발생시켰음")
   *
   * 2. 키워드 throw 를 이용해서 예외를 발생시킨다.
   *     throw e;
   *
   *
   * */

}

class Ex8_6 {

  public static void main(String[] args) {
    try {
      Exception e = new Exception("고의로 발생시킴");
      throw e;
    } catch (Exception e) {
      System.out.println("에러 메시지 : " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println("프로그램이 정상적으로 종료되었음");
  }

  /*
  * Exception 인스턴스를 생성할 때 생성자에 String 을 넣어주면 이 String 이 Exception 인스턴스에 메시지로 저장된다.
  * 이 메시지는 getMessage() 를 이용해 얻을 수 있다.
  *
  * */
}
