package chapter.five;

import java.util.Arrays;

public class Chapter05_10 {

  public static void main(String[] args) {
    int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(Arrays.toString(numArr));

    for (int i = 0; i < numArr.length; i++) {
      int randomNumber = (int) (Math.random() * 10) + 1;
      int tmp = numArr[0];
      numArr[0] = numArr[randomNumber];
      numArr[randomNumber] = tmp;
    }

    System.out.println(Arrays.toString(numArr));
  }

}
