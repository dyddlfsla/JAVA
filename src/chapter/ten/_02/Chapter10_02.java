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
   * */

}
