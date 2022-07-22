package chapter.seven.exercise;

public class Exercise7_4 {

  /*
   * 7-4. MyTv 클래스의 멤버변수 isPowerOn, channel, volume 을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
   * 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter() 와 setter() 메서드를 추가하시오.
   *
   *
   * 7-5. 이전 채널로 이동하는 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
   * 메서드명: goToPrevChannel / 기능: 현재 채널을 이전 채널로 변경한다. / 반환타입: 없음 / 매개변수: 없음
   *
   * */

  public static void main(String[] args) {
    MyTv myTv = new MyTv();
    myTv.setChannel(10);
    System.out.println("CH: " + myTv.getChannel());
    myTv.setChannel(20);
    System.out.println("CH: " + myTv.getChannel());
    myTv.goToPrevChannel();
    System.out.println("CH: " + myTv.getChannel());
    myTv.goToPrevChannel();
    System.out.println("CH: " + myTv.getChannel());
  }
}

class MyTv {

  private boolean isPowerOn;
  private int channel;
  private int volume;
  private int prevChannel;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  public boolean isPowerOn() {
    return isPowerOn;
  }

  public void setPowerOn(boolean powerOn) {
    isPowerOn = powerOn;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    if (channel > MIN_CHANNEL && channel < MAX_CHANNEL) {
      prevChannel = this.channel;
      this.channel = channel;
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume > MIN_VOLUME && volume < MAX_VOLUME) {
      this.volume = volume;
    }
  }

  public void goToPrevChannel() {
    setChannel(prevChannel);
  }
}
