package chapter.eleven._51;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {

  public static void main(String[] args) {
    String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

    HashMap map = new HashMap();

    for (int i = 0; i < data.length; i++) {
      if (map.containsKey(data[i])) {
        Integer value = (Integer) map.get(data[i]);
        map.put(data[i], new Integer(value.intValue() + 1));
      } else {
        map.put(data[i], new Integer(1));
      }
    }

    Iterator iterator = map.entrySet().iterator();

    while (iterator.hasNext()) {
      Map.Entry entry = (Map.Entry) iterator.next();
      int value = ((Integer) entry.getValue()).intValue();
      System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
    }

  }

  public static String printBar(char ch, int value) {
    char[] bar = new char[value];
    for (int i = 0; i < bar.length; i++) {
      bar[i] = ch;
    }
    return new String(bar);
  }

  /*
  * 문자열 배열에 담긴 문자열을 하나씩 읽어서 HashMap 에 키로 저장하고 값으로 1을 저장한다. HashMap 에 같은 문자열이 키로 저장되어 있는지
  * containsKey() 로 확인하고 이미 저장되어 있는 값이면 값을 1을 증가시킨다.
  *
  * 그리고 그 결과를 printBar() 를 이용해 표현했다. 이렇게 하면 문자열 배열에 담긴 문자열들의 빈도 수를 구할 수 있다.
  * 한정된 범위 내에 있는 순차적인 값들의 빈도 수는 배열을 이용하지만, 이처럼 한정되지 않은 범위의 비순차적인 값들의 빈도수는 HashMap 을 이용해서 구할 수 있다.
  *
  * ※ HashMap 처럼 Hashing 을 구현한 클래스들은 데이터 저장 시, 저장 순서를 유지하지 않는다.
  *
  *
  * */
}
