package chapter.fourteen.exercise;

import java.util.Random;

public class Ex14_7 {

  /*
  * 14-7. 임의의 로또 번호 (1 ~ 45) 를 정렬해서 출력하시오.
  *
  * sol:
  *
  * */
  public static void main(String[] args) {
    new Random().ints(6, 1, 46)
        .distinct()
        .limit(6)
        .sorted()
        .forEach(System.out::println);
  }
}
