package chapter.fourteen._09;

import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter14_09 {

  /*
   * ◆ Predicate 의 결합
   *
   * 여러 조건식을 논리 연산자인 &&(and), ||(or), !(not) 으로 연결해서 하나의 식을 구성할 수 있는 것 처럼,
   * 여러 Predicate 를 and(), or(), negate() 로 연결해서 하나의 새로운 Predicate 로 결합할 수 있다.
   *
   * Predicate<Integer> p1 = i -> i < 100;
   * Predicate<Integer> p2 = i -> i < 200;
   * Predicate<Integer> p3 = i -> i%2 == 0;
   * Predicate<Integer> p4 = p1.negate(); // i >= 100;
   *
   * (i >= 100) && (i < 200 || i%2 == 0)
   * Predicate<Integer> all = p4.and(p2.or(p3));
   * System.out.println(all.test(150)); // true
   *
   * 이처럼 and(), or(), negate() 로 여러 조건식을 하나로 합칠 수 있다. 물론 아래와 같이 람다식을 직접 넣을 수 도 있다.
   *
   * Predicate<Integer> all = p4.and(i -> i < 200).or(i -> i%2 == 0);
   * ※ Predicate 끝에 negate() 를 붙이면 조건식 전체가 부정이 된다.
   *
   * 그리고 static 메서드인 isEqual() 은 두 대상을 비교하는 Predicate 를 만들 때 사용한다. 먼저,
   * isEqual() 의 매개변수로 비교 대상을 하나 지정하고, 또 다른 비교대상은 test() 의 매개변수로 지정한다.
   *
   * Predicate<String> p = Predicate.isEqual(str1);
   * boolean result = p.test(str2); // str1 과 str2 가 같은지 비교하여 결과를 반환한다.
   *
   * 위의 두 문장을 합치면 아래와 같은데, 아래의 문장이 더 이해하기 쉬울 것이다.
   *
   * boolean result = Predicate.isEqual(str1).test(str2);
   *
   *
   *
   *
   * */
  public static void main(String[] args) {
    Function<String, Integer> function1 = s -> Integer.parseInt(s, 16);
    Function<Integer, String> function2 = i -> Integer.toBinaryString(i);

    Function<String, String> function3 = function1.andThen(function2);
    Function<Integer, Integer> function4 = function1.compose(function2);

    System.out.println(function3.apply("FF"));
    System.out.println(function4.apply(2));

    Function<String, String> function5 = x -> x;
    System.out.println(function5.apply("AAA"));

    Predicate<Integer> p1 = i -> i < 100;
    Predicate<Integer> p2 = i -> i < 200;
    Predicate<Integer> p3 = i -> i % 2 == 0;
    Predicate<Integer> p4 = p1.negate(); // i >= 100;

    Predicate<Integer> all = p4.and(p2.or(p3));
    System.out.println(all.test(150)); // true

    String str1 = "abc";
    String str2 = "abc";

    Predicate<String> e1 = Predicate.isEqual(str1);
    boolean result = e1.test(str2);
    System.out.println(result);

  }
}
