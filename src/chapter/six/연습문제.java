package chapter.six;

import java.util.Arrays;

class MyTv {

  boolean isPowerOn;
  int channel;
  int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  void turnOnOff() {
    isPowerOn = !isPowerOn;
  }

  void volumeUp() {
    if (volume < MAX_VOLUME) {
      volume++;
    }
  }

  void volumeDown() {
    if (volume > MIN_VOLUME) {
      volume--;
    }
  }

  void channelUp() {
    if (channel == MAX_CHANNEL) {
      channel = MIN_CHANNEL;
    } else {
      channel++;
    }
  }

  void channelDown() {
    if (channel == MIN_CHANNEL) {
      channel = MAX_CHANNEL;
    } else {
      channel--;
    }
  }
}
public class 연습문제 {

  /**
   * 1. 다음과 같은 멤버변수를 갖는 Student 클래스를 작성하시오.
   *
   * sol:
   *
   * class Student {
   *   String name;
   *   int ban;
   *   int no;
   *   int kor;
   *   int eng;
   *   int math;
   *
   *  }
   *
   * 2. 다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info()를 추가하시오.
   *
   * sol:
   *
   * class Student {
   *
   *   String name;
   *   int ban;
   *   int no;
   *   int kor;
   *   int eng;
   *   int math;
   *
   *   Student(String name, int ban, int no, int kor, int eng, int math) {
   *     this.name = name;
   *     this.ban = ban;
   *     this.no = no;
   *     this.kor = kor;
   *     this.eng = eng;
   *     this.math = math;
   *   }
   *
   *   String info() {
   *     int total = kor + eng + math;
   *     float average = (float) total / 3;
   *     float roundedAverage = java.lang.Math.round(average * 10) / 10.0f;
   *     return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + total + ", " + roundedAverage;
   *   }
   * }
   *
   * 3. 앞서 정의한 Student 클래스에 다음과 같이 정의된 두 개의 메서드 getTotal(), getAverage()를 추가하시오.
   *
   *  sol:
   *  class Student {
   *
   *   String name;
   *   int ban;
   *   int no;
   *   int kor;
   *   int eng;
   *   int math;
   *
   *   Student() {
   *
   *   }
   *
   *   Student(String name, int ban, int no, int kor, int eng, int math) {
   *     this.name = name;
   *     this.ban = ban;
   *     this.no = no;
   *     this.kor = kor;
   *     this.eng = eng;
   *     this.math = math;
   *   }
   *
   *   int getTotal() {
   *     return kor + eng + math;
   *   }
   *
   *   float getAverage() {
   *     return java.lang.Math.round((float) getTotal() / 3 * 10) / 10.0f;
   *   }
   *
   *   String info() {
   *     return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
   *   }
   * }
   *
   * 4. 두 점의 거리를 계산하는 getDistance()를 완성하세요.
   *
   * sol:
   *
   * static double getDistance(int x, int y, int x1, int y1) {
   *     return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
   *   }
   *
   * 5. 다음 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
   *
   * sol:
   *
   * 1. 클래스 변수(static 변수) : static int width, static int height
   * 2. 인스턴스 변수 : int kind, int num
   * 3. 지역변수 : k, n, card, args
   *
   * 6. 4번에서 작성한 클래스메서드 getDistance()를 MyPoint 클래스의 인스턴스메서드로 정의하시오.
   *
   * sol:
   *
   * double getDistance(int x1, int y1) {
   *     return Math.sqrt(Math.pow(x1 - this.x, 2) + Math.pow(y1 - this.y, 2));
   *   }
   *
   * 7. 다음은 컴퓨터 게임의 병사를 클래스로 정의한 것이다. 이 클래스의 멤버 중에 static 을 붙여야 하는 것은
   * 어떤 것들이고 이유는 무엇인가? (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
   *
   * sol:
   * static 을 붙여 클래스 변수로 설정한다는 것은 해당 속성을 모든 인스턴스들이 공통적으로 공유한다는 뜻이다.
   * 문제의 조건에서 모든 인스턴스들의 공격력과 방어력은 같아야 한다고 했으므로
   * 공격력 속성과 방어력 속성에 static 을 붙여 공통 속성으로 공유해야한다. 또한 클래스 변수에 접근하기 위해
   * 해당 변수에 접근하는 메서드를 클래스 메서드로 만들어주어야 한다.
   *
   * static int weapon = 6;
   * static int armor = 0;
   *
   * static void weaponUp() {
   * weapon++;
   * }
   * static void armorUp() {
   * armor++;
   * }
   *
   * 8. 다음 중 생성자에 대한 설명으로 옳지 않은 것은?
   *
   * sol:
   *  O : ① 모든 생성자의 이름은 클래스의 이름과 동일해야 한다.
   *  X : ② 생성자는 객체를 생성하기 위한 것이다.
   *         //실제로 객체를 생성하는 것은 new 연산자이지 생성자가 아니다.
   *          생성자는 인스턴스 생성시 같이 해야하는 일들을 수행하는 메서드이고
   *          주로 인스턴스 초기화를 많이 하는 것뿐이다. 변수 초기화 이외에
              다른 코드 수행이 필요하다면 그 작업도 생성자를 통해 처리할 수 있다.
   *  O : ③ 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
   *         //만약 클래스에 생성자가 없다면 컴파일러가 자동적으로 기본 생성자를 추가하여 준다.
   *  O : ④ 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
   *  X : ⑤ 생성자는 오버로딩 할 수 없다.
   *        //생성자 역시 메서드의 하나일 뿐이다. 매개변수를 다르게 함으로써 오버로딩이 가능하다.
   *
   * 9. 다음 중 this 에 대한 설명으로 맞지 않는 것은?
   *
   * sol:
   *  X : ② 클래스 내에서라면 어디서든 사용할 수 있다.
   *     //this 는 인스턴스 자기 자신을 가리키는 참조변수이므로 인스턴스 멤버만 this 를 사용할 수 있다.
   *      static 이 붙은 클래스메서드는 this 에 접근할 수 없다.
   *
   * 10. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은?
   *
   * sol:
   *
   *  X : ③, ④ // 리턴타입과 매개변수의 이름은 같은 이름의 메서드를 구별하는데 있어 아무런 영향을 주지 못한다.
   *
   * 11. 다음 중 아래의 add 메서드를 올바르게 오버로딩한 것은?
   *
   * sol:
   * O : ②, ③, ④
   * X : ① //매개변수 이름이 다른 것은 오버로딩 성립과 관련이 없다.
   *
   * 12. 다음 중 초기화에 대한 설명으로 옳지 않은 것은?
   *
   * sol:
   * X : ③ // 초기화 블럭이 생성자 보다 먼저 실행된다.
   *     ⑤ // 클래스 변수가 인스턴스 변수보다 먼저 초기화된다.
   *
   * 13. 다음 중 인스턴스 변수의 초기화 순서가 옳은 것은?
   *
   * sol: ① 기본값 - 명시적 초기화 - 초기화 블럭 - 생성자
   *
   * 14. 다음 중 지역변수에 대한 설명으로 옳지 않은 것은?
   *
   * sol:
   *  X : ① //지역변수는 자동초기화 되지 않으므로 직접 초기화하여 사용해야 한다.
   *      ⑤ // 지역변수는 stack 영역에 생성되고 소멸된다.
   *
   * 15. 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은?
   *
   * sol:
   * X: ② //메서드들이 종료된 것이 아니라 println 메서드가 종료될 때까지 대기 상태로 남아있는 것이다.
   *
   *
   * 16. 다음 코드의 실행 결과를 예측하여 적으시오.
   *
   * sol:
   * ABC123
   * After change : ABC123456
   *
   * change 메서드의 매개변수가 참조형인데도 왜? main 메서드의 문자열 str 에 변경한
   * 내용이 반영되지 않은 것일까? 많은 사람들이 매개변수가 참조형이라는 것만 보고 main 메
   * 서드의 문자열 str 이 변경될 것이라고 쉽게 생각한다. 누구라도 실수하기 쉬운 부분이므
   * 로 주의하길 바라는 마음에서 이 문제를 만들었다.
   *
   * 메서드 change 에서는 넘겨받은 문자열의 뒤에 "456"을 붙인다. 그런데 여기서 중요한 것은
   * 문자열은 내용을 변경할 수 없기 때문에 덧셈연산을 하면 새로운 문자열 인스턴스가 생성되고 이 인스턴스의 주소가 변수
   * str 에 저장된다는 것이다. 즉 기존의 str 이 참조하고 있는 "ABC123"이 변경되는 것이 아니라
   * "ABC123456"을 참조하는 새로운 String 인스턴스가 생성되는 것이다. 그러나 change 메서드는 새롭게 만들어진
   * 이 String 인스턴스를 반환하지 않는 void 메서드이다. 따라서 메서드 종료와 함께 "ABC123456"을 참조하는
   * String 인스턴스 역시 메모리에서 같이 소멸된다.
   *
   * ※ 참조 타입과 기본형 타입의 본질적인 차이가 무엇인지 이해하고 메모리에서 어떻게 처리되는지 아는 것이 중요하다.
   *
   * 17. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
   *
   * sol:
   * static int[] shuffle(int[] arr) {
   *     for (int i = 0; i < arr.length; i++) {
   *       int random = (int) (Math.random() * 9);
   *       int tmp = arr[i];
   *       arr[i] = arr[random];
   *       arr[random] = tmp;
   *     }
   *     return arr;
   *   }
   *
   * 18. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
   *
   * sol:
   *
   * static boolean isNumber(String str) {
   *     if (str == null || str.equals("")) {
   *       return false;
   *     }
   *
   *     boolean result = false;
   *     for (int i = 0; i < str.length(); i++) {
   *       if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
   *         return false;
   *       }
   *
   *       if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
   *         return false;
   *       }
   *     }
   *     return true;
   *   }
   *
   * 19. Tv 클래스를 주어진 로직대로 완성하시오. 완성 후에 실행해서 주어진 실행 결과와 일치하는지 확인하시오.
   *
   * sol:
   * class MyTv {
   *
   *   boolean isPowerOn;
   *   int channel;
   *   int volume;
   *
   *   final int MAX_VOLUME = 100;
   *   final int MIN_VOLUME = 0;
   *   final int MAX_CHANNEL = 100;
   *   final int MIN_CHANNEL = 1;
   *
   *   void turnOnOff() {
   *     isPowerOn = !isPowerOn;
   *   }
   *
   *   void volumeUp() {
   *     if (volume < MAX_VOLUME) {
   *       volume++;
   *     }
   *   }
   *
   *   void volumeDown() {
   *     if (volume > MIN_VOLUME) {
   *       volume--;
   *     }
   *   }
   *
   *   void channelUp() {
   *     if (channel == MAX_CHANNEL) {
   *       channel = MIN_CHANNEL;
   *     } else {
   *       channel++;
   *     }
   *   }
   *
   *   void channelDown() {
   *     if (channel == MIN_CHANNEL) {
   *       channel = MAX_CHANNEL;
   *     } else {
   *       channel--;
   *     }
   *   }
   * }
   *
   * 20. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
   *
   * sol:
   * static int max(int[] arr) {
   *     int max = 0;
   *     if (arr == null || arr.length == 0) {
   *       return -999999;
   *     }
   *
   *     for (int i = 0; i < arr.length; i++) {
   *       if (arr[i] > max) {
   *         max = arr[i];
   *       }
   *     }
   *     return max;
   *   }
   *
   * 21. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
   *
   * sol:
   * static int abs(int value) {
   *     return value < 0 ? -value : value;
   *   }
   *
   * */

  static int abs(int value) {
    if (value < 0) {
      return -value;
    }
    return value;
  }

  public static void main(String[] args) {
    int value = 5;
    System.out.printf("%d의 절댓값 : %d 입니다.%n", value, abs(value));

    value = -10;
    System.out.printf("%d의 절댓값 : %d 입니다.%n", value, abs(value));
  }
}
