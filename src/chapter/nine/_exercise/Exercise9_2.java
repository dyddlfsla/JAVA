package chapter.nine._exercise;

public class Exercise9_2 {

  /*
  * 다음과 같은 실행 결과를 얻도록 equals() 와 toString() 을 오버라이딩 하시오.
  *
  * */
  public static void main(String[] args) {
    Point3D p1 = new Point3D(1, 2, 3);
    Point3D p2 = new Point3D(1, 2, 3);

    System.out.println(p1); // [1, 2, 3]
    System.out.println(p2); // [1, 2, 3]
    System.out.println("p1 == p2 ? " + (p1 == p2)); // p1 == p2 ? false
    System.out.println("p1.equals(p2) ? " + (p1.equals(p2))); // p1.equals(p2) ? true
  }
}

class Point3D {
  int x;
  int y;
  int z;

  public Point3D() {
    this(0, 0, 0);
  }

  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj instanceof Point3D) {
      Point3D p1 = (Point3D) obj;
      return this.x == p1.x && this.y == p1.y && this.z == p1.z;
    }
    return false;
  }

  @Override
  public String toString() {
    return String.format("[ %d, %d, %d]", this.x, this.y, this.z);
  }
}
