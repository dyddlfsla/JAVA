package chapter.fourteen.exercise;

import java.util.stream.Stream;

public class Ex14_6 {

  /*
   * 14-6. 문자열 배열 strArr 의 문자열 중에서 가장 긴 것의 길이를 출력하시오.
   *
   * sol:
   *
   *
   * */

  public static void main(String[] args) {

    System.out.printf("value = %d", Stream.of(new String[]{"aaa", "bb", "c", "dddd"})
        .reduce((a, b) -> a.length() > b.length() ? a : b)
        .get()
        .length());
  }
}
