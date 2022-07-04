package chapter.eleven._44;

import java.util.TreeSet;

public class Ex11_14 {

  public static void main(String[] args) {
    TreeSet set = new TreeSet();

    String from = "b";
    String to = "d";

    set.add("abc");
    set.add("alien");
    set.add("bat");
    set.add("car");
    set.add("Car");
    set.add("disc");
    set.add("dance");
    set.add("dZZZZ");
    set.add("dzzzz");
    set.add("elephant");
    set.add("elevator");
    set.add("fan");
    set.add("flower");

    System.out.println(set);
    System.out.println("range search : from " + from + " to " + to);
    System.out.println("result1 : " + set.subSet(from, to));
    System.out.println("result2 : " + set.subSet(from, to + "zzz"));

    /*
    * subSet() 메서드를 이용해 범위 검색(range search) 을 하는 경우, 시작 범위는 포함되지만 끝 범위는 포함되지 않으므로
    * result1 에는 c 로 시작하는 단어까지만 검색결과에 포함한다.
    *
    * */
  }

}

class Ex11_15 {

  public static void main(String[] args) {
    TreeSet set = new TreeSet();
    int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

    for (int i = 0; i < score.length; i++) {
      set.add(new Integer(score[i]));
    }

    System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
    System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));
  }

  /*
  * TreeSet 의 headSet() 메서드와 tailSet() 메서드를 이용하면, TreeSet 에 저장된 객체 중 지정된 기준 값보다 큰 값의 객체들과
  * 작은 값의 객체들을 얻을 수 있다.
  *
  *            80
  *          /    \
  *         50    95
  *        /  \     \
  *       35  65    100
  *      /  \
  *     10  45
  *
  * 위의 그림은 예제에 나온 TreeSet 을 그림으로 표현한 것인데
  * 50이 저장된 노드의 왼쪽 노드와 그 아래에 연결된 모든 노드의 값은 50보다 작고, 그 외 나머지 값들은 50보다 크다는 것을 알 수 있다.
  *
  *
  *
  * */
}
