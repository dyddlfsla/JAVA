package chapter.eleven._09;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

  public static void main(String[] args) {
    ArrayList list1 = new ArrayList(10); //용량 10인 ArrayList 생성
    list1.add(new Integer(5));
    list1.add(new Integer(4));
    list1.add(new Integer(2));
    list1.add(new Integer(0));
    list1.add(new Integer(1));
    list1.add(new Integer(3));

    ArrayList list2 = new ArrayList(list1.subList(1, 4));
    print(list1, list2);

    Collections.sort(list1);
    Collections.sort(list2);

    print(list1, list2);

    System.out.println("list.containsAll(list2):" + list1.containsAll(list2));

    list2.add("B");
    list2.add("C");
    list2.add(3, "A");
    print(list1, list2);

    list2.set(3, "AA");
    print(list1, list2);

    //list1에서 list2와 겹치는 부분만 남기고 나머지는 다 삭제한다.
    System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));

    print(list1, list2);

    //list2 에서 list1에 포함된 객체들을 삭제한다.
    for (int i = list2.size() - 1; i >= 0; i--) {
      if (list1.contains(list2.get(i))) {
        list2.remove(i);
      }
    }
    print(list1, list2);

  }

  static void print(ArrayList list1, ArrayList list2) {
    System.out.println("list1: " + list1);
    System.out.println("list2: " + list2);
    System.out.println();
  }

  /**
   * 위의 예제는 ArrayList 의 기본적인 메서드를 이용해서 객체를 다루는 방법을 보여준다.
   * ArrayList 는 List 인터페이스를 구현했기 때문에 저장된 순서를 유지한다는 것을 알 수 있다.
   * 그리고 Collection 클래스의 sort 메서드를 이용해서 ArrayList 에 저장된 객체들을 정렬하였는데 Collection 클래스에 대한 내용과
   * 정렬(sort) 하는 방법에 대해서는 후에 자세히 다룰 것이다.
   *
   * ※ Collection 은 인터페이스고 Collections 는 클래스임에 주의하자.
   *
   * */
}
