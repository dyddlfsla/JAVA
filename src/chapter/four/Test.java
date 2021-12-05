package chapter.four;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    int sum = 0;
    int i = 1;
    int sign = 1;
    while (sum < 100) {
      sum += i * sign;
      System.out.println("i = " + i + ", sum = " + sum);
      i++;
      sign = -sign;
    }
  }
}