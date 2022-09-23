package chapter.twelve.exercise._05;

@TestInfo()
public class Ex12_5 {

  /*
  * 12-5. 다음 중 메타 애너테이션이 아닌 것은?
  *
  * sol:
  * ③ Native
  *
  *
  *
  * 12-6. 애너테이션이 TestInfo 가 다음과 같이 정의되어 있을 때, 이 애너테이션이 올바르게 적용되지 않은 것은?
  *
  * @interface TestInfo {
  *   int count() default 1;
  *   String[] value() default "aaa";
  * }
  *
  * @TestInfo class Exercise12_7 {} → 정상. @TestInfo 에 존재하는 애너테이션 요소 count, value 가 default 값을 가지고 있으므로 값을 생략할 수 있다.
  * @TestInfo(1) class Exercise12_7 {} → 에러. 애너테이션의 요소가 오직 한 개이고 이름이 value 인 경우, 요소 이름을 생략하고 값만 지정할 수 있는데 @TestInfo 는 이미 2개 이상의 요소를 가지고 있어 불가능하다.
  * @TestInfo("bbb") class Exercise12_7 {} → 정상. count 는 기본값을 가지고 있고, 배열의 요소가 하나인 경우 괄호 {} 를 생략할 수 있다.
  * @TestInfo("bbb", "ccc") class Exercise12_7 {} → 에러. 배열의 값이 2개 이상인 경우 괄호{} 로 감싸야 한다.
  * */

}

@interface TestInfo {
  int count() default 1;
  String[] value() default "aaa";
}
