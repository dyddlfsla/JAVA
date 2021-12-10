package chapter.six;

public class Ex6_6 {

  public static void main(String[] args) {
    Data data = new Data();
    data.x = 10;

    System.out.printf("main() : x = %s%n", data.x);
    change(data.x);
    System.out.printf("After change(data.x)%n");
    System.out.printf("main() : x = %s%n", data.x);
  }

  static void change(int x) {
    x = 1000;
    System.out.printf("change() : x = %s%n", x);
  }

}

class Data{
  int x;
}

/**
 * 'data.x' 의 값이 변경된 것이 아니라, change 메서드의 매개변수 x의 값이 변경된 것이다. 즉 원본이 아닌
 * 복사본이 변경된 것이라 실제 원본인 data.x 에는 영향을 주지 못한다. 이처럼 기본형 매개변수는 변수에 저장된
 * 값만 읽을 수 있을 뿐 변경할 수 는 없다.
 *
 * */
