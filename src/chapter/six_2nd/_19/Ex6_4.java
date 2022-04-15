package chapter.six_2nd._19;

public class Ex6_4 {

  public static void main(String[] args) {
    MyMath myMath = new MyMath();
    long result1 = myMath.add(5L, 3L);
    long result2 = myMath.subtract(5L, 3L);
    long result3 = myMath.multiply(5L, 3L);
    double result4 = myMath.divide(5L, 3L);

    System.out.printf("add(5L, 3L) = %d%n", result1);
    System.out.printf("subtract(5L, 3L) = %d%n", result2);
    System.out.printf("multiply(5L, 3L) = %d%n", result3);
    System.out.printf("divide(5L, 3L) = %f%n", result4);
  }

  /*
  * 여기서 눈여겨봐야 할 곳은 divide(double a, double b) 를 호출하는 부분이다. divide 메서드에 선언된 매개변수 타입은 double 형인데
  * 이와 다른 long 형 타입의 인자인 5L 과 3L 을 사용해서 호출하는 것이 가능하다.
  *
  * 호출 시에 입력된 값은 메서드의 매개변수에 대입되는 값이므로, long 형의 값을 double 형 변수에 저장하는 것과 같아서 'double a = 5L;' 을 수행했을 때와
  * 같이 long 형의 값 5L 은 double 형의 값인 5.0 으로 자동 형변환되어 divide 의 매개변수 a 에 저장된다.
  * 즉, 메서드의 인자에 값을 넣을 때는 인자의 타입이 메서드 매개변수 타입과 일치하거나 매개변수 타입으로 형변환이 가능한 것이어야 한다.
  *
  * */


}

class MyMath {

  long add(long a, long b) {return a + b;}
  long subtract(long a, long b) {return a - b;}
  long multiply(long a, long b) {return a * b;}
  double divide(double a, double b) {return a / b;}
}
