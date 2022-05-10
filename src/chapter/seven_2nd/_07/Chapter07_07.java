package chapter.seven_2nd._07;

public class Chapter07_07 {

  /** ◆ 오버라이딩(Overriding)
   *
   * 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다. 상속받은 메서드를 그대로
   * 사용하기도 하지만, 자손 클래스 자신에 맞게 변경해야하는 경우가 많다. 이럴 때 조상의 메서드를 오버라이딩한다.
   * ※ overriding 의 사전적 의미는 ' ~ 위에 덮어쓰다(overwrite)' 이다.
   *
   * 2차원 좌표계의 한 점을 표현하기 위한 Point 클래스가 있을 때, 이를 조상으로 하는 Point3D 클래스, 3차원 좌표계의 한 점을
   * 표현하기 위한 클래스를 다음과 같이 새로 작성하였다고 하자.
   *
   * class Point {
   *   int x;
   *   int y;
   *
   *   String getLocation() {
   *     return "x : " + x + ", y : " + y;
   *   }
   * }
   *
   * class Point3D extends Point {
   *   int z;
   *
   *   String getLocation() { //오버라이딩
   *     return "x : " + x ", y : " + y + ", z : " + z;
   *   }
   * }
   *
   * Point 클래스의 getLocation() 은 한 점의 x, y 좌표를 문자열로 반환하도록 작성되었다.
   * 이 두 클래스는 서로 상속관계에 있으므로 Point3D 클래스는 Point 클래스로부터 getLocation() 상속 받지만, Point3D 클래스는
   * 3차원 좌표계의 한 점을 표현하기 위한 것이므로 조상인 Point 클래스로부터 상속받은 getLocation() 은 Point3D 클래스에 맞지 않는다.
   * 그래서 이 메서드를 Point3D 클래스 자신에 맞게 z 축의 좌표값도 포함하여 반환하도록 오버라이딩 하였다. Point 클래스를 사용하던 사람들은
   * 새로 작성된 Point3D 클래스가 Point 클래스의 자손이므로 Point3D 클래스의 인스턴스에 대해서 getLocation() 을 호출하면 Point 클래스의
   * getLocation() 이 그랬던 것처럼 점의 좌표를 문자열로 얻을 수 있을 것이라고 기대할 것이다. 그렇기 때문에 새로운 메서드를 제공하는 것보다
   * 물려받은 멤버를 오버라이딩 하는 것이 더 바람직하다.
   *
   *
   *
   * */

}
