package chapter.seven.chapter_07_38;

public class Chapter07_38 {

  /** ◆ 인터페이스를 이용한 다형성
   *
   * 다형성을 학습할 때 자손 클래스의 인스턴스를 조상 타입의 참조변수로 참조하는 것이 가능하다는 것을 배웠다. 인터페이스 역시 이를 구현한
   * 클래스의 조상이라 할 수 있으므로 해당 인터페이스 타입의 참조변수로 이를 구현한 클래스의 인스턴스를 참조할 수 있으며, 인터페이스의
   * 타입으로의 형변환도 가능하다.
   *
   * 인터페이스 Fightable 을 클래스 Fighter 가 구현했을 때, 다음과 같이 Fighter 인스턴스를 Fightable 타입의 참조변수로 참조하는 것이 가능하다.
   *
   *  Fightable f1 = (Fightable) new Fighter();
   *  Fightable f2 = new Fighter();
   *
   * 따라서 인터페이스는 다음과 같이 메서드의 매개변수 타입으로도 사용될 수 있다.
   *
   *  void attack(Fightable fightable) {}
   *
   * 인터페이스의 타입의 매개변수가 갖는 의미는 메서드 호출 시 해당 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 제공해야 한다는 것이다.
   *
   *  class Fighter extends Unit implements Fightable {
   *    public void move(int x, int y) {}
   *    public void attack(Fightable fightable) {}
   *  }
   *
   * 위와 같이 Fightable 인터페이스를 구현한 Fighter 클래스가 있을 때, attack 메서드의 매개변수로 Fighter 인스턴스를 넘겨 줄 수 있다.
   * 즉, attack(new Fighter()) 와 같이 할 수 있다는 것이다. 그리고 아래처럼 메서드의 리턴타입으로 인터페이스를 지정하는 것도 가능하다.
   *
   *  Fightable method() {
   *    ...
   *    Fighter f = new Fighter();  //한 문장으로 줄여 return new Fighter(); 로 표현할 수도 있다.
   *    return f;
   *  }
   *
   * ※ 리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다.
   * 위 코드에서는 method() 의 리턴타입이 Fightable 인터페이스이기 때문에 메서드의 return 문에서 Fightable 인터페이스를
   * 구현한 Fighter 클래스의 인스턴스의 주소를 반환한다.
   * */


}
