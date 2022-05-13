package chapter.seven_2nd._23;

public class Chapter07_23 {

  /** ◆ 다형성(polymorphism)
   *
   * 다형성이란 '여러 가지 형태를 가질 수 있는 성질' 을 의미하며, 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함으로써
   * 다형성을 프로그래밍적으로 구현하였다. 이를 좀 더 구체적으로 말하자면, 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조할 수 있도록 한 것이다.
   * 예제를 통해 보다 자세히 살펴보자
   *
   * class Tv {
   *   boolean power;
   *   int channel;
   *
   *   void power() {power = !power;}
   *   void channelDown() {channel--}
   *   void channelUp() {channel++}
   *
   * }
   *
   * class CaptionTv extends Tv {
   *   String text;
   *   void caption() {...}
   * }
   *
   * 지금까지 우리는 생성된 인스턴스를 다루기 위해서, 인스턴스의 타입과 일치하는 타입의 참조변수만을 사용했다. 즉, Tv 인스턴스를 참조하기 위해
   * Tv 타입의 참조변수를 사용하고 CaptionTv 의 인스턴스를 참조하기 위해 CaptionTv 타입의 참조변수를 사용했다.
   *
   * Tv t = new Tv();
   * CaptionTv c = new CaptionTv();
   *
   * 이처럼 인스턴스의 타입과 참조변수의 타입이 일치하는 것이 보통이지만, Tv 와 CaptionTv 클래스가 서로 상속관계에 있을 경우, 다음과 같이
   * 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조하도록 하는 것도 가능하다.
   *
   *
   * */

}
