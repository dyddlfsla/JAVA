package chapter.nine._05;

public class Chapter09_5 {

  /** ◆ Object 클래스의 메서드 - toString()
   *
   * 이 메서드는 인스턴스에 대한 정보를 문자열(String)로 제공할 목적으로 정의한 것이다. 인스턴스의 정보를 제공한다는 것은 대부분의 경우
   * 인스턴스 변수에 저장된 값들을 문자열로 표현한다는 뜻이다. Object 클래스에 정의된 toString() 은 다음과 같다.
   *
   * public String toString() {
   *   return getClass().getName() + "@" + Integer.toHexString(hashCode());
   * }
   *
   * 클래스를 작성할 때 toString() 을 오버라이딩하지 않는다면, 위와 같은 내용이 그대로 사용될 것이다.
   * 즉, toString() 을 호출하면 클래스이름과 16진수의 해시코드를 얻게 될 것이다.
   *
   *
   *
   * */

  public static void main(String[] args) {
    Card c1 = new Card();
    Card c2 = new Card();

    System.out.println(c1.toString());
    System.out.println(c2.toString());
  }

  /*
  * Card 인스턴스 두 개를 생성한 다음, 각 인스턴스에 toString() 을 호출한 결과를 출력했다.
  * Card 클래스에서 Object 클래스로부터 상속받은 toString() 을 오버라이딩하지 않았기 때문에 Card 인스턴스에 toString()을 호출하면,
  * Object 클래스의 toString() 이 호출된다.
  *
  * 그래서 위의 결과에 클래스 이름과 16진수 해시코드가 출력되었다. 서로 다른 인스턴스에 대해서 toString()을 호출하였으므로 클래스의 이름은 같아도
  * 해시코드 값이 다르다는 것을 확인할 수 있다.
  *
  * */

}

class Card {
  String kind;
  int number;

  public Card() {
    this("SPADE", 1);
  }

  public Card(String kind, int number) {
    this.kind = kind;
    this.number = number;
  }

  @Override
  public String toString() {
    return "Kind : " + kind + " , number : " + number;
  }

  /*
  * Card 인스턴스의 toString() 을 호출하면 인스턴스가 갖고 있는 인스턴스 변수 kind 와 number 의 값을 문자열로 변환하여
  * 반환하도록 오버라이딩했다. 오버라이딩할 때, Object 클래스에 정의된 toString() 의 접근 제어자가 public 이므로
  * Card 클래스의 toString() 접근제어자도 public 이어야 한다는 점을 눈여겨 보기 바란다.
  *
  * 조상에 정의된 메서드를 자손에서 오버라이딩할 때는 조상에 정의된 접근범위보다 같거나 더 넓어야 하기 때문이다. Object 의 toString()이
  * public 이므로 이를 오버라이딩하는 Card 의 toString() 은 public 보다 좁아질 수 없을 것이다.
  *
  *
  * */
}
