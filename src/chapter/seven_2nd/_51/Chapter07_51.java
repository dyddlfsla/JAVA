package chapter.seven_2nd._51;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter07_51 {

  /** ◆ 익명 클래스 (Anonymous class)
   *
   * 이제 마지막으로 익명 클래스에 대해서 알아보자. 익명 클래스는 특이하게도 다른 내부 클래스들과 달리 이름이 없다. 클래스의 선언과 객체의 생성
   * 을 동시에 하기 때문에 단 한번만 사용될 수 있고 오직 하나의 객체만을 생성할 수 있는 일회용 클래스이다.
   *
   * new [조상클래스이름]() {
   *   //멤버 선언
   * }
   *
   * new [구현인터페이스이름]() {
   *   //멤버 선언
   * }
   *
   * 이름이 없기 때문에 생성자도 가질 수 없으며, 조상 클래스의 이름이나 구현하고자 하는 인터페이스의 이름을 사용해서 정의하기 때문에 하나의 클래스로 상속받는 동시에
   * 인터페이스를 구현하거나 둘 이상의 인터페이스를 구현할 수 없다. 오로지 단 하나의 클래스를 상속받거나 단 하나의 인터페이스를 구현할 수 있다.
   *
   * 익명 클래스는 구문이 다소 생소하지만, 인스턴스 클래스를 익명 클래스로 바꾸는 연습을 몇 번 해보면 곧 익숙해질 것이다.
   * */

}

class Ex7_17 {
  Object iv = new Object() {void method() {}}; //익명 클래스
  static Object cv = new Object() {void method() {}}; //익명 클래스

  void method() {Object lv = new Object() {};} //익명 클래스

  /*
  * 위의 예제는 단순히 익명 클래스의 사용 예를 보여 준 것이다. 이 예제를 컴파일하면 다음과 같이 4개의 클래스 파일이 생성된다.
  * Ex7_17.class
  * Ex7_17$1.class ← 익명 클래스
  * Ex7_17$2.class ← 익명 클래스
  * Ex7_17$3.class ← 익명 클래스
  *
  *
  * */
}

class Ex7_18 {

  public static void main(String[] args) {
    Button b = new Button("Start");
    b.addActionListener(new EventHandler());

  }
}

class EventHandler implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("ActionEvent occurred!!");
  }
}

class Ex7_19 {

  public static void main(String[] args) {
    Button b = new Button("Start");
    b.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent Occurred!!");
      }
    });
  }
}

/*
* Ex7_18 의 내용을 익명 클래스를 적용해 변경한 것이 Ex7_19 이다. 먼저 두 개의 독립된 클래스를 작성한 다음에,
* 익명 클래스를 이용해 변경하면 보다 쉽게 코드를 작성할 수 있을 것이다.
*
*
* */
