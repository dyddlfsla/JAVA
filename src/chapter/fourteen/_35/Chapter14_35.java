package chapter.fourteen._35;

public class Chapter14_35 {


  /*
  * ◆ Optional<T>

  * Optional<T> 는 'T 타입의 객체'를 감싸는 래퍼 클래스이다. 그래서 Optional 타입의 객체에는 모든 타입의 객체를 담을 수 있다.
  *
  * public final class Optional<T> {
  *   private final T value; // T 타입의 참조변수
  * }
  *
  * 최종 연산의 결과를 그냥 반환하는 것이 아니라 Optional 객체에 담아서 반환을 하면, 반환된 결과가 null 인지 매번 if 문으로 체크하는 대신
  * Optional 에 정의된 메서드를 통해서 간단히 처리할 수 있다.
  *
  * Optional<T> 를 이용하면, null 체크를 위한 if 문이 없이도 NullPointerException 이 발생하지 않는, 보다 간결하고 안전한 코드를 작성하는 것이 가능하다.
  *
  *
  *
  * 1. Optional<T> 객체 생성하기
  *
  * Optional 객체를 생성할 때는 of() 또는 ofNullable() 메서드를 사용한다.
  *
  * String str = "abc";
  * Optional<String> optVal = Optional.of(str);
  * Optional<String> optVal = Optional.of("abc");
  * Optional<String> optVal = Optional.of(new String("abc"));
  *
  * 참조변수의 값이 null 일 가능성이 있으면 of() 대신 ofNullable() 을 사용해야 한다. of() 메서드는 매개변수의 값이 null 이면 NullPointerException 을 발생시키기 때문이다.
  *
  * Optional<String> optVal = Optional.of(null); // 에러 발생. NullPointerException.
  * Optional<String> optVal = Optional.ofNullable(null); // 에러 발생하지 않음.
  *
  * Optional<T> 타입의 참조변수를 기본값으로 초기화할 때는 empty() 메서드를 사용한다. null 을 매개변수로 넣어서 초기화 시킬수도 있겠지만,
  * 그러지 않고 empty() 를 사용하는 것이 더 바람직하다
  *
  * Optional<String> optVal = null; // 가능하긴 하지만, 바람직하지 않음.
  * Optional<String> optVal = Optional.empty(); // 빈 객체로 초기화.
  *
  *
  *
  * */

}
