package chapter.five;

public class Chapter05_04 {

  /** ◆ 배열의 길이 (length)
   *
   * 자바에서는 자바 가상 머신(JVM)이 모든 배열의 길이를 별도로 관리하며, '배열이름.length' 를 통해서
   * 배열 길이에 대한 정보를 얻을 수 있다.
   *
   * int[] arr = new int[5];
   * int tmp = arr.length; //tmp 에 배열의 길이인 5가 저장된다.
   *
   * 배열은 한번 생성하면 길이를 변경할 수 없기 때문에, 이미 생성된 배열의 길이는 변하지 않는다.
   * 즉, '배열이름.length' 는 상수다. 값을 읽을 수만 있을 뿐 변경할 수 없는 것이다.
   *
   * 그래서 for 문의 조건식에 배열의 길이를 직접 적어주는 것 보다는 '배열이름.length' 를 사용하는 것이 좋다.
   *
   *  int[] score = new int[5];
   *  for (int i = 0; i < score.length; i++) {
   *    System.out.println(score[i]);
   *  }
   *
   * */

}
