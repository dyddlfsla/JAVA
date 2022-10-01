package chapter.fourteen._32;

public class Chapter14_32 {


  /*
   * ◆ 스트림의 중간연산 - peek()
   *
   * 연산과 연산 사이에 올바르게 처리되었는지 확인하고 싶다면, peek() 을 사용하자.
   * forEach() 와는 달리 스트림의 요소를 소모하지 않으므로 연산 사이에 여러 번 끼워 넣어도 문제가 되지 않는다.
   *
   * Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"),
   *      new File("Ex2.java"), new File("Ex1.txt"));
   *
   *  fileStream.map(File::getName) // Stream<File> → Stream<String>
   *      .filter(string -> string.indexOf('.') != -1) // . 이 없는 문자열은 제외시킨다.
   *      .peek(string -> System.out.printf("filename = %s%n", string))
   *      .map(string -> string.substring(string.indexOf('.') + 1)) // 문자열에서 '.' 을 찾은 뒤 . 이후만 잘라낸다.
   *      .map(String::toUpperCase)  // 대문자로 변환.
   *      .peek(string -> System.out.printf("extension=%s%n", string))
   *      .distinct() // 중복된 요소 제거
   *      .forEach(System.out::print);
   *
   *
   * filter() 나 map() 의 결과를 확인할 때 유용하게 사용될 수 있다. peek() 으로 각 요소를 화면에 출력하게 하면
   * 연산이 올바르게 처리되고 있는지 확인할 수 있다.
   *
   *
   * */

}
