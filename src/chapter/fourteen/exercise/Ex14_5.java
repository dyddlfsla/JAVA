package chapter.fourteen.exercise;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex14_5 {

  /*
   * 14-5. 문자열 배열 strArr 의 모든 문자열의 길이를 더한 결과를 출력하시오.
   *
   * sol:
   *
   *
   * */
  public static void main(String[] args) {

    System.out.printf("sum = %d", Stream.of(new String[]{"aaa", "bb", "c", "dddd"})
        .collect(Collectors.joining())
        .length());
  }
}
