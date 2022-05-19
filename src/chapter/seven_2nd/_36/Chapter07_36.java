package chapter.seven_2nd._36;

public class Chapter07_36 {

  /** ◆ 인터페이스의 상속
   *
   * 인터페이스는 인터페이스로부터만 상속받을 수 있으며, 클래스와는 달리 다중상속, 즉 여러 개의 인터페이스로부터 상속을 받는 것이 가능하다.
   * ※ 인터페이스는 클래스와 달리 Object 클래스와 같은 최고 조상이 없다.
   *
   * interface Movable {
   *   void move(int x, int y);
   * }
   *
   * interface Attackable {
   *   void attack(Unit u);
   * }
   *
   * interface Fightable extends Movable, Attackable {}
   *
   * 클래스의 상속과 마찬가지로 자손 인터페이스(Fightable) 은 조상 인터페이스 (Movable, Attackable) 에 정의된 멤버를 모두 상속 받는다.
   * 그래서 Fightable 자체에는 정의된 멤버가 하나도 없지만 조상 인터페이스로부터 상속받은 두 개의 추상 메서드, move(int x, int y) 와
   * attack(Unit u) 를 멤버로 갖게 된다.
   *
   *
   *
   * */

}
