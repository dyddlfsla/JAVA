package chapter.eleven._42;

import java.util.Set;
import java.util.TreeSet;

public class Chapter11_42 {

  public static void main(String[] args) {
    Set set = new TreeSet();

    for (int i = 0; set.size() < 6; i++) {
      int num = (int) (Math.random() * 45) + 1;
      set.add(num);
    }

    System.out.println(set);
    /*
    * TreeSet 은 별도의 정렬을 하지 않아도 값을 저장할 때 자동 정렬이 된다.
    *
    * */
  }

}
