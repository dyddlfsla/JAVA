package chapter.ten._08;

public class Chapter10_08 {

  /** ◆ Date 와 Calendar 간의 변환
   *
   * Calendar 가 추가되면서 Date 는 대부분의 메서드가 'deprecated' 되었으므로 잘 사용되지 않는다. 그럼에도 불구하고 여전히 Date 를 필요로하는
   * 메서드들이 있기 때문에 Calendar 를 Date 로 또는 그 반대로 변환할 일이 생긴다. 그럴 때는 다음과 같이 한다.
   *
   * ※ Java API 문서를 보면 더 이상 사용을 권장하지 않는 대상에 'deprecated' 가 붙어 있다.
   *
   * =======================================================================================
   *
   * 1. Calendar 를 Date 로 변환
   *  Calendar cal = Calendar.getInstance();
   *  ...
   *  Date d = new Date(cal.getTimeInMillis());
   *
   * 2. Date 를 Calendar 로 변환
   *  Data d = new Date();
   *  ...
   *  Calendar cal = Calendar.getInstance();
   *  cal.setTime(d);
   *
   * */

}
