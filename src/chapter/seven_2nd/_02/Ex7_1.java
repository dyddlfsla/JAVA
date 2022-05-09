package chapter.seven_2nd._02;

class Tv {
  boolean power; //전원상태 (on / off)
  int channel; // 채널

  void power() {power = !power;}
  void channelUp() {channel++;}
  void channelDown() {channel--;}
}

class CaptionTv extends Tv { //CaptionTv 에는 캡션(자막) 을 보여주는 기능을 추가하였다.
  boolean caption; // 자막 상태(On / Off)
  void displayCaption(String text) {
    if(caption) { //자막 상태가 on 일 때만 text 를 보여준다.
      System.out.printf("%s \n", text);
    }
  }
}
public class Ex7_1 {

  public static void main(String[] args) {
    CaptionTv captionTv = new CaptionTv();
    captionTv.channel = 10;    //조상 클래스로부터 상속 받은 멤버
    captionTv.channelDown(); //조상 클래스로부터 상속 받은 멤버
    System.out.printf("%d\n", captionTv.channel);
    captionTv.displayCaption("hello, world");
    captionTv.caption = true; // 자막 기능을 켠다.
    captionTv.displayCaption("hello, world");
  }

  /**
   * Tv 클래스로부터 상속 받고 기능을 추가하여 Caption Tv 클래스를 작성하였다.
   * 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 함께 생성되기 떄문에 따로 조상 클래스의 인스턴스를 생성하지 않아도
   * 조상 클래스의 멤버들을 사용할 수 있다.
   *
   *
   * */

}
