package chapter.fourteen.exercise;

public class Ex14_1 {

  /*
   * 14-1. 다음 메서드를 람다식으로 변환하시오.
   *
   * sol:
   *
   * 한번에 람다식을 작성하려 하지말고 한 단계씩 변환해나가는 것이 좋다.
   *
   * 람다식 변환 순서
   * ① 메서드에서 반환타입과 메서드 이름을 제거한다.
   * ② 메서드의 선언부와 구현부 사이에 -> 기호를 추가한다.
   * ③ 반환값이 존재하는 메서드의 경우 return 문 대신 '식(expression)' 으로 대체할 수 있다.
   * ④ 람다식에 선언된 매개변수의 타입은 추론이 가능한 경우 생략할 수 있는데, 대부분의 경우 생략할 수 있다.
   * ⑤ 매개변수가 하나만 있다면 매개변수를 감싸고 있는 괄호() 를 생략할 수 있다.
   * ⑥ 메서드 구현부 중괄호{} 안의 문장이 하나일 때는 괄호{} 를 생략할 수 있다. 단, 괄호 안의 문장이 return 문이라면 생략할 수 없다.
   *
   * 1. void printVar(String name, int i) { // 문제에는 int printVar 로 적혀있는데 return 문이 없으므로 오류이다. void 로 수정함.
   *      System.out.println(name + "=" + i);
   *    }
   * : (name, i) -> System.out.println(name + "=" + i)
   *
   * 2. int square(int x) {
   *      return x * x;
   *    }
   * : x -> x * x
   *
   * 3. int roll() {
   *      return (int)(Math.random() * 6);
   *    }
   * : () -> (int)(Math.random() * 6)
   *
   * 4. int sumArr(int[] arr) {
   *       int sum = 0;
   *       for (int i : arr)
   *         sum += i;
   *     return sum;
   *    }
   * : (arr) -> { int sum = 0;
   *              for (int i :arr) {
   *                sum += i;
   *              }
   *              return sum;
   *              }
   *
   * 5. int[] emptyArr() {
   *      return new int[]{};
   *    }
   * : () -> new int[]{}
   *
   * */
}