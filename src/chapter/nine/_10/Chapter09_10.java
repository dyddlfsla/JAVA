package chapter.nine._10;

public class Chapter09_10 {

  /** ◆ 빈 문자열 (empty string)
   *
   * 길이가 0인 배열이 존재할 수 있을까? 답은 'yes' 이다. char 형 배열도 길이가 0인 배열을 생성할 수 있고,
   * 이 배열을 내부적으로 가지고 있는 문자열이 바로 빈 문자열이다.
   *
   * 'String s = "";' 과 같은 문장이 있을 때, 참조변수 s 가 참조하고 있는 String 인스턴스는 내부에 'new char[0]' 과 같이
   * 길이가 0인 char 형 배열을 저장하고 있는 것이다.
   *
   * char[] chArr = new char[0]; //길이가 0인 char 배열
   * int[] iArr = {}; //길이가 0인 int 배열
   *
   * 길이가 0이기 때문에 아무런 문자도 저장할 수 없는 배열이라 무의미하게 느껴지겠지만 어쨌든 이러한 표현이 가능하다.
   * 그러나 'String s = "";' 과 같은 표현이 가능하다고 해서 'char c = ";' 와 같은 표현도 가능한 것은 아니다. char 형 변수에는
   * 반드시 하나의 문자를 지정해야한다.
   *
   * String s = null;   →   String s = ""; // 빈 문자열로 초기화
   * char c = '\u0000'; →  char c = ' '; // 공백 문자로 초기화
   *
   * 일반적으로 변수를 선언할 때, 각 타입의 기본값으로 초기화 하지만 String 은 참조형 타입의 기본값인 null 보다는 빈 문자열로,
   * char 형은 기본값인 \u0000 대신 공백으로 초기화하는 것이 보통이다.
   *
   * */
  public static void main(String[] args) {
    char[] chArr = new char[0]; // char[] chArr = {}; 와 같다.
    String s = new String(chArr); //String s = new String(""); 와 같다.

    System.out.println("chArr.length = " + chArr.length);
    System.out.println("@@@" + s + "@@@");
  }

}
