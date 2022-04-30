package chapter.ten._02;

public class Chapter10_02 {

  /** ◆ Calendar 클래스
   *
   * Calendar 클래스는  추상클래스이기 때문에 직접 객체를 생성할 수는 없고, 메서드를 통해서 완전히 구현된 클래스의 인스턴스를
   * 얻어야 한다.
   *
   *  Calendar calendar = new Calendar(); // !! 에러. 추상클래스는 인스턴스를 생성할 수 없다.
   *  Calendar calendar = Calendar.getInstance(); // getInstance() OK. 메서드는 Calendar 클래스를 구현한 클래스의 인스턴스를 반환한한다.
   *
   * getInstance() 메서드는 태국의 경우 BuddhistCalendar 클래스의 인스턴스를 반환하고 그외에는 GregorianCalendar 클래스의 인스턴스를 반환한다.
   * 즉, 각 국가에서 사용하는 날짜 시스템에 따라 다른 인스턴스를 반환한다.
   *
   * 인스턴스를 직접 생성해서 사용하지 않고 이처럼 메서드를 통해서 인스턴스를 반환받게 하는 이유는 최소한의 변경으로 프로그램이 동작할 수 있도록 하기 위한 것이다.
   *
   *  class MyApplication {
   *    public static void main(String[] args) {
   *      Calendar cal = new Calendar(); // 경우에 따라 이 부분을 변경해야 한다.
   *      ...
   *    }
   *  }
   *  만일 위와 같이 특정 인스턴스를 생성하도록 프로그램이 작성되어 있다면, 다른 종류의 역법을 사용하는 국가에서 실행한다던가, 새로운 역법이 추가된다던가 하는 경우
   *  즉 다른 종류의 인스턴스를 필요로 하는 경우에 MyApplication 을 변경해야 하지만 아래와 같이 메서드를 통해서 인스턴스를 얻도록 하면 MyApplication 을 변경하지 않아도 된다.
   *
   *  class MyApplication {
   *    public static void main(String[] args) {
   *      Calendar cal = Calendar.getInstance();
   *    }
   *  }
   *
   *  대신 getInstance() 의 내용은 달라져야 하겠지만, MyApplication 이 변경되지 않아도 된다는 것이 중요하다. getInstance() 메서드가 static 인 이유는
   *  메서드 내의 코드에서 인스턴스 변수를 사용하거나 인스턴스 메서드를 호출하지 않기 때문이며 또 다른 이유는 getInstance() 가 static 이 아니라면 위와 같이
   *  객체를 생성한 다음에 호출해야 하는데 Calendar 는 추상클래스이기 때문에 객체를 생성할 수 없기 때문이다.
   *
   * */

}
