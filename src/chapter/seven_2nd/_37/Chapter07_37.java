package chapter.seven_2nd._37;

public class Chapter07_37 {

  /** ◆ 인터페이스의 구현
   *
   * 인터페이스도 추상 클래스처럼 그 자체로는 인스턴스를 생성할 수 없으며, 추상 클래스가 상속을 통해 추상 메서드를 완성하는 것처럼 인터페이스도
   * 자신에 정의된 추상 메서드의 몸통을 만들어주는 클래스를 작성해야 하는데 그 방법은 추상 클래스가 자신을 상속받는 클래스를 정의하는 것과 다르지 않다.
   * 다만 클래스는 확장한다는 의미에서 키워드 'extends' 를 사용하지만 인터페이스는 구현한다는 의미의 키워드 'implements' 를 사용할 뿐이다.
   *
   * class [클래스이름] implements [인터페이스이름] {
   *   // 인터페이스에 정의된 추상 메서드를 모두 구현해야 한다.
   * }
   *
   * class Fighter implements Fightable {
   *   public void move(int x, int y) {...}
   *   public void attack(Unit u) {...}
   * }
   *
   * ※ 이때 'Fighter 클래스는 Fightable 인터페이스를 구현한다' 라고 한다.
   *
   * 만일 구현하는 인터페이스의 메서드 중 일부만 구현한다면, 마찬가지로 abstract 를 붙여서 추상 클래스로 선언해야 한다.
   *
   * abstract class Fighter implements Fightable {
   *   public void move(int x, int y) {...}
   * }
   *
   * 그리고 다음과 같이 상속과 구현을 동시에 할 수도 있다.
   *
   * class Fighter extends Unit implements Fightable {
   *   public void move(int x, int y) {...}
   *   public void attack(Unit u) {...}
   * }
   *
   *
   *
   * */

}
