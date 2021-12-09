package chapter.six;

public class Chapter06_18 {

  /** ◆ 메서드의 실행 흐름
   *
   * class Math {
   *
   *   long add(long a, long b) {return a + b;}
   *   long subtract(long a, long b) {return a - b;}
   *   long multiply(long a, long b) {return a * b;}
   *   long divide(long a, long b) {return a / b;}
   * }
   *
   * Math 클래스의 'add(long a, long b)'를 호출하기 위해서는 먼저 Math 클래스의 인스턴스를 생성해야 한다.
   * 그 다음 참조변수를 통해 호출해야 한다.
   *
   *  Math math = new Math(); //먼저 인스턴스를 생성한다.
   *  long value = math.add(1L, 2L); //메서드를 호출한다.
   *
   * */
  public static void main(String[] args) {
    Math math = new Math();
    long result1 = math.add(5L, 3L);
    long result2 = math.subtract(5L, 3L);
    long result3 = math.multiply(5L, 3L);
    double result4 = math.divide(5L, 3L);

    System.out.printf("add(5L, 3L) = %s 입니다. %n", result1);
    System.out.printf("subtract(5L, 3L) = %s 입니다. %n", result2);
    System.out.printf("multiply(5L, 3L) = %s 입니다. %n", result3);
    System.out.printf("divide(5L, 3L) = %s 입니다. %n", result4);
  }
}

class Math {

  long add(long a, long b) {
    return a + b;
  }

  long subtract(long a, long b) {
    return a - b;
  }

  long multiply(long a, long b) {
    return a * b;
  }

  double divide(double a, double b) {
    return a / b;
  }
}
