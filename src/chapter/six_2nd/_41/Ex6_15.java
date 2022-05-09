package chapter.six_2nd._41;

public class Ex6_15 {

  static int[] arr = new int[10]; //클래스 변수

  static { //클래스 초기화 블럭
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 10) + 1;
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < Ex6_15.arr.length; i++) {
      System.out.printf("arr[i] : %d \n", arr[i]);
    }
  }
  /**
   * 예제 코드를 살펴보면 명시적 초기화를 통해 배열 arr 을 생성하고 클래스 초기화 블럭을 이용해 배열의 각 요소들을 임의의 값으로 채우게 하였다.
   * 이처럼 배열이나 예외처리가 필요한 초기화에서는 명시적 초기화만으로는 복잡한 초기화 작업을 할 수 없다. 이런 경우에는
   * 추가적으로 초기화 블럭을 사용하도록 한다.
   *
   * */
}
