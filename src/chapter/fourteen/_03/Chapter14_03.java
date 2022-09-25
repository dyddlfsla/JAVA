package chapter.fourteen._03;

public class Chapter14_03 {

  public static void main(String[] args) {

  }

  /*
  * ◆ 람다식의 예
  *
  * 직접 람다식을 작성한 다음 바르게 변환하였는지 확인해보자.
  *
  * ① int max(int a, int b) {
  *     return a > b ? a : b;
  *   }
  *
  * (int a, int b) -> { return a > b ? a : b;}
  * (a, b) -> a > b ? a : b
  *
  * ② void printVar(String name, int i) {
  *     System.out.println(name + " = " + i);
  *   }
  *
  * (String name, int i) -> {System.out.println(name + " = " + i);}
  * (name, i) -> System.out.println(name + " = " + i)
  *
  *
  * ③ int square(int x) {
  *     return x * x;
  *   }
  *
  * (int x) -> { return x * x;}
  *  x -> x * x
  *
  * ④ int roll() {
  *     return (int) (Math.random() * 6;
  *   }
  * () -> {return (int) (Math.random() * 6);}
  * () -> (int) (Math.random() * 6)
  *
  *
  * ⑤ int sumArr(int[] arr) {
  *     int sum = 0;
  *     for (int i : arr) {
  *       sum += i;
  *     }
  *     return sum;
  *   }
  *
  * (int[] arr) -> {
  *     int sum = 0;
  *     for (int i : arr) {
  *       sum += i;
  *     }
  *     return sum;
  * }
  *
  * (int[] arr) -> {
  *   int sum = 0;
  *   for (int i : arr) {
  *     sum += i;
  *   }
  * }
  *
  *
  *
  * */

}
