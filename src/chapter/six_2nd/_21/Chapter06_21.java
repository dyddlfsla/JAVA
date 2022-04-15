package chapter.six_2nd._21;

public class Chapter06_21 {
  /** ◆ 반환값
   *
   * return 문의 반환값으로 주로 변수가 오긴 하지만 항상 그런 것은 아니다. 아래 왼쪽의 코드는 오른쪽과 같이 간략히 할 수 있는데
   * 아래의 코드는 return 문의 반환값으로 'x + y' 라는 수식이 적혀 있다. 그렇다고 해서 수식이 반환되는 것은 아니고
   * 이 수식을 계산한 결과가 반환된다.
   *
   * int add(int x, int y) {
   *   int result = x + y;
   * }
   *
   *          ↓
   *
   * int add(int x, int y) {
   *   return x + y;
   * }
   *
   * 아래의 diff 메서드는 두 개의 정수를 받아서 그 차이를 절대값으로 반환한다. 이 역시 메서드를 반환하는 것이 아니라 메서드 abs 를 호출하고
   * 그 결과를 받아서 반환한다. 메서드 abs 의 반환타입이 메서드 diff 의 반환타입과 일치하기 때문에 이렇게 하는 것이 가능하다는 것에 주의하자.
   *
   * int diff(int x, int y) {                       int diff(int x, int y) {
   *   int result = abs(x-y);                           return abs(x-y);
   *   return result;                              }
   * }
   *
   * int abs(int x) {
   *   if (x >= 0) {
   *     return x;
   *   } else {
   *     return -x;
   *   }
   * }
   *       ↓
   *
   * int abs(x) {
   *   return x >= 0 ? x : -x; // 간단한 true or false 형태이 if 문은 삼항연산자로 대체할 수 있다.
   * }
   *
   *
   * */

}
