package chapter.six_2nd._20;

public class Chapter06_20 {

  /** ◆ return 문
  *
  *  return 문은 현재 실행중인 메서드를 종료하고 호출한 메서드로 되돌아간다. 지금까지 반환값이 있을 때만 return 문을 썼지만, 원래는 반환값의 유무에 관계없이
  *  모든 메서드에는 적어도 하나의 return 문이 있어야 한다. 그런데도 반환타입이 void 인 경우, return 문이 없어도 아무런 문제가 없었던 이유는 컴파일러가
  *  메서드의 마지막에 'return;' 을 자동적으로 추가해주었기 때문이다.
  *
  *  void printGugudan(int dan) {
   *    for (int i = 1; i <= 9; i++) {
   *      System.out.printf(%d * %d = %d%n, dan, i, dan * i);
   *    }
   *    //return; 반환타입이 void 인 경우 컴파일러가 return 문을 추가해준다.
   *  }
   *
   *  그러나 반환타입이 void 가 아닌 경우, 즉 반환값이 있는 경우, 반드시 return 문이 있어야 한다. return 문이 없다면 컴파일 에러가 발생한다.
   *
   *  int multiply(int x, int y) {
   *    int result = x + y;
   *    return result; //반환타입이 void 가 아니므로 return 문을 절대 생략할 수 없다.
   *  }
   *
   *  아래의 코드는 두 값 중에서 큰 값을 반환하는 메서드이다. 이 메서드의 리턴타입이 int 이고 int 타입의 값을 반환하는 return 문이 있지만,
   *  return 문이 없다는 에러가 발생한다.
   *  왜냐하면 if 문 조건식의 결과에 따라 return 문이 실행되지 않을수도 있기 때문이다.
   *
   *  int max(int a, int b) {
   *    if ( a > b)
   *      return a; //조건식이 참일 때만 return 문이 실행된다. b 가 큰 경우 실행될 return 문이 존재하지 않는다.
   *  }
   *
   *  그래서 이런 경우 다음과 같이 if 문의 else 블럭에 return 문을 추가해서, 항상 결과값이 반환되도록 해야 한다.
   *
   *  int max(int a, int b) {
   *    if (a > b) {
   *      return a;
   *    } else {
   *      return b;
   *    }
   *  }
   *
   *
   *
   * */

}
