package chapter.fourteen._13;

public class Chapter14_13 {

  /*
  * ◆ 메서드 참조
  *
  * 람다식이 하나의 메서드만 호출하는 경우에는 '메서드 참조(method reference)' 라는 방법으로 람다식을 간단히 할 수 있다.
  * 예를 들어, 문자열을 정수로 반환하는 람다식은 아래와 같이 작성할 수 있다.
  *
  * Function<String, Integer> function = string -> Integer.parseInt(string);
  *
  * 보통은 이렇게 람다식을 작성하는데, 이 람다식을 메서드로 표현하면 다음과 같다.
  * ※ 람다식은 엄밀히 말하면, 익명 클래스의 구현 객체지만 간단히 메서드만 적었다.
  *
  * Integer wrapper(String string) {
  *   return Integer.parseInt(string);
  * }
  *
  * 위의 코드를 보면, 사실 wrapper 라는 이름의 메서드는 그 자체로는 별로 하는 일이 없다. 그저 값을 받아서 Integer.parseInt() 에게
  * 넘겨주는 일만 할 뿐이다. 차라리 이 거추장스러운 메서드를 벗겨내고 Integer.parseInt() 를 직접 호출하는 것이 낫지 않을까?
  *
  * Function<String, Integer> function = (String str) -> Integer.parseInt(str);
  *                                   ↓
  * Function<String, Integer> function = Integer::parseInt; //메서드 참조
  *
  * 위의 메서드 참조에서 람다식의 일부가 생략되었지만, 컴파일러는 생략된 부분을 우변의 parseInt 메서드의 선언부로부터, 또는 좌변의 Function 인터페이스에
  * 지정된 제네릭 타입을 보고 추론할 수 있다.
  *
  * 1. static 메서드 참조:  (x) -> ClassName.method(x)  =>  ClassName::method
  * 2. 인스턴스 메서드 참조: (obj, x) -> obj.method(x)  => ClassName::method
  * 3. 특정 객체 인스턴스 메서드 참조: (x) -> obj.method(x)  => obj::method
  *
  *
  * 하나의 메서드만 호춣하는 람다식은 '클래스이름::메서드이름' 또는 '참조변수::메서드이름' 으로 간단히 작성할 수 있다.
  *
  *
  * ◆ 생성자의 메서드 참조
  *
  * 생성자를 호출하는 람다식도 메서드 참조로 변환할 수 있다.
  * Supplier<MyClass> supplier = () -> new MyClass(); //람다식
  * Supplier<MyClass> supplier = MyClass::new; //메서드 참조
  *
  * 매개변수가 있는 생성자라면, 매개변수의 개수에 따라 알맞은 함수형 인터페이스를 사용하면 된다.
  * 필요하다면 함수형 인터페이스를 새로 정의해야 한다.
  *
  * Function<Integer, MyClass> function = (i) -> new MyClass(i); //람다식
  * Function<Integer, MyClass> function = MyClass::new //메서드 참조
  *
  * BiFunction<Integer, String, MyClass> = (i, s) -> new MyClass(i, s); // 람다식
  * BiFunction<Integer, String, MyClass> = MyClass::new // 메서드 참조
  *
  * 그리고 배열을 생성할 때는 아래와 같이 할 수 있다.
  *
  * Function<Integer, int[]> function = x -> new int[x]; //람다식
  * Function<Integer, int[]> function = int[]::new //람다식
  *
  * 메서드 참조는 람다식을 마치 static 변수처럼 다룰 수 있게 해준다. 메서드 참조는 코드를 한층 더 간결하게 하는데 유용하다.
  * 람다식을 메서드 참조로 변환하는 연습을 많이 해서 익숙해지는 것이 좋다.
  *
  *
  *
  *
  *
  * */

}
