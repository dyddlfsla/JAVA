package chapter.seven.chapter_07_33;

public class Chapter07_33 {

  /** ◆ 추상 클래스의 작성
   *
   * 여러 클래스에 공통적으로 사용될 수 있는 클래스를 바로 작성하기도 하고, 기존의 클래스의 공통적인 부분을 뽑아서 추상클래스로 만들어 상속하도록
   * 하는 경우도 있다. 추상의 사전적 정의는 다음과 같다.
   *
   * ---------------------------------------------------------------------------------
   *  추상 : 낱낱의 구체적 표상이나 개념에서 공통된 성질을 뽑아 이를 일반적인 개념으로 파악하는 정신 작용
   *----------------------------------------------------------------------------------
   *
   *  상속이 자손클래스를 만드는데 조상클래스를 사용하는 것이라면, 이와 반대로 추상화는 기존의 클래스의 공통부분을 뽑아내서
   *  조상클래스로 만드는 것이라고 볼 수 있다.
   *
   *  추상화를 구체화와 반대되는 의미로 이해하면 보다 쉽게 이해할 수 있을 것이다. 상속계층도를 따라 내려갈수록 클래스는
   *  점점 기능이 추가되어 구체화의 정도가 심해지며, 상속계층도를 따라 올라갈수록 추상화의 정도가 심해진다고 할 수 있다.
   *  즉, 상속계층도를 따라 내려갈수록 세분화되며, 올라갈수록 공통요소만 남게 된다.
   *
   *  컴퓨터 게임에 나오는 유닛들을 클래스로 간단히 정의해보았다. 이 유닛들은 각자 나름대로의 기능을 가지고 있지만
   *  공통부분을 뽑아내어 하나의 클래스로 만들고, 이 클래스로부터 상속받도록 변경해보자.
   *
   *  class Marine { //보병
   *    int x, y; //현재 위치
   *    void move(int x, int y) { 지정된 위치로 이동 }
   *    void stop() { 현재 위치에 정지 }
   *    void stimPack() { 스팀팩을 사용 }
   *  }
   *
   *  class Tank { //탱크
   *    int x, y; //현재 위치
   *    void move(int x, int y) { 지정된 위치로 이동 }
   *    void stop() { 현재 위치에 정지 }
   *    void changeMode() { 공격모드를 변환 }
   *  }
   *
   *  class DropShip { //수송선
   *    int x, y; //현재 위치
   *    void move(int x, int y) { 지정된 위치로 이동 }
   *    void stop() { 현재 위치에 정지 }
   *    void load() { 선택된 대상을 태운다 }
   *    void unload() {선택된 대상을 내린다 }
   *  }
   *
   * */
  public static void main(String[] args) {
    Unit[] group = new Unit[3];
    group[0] = new Marine();
    group[1] = new Tank();
    group[2] = new DropShip();

    for (int i = 0; i < group.length; i++) {
      group[i].move(100, 200);
    }
    // Unit 배열의 모든 유닛을 좌표(100, 200)의 위치로 이동한다.
  }
}

abstract class Unit {
  int x, y;
  abstract void move(int x, int y);
  void stop() {
    /* 현재 위치에 정지 */
  }
}

class Marine extends Unit {

  @Override
  void move(int x, int y) {
    /* 상속받은 추상메서드 move 를 오버라이딩하여 구현 */
  }
  void stimPack() {}
}

class Tank extends Unit {

  @Override
  void move(int x, int y) {
    /* 상속받은 추상메서드 move 를 오버라이딩하여 구현 */
  }
  void changeMode() {}
}

class DropShip extends Unit {

  @Override
  void move(int x, int y) {
    /* 상속받은 추상메서드 move 를 오버라이딩하여 구현 */
  }
  void load() {}
  void unload() {}

}

/**
 * 각 클래스의 공통부툰을 뽑아내서 Unit 클래스를 정의하고 이로부터 상속받도록 하였다. 이 Unit 클래스는 다른 유닛을 위한
 * 클래스를 작성하는데 재활용될 수 있을 것이다.
 *
 * 이들 클래스에 대해서 stop 메서드는 선언부와 구현부 모두 공통적이지만 Marine, Tank 는 지상유닛이고 DropShip 은 공중유닛이기
 * 때문에 이동하는 방법이 서로 달라서 move 메서드의 실제 구현 내용이 다를 것이다.
 * 그래도 move 메서드의 선언부는 같기 때문에 추상메서드로 정의할 수 있다. 최대한의 공통부분을 뽑아내기 위한 것이기도 하지만,
 * 모든 유닛은 이동할 수 있어야 하므로 Unit 클래스에는 move 메서드가 반드시 필요한 것이기 떄문이다.
 *
 * move 메서드가 추상메서드로 선언된 것에는, 앞으로 Unit 클래스를 상속받아서 작성되는 클래스는 move 메서드를 자신의 클래스에 알맞게
 * 반드시 구현해야 한다는 의미가 담겨 있는 것이기도 하다.
 *
 * */

