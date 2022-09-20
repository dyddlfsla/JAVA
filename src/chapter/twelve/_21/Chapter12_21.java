package chapter.twelve._21;

public class Chapter12_21 {

  /*
  * ◆ 열거형에 멤버 추가하기
  *
  * Enum 클래스에 정의된 ordinal() 이 열거형 상수가 정의된 순서를 반환하지만, 이 값을 열거형 상수의 값으로 사용하지 않는 것이 좋다.
  * 이 값은 내부적인 용도로만 사용되기 위한 것이기 때문이다.
  *
  * 열거형 상수의 값이 불규칙적인 경우에는 다음과 같이 열거형 상수의 이름 옆에 원하는 값을 괄호() 와 함께 적어주면 된다.
  *
  *  enum Direction { EAST(1), SOUTH(5), WEST(-1), NORTH(10) }
  *
  * 그리고 지정된 값을 저장할 수 있는 인스턴스 변수와 생성자를 새로 추가해주어야 한다. 이 때 주의할 점은,
  * 먼저 열거형 상수를 모두 정의한 다음에 다른 멤버들을 추가해야 한다는 것이다.
  * 그리고 열거형 상수의 마지막에 ';' 도 잊지 말아야 한다.
  *
  * enum Direction {
  *   EAST(1), SOUTH(5), WEST(-1), NORTH(10); // 끝에 ';' 을 추가해야 한다.
  *
  *   private final int value; // 정수를 저장할 필드(인스턴스 변수)를 추가
  *
  *   Direction(int value) { // 생성자를 추가한다. ※ 열거형의 생성자는 묵시적으로 private 이다.
  *     this.value = value;
  *   }
  *
  *   public int getValue() {return this.value;} // getter 추가
  * }
  *
  *
  * 열거형의 인스턴스 변수는 반드시 final 이어야 한다는 제약은 없지만, value 는 열거형 상수의 값을 저장하기 위한 것이므로
  * final 을 붙였다. 그리고 외부에서 이 값을 얻을 수 있게 getValue() 도 추가해주었다.
  *
  * Direction d = new Direction(1); // 에러 발생. 열거형의 생성자는 외부에서 호출 불가.
  *
  * 열거형 Direction 에 새로운 생성자가 추가되었지만, 위와 같이 열거형의 객체를 생성할 수 없다. 열거형의 생성자는 제어자가 묵시적으로 private 이기 때문이다.
  *
  *
  *
  * */

}

enum Direction {
  EAST(1, ">"), SOUTH(2, "v"), WEST(3, "<"), NORTH(4, "^");

  private static final Direction[] DIR_ARR = Direction.values();
  private final int value;
  private final String symbol;

  Direction(int value, String symbol) {
    this.value = value;
    this.symbol = symbol;
  }

  public int getValue() {
    return value;
  }

  public String getSymbol() {
    return symbol;
  }

  public static Direction of(int dir) {
    if (dir < 1 || dir > 4) {
      throw new IllegalArgumentException("Invalid value : " + dir);
    }
    return DIR_ARR[dir - 1];
  }

  //방향을 회전시키는 메서드 num 의 값만큼 90 씩 시계방향으로 회전한다.

  public Direction rotate(int num) {
    num = num % 4;

    if (num < 0) {
      num += 4; // num 이 음수일 때는 시계 반대 방향으로 회전
    }
    return DIR_ARR[(value - 1 + num) % 4];
  }


  @Override
  public String toString() {
    return name() + getSymbol();
  }
}

class Ex12_6 {

  public static void main(String[] args) {
    for (Direction direction : Direction.values()) {
      System.out.printf("%s = %d%n", direction.name(), direction. getValue());
    }

    Direction direction1 = Direction.EAST;
    Direction direction2 = Direction.of(1);

    System.out.printf("%s = %d%n", direction1.name(), direction1. getValue());
    System.out.printf("%s = %d%n", direction2.name(), direction2. getValue());

    System.out.println(Direction.EAST.rotate(1));
    System.out.println(Direction.EAST.rotate(2));
    System.out.println(Direction.EAST.rotate(-1));
    System.out.println(Direction.EAST.rotate(-2));
  }

}
