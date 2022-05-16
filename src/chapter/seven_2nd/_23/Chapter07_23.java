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
   * Tv t = new CaptionTv(); //타입 불일치. 조상 타입의 참조변수로 자손 인스턴스를 참조가 가능하다
   *
   * 이제 인스턴스를 같은 타입의 참조변수로 참조하는 것과 조상 타입의 참조변수로 참조하는 것은 어떤 차이가 있는지에 대해 알아보자.
   *
   * CaptionTv c = new CaptionTv(); // 참조변수와 인스턴스 타입이 일치!
   * Tv t = new CaptionTv(); // 조상 타입 참조변수로 자손 타입 인스턴스 참조
   *
   * 위의 코드에서 CaptionTv 인스턴스 2개를 생성하고, 참조변수 c 와 t 가 생성된 인스턴스를 하나씩 참조하도록 하였다.
   * 이 경우 실제 인스턴스가 CaptionTv 타입이라 할지라도, 참조변수 t 로는 CaptionTv 의 모든 멤버를 사용할 수 없다.
   *
   * Tv 타입의 참조변수로는 CaptionTv 인스턴스의 멤버 중에서 Tv 클래스의 멤버들(상속받은 멤버포함)만 사용할 수 있다. 따라서,
   * 생성된 CaptionTv 인스턴스의 멤버 중에서 Tv 클래스에 정의 되지 않은 멤버, text 와 caption() 은 참조변수 t 로 사용이 불가능하다.
   *
   * 즉, t.text 또는 t.caption() 와 같이 할 수 없다는 것이다. 둘 다 같은 타입의 인스턴스지만 참조변수의 타입에 따라 사용할 수 있는 멤버가 달라진다.
   *
   * t(1x100) → CaptionTv 인스턴스(1x100)
   *            boolean power
   *            int channel
   *            channelUp()
   *            channelDown()
   *            String text //사용불가.
   *            void caption() //사용불가.
   *
   * c(1x200) → CaptionTv 인스턴스(1x200)
   *            boolean power
   *            int channel
   *            channelUp()
   *            channelDown()
   *            String text
   *            void caption() // 참조변수가 CaptionTv 이므로 모든 멤버르 사용할 수 있다.
   *
   * 반대로 아래와 같이 자손 타입의 참조변수에 조상 타입의 인스턴스를 참조하는 것은 가능할까?
   *
   * CaptionTv c = new Tv(); //에러. 허용안됨
   *
   * 그렇지 않다. 위의 코드를 컴파일하면 에러가 발생한다. 그 이유는 실제 인스턴스인 Tv 의 멤버보다 참조변수 c 가 사용할 수 있는 멤버 개수가 더 많기 때문이다.
   * 그래서 이를 허용하지 않는다.
   *
   * - 조상 타입의 참조변수로 자손 타입의 인스턴스를 참조할 수 있다.
   * - 반대로 자손 타입의 참조변수로 조상 타입의 인스턴스를 참조할 수 없다.
   *
   *
   * */

}
