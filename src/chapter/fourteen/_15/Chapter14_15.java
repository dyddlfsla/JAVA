package chapter.fourteen._15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void showName() {
    System.out.println(name);
  }

  @Override
  public String toString() {
    return name;
  }
}

public class Chapter14_15 {

  /*
  * ◆ 스트림 (Stream)
  *
  * 지금까지 우리는 많은 수의 데이터를 다룰 때, 컬렉션이나 배열에 데이터를 담고 원하는 결과를 얻기 위해 for 문과 Iterator 를 이용해서
  * 코드를 작성해왔다. 그러나 이러한 방식으로 작성된 코드는 너무 길고 알아보기 어렵다. 그리고 재사용성도 떨어진다.
  *
  * 또 다른 문제는 데이터 소스마다 다른 방식으로 다뤄야 한다는 것이다. Collection 이나 Iterator 와 같은 인터페이스를 이용해서
  * 컬렉션을 다루는 방식을 어느정도 표준화하기는 했지만, 각 컬렉션 클래스에는 같은 기능의 메서드들이 중복해서 정의되어 있다.
  * 예를 들어 List 를 정렬할 때에는 Collections.sort() 를 사용해야 하고, 배열을 정렬할 때는 Arrays.sort() 를 사용해야 한다.
  *
  * 이러한 문제점들을 해결하기 위해서 만든 것이 '스트림(Stream)' 이다. 스트림은 데이터 소스를 추상화하고, 데이터를 다루는 데 자주 사용되는 메서드들을 정의해 놓았다.
  * 데이터 소스를 추상화하였다는 것은, 데이터 소스가 무엇이던 간에 같은 방식으로 다룰 수 있게 되었다는 것과 코드의 재사용성이 높아진다는 것을 의미한다.
  *
  * 스트림을 이용하면, 배열이나 컬렉션뿐만 아니라 파일에 저장된 데이터도 모두 같은 방식으로 다룰 수 있다.
  *
  * 예를 들어, 문자열 배열과 같은 내용의 문자열을 저장하는 List 가 있을 때
  * String[] strArr= { "aaa", "ddd", "ccc"};
  * List<String> strList = Arrays.asList(strArr);
  *
  * 이 두 데이터 소스를 기반으로 하는 스트림은 다음과 같이 생성한다.
  *
  * Stream<String> strStream1 = strList.stream(); //스트림을 생성.
  * Stream<String> strStream2 = Arrays.stream(strArr); // 스트림을 생성.
  *
  * 이 두 스트림으로 데이터 소스의 데이터를 읽어서 정렬하고 화면에 출력하는 방법은 다음과 같다. 원본 데이터 소스가 정렬되는 것이 아님에 주의한다.
  *
  * strStream1.sorted().forEach(System.out::println);
  * strStream2.sorted().forEach(System.out::println);
  *
  * 위에서 본 것 처럼, 이 두 스트림의 데이터 소스는 서로 다르지만, 정렬하고 출력하는 방법은 완전히 동일하다.
  *
  *
  *
  * */

  public static void main(String[] args) {

    List<Person> list = Arrays.asList(new Person("홍길동"), new Person("김자바"), new Person("왕자바"));
    list.forEach(System.out::println);
  }

  public void showName(Person person) {
    System.out.println(person.getName());
  }

  Consumer<Person> consumer = person -> System.out.println(person.getName());
}
