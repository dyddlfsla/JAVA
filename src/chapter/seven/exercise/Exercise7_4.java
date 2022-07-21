package chapter.seven.exercise;

public class Exercise7_4 {

  /*
   * MyTv 클래스의 멤버변수 isPowerOn, channel, volume 을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
   * 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter() 와 setter() 메서드를 추가하시오.
   *
   *
   * */

  public static void main(String[] args) {

  }

}

class MyTv {

  private boolean isPowerOn;
  private int channel;
  private int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;
}
