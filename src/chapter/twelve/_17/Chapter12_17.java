package chapter.twelve._17;

public class Chapter12_17 {

  /*
  * ◆ 열거형(enum)
  *
  * 열거형은 여러 상수를 선언해야 할 때, 편리하게 선언할 수 있는 방법이다. 일반적으로 상수를 선언할 때 다음과 같이 하는데
  * 이처럼 상수가 많을 때는 코드가 불필요하게 길어지는 단점이 있다.
  *
  * class Card {
  *   static final int CLOVER = 0;
  *   static final int HEART = 1;
  *   static final int DIAMOND = 2;
  *   static final int SPADE = 3;
  *
  *   static final int TWO = 0;
  *   static final int THREE = 1;
  *   static final int FOUR = 2;
  *
  *   final int kind;
  *   final int num;
  *
  * }
  *
  * 이런 경우, 열거형을 이용하면 다음과 같이 간단하게 상수를 선언할 수 있다. 위와 달리 따로 값을 지정해주지 않아도
  * 자동적으로 0부터 시작하는 정수 값이 할당된다. 위 코드를 참고하면
  * CLOVER 의 값은 0이고, HEART = 1, DIAMOND = 2 와 같은 식이다.
  *
  * class Card {
  *   enum Kind { CLOVER, HEART, DIAMOND, SPADE } // 열거형 Kind 를 정의
  *   enum Value { TWO, THREE, FOUR } // 열거형 Value 를 정의
  *
  *   final Kind kind;
  *   final Value value;
  * }
  *
  * 그리고 이전의 코드에서는 다시 살펴보면 Card.CLOVER 와 Card.TWO 의 값이 0 이기 때문에
  * 조건식 if (Card.CLOVER == Card.TWO) 이 true 가 되어버리는 상황이 발생한다.
  * 그런데 논리적으로 따져보면, 애초에 카드의 무늬와 숫자는 서로 성질 자체가 다른 것이므로 비교 자체가 될 수 없는 것이므로
  * 조건식 결과는 잘못되었다고도 할 수 있다.
  *
  * 그러나 열거형을 이용해서 상수를 정의한 경우는 값을 비교하기 이전에 타입을 먼저 비교하기 때문에 값 자체는 같더라도
  * 타입이 다르면 컴파일 에러가 발생하며 비교 자체가 성립하지 않는다.
  *
  * if (Card.Kind.CLOVER == Card.Value.TWO) // 컴파일 에러. 비교 자체가 불가능.
  *
  *
  *
  *
  * */

}
