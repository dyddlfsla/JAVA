package chapter.nine._12;

import java.util.StringJoiner;

public class Chapter09_12 {

  /** ◆ join() 과 StringJoiner
   *
   * join() 은 여러 문자열 사이에 구분자를 넣어서 결합한다. 구분자로 문자열을 자르는 split() 와 반대의 작업을 한다고 생각하면 이해하기 쉽다.
   * String animals = "dog,cat,bear";
   * String[] arr = animals.split(","); //문자열을 구분자 ',' 로 나누어서 배열로 저장
   * String str = String.join("-", arr); //배열의 문자열을 '-' 로 구분해서 결합
   * System.out.println(str);// dog-cat-bear
   *
   * java.util.StringJoiner 클래스를 사용해서 문자열을 결합할 수도 있는데, 사용하는 방법은 간단하다.
   *
   * StringJoiner sj = new StringJoiner(",", "[", "]");
   * String[] strArr = {"aaa", "bbb", "ccc"};
   *
   * for (String str : strArr) {
   *   sj.add(str.toUpperCase());
   * }
   * System.out.println(sj.toString()); // [AAA, BBB, CCC]
   *
   *
   *
   * */

  public static void main(String[] args) {
    String animals = "dog,cat,bear";
    String[] arr = animals.split(",");
    System.out.println(String.join("-", arr));

    StringJoiner sj = new StringJoiner("/", "[", "]");

    for (String str : arr) {
      sj.add(str);
    }
    System.out.printf("%s\n", sj.toString());
  }

}
