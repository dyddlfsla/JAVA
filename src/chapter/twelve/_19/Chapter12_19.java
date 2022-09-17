package chapter.twelve._19;

public class Chapter12_19 {

  /*
  * ◆ 열거형의 조상 - java.lang.Enum
  *
  * 모든 열거형의 조상은 java.lang.Enum 이며, 이 클래스는 다음과 같은 메서드를 제공한다.
  *
  * ① Class<E> getDeclaringClass(): 열거형의 Class 객체를 반환한다.
  * ② String name(): 열거형 상수의 이름을 문자열로 반환한다.
  * ③ int ordinal(): 열거형 상수가 정의된 순서를 반환한다. (0부터 시작)
  * ④ T valueOf(Class<T> enumType, String name): 지정된 열거형에서 name 과 일치하는 열거형 상수를 반환한다.
  *
  * ordinal() 모든 열거형의 조상인 java.lang.Enum 클래스에 정의된 것으로, 열거형 상수가 정의된 순서(0부터 시작)를 정수로 반환한다.
  *
  * 이외에도 values() 처럼 컴파일러가 모든 열거형에 자동적으로 추가해주는 메서드가 두 개 더 있다.
  *
  *  ① static E[] values()
  *  ② static E valueOf(String name)
  *
  * Direction[] dArr = Direction.values();
  *
  * for (Direction d : dArr) {
  *   System.out.printf(%s = %d%n, d.name(), d.ordinal());
  * }
  *
  * 그리고 valueOf(String name) 는 열거형 상수의 이름으로 문자열 상수에 대한 참조를 얻을 수 있게 해준다.
  *
  * Direction d = Direction.valueOf("WEST");
  *
  * System.out.println(d); // WEST
  * System.out.println(Direction.WEST == Direction.valueOf("WEST")); //true
  *
  *
  * */

}

enum Direction {EAST, SOUTH, WEST, NORTH}


class Ex12_5 {

  public static void main(String[] args) {
    Direction d1 = Direction.EAST;
    Direction d2 = Direction.valueOf("WEST");
    Direction d3 = Enum.valueOf(Direction.class, "EAST");

    System.out.println("d1 = " + d1);
    System.out.println("d2 = " + d2);
    System.out.println("d3 = " + d3);

    System.out.println("d1 == d2 ? " + (d1 == d2));
    System.out.println("d1 == d3 ? " + (d1 == d3));
    System.out.println("d1.equals(d3) ? " + d1.equals(d3));
//    System.out.println("d2 > d3 ? " + d2 > d3); 에러 발생. 열거형 상수 간에 <, > 와 같은 비교 연산자를 사용할 수 없다.
    System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
    System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));

    switch (d1) {
      case EAST:
        System.out.println("The Direction is EAST.");
        break;
      case SOUTH:
        System.out.println("The Direction is SOUTH.");
        break;
      case WEST:
        System.out.println("The Direction is WEST.");
        break;
      case NORTH:
        System.out.println("The Direction is NORTH.");
        break;
      default:
        System.out.println("Invalid direction.");
        break;
    }

    Direction[] dArr = Direction.values();

    for (Direction d : dArr) {
      System.out.printf("%s == %d", d.name(), d.ordinal());
    }
  }
}
