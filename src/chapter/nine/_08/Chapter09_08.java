package chapter.nine._08;

public class Chapter09_08 {

  /** ◆ 문자열(String) 의 비교
   *
   * 문자열을 만들 때는 두 가지 방법, 문자열 리터럴을 지정하는 방법과 String 클래스의 생성자를 사용해서 만드는 방법이 있다.
   *
   * String str1 = "abc"; //문자열 리터럴 "abc" 의 주소가 str1 에 저장됨.
   * String str2 = "abc"; //문자열 리터럴 "abc" 의 주소가 str2 에 저장됨.
   *
   * String str3 = new String("abc"); //새로운 String 인스턴스를 생성.
   * String str4 = new String("abc"); //새로운 String 인스턴스를 생성.
   *
   * String 클래스의 생성자를 이용한 경우에는 new 연산자에 의해서 메모리 할당이 이루어지기 때문에 항상 새로운 String 인스턴스가 생성된다.
   * 그러나 문자열 리터럴은 이미 존재하는 것을 재사용하는 것이다. 아래의 그림은 위의 코드가 실행되었을 때의 상황을 표현한 것이다.
   *
   * str1 |0x100| →  0x100
   *                 "abc"
   * str2 |0x100| ↗
   *
   * str3 |0x200| →  0x200
   *                 "abc"
   * str4 |0x300| →  0x300
   *                 "abc"
   *
   *  equals() 메서드를 사용했을 때는 두 문자열의 내용을 비교하기 때문에 두 경우 모두 true 를 결과로 얻지만,
   *  String 인스턴스의 주소를 비교하는 연산자 '==' 로 비교했을 때는 결과가 다를 것이다.
   *
   * */
  public static void main(String[] args) {
    String str1 = "abc";
    String str2 = "abc";
    System.out.println("String str1 = " + str1);
    System.out.println("String str2 = " + str2);

    System.out.println("str1 == str2 ? " + (str1 == str2));
    System.out.println("str1.equals(str2) ? " + str1.equals(str2));



    String str3 = new String("abc");
    String str4 = new String("abc");
    System.out.println("String str3 = " + str3);
    System.out.println("String str4 = " + str4);

    System.out.println("str3 == str4 ? " + (str3 == str4));
    System.out.println("str3.equals(str4) ? " + str3.equals(str4));
  }
}
