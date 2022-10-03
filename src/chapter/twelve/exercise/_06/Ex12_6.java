package chapter.twelve.exercise._06;

public class Ex12_6 {

  /*
  * 12-6. 애너테이션이 다음과 같이 정의되어 있을 때, 이 애너테이션이 잘못 적용된 것은?
  *
  * @interface TestInfo {
  *   int count() default 1;
  *   String[] value() default "aaa";
  * }
  *
  * ① @TestInfo
  * ② @TestInfo(1)
  * ③ @TestInfo("bbb")
  * ④ @TestInfo("bbb", "ccc)
  *
  * sol:
  *
  * ① count() 와 value() 요소 모두 default 값이 지정되어 있으므로 애너테이션 적용 시 값을 생략하는 것이 가능하다.
  * ② 요소의 이름을 생략하려면 애너테이션 요소의 이름이 value 인 경우에만 가능하다. 요소의 이름이 count 이기 때문에 이름을 생략할 수 없다.
  * ③ 요소의 타입이 배열 타입이면서 배열 요소가 하나만 있는 경우 괄호{} 를 생략할 수 있다.
  * ④ 요소의 타입이 배열 타입이면서 배열 요소가 2개 이상인 경우 괄호를 생략할 수 없다. @TestInfo(value = {"bbb", "ccc"}) 로 써야 한다.
  *
  *
  *
  *
  *
  *
  * */

}
