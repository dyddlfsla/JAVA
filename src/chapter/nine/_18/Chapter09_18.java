package chapter.nine._18;

public class Chapter09_18 {

  /** ◆ StringBuffer 의 비교
   *
   * String 인스턴스 간의 비교에 대해서 학습하면서 등가비교연산자 '==' 에 의한 비교와 equals() 에 의한 비교의 차이점을 자세히 알아보았다.
   * String 클래스에서는 equals() 메서드를 오버라이딩해서 문자열의 내용을 비교하도록 구현되어 있지만, StringBuffer 클래스는 equals 메서드를 오버라이딩
   * 하지 않았으므로 StringBuffer 클래스의 equals 메서드를 사용해도 등가비교연산자(==)로 비교한 것과 같은 결과를 얻는다.
   *
   * StringBuffer sb = new StringBuffer("abc");
   * StringBuffer sb2 = new StringBuffer("abc");
   *
   * System.out.println(sb == sb2); // false
   * System.out.println(sb.equals(sb2)); // false
   *
   * 반면에 toString() 은 오버라이딩되어 있어서 StringBuffer 인스턴스에 toString() 을 호출하면, 담고 있는 문자열을 String 으로 반환한다.
   * 그래서 StringBuffer 인스턴스에 담긴 문자열을 비교하기 위해서는 StringBuffer 인스턴스에 toString() 을 호출해서 String 인스턴스를 얻은 다음
   * 여기에 equals() 메서드를 사용해서 비교해야 한다.
   *
   * String s = sb.toString();
   * String s2 = sb2.toString();
   *
   * System.out.println(s.equals(s2)); // true
   *
   * */

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("abc");
    StringBuffer sb2 = new StringBuffer("abc");

    System.out.println("sb == sb2 ? " + (sb == sb2));
    System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

    String s = sb.toString();
    String s2 = sb2.toString();

    System.out.println("s.equals(s2) ? " + s.equals(s2));

  }
}
