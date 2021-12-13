package chapter.seven;

public class Chapter07_07 {

  /** ◆ 오버라이딩(overriding)
   *
   * 조상 클래스로부터 상속 받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다. 상속 받은 메서드를 그대로 사용하기도 하지만
   * 자손 클래스 자신에 맞게 변경해야 하는 경우가 더 많다. 이럴 때 조상 클래스의 메서드를 오버라이딩한다.
   *
   * 2차원 좌표계의 한 점을 표현하기 위한 Point 클래스가 있을 때, 이를 조상으로 하는 Point3D 클래스를 새로 작성하였다고 하자.
   *
   *  class Point {
   *    int x;
   *    int y;
   *    String getLocation() {
   *      return "x :" + x + ", y :" + y;
   *    }
   *  }
   *
   *  class Point3D extends Point {
   *    int z;
   *
   *    String getLocation() {
   *      return "x :" + x + ", y :" + y + ", z :" + z;
   *    }
   *  }
   *
   *  이 두 클래스는 서로 상속 관계에 있으므로 Point3D 클래스는 Point 클래스로부터 getLocation() 메서드를 상속받지만,
   *  Point3D 클래스는 3차원 좌표계의 한 점을 표현하기 위한 것으로 상속 받은 getLocation() 가 적합하지 않다. 그래서
   *  이 메서드를 Point3D 클래스에 맞게 z축의 값도 포함시켜 반환하도록 오버라이딩하였다.
   *
   *
   *
   * */

}
