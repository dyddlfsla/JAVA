package chapter.six_2nd._25;

class Date3 {
  int x;
}
public class Ex6_8 {

  public static void main(String[] args) {
    Date3 d = new Date3();
    d.x = 10;
    Date3 d2 = copy(d); //반환된 tmp 객체의 주소를 다시 d2 에 담는다. 즉, d2 와 tmp 는 같은 객체의 주소를 가지고 있다(같은 객체를 가리키고 있는 것이다.)
    System.out.printf("d.x = %d\n", d.x);
    System.out.printf("d2.x = %d\n", d2.x);
  }


  static Date3 copy(Date3 d) {
    Date3 tmp = new Date3(); // 새로운 Date3 객체 tmp 를 생성하였다.
    tmp.x = d.x; // d.x 의 값을 tmp.x 에 복사한다.
    return tmp; // 복사한 값을 가지고 있는 tmp 객체의 주소를 반환한다.
  }
}
