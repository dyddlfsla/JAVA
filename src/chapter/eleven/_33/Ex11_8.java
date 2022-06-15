package chapter.eleven._33;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex11_8 {

  public static void main(String[] args) {
    Set set = new HashSet();
//    Set set = new LinkedHashSet();
    int[][] board = new int[5][5];

    for (int i = 0; set.size() < 25; i++) {
      set.add((int) (Math.random() * 50) + 1 + "");
    }

    Iterator it = set.iterator();

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = Integer.parseInt((String) it.next());
        System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
      }
      System.out.println();
    }
  }

  /*
  * 1 ~ 50 사이의 숫자 중에서 25개를 골라 '5x5' 크기의 빙고판을 만드는 예제이다. next() 는 반환값이 Object 타입이므로 형변환해서
  * 원래의 타입으로 돌려놔야 한다. 그런데 몇번 실행해보면 같은 숫자가 비슷한 위치에 나온다는 사실을 발견할 수 있을 것이다. 앞서 언급한 것과 같이
  * HashSet 은 저장된 순서를 보장하지 않고 자체적인 저장 방식에 따라 저장순서가 결정되기 때문이다.
  *
  *
  * */

}
