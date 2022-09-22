package chapter.twelve._38;

public class Chapter12_38 {

  /*
  * ◆ 애너테이션의 요소 정의 규칙
  *
  * 애너테이션의 요소를 선언할 때 반드시 지켜야 하는 규칙은 다음과 같다.
  *
  * ① 요소의 타입은 기본형, String, enum, 애너테이션, Class 만 허용된다.
  * ② () 안에 매개변수를 선언할 수 없다.
  * ③ 요소를 타입 매개변수로 정의할 수 없다. 제네릭 타입 불가
  * ④ 예외를 선언할 수 없다.
  *
  * 이 규칙을 적용시켜, 다음 코드에서 무엇이 잘못되었는지 확인해보자.
  *
  * @interface AnnoTest {
  *
  *   int id = 300; // OK. 애너테이션에 상수 선언은 가능하다. static final int id = 300;
  *   String major(int i, int j); // 에러. 애너테이션 요소에는 매개변수를 선언할 수 없다.
  *   String minor() throws Exception; // 에러. 애너테이션 요소에는 예외를 선언할 수 없다.
  *   ArrayList<T> list(); // 에러. 애너테이션 요소에 타입 매개변수를 선언할 수 없다.
  *
  * }
  *
  *
  *
  *
  * */

}
