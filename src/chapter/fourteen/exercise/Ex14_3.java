package chapter.fourteen.exercise;

public class Ex14_3 {

  /*
  * 14-3. 괄호 안에 맞는 함수형 인터페이스는?
  *       ( ) f;
  *       f = (int a, int b) -> a > b ? : a : b;
  *
  * sol: 참조변수 f 는 매개변수 2개와 1개의 값을 반환하는 메서드이다.
  *      이 조건에 부합하는 선언부를 가진 함수형 인터페이스는 BiFunction<T> 이다.
  *      BiFunction<T> 의 추상메서드 apply() 는 두 개의 매개변수와 1개의 리턴값을 가진다.
  *
  * */

}
