package chapter.three;

public class Ex3_8 {

  /**
   * 크기가 작은 자료형의 변수를 큰 자료형의 변수에 저장할 때는 자동적으로 형변환이 되지만,
   * 반대로 큰 자료형의 값을 작은 자료형의 변수에 저장하려면 명시적으로 형변환 연산자를 사용해서 변환해주어야 한다.
   *
   * */
  public static void main(String[] args) {
    byte a = 10;
    byte b = 30;
    byte c = (byte) (a * b); //a, b는 byte 타입이므로 연산을 하게되면 자동으로 int타입이 된다. 따라서 a * b는 int타입이고
                             // 이것을 다시 byte c에 저장하려면 (byte)로 형변환을 표시해야 한다.
    System.out.println(c);
  }
}
