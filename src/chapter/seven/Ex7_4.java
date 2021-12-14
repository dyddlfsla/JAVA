package chapter.seven;

class Point {
  int x;
  int y;

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
public class Ex7_4 {

  public static void main(String[] args) {
    Point3D point3D = new Point3D(1, 2, 3);
    System.out.printf("x = %d, y = %d, z = %d", point3D.x, point3D.y, point3D.z);
  }

  /*
  * 조상의 멤버를 초기화 할때는 위와 같이 조상의 생성자를 이용해서 초기화 하는 것이 바람직하다.
  *
  * */
}
