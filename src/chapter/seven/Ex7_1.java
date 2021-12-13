package chapter.seven;

class Tv {
  boolean power;
  int channel;

  void power() {
    power = !power;
  }
  void channelUp() {
    ++channel;
  }
  void channelDown() {
    --channel;
  }
}

class CationTv extends Tv {
  boolean caption;
  void displayCaption(String text) {
    if (caption) {
      System.out.printf("%s%n", text);
    }
  }
}

public class Ex7_1 {

  public static void main(String[] args) {
    CationTv cationTv = new CationTv();
    cationTv.channel = 10;
    cationTv.channelUp();
    System.out.printf("%d%n", cationTv.channel);
    cationTv.displayCaption("Hello, world!");
    cationTv.caption = true;
    cationTv.displayCaption("Hello, world!");
  }

  /*
  * 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 함께 생성되기 때문에 따로 조상 클래스의 인스턴스를 생성하지 않고도
  * 조상 클래스의 멤버들을 사용할 수 있다.
  * */
}
