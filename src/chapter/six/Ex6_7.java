package chapter.six;

public class Ex6_7 {

  public static void main(String[] args) {
    Data data = new Data();
    data.x = 10;
    System.out.printf("main() : x = %s%n", data.x);

    change(data);
    System.out.printf("After change(data)%n");
    System.out.printf("main() : x = %s%n", data.x);
  }

  static void change(Data data) {
    data.x = 1000;
    System.out.printf("change() : x = %s%n", data.x);
  }


  /** ◆ 참조형 매개변수
   *
   * 이전 예제와는 달리 change 메서드를 호출한 후에 data.x의 값이 변경되었다.
   * change 메서드의 매개변수가 참조형이기 때문에 값이 아니라 '값이 저장된 주소'를 change 메서드에
   * 넘겨주었다. 따라서 값을 읽어오는 것뿐만 아니라 변경하는 것도 가능하다.
   *
   * */
}
