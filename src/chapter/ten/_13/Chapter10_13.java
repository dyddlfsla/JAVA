package chapter.ten._13;

public class Chapter10_13 {

  /** ◆ SimpleDateFormat
   *
   * Date 와 Calendar 만으로 날짜 데이터를 원하는 형태로 다양하게 출력하는 것은 불편하고 복잡하다. 그러나
   * SimpleDateFormat 을 사용하면 이러한 문제들이 간단히 해결된다.
   *
   * ※ 자세한 출력 형식은 Java API 문서를 참고하는 것이 좋다.
   *
   * SimpleDateFormat 을 사용하는 방법은 간단하다. 먼저 원하는 형식의 패턴을 작성해서 SimpleDateFormat 인스턴스를 생성한 다음,
   * 출력하고자 하는 Date 인스턴스를 가지고 format(Date d) 메서드를 호출하면 지정한 출력형식에 맞게 변환된 문자열을 얻는다.
   *
   * Date today = new Date(); //오늘 날짜를 생성한다.
   * SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
   *
   * String result = df.format(today); //오늘 날짜를 지정한 출력 형식으로 변환한다.
   *
   *
   *
   * */

}
