package chapter.six_2nd._23;

public class Chapter06_23 {

  /** ◆ 기본형 매개변수
   *
   * 자바에서는 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다. 매개변수의 타입이 기본형(primitive type) 일 때는
   * 기본형 값이 복사되겠지만, 참조형(reference type) 일이면 인스턴스의 주소가 복사된다. 메서드의 매개변수를 기본형으로 선언하면 단순히 저장된
   * 값만 얻지만, 참조형으로 선언하면 값이 저장된 곳의 주소를 알 수 있기 때문에 값을 읽어 오는 것은 물론 값을 변경하는 것도 가능하다.
   *
   *  - 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다. (read only)
   *  - 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다. (read & write)
만  *
   *
   * */

}

class Date {
  int x;
}

class Ex6_6 {

  public static void main(String[] args) {
    Date d = new Date();
    d.x = 10;
    System.out.printf("main() : x = %d%n", d.x);
    change(d.x);
    System.out.printf("After change(d.x)%n");
    System.out.printf("main() : x = %d%n", d.x);
  }

  private static void change(int x) { //기본형 매개변수
    x = 1000;
    System.out.printf("change() : x = %d%n", x);
  }

  /**
   * ① change 메서드가 호출되면서 'd.x' 가 change 메서드의 매개변수 x 에 복사됨.
   * ② change 메서드에서 x 의 값을 1000으로 변경
   * ③ change 메서드가 종료되면서 매개변수 x 는 스택에서 제거됨
   *
   * 'd.x' 의 값이 변경된 것이 아니라, change 메서드의 매개변수 x 의 값이 변경된 것이다. 즉, 원본이 아닌 복사본이 변경된 것이라
   * 원본에는 아무런 영향을 미치지 못한다. 이처럼 기본형 매개변수는 변수에 저장된 값을 읽을 수만 있을 뿐 변경할 수는 없다.
   * */
}
