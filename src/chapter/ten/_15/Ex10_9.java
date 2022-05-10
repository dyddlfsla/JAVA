package chapter.ten._15;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_9 {

  public static void main(String[] args) {
    DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
    DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

    try {
      Date d = df.parse("2019년 11월 23일");
      System.out.println(df2.format(d));
    } catch (Exception e) {}
  }
  /**
   * parse 를 활용하여 문자열을 Date 인스턴스로 변환하는 예제이다.
   * SimpleDateFormat 의 parse(String source) 는 문자열 source 를 날짜 Date 인스턴스로 변환해주기 때문에 매우 유용하게 쓰일 수 있다.
   * ※ 지정된 형식과 입력된 형식이 일치하지 않는 경우에는 예외가 발생하므로 적절한 예외처리가 필요하다.
   *
   * */

}
