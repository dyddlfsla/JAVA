package chapter.three;

public class Ex3_9 {

  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;
    long c = a * b;
    System.out.println(c);
  }

  /**
   * long타입의 변수가 a * b의 결과값을 담기에 충분히 크므로 문제가 없을 것 같지만
   * 대입 연산자 = 가 수행되기 이전에 문제가 발생한다. a * b는 int타입이므로 a * b의 값을 온전히 담지 못하는 것이다. 따라서
   * a * b에는 -1454759936 가 저장되고 이것이 다시 c에 저장된다.
   *
   * */
}
