package chapter.eight.exercise;

public class Ex8_3 {
  /*

  * sol: ④
  *
  * 오버라이딩의 조건 중 예외에 대한 조건은 다음과 같다.
  * 자식 클래스에서 오버라이딩 할 때 부모 메서드보다 더 많은 예외를 선언할 수 없다는 것이다.
  * 현재 상태를 보면 부모 메서드에는 InvalidNumberException, NotANumberException 등 총 2개의 예외가 선언되어 있다.
  *
  * void add(int a, int b) throws InvalidNumberException, NotANumberException {}
  *
  * ① : 부모 메서드와 같이 2개의 예외가 선언되어 있으므로 가능한 오버라이딩이다.
  * ② : 부모 메서드보다 적은 1개의 예외가 선언되어 있으므로 가능한 오버라이딩이다.
  * ③ : 부모 메서드보다 적은 1개의 예외가 선언되어 있으므로 가능한 오버라이딩이다.
  * ④ : 자식 메서드에 Exception 이 예외로 선언되어 있는데 이것은 잘못된 것이다. 이 경우 Exception 클래스의 자손들까지 예외 범위에 포함되게 되므로
  *     부모 메서드보다 훨씬 많은 예외를 선언하게 되는 것이다. 따라서 잘못된 오버라이딩이다.
  * ⑤ : throws NumberException {} 인 경우 NumberException 의 자식들만 예외에 포함하는 것으로 부모 메서드와 같은 수의 예외를 선언한 것이다.
  *     따라서 가능한 오버라이딩이다.
  *
  *
  *
  * */


}

