package chapter.twelve._26;

public class Chapter12_26 {

  /*
   * ◆ @Deprecated
   *
   * 새로운 버전의 JDK 가 소개될 때, 새로운 기능이 추가될 뿐만 아니라 기존의 부족했던 기능을 개선하기도 한다. 이 과정에서 기존의 기능을 대체할 것들이 추가되어도,
   * 이미 여러 곳에서 사용되고 있을지도 모르는 기존의 것들을 함부로 삭제할 수 없다.
   *
   * 그래서 생각해낸 방법이 더 이상 사용되지 않는 필드나 메서드에 '@Deprecated' 를 붙이는 것이다. 이 애너테이션이 붙은 대상 다른 것으로 대체되었으니
   * 더 이상 사용하지 않을 것을 권한다는 의미이다. 예를 들어, java.util.Date 클래스의 대부분의 메서드에는 '@Deprecated' 가 붙어 있는데
   * Java API 에서 Date 클래스의 getDate() 를 보면 아래와 같이 적혀있다.
   *
   * Deprecated As of JDK version 1.1, replaced by Calendar.set(Calendar.DAY_OF_MONTH, int date).
   *
   * 이 메서드 대신에 JDK1.1 부터 추가된 Calendar 클래스의 get() 을 사용하라는 얘기다. 기존의 것 대신 새로 추가된 기능을 사용하도록 유도하는 것이다.
   * 굳이 기존의 것을 사용하겠다면,말릴 수 없겠지만 가능하면 '@Deprecated' 가 붙은 것들은 사용하지 않아야 한다.
   *
   *
   *
   *
   * */
}
