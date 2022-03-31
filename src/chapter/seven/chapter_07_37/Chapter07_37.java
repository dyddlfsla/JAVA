package chapter.seven.chapter_07_37;

import chapter.seven.chapter_07_36.Fightable;

public class Chapter07_37 {

  /** ◆ 인터페이스의 구현
   *
   * 인터페이스도 추상클래스처럼 그 자체로는 인스턴스를 생성할 수 없으며, 추상클래스가 상속을 통해 추상메서드를 완성하는 것처럼 인터페이스도
   * 자신에 정의된 추상메서드의 몸통을 만들어주는 클래스를 작성해야 하는데, 그 방법은 추상클래스가 자신을 상속받은 클래스를 정의하는 것과 별반 다르지 않다.
   * 다만 추상클래스를 상속하는 경우 확장한다는 의미의 키워드 'extends' 를 사용하지만 인터페이스는 구현한다는 의미의 키워드 'implements' 를 사용한다.
   *
   *  class [클래스이름] implements [인터페이스이름] {
   *    //인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
   *  }
   * */

}

class Fighter implements Fightable {

  @Override
  public void move(int x, int y) { /* 내용 생략 */}

  @Override
  public void attack(Unit unit) {/* 내용 생략 */}
}

/**
 * 만일 구현하는 인터페이스의 모든 추상메서드를 구현하지 않고 일부만 구현한다면, abstract 를 붙여서 추상 클래스로 선언해야 한다.
 * */

abstract class FighterSecond implements Fightable {

  @Override
  public void move(int x, int y) {
    //인터페이스 Fightable 을 구현하려면 move() 메서드 뿐만 아니라 attack() 메서드 역시 오버라이드해야 하지만
    //move() 메서드만 구현하고 attack() 메서드는 구현하지 않았다 이런 경우 해당 클래스를 추상클래스로 선언해야 한다.
  }
}

/**
 * 그리고 다음과 같이 상속과 구현을 동시에 할 수도 있다.
 * */

class FighterThird extends Unit implements Fightable {

  @Override
  public void move(int x, int y) {}

  @Override
  public void attack(Unit unit) {}
}

