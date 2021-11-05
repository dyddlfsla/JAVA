package chapter.fourteen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter14_15 {

  /**
  *  ◆ 스트림(Stream)이란?
  * 컬렉션이나 배열에 데이터를 담아 다룰 때, 기존의 방식에서는 원하는 결과를 얻기 위해 많은 for문과 Iterator 를 이용해왔다.
  * 그러나 이러한 방식으로 작성된 코드는 너무 길고 알아보기 힘들었으며, 재사용성 역시 떨어졌다. 또한 데이터 소스마다 다른 방식으로 다루어야 한다는
  * 문제점 역시 존재했다. 이러한 문제점을 해결하기 위해서 만든 것이 '스트림(stream)'이다. 스트림은 데이터 소스를 추상화하고, 데이터를 다루는데
  * 자주 사용되는 메서드들을 정의해 놓았다. 여기서 데이터 소스를 추상화했다는 것은 데이터 소스가 무엇이던 간에 같은 방식으로 다룰 수 있게 되었다는 것이다.
  * 즉, 스트림을 이용하면 배열이나 컬렉션뿐만 아니라 파일에 저장된 데이터도 모두 같은 방식으로 다룰 수 있다.
  * 다음과 같은 예를 들 수 있다.
  *
  */

  public static void main(String[] args) {
    String[] strArr = {"aaa", "bbb", "ccc"};
    List<String> strList = Arrays.asList(strArr);

    /** 두 데이터 소스를 기반으로 하는 스트림을 다음과 같이 생성한다.*/

    Stream<String> strStream1 = strList.stream(); // 스트림 생성
    Stream<String> strStream2 = Arrays.stream(strArr);

    strStream1.sorted().forEach(System.out::println); //스트림을 이용하여 데이터 소스를 읽어서 정렬하고 화면에 출력
    strStream2.sorted().forEach(System.out::println);

    /**
     * ◆ 스트림의 특징
     * 1. 스트림은 데이터 소스를 변경하지 않는다.
     *  스트림은 데이터 소스로 부터 데이터를 읽기만할 뿐, 데이터 소스를 변경하지 않는다. 다만, 필요하다면 정렬된 결과를 컬렉션이나 배열에 담아서 반환할 수 있다.
     */
    List<String> sortedList = strStream2.sorted().collect(Collectors.toList()); //정렬된 결과를 새로운 List에 담아서 반환한다.

    /**
    * 2. 스트림은 일회용이다.
    *  스트림은 Iterator처럼 일회용이다. 스트림도 한번 사용하면 닫혀서 다시 사용할 수 없다. 필요하다면 스트림을 다시 생성해야 한다.
    */

    Stream<String> strStream3 = strList.stream();
    strStream3.sorted().forEach(System.out::println);
    long numOfStr = strStream3.count(); // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed. 스트림이 이미 닫혔다.

    /**
    * 3. 스트림은 작업
    *
    * */
 }
}
