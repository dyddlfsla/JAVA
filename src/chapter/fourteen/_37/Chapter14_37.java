package chapter.fourteen._37;

public class Chapter14_37 {

  /*
  * ◆ Optional<T> 객체의 값 가져오기
  *
  * Optional 객체에 저장된 값을 가져올 때는 get() 메서드를 사용하면 된다. 값이 null 일 때는 NoSuchElementException 이 발생하며,
  * 이를 대비해서 orElse() 메서드를 사용해 대체할 값을 지정할 수도 있다.
  *
  * Optional<String> optVal = Optional.of("abc");
  * String str1 = optVal.get(); //optVal 에 저장된 값을 반환. 만약 null 이라면 예외가 발생한다.
  * String str2 = optVal.orElse(""); // optVal 에서 값을 꺼내는 것은 get() 과 동일하지만 꺼내는 값이 null 일 경우 대체할 값을 지정할 수 있다. null 이면 문자열 "" 로 대체됨.
  *
  * orElse() 의 변형으로는 null 을 대체할 값을 반환하는 람다식을 지정할 수 있는 orElseGet() 과 null 일때 별개의 지정된 예외를 발생시킬 수 는 orElseThrow() 메서드가 있다.
  *
  * T orElseGet(Supplier<? extends T> other): 값이 null 이라면 람다식으로 만들어진 값을 대체해서 반환한다.
  * T orElseThrow(Supplier<? extends X> exceptionSupplier): 값이 null 이라면 매개변수로 지정된 예외를 발생시킨다.
  *
  * String str3 = optVal.orElseGet(String::new); // null 이라면 새로운 new String() 을 생성하여 반환한다.
  * String str3 = optVal.orElseThrow(NullPointerException::new) // null 이라면 해당 예외를 발생시킨다.
  *
  * isPresent() 는 Optional 객체의 값이 null 이면 false 를, null 이 아니면 true 를 반환한다.
  * ifPresent(Consumer<T> block) 는 값이 있으면 주어진 람다식을 실행하고, 없으면 아무일도 하지 않는다.
  *
  * if (str != null) {
  *   System.out.println(str); // null 이 아니면 값을 화면에 출력.
  * }
  *
  * 위의 코드는 isPresent() 이용해서 다음과 같이 쓸 수 있다.
  *
  * if (Optional.ofNullable(str).isPresent()) {
  *   System.out.println(str);
  * }
  *
  * 이 코드를 ifPresent() 를 사용하면 한층 더 간결하게 할 수 있다.
  *
  * Optional.ofNullable(str).ifPresent(System.out::println);
  * null 이 아닐때만 람다식 내용을 수행하고 null 이면 아무것도 수행하지 않는다.
  *
  *
  *
  *
  *
  * */

}
