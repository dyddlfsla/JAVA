package chapter.seven;

public class Chapter07_23 {

  /** ◆ 다형성(Polymorphism)
   *
   * 다형성이란 '여러 가지 형태를 가질 수 있는 능력'을 의미하며, 자바에서는 한 타입의 참조변수에 여러 가지 타입의 객체를 참조할수 있도록
   * 함으로써 다형성을 프로그램적으로 구현하였다. 이를 좀 더 구체적으로 설명하면, 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를
   * 참조할 수 있도록 하는 것이다. 다음을 보자. 지금까지 우리는 생성된 인스턴스를 다루기 위해서 인스턴스의 타입과 일치하는 타입의
   * 참조변수만을 사용했다. 즉, Radio 인스턴스를 다루기 해서는 Radio 타입의 참조변수를 사용하고, CaptionRadio 인스턴스를 다루기 위해서는
   * CationRadio 타입의 참조변수만 사용했다. 이처럼 인스턴스의 타입과 참조변수의 타입이 일치하는 것이 보통이지만 Radio 와 CaptionRadio 가
   * 서로 상속관계에 있을 경우, 다음과 같이 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조하도록 하는 것이 가능하다.
   *
   * 자 그러면 인스턴스를 같은 타입의 참조변수로 참조하는 것과 조상 타입의 참조변수로 참조하는 것 사이에 어떤 차이점이 있을까?
   *
   * 이 경우 실제 인스턴스가 CaptionRadio 타입이라 할지라도, 참조변수 radio1 로는 CaptionRadio 의 모든 멤버를 사용할 수 없다.
   * Radio 타입의 참조변수로는 생성된 CaptionRadio 인스턴스의 멤버 중 Radio 클래스에 정의 되지 않은 멤버, text 와  caption()은
   * 참조변수로 radio1 로 사용이 불가능 하다. 즉, radio1.text 라던가 radio1.caption()이 불가능한 것이다. 둘 다 같은 타입의
   * 인스턴스지만 참조변수의 타입에 따라 사용할 수 있는 멤버가 달라진다.
   *
   * 그렇다면 반대로, 자손타입의 참조변수로 조상타입의 인스턴스를 참조하는 것이 가능할까?
   * 답은 그렇지 않다이다. 그 이유는 실제 인스턴스인 Radio 의 멤버 개수보다 참조변수 captionRadio2 가 사용할 수 있는 멤버가 더 많기 때문이다.
   *
   *
   *
   * */

  public static void main(String[] args) {
    Radio radio1 = new Radio();
    CaptionRadio captionRadio1 = new CaptionRadio();
    Radio radio2 = new CaptionRadio(); //타입 불일치. 조상 타입의 참조변수로 자손 인스턴스를 참조하였다.
    //CaptionRadio captionRadio2 = new Radio(); 에러 발생. 반대로 자손 타입의 참조변수로 조상 타입의 인스턴스를 참조하는 것은 불가능하다.
    CaptionRadio captionRadio2 = (CaptionRadio) new Radio();
    captionRadio2.text = "test";
  }
}



class Radio {
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

class CaptionRadio extends Radio {
  String text;
  void caption() {

  }
}
