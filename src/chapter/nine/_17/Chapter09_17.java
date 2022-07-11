package chapter.nine._17;

public class Chapter09_17 {

  /** ◆ StringBuffer 의 변경
   *
   * String 과 달리 StringBuffer 는 내용을 변경할 수 있다. 예를 들어 아래와 같이 StringBuffer 를 생성하였다고 가정하자
   *
   * StringBuffer sb = new StringBuffer("abc");
   *
   * 그리고 sb 에 문자열 "123" 을 추가하면
   *
   * sb.append("123"); // sb 내용 뒤에 "123" 을 추가한다.
   *
   * append() 는 반환타입이 StringBuffer 인데 자신의 주소를 반환한다. 그래서 아래와 같은 문장이 수행되면, sb에 새로운
   * 문자열이 추가되고 sb 자신의 주소를 반환하여 sb2 에는 sb 의 주소가 저장된다.
   *
   * StringBuffer sb2 = sb.append("ZZ");
   * System.out.println(sb);
   * System.out.println(sb2);
   *
   * ab 와 sb2 모두 같은 StringBuffer 인스턴스를 가리키고 있으므로 같은 내용이 출력된다. 그래서 하나의 StringBuffer 인스턴스에 대해 아래와 같이
   * 연속적으로 append() 를 호출하는 것이 가능하다.
   *
   * StringBuffer sb = new StringBuffer("abc");
   * sb.append("123").append("ZZ");
   *
   * append() 가 자기 자신을 반환하므로 연속적으로 append()를 호출할 수 있는 것이다.
   *
   *
   *
   *
   *
   *
   *
   * */

}
