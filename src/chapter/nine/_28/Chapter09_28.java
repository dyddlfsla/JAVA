package chapter.nine._28;

public class Chapter09_28 {

  /* ◆ 문자열을 숫자로 변환하기
  * 다음은 문자열을 숫자로 변환하는 다양한 방법을 보여준다. 문자열을 숫자로 변환할 때는 아래의 방법 중 하나를 선택해서 사용하면 된다.
  *
  * int i = new Integer("100").intValue();
  * int i2 = Integer.parseInt("100");
  * Integer i3 = Integer.valueOf("100");
  *
  * 변환 방법 중
  * '타입.parse타입(String s)' 와 '타입.valueOf()' 에는 차이점이 존재한다. 전자는 반환값이 기본형이고
  * 후자는 반환값이 래퍼 클래스 타입이라는 것이다.
  *
  * 또한, 문자열이 10진수가 아닌 다른 진법(radix) 의 숫자일 때도 변환이 가능하도록 다음과 같은 메서드가 제공된다.
  *
  * static int parseInt(String s, int radix)
  * static Integer valueOf(String s, int radix) // 문자열 s 를 radix 진법으로 인식.
  *
  * */
  public static void main(String[] args) {
    int i = new Integer("100").intValue();
    int i2 = Integer.parseInt("100");
    int i3 = Integer.valueOf("100");

    int i4 = Integer.parseInt("100", 2);
    int i5 = Integer.parseInt("100", 8);
    int i6 = Integer.parseInt("100", 16);
    int i7 = Integer.parseInt("FF", 16);
//    int i8 = Integer.parseInt("FF"); NumberFormatException 매개변수로 진법을 지정하지 않았으므로 발생할 것.

    Integer i9 = Integer.valueOf("100", 2);
    Integer i10 = Integer.valueOf("100", 8);
    Integer i11 = Integer.valueOf("100", 16);
    Integer i12 = Integer.valueOf("FF", 16);
//    Integer i13 = Integer.valueOf("FF"); NumberFormatException 매개변수로 진법을 지정하지 않았으므로 발생할 것.

    System.out.println(i);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println("100(2) -> " + i4);
    System.out.println("100(8) -> " + i5);
    System.out.println("100(16) -> " + i6);
    System.out.println("FF(16) -> " + i7);

    System.out.println("100(2) -> " + i9);
    System.out.println("100(8) -> " + i10);
    System.out.println("100(16) -> " + i11);
    System.out.println("FF(16) -> " + i12);


  }
}
