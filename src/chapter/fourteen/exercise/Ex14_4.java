package chapter.fourteen.exercise;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_4 {

  /*
  * 14-4. 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
  *
  * */

  public static void main(String[] args) {
    int[][] intArr = new int[][]{
        {1, 1}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6},
        {2, 1}, {2, 2}, {2, 3}, {2, 4}, {2, 5}, {2, 6},
        {3, 1}, {3, 2}, {3, 3}, {3, 4}, {3, 5}, {3, 6},
        {4, 1}, {4, 2}, {4, 3}, {4, 4}, {4, 5}, {4, 6},
        {5, 1}, {5, 2}, {5, 3}, {5, 4}, {5, 5}, {5, 6},
        {6, 1}, {6, 2}, {6, 3}, {6, 4}, {6, 5}, {6, 6}
    };
    Stream.of(intArr)
        .filter(arr -> Arrays.stream(arr).sum() == 6)
        .forEach(arr -> System.out.println(Arrays.toString(arr)));

  }




}
