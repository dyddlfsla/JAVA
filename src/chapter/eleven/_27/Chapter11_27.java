package chapter.eleven._27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter11_27 {

  /** ◆ Arrays 의 다양한 메서드 (2)
   *
   * 1. 문자열의 비교와 출력 - equals(), toString()
   *
   * toString() 으로 배열의 모든 요소를 문자열로 편하게 출력할 수 있다. 이미 많이 사용해서 익숙할 것이다.
   * toString() 은 일차원 배열에만 사용할 수 있으므로, 다차원 배열에는 deepToString() 을 사용해야 한다.
   * deepToString() 은 배열의 모든 요소를 재귀적으로 접근해서 문자열을 구성하므로 2차원뿐만 아니라 3차원 이상의 배열에도 동작한다.
   *
   * equals() 는 두 배열에 저장된 모든 요소를 비교해서 같으면 true, 다르면 false 를 반환한다.
   * equals() 도 일차원 배열에만 사용가능하므로, 다차원 배열의 비교에는 deepEquals() 를 사용해야 한다.
   *
   *
   * 2. 배열을 List 로 변환 - asList(Object... a)
   * asList() 는 배열을 List 에 담아서 반환한다. 매개변수의 타입이 가변인수라서 배열 생성없이 저장할 요소들만 나열하는 것도 가능하다.
   * List list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
   * List list2 = Arrays.asList(1, 2, 3, 4, 5);
   * list.add(6); //UnsupportedOperationException 발생
   *
   * 한 가지 주의할 점은 asList() 가 반환한 List 는 그 크기를 변경할 수 없다는 것이다. 즉, 추가 또는 삭제가 불가능하다.
   * 저장된 내용은 변경가능하다. 만일 크기를 변경할 수 있는 List 가 필요하다면 다음과 같이 하면 된다.
   *
   * List list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
   *
   *
   *
   *
   * */
  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4};
    int[][] arr2D = {
        {11, 12},
        {21, 22}
    };

    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.deepToString(arr2D));

    String[][] str2D = new String[][]{
        {"aaa", "bbb"},
        {"AAA", "BBB"}
    };
    String[][] str2D2 = new String[][]{
        {"aaa", "bbb"},
        {"AAA", "BBB"}
    };

    System.out.println(Arrays.equals(str2D, str2D2));
    System.out.println(Arrays.deepEquals(str2D, str2D2)); //다차원 배열을 비교할 때에는 deepEquals() 를 사용해야 한다.

    List list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
    System.out.println(Arrays.toString(list.toArray()));
    List list2 = Arrays.asList(1, 2, 3, 4, 5);
    System.out.println(Arrays.toString(list2.toArray()));

    List list3 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(Arrays.toString(list3.toArray()));
    list3.add(6);
    System.out.println(Arrays.toString(list3.toArray()));
  }
}

class Ex11_6 {

  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5};
    int[][] arr2D = {
        {11, 12, 13},
        {21, 22, 23}
    };

    System.out.println("arr = " + Arrays.toString(arr));
    System.out.println("arr2D = " + Arrays.deepToString(arr2D));

    int[] arr2 = Arrays.copyOf(arr, arr.length);
    int[] arr3 = Arrays.copyOf(arr, 3);
    int[] arr4 = Arrays.copyOf(arr, 7);
    int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
    int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

    System.out.println("arr2 = " + Arrays.toString(arr2));
    System.out.println("arr3 = " + Arrays.toString(arr3));
    System.out.println("arr4 = " + Arrays.toString(arr4));
    System.out.println("arr5 = " + Arrays.toString(arr5));
    System.out.println("arr6 = " + Arrays.toString(arr6));

    int[] arr7 = new int[5];
    Arrays.fill(arr7, 9);
    System.out.println("arr7 = " + Arrays.toString(arr7));

    Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1);
    System.out.println("arr7 = " + Arrays.toString(arr7));

    for (int i : arr7) {
      char[] graph = new char[i];
      Arrays.fill(graph, '*');
      System.out.println(new String(graph) + i);
    }

    String[][] str2D = new String[][]{
        {"aaa", "bbb"},
        {"AAA", "BBB"}
    };
    String[][] str2D2 = new String[][]{
        {"aaa", "AAA"},
        {"bbb", "BBB"}
    };

    System.out.println(Arrays.equals(str2D, str2D2));
    System.out.println(Arrays.deepEquals(str2D, str2D2));

    char[] chArr = {'A', 'D', 'C', 'B', 'E'};

    System.out.println("chArr = " + Arrays.toString(chArr));
    System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
    System.out.println("= After sorting =");
    Arrays.sort(chArr);
    System.out.println("chArr = " + Arrays.toString(chArr));
    System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
  }
}