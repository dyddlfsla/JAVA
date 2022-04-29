package chapter.six_2nd._31;

public class Ex6_10 {

  public static void main(String[] args) {
    MyMath3 myMath3 = new MyMath3();
    System.out.printf("myMath3.add(3, 3) 결과: %d\n", myMath3.add(3, 3));
    System.out.printf("myMath3.add(3L, 3) 결과: %d\n", myMath3.add(3L, 3));
    System.out.printf("myMath3.add(3, 3L) 결과: %d\n", myMath3.add(3, 3L));
    System.out.printf("myMath3.add(3L, 3L) 결과: %d\n", myMath3.add(3L, 3L));

    int[] a = { 100, 200, 300};
    System.out.printf("myMath3.add(a) 결과: %d", myMath3.add(a));
  }

}

class MyMath3 {
  //오버로딩의 핵심은 메서드의 이름이 같다고 하더라도 메서드의 매개변수를 통해 메서드를 구별할 수 있느냐 없느냐가 중요하다.
  int add(int a, int b) {
    System.out.printf("int add(int a, int b) -");
    return a + b;
  }
  long add(int a, long b) {
    System.out.printf("long add(int a, long b) -");
    return a + b;
  }
  long add(long a, int b) {
    System.out.printf("long add(long a, int b) -");
    return a + b;
  }
  long add(long a, long b) {
    System.out.printf("long add(long a, long b) -");
    return a + b;
  }
  int add(int[] a) {
    System.out.printf("int add(int[] a) -");
    int result = 0;
    for(int i = 0; i < a.length; i++) {
      result += a[i];
    }
    return result;
  }


}
