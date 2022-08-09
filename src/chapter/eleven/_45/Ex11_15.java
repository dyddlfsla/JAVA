package chapter.eleven._45;

import java.util.TreeSet;

public class Ex11_15 {

  public static void main(String[] args) {
    TreeSet set = new TreeSet();
    int[] scores = {80, 95, 50, 35, 45, 65, 10, 100};
    for (int score : scores) {
      set.add(new Integer(score));
    }

    System.out.println("50 보다 작은 값: " + set.headSet(new Integer(50)));
    System.out.println("50 보다 큰 값: " + set.tailSet(new Integer(50)));
  }

  /*
  * TreeSet 의 headSet(), tailSet() 메서드를 사용하면 TreeSet 에 저장된 객체 중 지정된 기준 값보다 큰 값의 객체들과 작은 값의 객체들을 얻을 수 있다.
  *
  * */

}
