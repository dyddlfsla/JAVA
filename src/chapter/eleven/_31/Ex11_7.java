package chapter.eleven._31;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {

  public static void main(String[] args) {
    String[] strArr = {"cat", "Dog", "lion", "tiger"};

    Arrays.sort(strArr); // String 의 Comparable 구현에 의한 정렬
    System.out.println("strArr = " + Arrays.toString(strArr));

    Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분하지 않고 정렬
    System.out.println("strArr = " + Arrays.toString(strArr));

    Arrays.sort(strArr, new Descending()); // Comparator 를 새로 구현한 Descending 을 이용하여 정렬하기
    System.out.println("strArr = " + Arrays.toString(strArr));

  }

}

class Descending implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {
    if (o1 instanceof Comparable && o2 instanceof Comparable) {
      Comparable c1 = (Comparable) o1;
      Comparable c2 = (Comparable) o2;
      return c1.compareTo(c2) * -1; // -1 을 곱해서 기본 정렬방식의 역으로 변경한다.
    }
    return -1;
  }

  /*
  * Arrays.sort() 는 배열을 정렬할 때, Comparator 를 지정해주지 않으면 저장하는 객체(Comparable 을 구현한 클래스의 객체)에 구현된 내용에 따라 정렬된다.
  * static void sort(Object[] a) // 객체 배열에 저장된 객체가 구현한 Comparable 에 의한 정렬
  * static void sort(Object[] a, Comparator c) // 지정한 Comparator 에 의한 정렬
  *
  * String 의 Comparator 구현은 문자열이 사전 순으로 정렬되도록 작성되어 있다. 문자열의 오름차순 정렬은 공백, 숫자, 대문자, 소문자의 순으로 정렬되는 것을 말한다.
  * 정확히 얘기하면 문자의 유니코드의 순서가 작은 값에서부터 큰 값으로 정렬되는 것이다. 그리고 아래와 같이 대소문자를 구분하지 않고 비교하는 Comparator 를 상수의 형태로 제공한다.
  *
  * public static final Comparator CASE_INSENSITIVE_ORDER
  *
  * 이 Comparator 를 이용하면 문자열을 대소문자 구분없이 정렬할 수 있다.
  *
  * */
}
