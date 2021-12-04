package chapter.four;

public class Chapter04_12 {

  /** ◆ 임의의 정수 만들기 Math.random()
   *
   * 난수를 얻기 위해서는 Math.random()를 사용해야 하는데, 이 메서드는 0.0 과 1.0
   * 사이의 범위에 속하는 하나의 double 값을 반환한다. 0.0은 범위에 포함되고 1.0은 포함되지 않는다
   *
   *  0.0 <= Math.random() < 1.0
   *
   *  만일 1과 3사이의 정수를 구하기 원한다면 다음과 같이 할 수 있다.
   *
   *  ① 각 변에 3을 곱한다.
   *
   *  0.0 * 3 <= Math.random() * 3 < 1.0 * 3
   *  0.0 <= Math.random() * 3 < 3.0
   *
   *  ② 각 변을 int 로 형변환 한다.
   *  (int) 0.0 <= (int) (Math.random() * 3) < (int) 3.0
   *  0 <= (int) (Math.random() * 3) < 3
   *
   *  ③ 각 변에 1을 더한다.
   *  0 + 1 <= (int) (Math.random() * 3) + 1 < 3 + 1
   *  1 <= (int) (Math.random() * 3) + 1 < 4
   *
   *  이제 1부터 3사이의 정수를 하나 얻을 수 있게 되었다. 4는 포함하지 않는다.
   *
   *
   * */

  public static void main(String[] args) {
    int num = 0;
    for (int i = 1; i <= 5; i++) {
      num = (int) (Math.random() * 6) + 1;
      System.out.println(num);
    }
  }

}
