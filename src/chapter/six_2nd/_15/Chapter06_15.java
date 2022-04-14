package chapter.six_2nd._15;

public class Chapter06_15 {

    void print99danAll() {
       for (int i = 1; i <= 9; i++) {
         for (int j = 1; j <= 9; j++) {
           System.out.printf(" %d x %d = %d", i, j, i*j);
         }
         System.out.printf("%n", "");
       }
     };

  public static void main(String[] args) {
    Chapter06_15 chapter06_15 = new Chapter06_15();
    chapter06_15.print99danAll();
  }

  /** ◆ 메서드의 선언부
   *
   * 메서드 선언부는 '메서드의 이름' 과 '매개변수 선언' 그리고 '반환타입' 으로 구성되어 있으며, 메서드가 작업을 수행하기 위해
   * 어떤 값들을 필요로 하고 작업의 결과로 어떤 타입의 값을 반환하는지에 대한 정보를 제공한다. 예를 들어, 아래에 정의된 메서드 add 는
   * 두 개의 정수를 입력 받아서, 두 값을 더한 결과(int 타입의 값)를 반환한다.
   *
   *  int add(int a, int b) {
   *    int result  = a + b;
   *    return result;
   *  }
   *
   * 메서드의 선업누는 후에 변경사항이 발생하지 않도록 신중히 작성해야 한다. 메서드의 선언부를 변경하게 되면 그 메서드가 호출되는 모든 곳이
   * 함께 변경되어야 하기 때문이다.
   *
   * 1. 매개변수 선언(parameter declaration)
   * 매개변수는 메서드가 작업을 수행하는데 필요한 값을 제공받기 위한 것이며, 필요한 값의 개수만큼 변수를 선언하며 각 변수 간의 구분은 쉼표 ',' 를 사용한다.
   * 한 가지 주의할 점은 일반적인 변수 선언과 달리 두 변수의 타입이 같아도 변수의 타입을 생략할 수 없다는 것이다.
   *
   * int add(int x, int y) {...} //OK.
   * int add(int, y) {...} // 에러. x 와 y 의 타입이 같다고 해도 각각의 타입을 밝혀주어야 한다.
   *
   * 선언할 수 있는 매개변수의 개수는 거의 제한이 없지만, 만일 입력해야할 값의 개수가 많은 경우에는 배열이나 참조변수를 사용하면 된다. 만일 값을
   * 전혀 입력 받을 필요가 없다면 괄호 () 안에 아무것도 적지 않는다.
   *
   * 2. 반환타입(return type)
   * 메서드의 작업수행 결과(출력)인 '반환값'의 타입을 적는다. 단, 반환값이 없는 경우 반환타입으로 'void' 를 적어야 한다. 아래에 정의된 메서드
   * 'print99danAll' 은 구구단 전체를 출력하는데, 작업을 수행하는데 필요한 값(입력)도 , 작업수행의 결과인 반환값(출력)도 없다. 그래서 반환타입이 'void' 이다.
   *
   *  void print99danAll() {
   *    for (int i = 1; i <= 9; i++) {
   *      for (int j = 1; j <= 9; j++) {
   *        System.out.printf(" %d x %d = %d", i, j, i*j);
   *      }
   *      System.out.printf("%n", "");
   *    }
   *  }
   *
   *
   * */

}
