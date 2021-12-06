package chapter.five;

public class Chapter05_14 {

  /** ◆ String 클래스
   *
   * 지금까지 문자열을 저장할 때 String 클래스를 사용해왔다.
   * 사실 문자열이라는 용어는 '문자를 연이어 늘어놓는 것'을 의미하므로 문자배열인 char 배열과 같은 뜻이다.
   *
   * 그런데 자바에서 char 배열이 아닌 String 클래스를 이용해서 문자열을 다루는 이유는 String 클래스가
   * char 배열에 여러 가지 기능을 추가하여 확장한 것이기 때문이다.
   *
   * 그래서 char 배열을 사용하는 것보다 String 클래스를 사용하는 것이 문자열을 다루기 더 편하다.
   *
   *  "String 클래스는 char 배열에 기능 (메서드)을 추가한 것이다."
   *
   * C 언어에서는 문자열을 char 배열로 다루지만, 객체지향언어인 자바에서는 char 배열과 그에 관련된 기능들을
   * 함께 묶어서 클래스에 정의한다.
   *
   *  char 배열과 String 클래스에는 한 가지 중요한 차이가 있는데, String 객체(문자열)는 읽을 수만 있을 뿐
   *  내용을 변경할 수는 없다는 것이다.
   *
   *
   * 1. String 클래스의 주요 메서드
   *
   * String 클래스는 상당히 많은 문자열 관련 메서드들을 제공하지만, 가장 기본적인 몇 가지만 살펴보자.
   * 자세히 이해하려 하지 말고 원하는 결과를 얻으려면 어떻게 코드를 작성해야 하는지 정도만 이해해도 충분하다.
   *
   * char charAt(index) : 문자열에서 해당 위치(index)에 있는 문자를 반환한다.
   * int length : 문자열의 길이를 반환한다.
   * String subString(int from, int to) : 문자열에서 해당 범위(from ~ to)의 문자열을 반환한다. 단 to 는 포함하지 않음.
   * boolean equals(Object object) : 문자열의 내용이 같은지 확인한다. 같으면 결과는 true 다르면 false
   * char[] toCharArray() : 문자열을 문자배열(char[])로 변환해서 반환한다.
   *
   *  String str = "ABCDE";
   *  char ch = str.charAt(3); // 4번째 문자인 'D'가 저장된다.
   *
   *  String str = "012345";
   *  String tmp = str.subString(1, 4) // 인덱스 1 ~ 3까지의 내용을 문자열로 반환한다.
   *
   * 기본형 변수의 값을 비교하는 경우 '=='연산자를 사용하지만, 문자열의 내용을 비교할 때는
   * equals()를 사용해야 한다. 그리고 이 메서드는 대소문자를 구분한다. 만약 대소문자 구분없이 문자열 내용을 비교하고 싶다면
   * equalsIgnoreCase() 를 사용해야 한다.
   *
   * */
  public static void main(String[] args) {
    System.out.println("매개변수의 개수: " + args.length);

    for (int i = 0; i < args.length; i++) {
      System.out.println("args [" + i + "] = \"" + args[i] + "\"");
    }
  }
}
