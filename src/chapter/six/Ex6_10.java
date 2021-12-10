package chapter.six;

class MathTest {

  int add(int a, int b) {
    System.out.printf("int add(int a, int b) : ");
    return a + b;
  }

  long add(int a, long b) {
    System.out.printf("int add(int a, long b) :");
    return a + b;
  }

  long add(long a, int b) {
    System.out.printf("int add(long a, int b) :");
    return a + b;
  }

  long add(long a, long b) {
    System.out.printf("int add(long a, long b) :");
    return a + b;
  }

  int add(int[] a) {
    System.out.printf("int add(int[] a) :");
    int result = 0;
    for (int i = 0; i < a.length; i++) {
      result += a[i];
    }
    return result;
  }
}

public class Ex6_10 {

  public static void main(String[] args) {
    MathTest mathTest = new MathTest();
    System.out.printf("mathTest.add(3, 3) 의 결과 : %d%n", mathTest.add(3, 3));
    System.out.printf("mathTest.add(3L, 3) 의 결과 : %d%n", mathTest.add(3L, 3));
    System.out.printf("mathTest.add(3, 3L) 의 결과 : %d%n", mathTest.add(3, 3L));
    System.out.printf("mathTest.add(3L, 3L) 의 결과 : %d%n", mathTest.add(3L, 3L));

    int[] a = new int[]{100, 200, 300};
    System.out.printf("mathTest.add(a) 의 결과: %d%n", mathTest.add(a));
  }

}
