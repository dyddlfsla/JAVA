package chapter.twelve._34;

public class Chapter12_34 {

  /*
  * ◆ 애너테이션 타입 정의하기
  *
  * 지금까지 애너테이션을 사용하는 방법에 대해서 살펴봤는데, 이제 직접 애너테이션을 만들어서 사용해볼 차례다. 새로운 애너테이션을 정의하는 방법은 아래와 같다.
  * '@' 기호를 붙이는 것을 제외하면 인터페이스를 정의하는 것과 동일하다.
  *
  * @interface [애너테이션명] {
  *   타입 요소이름(); //애너테이션의 요소를 선언한다.
  *   ...
  * }
  *
  * ◆ 애너테이션의 요소
  *
  * 애너테이션 내에 선언된 메서드를 '애너테이션의 요소(element)' 라고 하며, 아래에 선언된 TestInfo 애너테이션은 다섯 개의 요소를 갖는다.
  * ※ 애너테이션에도 인터페이스처럼 상수를 정의할 수 있지만, default 메서드를 정의할 수는 없다.
  *
  * @interface TestInfo {
  *   int count();
  *   String testedBy();
  *   String[] testTools();
  *   TestType testType(); // enum TestType { FIRST,FINAL }
  *   DateTime testDate(); // 자신이 아닌 다른 애너테이션을 포함할 수 있다.
  * }
  *
  * @interface DateTime {
  *   String yymmdd();
  *   String hhmmss();
  * }
  *
  * 애너테이선의 요소는 반환값이 있고, 매개변수는 없는 추상 메서드의 형태를 가지며, 상속을 통해 구현하지 않아도 된다.
  * 다만 애너테이션을 적용할 때 이 요소들의 값을 빠짐없이 지정해주어야 한다. 요소의 이름도 같이 적어주므로 순서는 상관없다.
  *
  * @TestInfo(count = 3,
  *           testedBy = "Kim",
  *           testTools = {"JUnit", "AutoTester"},
  *           testType =  TestType.FIRST,
  *           testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
  * public class NewClass { ... }
  *
  * 애너테이션의 각 요소는 기본 값을 가질 수 있으며, 기본값이 있는 요소는 애너테이션을 적용할 때 값을 지정하지 않으면 앞서 지정한 기본값이 사용된다.
  * ※ 기본값으로 null 을 제외한 모든 리터럴이 가능하다.
  *
  * @interface TestInfo {
  *   int count() default 1; //기본 값으로 1을 설정함.
  * }
  *
  * @TestInfo  // @TestInfo(count = 1) 과 동일함. count 를 지정하지 않았으므로 기본값 default 가 지정됨.
  * public class NewClass {...}
  *
  * 애너테이션 요소가 오직 하나뿐이고 이름이 value 인 경우, 애너테이션을 적용할 때 요소의 이름을 생략하고 값만 적어도 된다.
  *
  * @interface TestInfo {
  *   String value;
  * }
  *
  * @TestInfo("passed") // @TestInfo(value = "passed") 와 동일하다. 애너테이션 요소 이름이 value 이고 하나만 존재하는 경우.
  * public class NewClass {...}
  *
  * 요소의 타입이 배열인 경우, 괄호 {} 를 사용해서 여러 개의 값을 지정할 수 있다.
  *
  * @interface TestInfo {
  *   String[] testTools();
  * }
  *
  * @TestInfo(testTools = {"JUnit", "AutoTester"} //값이 여러 개인 경우
  * @TestInfo(testTools = "JUnit") // 값이 하나인 경우 괄호 {} 를 생략한다.
  * @TestInfo(testTools = {}) // 값이 없을 때는 괄호 {} 가 반드시 필요함.
  *
  * 앞서 기본값을 지정할 때에도 마찬가지로 괄호{} 를 사용할 수 있다.
  *
  * @interface TestInfo {
  *   String[] info() default {"aaa", "bbb"}; // 기본 값이 여러 개인 경우 괄호{} 사용
  *   String[] info2() default "ccc"; //기본값이 하나인 경우 괄호{} 생략 가능
  * }
  *
  * @TestInfo // @TestInfo(info = {"aaa", "bbb"}, info2 = "ccc" ) 와 동일
  * @TestInfo(info2 = {}) // @TestInfo(info = {"aaa", "bbb"}, info2 = {}) 와 동일
  * public class NewClass {...}
  *
  * 요소의 타입이 배열일 때도 요소의 이름이 value 이면, 요소의 이름을 생략할 수 있다.
  *
  * @interface SuppressWarnings {
  *   String[] value();
  * }
  *
  * 그래서 애너테이션을 적용할 때 요소의 이름을 생략할 수 있었던 것이다.
  *
  * @SuppressWarnings(value = {"deprecation", "unchecked"})
  * @SuppressWarnings({"deprecation", "unchecked"})
  *
  *
  *
  *
  *
  *
  * */

}
