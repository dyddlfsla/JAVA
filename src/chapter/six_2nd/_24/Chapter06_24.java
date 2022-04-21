package chapter.six_2nd._24;

class Data2 {int x;}

class Ex6_7 {
  public static void main(String[] args) {
    Data2 d = new Data2();
    d.x = 10;
    System.out.printf("main() : x = %d%n", d.x);

    change(d);
    System.out.printf("After change(d)%n");
    System.out.printf("main() : x = %d%n", d.x);
  }

  private static void change(Data2 d) {
    d.x = 1000;
    System.out.printf("change() : x = %d%n", d.x);
  }
}


public class Chapter06_24 {

  /**
   * 이전 예제와 달리 change 메서드를 호출한 후에 d.x 의 값이 변경되었다. change 메서드의 매개변수가 참조형이라서
   * 값이 아니라 '값이 저장된 객체 주소'를 change 메서드에게 넘겨주었기 때문에 값을 읽어오는 것 뿐만 아니라 변경하는 것도 가능하다.
   *
   * 다시 말해, change 메서드의 매개변수를 참조형으로 선언했기 때문에, x 의 값이 아닌 변수 d 의 주소가 매개변수 d 에 복사되었다.
   * 이제 main 메서드의 참조변수 d 와 change 메서드의 참조변수 d 는 같은 객체를 가리키게 되는 것이다. 그래서 매개변수 d 로 x 의 값을
   * 읽는 것과 변경하는 것이 모두 가능한 것이다.
   *
   * */

}
