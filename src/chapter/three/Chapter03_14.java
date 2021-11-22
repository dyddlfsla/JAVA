package chapter.three;

public class Chapter03_14 {

  /** ◆ 문자열의 비교
   *
   * 두 문자열을 비교할 때에는 비교 연산자 '=='를 사용하는 것이 아니라 equals()라는 메서드를 사용해야 한다. 비교 연산자는
   * 두 문자열이 완전히 같은 것인지 비교할 뿐이므로, 문자열의 내용이 같은지 비교하고 싶다면 equals()를 사용하는 것이다.
   *
   *  String str = new String("abc");
   *
   *  boolean result = str.equals("abc"); //내용이 같으므로 result에 true가 저장됨.
   *
   * */

  public static void main(String[] args) {
    String str1 = "abc";
    String str2 = new String("abc");

    System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
    System.out.printf("str1 == \"abc\" ? %b%n", str1 == "abc");
    System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc");
    System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
    System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
    System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
    System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
  }

}
