package chapter.nine._13;

public class Chapter09_13 {

  /** ◆ 문자열과 기본형 간의 변환
   *
   * 숫자로 이루어진 문자열을 숫자로, 또는 그 반대로 변환하는 경우가 자주 있다.
   * 이미 배운 것과 같이 기본형을 문자열로 변경하는 방법은 간단하다. 숫자에 빈 문자열"" 을 더해주기만 하면 된다.
   * 이 외에도 valueOf() 를 사용하는 방법도 있다. 성능은 valueOf() 가 더 좋지만, 빈 문자열을 더하는 방법이 간단하고 편하기 때문에 성능향상이
   * 필요한 경우에만 valueOf() 를 사용하자.
   *
   * int i = 100;
   * String str1 = i + ""; //숫자 100을 "100"으로 변환하는 방법
   * String str2 = String.valueOf(i);
   *
   * 반대로 String 을 기본형으로 변환하는 방법도 간다하다. valueOf() 를 쓰거나 앞서 배운 parseInt() 를 사용하면 된다.
   *
   * int i = Integer.parseInt("100");
   * int i2 = Integer.valueOf("100");
   *
   * 원래 valueOf() 의 반환 타입은 int 가 아니라 Integer 인데 곧 배울 오토박싱(auto-boxing) 에 의해 Integer 가 int 로 자동변환 된다.
   *
   * Integer i2 = Integer.valueOf("100");
   *
   * 예전에는 parseInt() 와 같은 메서드를 많이 썼는데, 메서드의 이름을 통일하기 위해 valueOf() 가 나중에 추가된다. valueOf(String s) 는
   * 메서드 내부에서 그저 parseInt(String s) 를 호출할 뿐이므로, 두 메서드는 반환 타입만 다르지 내부는 같은 메서드이다.
   *
   *
   *
   * */

}
