package chapter.twelve._25;

public class Chapter12_25 {

  /*
  * ◆ @Override
  *
  * 메서드 앞에만 붙일 수 있는 애너테이션으로, 조상의 메서드를 오버라이딩하는 것이라는 정보를 컴파일러에게 알려주는 역할을 한다. 아래의 코드에서처럼
  * 오버라이딩 할 때 실수로 조상 메서드의 이름을 잘못 적어도 컴파일러는 이것이 잘못된 것인지 알지 못한다.
  *
  * class Parent {
  *   void parentMethod() {...}
  * }
  *
  * class child extends Parent {
  *   void parentmethod() {...}
  * }
  *
  * 오버라이딩할 때는 이처럼 메서드의 이름을 잘못 적는 경우가 많은데, 컴파일러는 그저 새로운 이름의 메서드가 추가된 것으로 인식할 뿐이다.
  * 게다가 실행 시에도 오류가 발생하지 않고 조상의 메서드가 호출되므로 어디서 잘못되었는지 알아내기도 힘들다.
  *
  * class child extends Parent {
  *   @Override
  *   void parentmethod() {...} // 컴파일러가 경고 메세지를 띄움.
  * }
  *
  * 그러나 위의 코드처럼 메서드 앞에 @Override 를 붙이면, 컴파일러가 같은 이름의 메서드가 조상 클래스에 있는지 확인하고 없다면, 에러 메세지를 출력한다.
  * 오버라이딩 할 때 메서드 앞에 '@Override' 를 붙이는 것이 필수 문법은 아니지만, 개발자의 실수를 방지할 수 있으므로 반드시 붙이는 습관을 들이는 것이 좋다.
  *
  *
  *
  *
  *
  *
  * */

}

class Parent {

  void parentMethod() {

  }
}

class Child extends Parent {

  @Override
  void parentMethod() {

  }
}
