package chapter.six_2nd._10;

public class Chapter06_10 {

  /** ◆ 클래스의 정의 (2) - 사용자 정의 타입
   *
   * 프로그래밍 언어에서 제공하는 기본 자료형(primitive type) 외에 프로그래머가 서로 관련된 변수들을 묶어서 하나의 타입으로 새로 추가하는 것을
   * '사용자 정의 타입(User-defined type)' 이라고 한다.
   * 다른 프로그래밍 언어에서도 사용자 정의 타입을 정의할 수 있는 방법을 제공하고 있으며 자바와 같은 객체 지향언어에서는 클래스가 곧 사용자 정의 타입이다.
   * 기본형의 개수는 8개로 정해져 있지만 참조형의 개수가 정해져 있지 않은 이유는 이처럼 프로그래머가 새로운 타입을 계속해서 추가할 수 있기 때문이다.
   *
   * int hour; // 시간을 표현하기 위한 변수;
   * int minute; // 분을 표현하기 위한 변수;
   * float second; // 초를 표현하기 위한 변수;
   *
   * 시간을 표현하기 위해서 위와 같이 3개의 변수를 선언하였다. 만일 3개의 시간을 다뤄야 한다면 다음과 같이 해야 할 것이다.
   *
   * int hour1, hour2, hour3;
   * int minute1, minute2, minute3;
   * int second1, second2, second3;
   *
   * 이처럼 다뤄야 하는 시간의 개수가 늘어날 때마다, 시 분, 초를 위한 변수를 추가해줘야 하는데 데이터의 개수가 많으면 이런 식으로는
   * 곤란하다.
   *
   *  int[] hour = new int[3];
   *  int[] minute = new int[3];
   *  float[] second = new float[3];
   *
   *  이와 같이 배열로 처리한다면 다뤄야 하는 시간 데이터의 개수가 늘어나더라도 배열의 크기만 변경해주면 되므로, 변수를 매번
   *  새로 선언해줘야 하는 불편함과 복잡함은 없어졌다. 그러나 하나의 시간을 구성하는 시, 분, 초가 서로 분리되어 있기 때문에
   *  프로그램 수행 과정에서 시, 분, 초가 따로 뒤섞여서 올바르지 않은 데이터가 될 가능성이 있다. 이런 경우 시, 분,초를
   *  하나로 묶는 사용자 정의 타입, 즉 클래스를 정의하여 사용해야 한다.
   *
   *  class Time {
   *    int hour;
   *    int minute;
   *    float second;
   *  }
   *
   *  아래의 코드를 비교해보자.
   *
   *  (1) 비객체지향적 구조
   *
   * int hour1, hour2, hour3;
   * int minute1, minute2, minute3;
   * float second1, second2, second3;
   * ==================================
   * int[] hour = new int[3];
   * int[] minute = new int[3];
   * float[] second = new float[3];
   * ==================================
   *
   *  (2) 객체지향적 구조
   *
   *  class Time {
   *    int hour;
   *    int minute;
   *    float second;
   *  }
   *
   *  Time t1 = new Time();
   *  Time t2 = new Time();
   *  Time t3 = new Time();
   *
   *  Time[] time = new Time[];
   *  time[0] = new Time();
   *  time[1] = new Time();
   *  time[2] = new Time();
   *
   * 이제부터는 시, 분, 초가 하나의 단위로 묶여서 다루어지기 때문에 다른 시간 데이터와 섞이는 일은 없겠지만, 시간 데이터에는 다음과 같은
   * 추가적인 제약조건이 있다.
   *
   * 1. 시, 분, 초는 모두 0보다 크거나 같아야 한다.
   * 2. 시의 범위는 0 ~ 23, 분의 범위는 0 ~ 59, 초의 범위는 0 ~ 59 이다.
   *
   * 이러한 조건들이 모두 프로그램 코드에 반영이 될때 보다 정확한 데이터를 유지할 수 있을 것이다. 객체지향언어가 아닌 언어에서는 이러한 추가적인 조건들을 반영하기가 어렵다.
   * 그러나 객체지향언어에서는 제어자와 메서드를 이용해서 이러한 조건들을 코드에 쉽게 반영할 수 있다.
   *
   * public class Time {
   *   private int hour;
   *   private int minute;
   *   private float second;
   *
   *   public void setHour(int hour) {
   *     if (hour < 0 || h > 23) {
   *       return; // hour 의 값을 변경하는 메서드. 지정한 값이  0보다 작거나 23보다 큰 경우 잘못된 데이터가 들어온 것으로
   *               // 시간을 변경하지 않고 메서드를 return 한다.
   *     }
   *     this.hour = hour;
   *   }
   * }
   *
   * 제어자를 이용해서 변수의 값을 직접 변경하지 못하게 하고, 대신 메서드를 통해서 값을 변경하도록 작성하였다.
   * 값을 변경할 때는 지정된 값의 유효성을 조건문으로 점검한 다음에 유효한 값일 경우 변경한다.
   *
   *
   *
   *
   * */

}
