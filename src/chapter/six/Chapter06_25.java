package chapter.six;

public class Chapter06_25 {

  /** ◆ 참조형 반환타입
   *
   * 매개변수 뿐만 아니라 반환타입도 참조형이 될 수 있다. 반환타입이 참조형이라는 것은 반환하는 값의 타입이 참조형
   * 이라는 얘긴데, 모든 참조형 타입의 값은 '객체의 주소'이므로 그저 정수값이 반환되는 것일뿐 특별할 것이 없다.
   *
   * */

  public static void main(String[] args) {
    Data data = new Data();
    data.x = 10;

    Data data2 = copy(data);
    System.out.printf("data.x = %s%n", data.x);
    System.out.printf("data2.x = %s%n", data2.x);
  }

  static Data copy(Data data) {
    Data tmp = new Data();
    tmp.x = data.x;
    return tmp;
  }

}
