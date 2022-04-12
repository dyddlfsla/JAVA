package chapter.six_2nd._07;

public class Chapter06_7 {

  /** ◆ 객체의 생성과 사용 예제
   *
   * 같은 클래스로부터 생성되었을지라도 각 인스턴스의 속성(멤버변수)는 서로 다른 값을 유지할 수 있으며,
   * 메서드의 내용은 모두 동일하다.
   * */
}

class Tv {
  // Tv 객체의 속성과 기능을 클래스의 변수와 메서드에 대응시켜 작성한다.
  //1. Tv 객체의 속성
  String color; //색상
  boolean power; //전원상태(On/off)
  int channel; // 채널

  //2. Tv 객체의 기능
  void power() { // Tv 의 전원을 키거나 끈다.
    power = !power;
  }
  void channelUp() { //Tv 의 채널을 올린다
    channel++;
  }
  void channelDown() { //Tv 의 채널을 내린다.
    channel--;
  }
}

class Ex6_2 {

  public static void main(String[] args) {
    Tv t1 = new Tv(); //Tv t1; t1 = new Tv(); 를 한 문장으로 가능
    Tv t2 = new Tv();
    System.out.printf("t1 의 channel 값은 %d 입니다.%n", t1.channel);
    System.out.printf("t2 의 channel 값은 %d 입니다.%n", t2.channel);

    t1.channel = 7;
    System.out.printf("t1 의 channel 값을 7로 변경하였습니다. %n");

    System.out.printf("t1 의 channel 값은 %d 입니다. %n", t1.channel);
    System.out.printf("t2 의 channel 값은 %d 입니다. %n", t2.channel);
  }


}
