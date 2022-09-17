package chapter.twelve._18;

public class Chapter12_18 {

  /*
  * ◆ 열거형의 정의와 사용
  *
  * 열거형을 정의하는 방법은 간단하다. 키워드 enum 을 사용하고 다음과 같이 괄호{} 안에 상수의 이름을 나열하기만 하면 된다.
  *
  *   enum [열거형이름] { 상수명1, 상수명2, ...}
  *
  * 예를 들어 동서남북 4방향을 상수로 정의하는 열거형 Direction 은 다음과 같다.
  *
  *  enum Direction { EAST, SOUTH, WEST, NORTH }
  *
  * 이 열거형에 정의된 상수를 사용하는 방법은 '[열거형이름].[상수명]' 이다. 클래스의 static 변수를 참조하는 것과 동일하다.
  *
  *  class Unit {
  *    int x, y; // 유닛의 위치
  *    Direction dir; // 열거형을 인스턴스 변수로 선언
  *
  *    void init() {
  *       dir = Direction.EAST; // 유닛 방향을 EAST 로 초기화.
  *
  * }
  *
  * 열거형 상수 간의 비교에는 '==' 을 사용할 수 있다. equals() 가 아닌 '==' 으로 비교가 가능하다는 것은
  * 그만큼 빠른 성능을 제공한다는 얘기다. 그러나 <, > 와 같은 비교 연산자는 사용할 수 없고 compareTo() 는 사용가능하다.
  * 앞서 배운 것과 같이 compareTo() 는 두 비교 대상이 같으면 0, 왼쪽이 크면 양수, 오른쪽이 크면 음수를 반환한다.
  *
  *   if (dir == Direction.EAST) {
  *     x++;
  *   } else if (dir > Direction.WEST) { // 에러 발생. 열거형 상수 비교 시  == 는 가능하지만 <, > 와 같은 비교 연산자는 불가능하다.
  *     ...
  *   } else if (dir.compareTo(Direction.WEST) > 0) { //열거형 상수에 compareTo() 사용 가능
  *     ...
  *   }
  *
  *
  *
  *
  *
  * */

}
