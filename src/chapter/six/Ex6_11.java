package chapter.six;

class Data_1{
  int value;
}

class Data_2{
  int value;

  Data_2(int x) {
    value = x;
  }
}

public class Ex6_11 {

  public static void main(String[] args) {
    Data_1 data_1 = new Data_1();
    //Data_2 data_2 = new Data_2(); 컴파일 에러 발생!!
  }
  /**
   * 위의 에러는 Data_2 클래스에 생성자를 찾을 수 없다는 에러인데,
   * Data_1 클래스에서는 생성자가 없어도 에러가 나지 않는데 왜 Data_2 클래스에서만 에러가 발생할까?
   * Data_1 클래스에는 아무런 생성자가 없으므로 컴파일러가 자동으로 기본 생성자를 추가하고 컴파일하지만
   * Data_2 클래스에는 사용자가 정의한 생성자가 존재하므로 기본 생성자를 추가하지 않는다. 그런데
   * new 연산자를 통해 존재하지 않는 기본 생성자를 호출하고 있으므로 에러가 발생하는 것이다.
   *
   *  ※ 기본 생성자가 컴파일에 의해 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.
   *
   * */
}
