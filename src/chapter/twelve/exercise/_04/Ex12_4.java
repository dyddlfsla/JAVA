package chapter.twelve.exercise._04;

import java.util.ArrayList;

public class Ex12_4 {
  /*
  * 12-4. 아래의 메서드는 두 개의 ArrayList 를 매개변수로 받아서, 하나의 새로운 ArrayList 로 병합한다.
  *       이를 제네릭 메서드로 변경하시오.
  *
  *
  * */

  public static <T extends Product> ArrayList<T> merge(ArrayList<T> list, ArrayList<T> list2) {

    ArrayList<T> newList = new ArrayList<>(list);
    newList.addAll(list);
    return newList;
  }

}

class Product {


}
