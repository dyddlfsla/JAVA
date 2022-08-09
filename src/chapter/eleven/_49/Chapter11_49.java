package chapter.eleven._49;

import java.util.HashMap;
import java.util.Scanner;

public class Chapter11_49 {

  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("myId", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1234");

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("id 와 password 를 입력해주세요.");
      System.out.print("id:");
      String id = scanner.nextLine().trim();

      System.out.print("password:");
      String password = scanner.nextLine().trim();
      System.out.println();

      if (!map.containsKey(id)) {
        System.out.println("입력하신 id 는 존재하지 않습니다. 다시 입력해주세요.");
      } else {
        if (!(map.get(id).equals(password))) {
          System.out.println("비밀번호가 일치하지 않습니다.");
        } else {
          System.out.println("id 와 비밀번호가 일치합니다.");
          break;
        }
      }
    }
  }
  /*
   * HashMap 을 생성하고 사용자ID 와 비밀번호를 키와 값의 쌍(pair)으로 저장한 다음, 입력된 사용자ID를 키로 HashMap 에서 검색해서 얻은 값(비밀번호)이 입력된 비밀번호와 비교하는 예제이다.
   *
   * map.put("asdf", "1111");
   * map.put("asdf", "1234");
   *
   * 앞서 설명한 바와 같이 HashMap 은 중복된 키를 허용하지 않는다. 따라서 위의 코드를 실행시키면 Map 안에는 asdf 라는 하나의 키만 존재할 것이다.
   * 그렇다면 이 asdf 키에는 어떤 값(value) 가 연결되어 있을까?
   * HashMap 에서 이미 존재하는 키를 또 추가하면 해당 키에 연결된 기존 값이 사라지고 추가된 값이 대체하게 된다. 즉 기존의 값을 덮어쓰게 되는 것이다.
   *
   *
   *
   *
   * */
}
