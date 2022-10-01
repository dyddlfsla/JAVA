package chapter.fourteen._30;

import java.io.File;
import java.util.stream.Stream;

public class Chapter14_30 {

  /*
   * ◆ 스트림의 중간 연산 - map()
   *
   * 스트림의 요소에 저장된 값 중에서 원하는 필드만 뽑아내거나 특정 형태로 변환해야 할 때가 있다. 이 때 사용하는 것이 바로 map() 이다.
   * 이 메서드의 선언부는 아래와 같으며, 매개변수 T 타입을 R 타입으로 변환해서 반환하는 함수를 지정해야 한다.
   *
   * Stream<R> map(Function<? super T, ? extends R> mapper)
   *
   * 예를 들어 File 의 스트림에서 파일의 이름만 뽑아서 출력하고 싶을 때, 아래와 같이 map() 을 이용하면 File 객체에서 파일의 이름(String) 만 간단히 뽑아낼 수 있다.
   * Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
   *
   * //map() 으로 Stream<File> 을 Stream<String> 으로 변환
   * Stream<String> filenameStream = fileStream.map(File::getName);
   * filenameStream.forEach(System.out::println); //스트림의 모든 요소를 출력
   *
   * map() 역시 중간 연산이므로, 연산결과는 String 을 요소로 하는 스트림이다. map() 으로 Stream<File> 을 Stream<String> 으로 변환했다고 볼 수 있다.
   *
   * 그리고 map() 도 filter() 처럼 하나의 스트림에 여러 번 적용할 수 있다.
   *
   *   fileStream.map(File::getName) // Stream<File> → Stream<String>
   *     .filter(string -> string.indexOf('.') != -1) // . 이 없는 문자열은 제외시킨다.
   *     .map(string -> string.substring(string.indexOf('.') + 1)) // 문자열에서 '.' 을 찾은 뒤 . 이후만 잘라낸다.
   *     .map(String::toUpperCase)  // 대문자로 변환.
   *     .distinct() // 중복된 요소 제거
   *     .forEach(System.out::print); // 스트림의 요소를 출력. JAVABAKTXT 출력됨.
   *
   *
   * */
  public static void main(String[] args) {
    Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak"),
        new File("Ex2.java"), new File("Ex1.txt"));
    fileStream.map(File::getName) // Stream<File> → Stream<String>
        .filter(string -> string.indexOf('.') != -1) // . 이 없는 문자열은 제외시킨다.
        .map(string -> string.substring(string.indexOf('.') + 1)) // 문자열에서 '.' 을 찾은 뒤 . 이후만 잘라낸다.
        .map(String::toUpperCase)  // 대문자로 변환.
        .distinct() // 중복된 요소 제거
        .forEach(System.out::print);
  }
}
