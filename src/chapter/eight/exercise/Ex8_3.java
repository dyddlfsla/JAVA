package chapter.eight.exercise;

public class Ex8_3 {
  /*

  * sol: ④, ⑤
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
  * ④ X ︎: 자식 메서드에 Exception 이 예외로 선언되어 있는데 이것은 잘못된 것이다. 이 경우 Exception 클래스의 자손들까지 예외 범위에 포함되게 되므로
  *     부모 메서드보다 훨씬 많은 예외를 선언하게 되는 것이다. 따라서 잘못된 오버라이딩이다.
  * ⑤ X : throws NumberException {} 인 경우 NumberException 와 그 자식들 InvalidNumberException, NotANumberException 을 예외로 선언한 것이다.
  *      즉 예외의 갯수가 3개인 것이다. 따라서 부모의 예외(2개) 보다 많으므로 오버라이딩 될 수 없다.
  *
  *
  *
  * */


}

