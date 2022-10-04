package chapter.fourteen.exercise;

public class Ex14_2 {

  /*
  * 14-2. 람다식을 메서드 참조로 변환하시오.
  *
  * sol:
  *
  * 메서드 참조란, 람다식이 하나의 메서드만을 호출하는 경우에는 해당 메서드를 감싸는 wrapper 메서드를 제거하고 메서드를 직접 참조하도록 하는 것이다.
  * 메서드 참조에는 다음과 같이 3가지 종류가 존재한다.
  *
  * 1. static 메서드 참조            | (x) -> ClassName.method(x) | ClassName::method
  * 2. 인스턴스 메서드 참조            | (obj, x) -> obj.method(x) | ClassName::method
  * 3. 특정 객체의 인스턴스 메서드 참조  | (x) -> obj.method(x) | obj::method
  *
  * 즉 하나의 메서드만 호출하는 람다식은 '클래스이름::메서드이름' 또는 '참조변수이름::메서드이름' 으로 바꿀 수 있다.
  *
  *
  * ① (String s) -> s.length() | String::length
  * ② () -> new int[]{} | int[]::new
  * ③ arr -> Arrays.stream(arr) | Arrays::stream
  * ④ (String str1, String str2) -> str1.equals(str2) | String::equals
  * ⑤ (a, b) -> Integer.compare(a, b) | 변환 불가
  * ⑥ (String kind, int num) -> new Card(kind, num) | Card::new
  * ⑦ (x) -> System.out.println(x) : System.out::println
  * ⑧ () -> Math.random() | 변환 불가
  * ⑨ (str) -> str.toUpperCase() | String::toUpperCase
  * ⑩ () -> new NullPointerException() | NullPointerException::new
  * ⑪ (Optional opt) -> opt.get() | Optional::get
  * ⑫ (StringBuffer sb, String s) -> sb.append(S) | StringBuffer::append
  * ⑬ (String s) -> System.out.println(s) | System.out::println
  *
  *
  *
  *
  *
  *
  *
  * */
}
