package chapter.six;

public class Chapter06_07 {

  /** ◆ 객체의 생성과 사용 예제
   *
   * 같은 클래스로부터 생성되었을지라도 각 인스턴스의 속성(멤버변수)는 서로 다른 값을 유지할 수 있으며,
   * 메서드의 내용은 모든 인스턴스에 대해 동일하다.
   *
   *
   * */
  public static void main(String[] args) {
    Tv tv1 = new Tv();
    Tv tv2 = new Tv();
    System.out.printf("tv1 의 channel 값은 %d 입니다.%n", tv1.channel);
    System.out.printf("tv2 의 channel 값은 %d 입니다.%n", tv2.channel);

    tv1.channel = 7;
    System.out.printf("tv1 의 channel 값은 %d 입니다.%n", tv1.channel);

    System.out.printf("tv1 의 channel 값은 %d 입니다.%n", tv1.channel);
    System.out.printf("tv2 의 channel 값은 %d 입니다.%n", tv2.channel);
  }
}
