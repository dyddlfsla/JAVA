package chapter.six;

class MyMath{
  long a, b;

  //인스턴스 변수 a, b 만을 이용해서 작업하므로 매개변수가 필요없다.
  long add() {
    return a + b;
  }
  long subtract() {
    return a - b;
  }
  long multiply() {
    return a * b;
  }
  double divide() {
    return a / b;
  }

  //인스턴스 변수와는 관계없이 매개변수만으로 작업이 가능하다.
  static long add(long a, long b) {
    return a + b;
  }
  static long subtract(long a, long b) {
    return a - b;
  }
  static long multiply(long a, long b) {
    return a * b;
  }
  static double divide(double a, double b) {
    return a / b;
  }

}
public class Ex6_9 {

  public static void main(String[] args) {
    //클래스메서드 호출. 인스턴스 생성없이도 호출 가능
    System.out.printf("%s%n", MyMath.add(200L, 100L));
    System.out.printf("%s%n", MyMath.subtract(200L, 100L));
    System.out.printf("%s%n", MyMath.multiply(200L, 100L));
    System.out.printf("%s%n", MyMath.divide(200L, 100L));

    //인스턴스 메서드 호출. 인스턴스를 생성해야만 호출이 가능.
    MyMath math = new MyMath();
    math.a = 200L;
    math.b = 100L;

    System.out.printf("%s%n", math.add());
    System.out.printf("%s%n", math.subtract());
    System.out.printf("%s%n", math.multiply());
    System.out.printf("%s%n", math.divide());

  }
}
