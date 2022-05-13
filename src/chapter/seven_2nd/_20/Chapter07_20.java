package chapter.seven_2nd._20;

public class Chapter07_20 {

  /** ◆ abstract - 추상의, 미완성의
   *
   * abstract 는 '미완성의' 의 의미를 가지고 있다. 메서드의 선언부만 작성하고 실제 수행 내용은 구현하지 않은 추상 메서드를 선언하는데 사용한다.
   * 그리고 클래스에 사용되어 해당 클래스 내에 추상 메서드가 존재한다는 것을 알려줄 수 있다.
   *
   * 제어자 abstract 가 사용될 수 있는 곳 → 클래스, 메서드
   *
   * 1. abstract 클래스 : 클래스 내에 추상 메서드가 선언되어 있음을 의미한다.
   * 2. abstract 메서드 : 선언부만 작성하고 구현부는 작성되지 않은 추상 메서드임을 의미한다.
   *
   * 추상 클래스는 아직 완성되지 않은 메서드가 존재하는 '미완성 설계도' 이므로 인스턴스를 생성할 수 없다.
   *
   * */
  public static void main(String[] args) {
    //AbstractTest abstractTest = new AbstractTest(); 에러 발생
  }
}

abstract class AbstractTest { //추상 클래스 (추상 메서드를 가지고 있는 클래스)
  abstract void move(); //추상 메서드(선언부만 있고 구현부는 작성되지 않은 메서드)
}


