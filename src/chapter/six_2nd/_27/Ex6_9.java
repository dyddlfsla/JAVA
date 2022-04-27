package chapter.six_2nd._27;

class MyMath2 {
  long a, b;

  // 인스턴스 변수 a, b 만을 이용해서 작업하므로 매개변수가 필요없다.
  long add() {
    return a + b;
  }
  long subtract() {
    return a - b;
  }
  long multiply() {
    return a * b;
  }
  long divide() {
    return a / b;
  }

  //인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
  static long add(long a, long b) {
    return a + b;
  }
  static long subtract(long a, long b) {
    return a - b;
  }
  static long multiply(long a, long b) {
    return a * b;
  }
  static double divide(long a, double b) {
    return a / b;
  }
}

public class Ex6_9 {

  public static void main(String[] args) {
  //클래스 메서드 호출. 인스턴스 생성없이 호출가능
    System.out.printf("%d\n", MyMath2.add(200L, 100L));
    System.out.printf("%d\n", MyMath2.subtract(200L, 100L));
    System.out.printf("%d\n", MyMath2.multiply(200L, 100L));
    System.out.printf("%f\n", MyMath2.divide(200L, 100.0));

    MyMath2 myMath2 = new MyMath2(); //인스턴스 생성.
    myMath2.a = 200L;
    myMath2.b = 100L;
    //인스턴스 메서드는 객체를 생성한 후에만 호출이 가능하다.
    System.out.printf("%d\n", myMath2.add());
    System.out.printf("%d\n", myMath2.subtract());
    System.out.printf("%d\n", myMath2.multiply());
    System.out.printf("%d\n", myMath2.divide());
  }
  /**
   * 인스턴스 메서드인 add(), subtract(), multiply(), divide() 는 인스턴스 변수인 a 와 b 만으로도 충분히 작업이 가능하기 때문에,
   * 매개변수를 필요로 하지 않으므로 괄호() 안에 매개변수를 선언하지 않았다. 반면에 add(long a, long b), subtract(long a, long b)
   * multiply(long a, long b), divide(long a, long b) 등은 인스턴스 변수 없이 매개변수만으로 작업을 수행하기 때문에 static 을 붙여서
   * 클래스 메서드로 선언하였다.
   * */

}
