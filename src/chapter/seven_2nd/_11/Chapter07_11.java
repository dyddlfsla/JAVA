package chapter.seven_2nd._11;

public class Chapter07_11 {

  /** ◆ super() - 조상의 생성자
   *
   * this() 처럼 super() 도 생성자이다. this() 같은 클래스의 다른 생성자를 호출하는데 사용되지만, super() 는 조상의 생성자를 호출하는데 사용된다.
   *
   * class Point {
   *   int x, y;
   *
   *   Point(int x, int y) {
   *     this.x = x;
   *     this.y = y;
   *   }
   * }
   *
   * class Point3D extends Point {
   *   int z;
   *
   *   Point3D(int x, int y, int z) {
   *     this.x = x; //조상의 멤버를 초기화
   *     this.y = y; //조상의 멤버를 초기화
   *     this.z = z;
   *   }
   * }
   *
   * 위의 코드에서는 Point3D 클래스의 생성자가 조상인 Point 클래스로부터 상속받은 x, y 를 초기화한다. 틀린 코드는 아니지만,
   * 생성자 Point3D() 를 아래처럼 '조상의 멤버는 조상의 생성자를 통해 초기화 되도록' 하는 것이 더 바람직하다.
   *
   * Point3D (int x, int y, int z) {
   *   super(x, y); //조상 클래스의 생성자 Point(int x, int y) 를 호출한다.
   *   this.z = z; //자기의 멤버는 자신의 생성자로 초기화.
   * }
   *
   * 이처럼 클래스 자신에게 선언된 변수는 자신이 가지고 있는 생성자를 통해 초기화하는 것이 좋다. 참고로 생성자는 상속되지 않는다.
   *
   *
   * */

}

class Ex7_4 {

  public static void main(String[] args) {
    Point3D point3D = new Point3D(1, 2, 3);
    System.out.println("x = " + point3D.x + ", y = " + point3D.y + ", z = " + point3D.z);

  }
}

class Point {

  int x, y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Point3D extends Point {
  int z;

  Point3D(int x, int y, int z) {
    super(x, y);
    this.z = z;
  }
}