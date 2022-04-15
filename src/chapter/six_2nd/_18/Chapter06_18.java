package chapter.six_2nd._18;

public class Chapter06_18 {

  /** ◆ 메서드의 실행 흐름
   *
   * 다음은 두 개의 값을 매개변수로 받아서 사칙연산을 수행하는 4개의 메서드를 가진 MyMath 클래스를 정의한 것이다.
   *
   * class MyMath {
   *   long add(long a, long b) {
   *     long result = a + b;
   *     return result;
   *   }
   *
   *   long subtract(long a, long b) {return a - b;}
   *   long multiply(long a, long b) {return a * b;}
   *   long divide(long a, long b) {return a / b;}
   * }
   *
   * MyMath 클래스의 'add(long a, long b)' 를 호출하기 위해서는 먼저 'MyMath mm = new MyMath();' 와 같이 해서
   * MyMath 클래스의 인스턴스를 생성한 다음 참조변수 mm 을 통해야 한다.
   *
   *  MyMath mm = new MyMath(); //먼저 인스턴스를 생성한다.
   *  long value = mm.add(1L, 2L); //메서드를 호출한다.
   *
   *  ① main 메서드에서 메서드 add 를 호출한다. 인수 1L 과 2L 이 메서드 add 의 매개변수 a, b 에 각각 복사(대입)된다.
   *  ② 메서드 add 의 괄호 {} 안에 있는 문장들이 순서대로 실행된다.
   *  ③ 메서드 add 의 모든 문장이 실행되거나 return 문을 만나면, 호출한 메서드(main 메서드)로 되돌아와서 이후의 문장들을 수행한다.
   *
   *  메서드가 호출되면 지금까지 실행 중이던 메서드는 실행을 잠시 멈추고 호출된 메서드의 문장들이 실행된다. 호출된 메서드의 작업이 모두 끝나면,
   *  다시 호출한 메서드로 돌아와 이후의 문장들을 실행한다.
   *
   * */



}
