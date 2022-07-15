package chapter.nine._27;

public class Chapter09_27 {

  /*
  * 이 클래스는 추상 클래스로 내부적으로 숫자를 멤버변수로 갖는 래퍼 클래스들의 조상이다.
  * 기본형 중에서 숫자와 관련된 래퍼 클래스들은 모두 Number 클래스의 자손이다.
  *
  * 그 외에도 Number 클래스 자손으로 BigInteger 와 BigDecimal 이 등이 있는데, BigInteger 는 long 으로도 다룰 수 없는 큰 범위의 정수를,
  * BigDecimal 은 double 로 다룰 수 없는 큰 범위의 부동 소수점수를 처리하기 위한 것으로 연산자의 역할을 대신하는 다양한 메서드를 제공한다.
  *
  * 객체가 가지고 있는 값을 숫자와 관련된 기본형으로 변환하여 반환하는 메서드들을 정의하고 있다.
  *
  * public abstract class Number implements java.io.Serializable {
  *
  *   public abstract int intValue();
  *   public abstract long longValue();
  *   public abstract float floatValue();
  *   public abstract double doubleValue();
  *
  *   public byte byteValue() {
  *     return (byte)intValue();
  *   }
  *
  *   public short shortValue() {
  *     return (short)intValue();
  *   }
  * }
  *
  *
  *
  * */

}
