package chapter.eleven._55;

import static java.util.Collections.*;

import java.util.*;

public class Ex11_19 {

  public static void main(String[] args) {
    List list = new ArrayList();
    System.out.println(list);

    addAll(list, 1, 2, 3, 4, 5);
    System.out.println(list);

    rotate(list, 2); // 오른쪽으로 2칸씩 이동
    System.out.println(list);

    swap(list, 0, 2); // 첫번째와 세번째를 교환
    System.out.println(list);

    shuffle(list); // 저장된 요소의 위치를 임의로 변경
    System.out.println(list);

    sort(list); // 저장된 요소를 정렬
    System.out.println(list);

    sort(list, reverseOrder()); // 역순 정렬 reverse(list); 와 동일
    System.out.println(list);

    int idx = binarySearch(list, 3); // 3이 저장된 위치를 검색해서 위치를 반환.
    System.out.println("idx of 3 = " + idx);

    System.out.println("max = " + max(list));
    System.out.println("min = " + min(list));
    System.out.println("min = " + max(list, reverseOrder()));

    fill(list, 9); // list 를 9로 채운다.
    System.out.println("list = " + list);

    List newList = nCopies(list.size(), 2); // list 와 같은 크기의 newList 를 생성하고 2로 채운다. 단, 결과는 변경 불가
    System.out.println("newList = " + newList);

    System.out.println(disjoint(list, newList)); // 두 컬렉션 간에 공통 요소가 없으면 true 반환

    copy(list, newList); // 두번째 인자의 컬렉션을 소스로 해서 컬렉션을 복사함.

    System.out.println("newList = " + newList);
    System.out.println("list = " + list);

    replaceAll(list, 2, 1); //기존의 요소를 새로운 요소로 대체함
    System.out.println("list = " + list);

    Enumeration enumeration = enumeration(list);
    ArrayList list2 = list(enumeration);

    System.out.println("list2 = " + list2);
  }

}
