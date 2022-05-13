package chapter.seven_2nd._22;

public class Chapter07_22 {

  /** ◆ 캡슐화와 접근 제어자
   *
   * 클래스나 멤버, 주로 멤버에 접근 제어자를 사용하는 이유는 클래스 내부에 선언된 데이터를 보호하기 위해서이다. 데이터가 유효한 값을
   * 유지하도록, 또는 비밀번호와 같은 데이터를 외부에서 함부로 변경하지 못하도록 하기 위해서는 외부로부터의 접근을 제한하는 것이
   * 필요하다. 이것을 데이터 감추기(data hiding) 이라고 하며, 객체지향개념의 캡슐화(encapsulation) 에 해당하는 내용이다.
   *
   * 또 다른 이유는 클래스 내에서만 사용되는, 내부 작업을 위해 임시로 사용되는 멤버변수나 부분작업을 처리하가 위한 메서드 등의 멤버들을
   * 클래스 내부에 감추기 위해서다. 외부에서 접근할 필요가 없는 멤버들을 private 로 지정하여 외부에 노출시키지 않음으로써
   * 복잡성을 줄일 수 있다. 이것 역시 캡슐화에 해당한다.
   *
   * 접근 제어자를 사용하는 이유
   * - 외부로부터 데이터를 보호하기 위해서
   * - 외부에는 필요한, 내부적으로만 사용되는 부분을 감추기 위해서
   *
   * 예를 들어, 시간을 표시하기 위한 클래스 Time 이 다음과 같이 정의되어 있을 때, 이 클래스의 인스턴스를 생성한 다음,
   * 멤버변수에 직접 접근하여 값을 변경할 수 있을 것이다.
   *
   * public class Time {
   *   int hour;
   *   int minute;
   *   int second;
   * }
   *
   * Time time = new Time();
   * time.hour = 25; // 멤버변수에 직접 접근하여 값을 바꿔버렸다.
   *
   * 멤버변수 hour 는 0보다 같거나 크고 24보다는 작은 범위의 값을 가져야 하지만 위의 코드에서처럼 잘못된 값을 지정한다고 해도
   * 이것을 막을 방법은 없다.
   * 이런 경우 멤버변수를 private 나 protected 로 제한하고 멤버변수의 값을 읽고 변경할 수 있는 public 메서드를 제공함으로써
   * 간접적으로 멤버변수의 값을 다룰 수 있도록 하는 것이 바람직하다.
   *
   *
   *
   * */

}

class Time {
  private int hour; //접근 제어자를 private 로 설정하여 외부에서 직접 접근하지 못하도록 한다.
  private int minute;
  private int second;

  public int getHour() {
    return hour;
  }
  public void setHour(int hour) {
    if (hour < 0 || hour > 23) {
      return;
    }
    this.hour = hour;
  }
  public int getMinute() {
    return minute;
  }
  public void setMinute(int minute) {
    if (minute < 0 || minute < 59) {
      return;
    }
    this.minute = minute;
  }
  public int getSecond() {
    return second;
  }
  public void setSecond(int second) {
    if (second < 0 || second > 60) {
      return;
    }
    this.second = second;
  }

  /*
  * get 으로 시작하는 메서드는 단순히 멤버변수의 값을 반환하는 일을 하고, set 으로 시작하는 메서드는 매개변수에 지정된 값을 검사하여
  * 조건에 맞는 값일 때만 멤버변수의 값을 변경하도록 작성되어 있다.
  * 만일 상속을 통해 확장될 것이 예상되는 클래스라면 멤버에 접근 제한을 주되 자손 클래스에서 접근하는 것이 가능하도록 하기 위해
  * private 대신 protected 를 사용한다. private 이 붙은 멤버는 자손 클래스에서도 접근이 불가능하기 때문이다.
  *
  * 보통 멤버변수의 값을 읽는 메서드의 이름을 'get+멤버변수' 로 하고 멤버변수의 값을 변경하는 메서드의 이름을 'set+멤버변수' 으로 한다.
  * 반드시 그렇게 해야 하는 것은 아니지만 암묵적인 규칙이므로 특별한 이유가 없는 한 따르도록 하자. 그리고 'get' 으로 시작하는 메서드를
  * '겟터(getter)', set 로 시작하는 메서드를 '세터(setter)' 라고 부른다.
  *
개 * */
}
