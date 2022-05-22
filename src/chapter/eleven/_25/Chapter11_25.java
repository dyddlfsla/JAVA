package chapter.eleven._25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Chapter11_25 {

  /** ◆ Arrays 의 다양한 메서드 (1)
   *
   * Arrays 클래스에는 배열을 다루는데 유용한 메서드가 정의되어 있다. 같은 기능의 메서드가
   * 배열의 타입만 다르게 오버로딩되어 있어서 많아 보이지만, 실제로는 그리 많지 않다.
   * 예를 들어, 아래는 Arrays 에 정의된 toString() 인데, 모든 기본형 배열과 참조형 배열에 대해 하나씩 정의되어 있는 것을 볼 수 있다.
   *
   * ※ Arrays 에 정의된 메서드는 모두 static 메서드이다.
   *
   * static String toString(boolean[] a) {...}
   * static String toString(byte[] a) {...}
   * static String toString(char[] a) {...}
   * ...
   *
   *
   * 1. 배열의 복사 - copyOf(), copyOfRange()
   * copyOf() 는 배열 전체를, copyOfRange() 는 배열의 일부를 복사해서 새로운 배열을 만들어 반환한다. 늘 그렇듯이
   * copyOfRange() 에 지정된 범위의 끝은 포함되지 않는다.
   *
   * 2. 배열 채우기 - fill(), setAll()
   * fill() 은 배열의 모든 요소를 지정된 값으로 채운다. setAll() 은 배열을 채우는데 사용할 함수형 인터페이스를 매개변수로 받는다.
   * 이 메서드를 호출할 때는 함수형 인터페이스를 구현한 객체를 매개변수로 지정하던가 아니면 람다식을 지정해야 한다.
   *
   * int[] arr7 = new int[5];
   * Arrays.fill(arr7, 9);
   * Arrays.setAll(arr7, (i) -> (int) (Math.random() * 5) + 1);
   *
   * 위 문장에 사용된 (i) -> (int) (Math.random() * 5) + 1); 은 '람다식(lambda expression)' 인데
   * 1 ~ 5 의 범위에 속한 임의의 정수를 반환하는 일을 한다. 그리고 setAll() 메서드는 이 람다식이 반환한 임의의 정수로 배열을 채운다.
   * 아직 함수형 인터페이스와 람다식을 배우지 않았으므로 이 정도로만 이해하고 넘어가자.
   *
   * 3. 배열의 정렬과 탐색 - sort(), binarySearch()
   * sort() 는 배열을 정렬할 때, 그리고 배열에 저장된 요소를 검색할 때는 binarySearch() 를 사용한다. binarySearch() 는
   * 배열에서 지정된 값이 저장된 위치(index) 를 찾아서 반환하는데, 반드시 배열이 정렬된 상태이어야 올바른 결과를 얻는다.
   * 그리고 만약 검색한 값과 일치하는 요소들이 여러 개 있다면, 이 중에서 어떤 것의 위치가 반환될지는 알 수 없다.
   *
   * 배열의 첫 번째 요소부터 순서대로 하나씩 검색하는 것을 '순차 검색(linear search)' 라고 하는데, 이 검색 방법은 배열이 정렬되어 있을 필요는 없지만
   * 배열의 요소를 하나씩 비교하기 때문에 시간이 많이 걸린다. 반면에 이진 검색(binary search) 은 배열의 검색할 범위를 반복적으로 절반씩 줄여가면서 검색하기 때문에
   * 검색 속도가 상당히 빠르다. 배열의 길이가 10배가 늘어나도 검색 횟수는 3 ~ 4회 밖에 늘어나지 않으므로 큰 배열의 검색에 유리하다.
   * 단, binarySearch() 는 배열이 정렬되어 있는 경우에만 사용할 수 있다는 단점이 있다.
   *
   *
   *
   * */

  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4};
    int[] arr2 = Arrays.copyOf(arr, arr.length); //arr2 = [0, 1, 2, 3, 4]
    System.out.println(Arrays.toString(arr2));
    int[] arr3 = Arrays.copyOf(arr, 3); //arr3 = [0, 1, 2]
    System.out.println(Arrays.toString(arr3));
    int[] arr4 = Arrays.copyOf(arr, 7); //arr4 = [0, 1, 2, 3, 4, 0, 0]
    System.out.println(Arrays.toString(arr4));
    int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr5 = [2, 3] → 4는 미포함
    System.out.println(Arrays.toString(arr5));
    int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr6 = [0, 1, 2, 3, 4, 0, 0]
    System.out.println(Arrays.toString(arr6));

    int[] arr7 = new int[5];
    Arrays.fill(arr7, 9);
    System.out.println(Arrays.toString(arr7));
    Arrays.setAll(arr7, (i) -> (int) (Math.random() * 5) + 1);
    System.out.println(Arrays.toString(arr7));

    int[] arr8 = {3, 2, 0, 1, 4};
    int idx = Arrays.binarySearch(arr8, 2);
    System.out.println(idx); // 배열이 정렬되지 않은 상태에서 binarySearch() 를 사용하면 idx = -5 라는 잘못된 값이 반환된다.

    Arrays.sort(arr8);
    System.out.println(Arrays.binarySearch(arr8, 2)); // idx = 2, 올바른 결과
  }

}
