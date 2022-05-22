package chapter.eleven._19;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {

  static Queue queue = new LinkedList();
  static final int MAX_SIZE = 5;

  public static void main(String[] args) {

    System.out.println("help 를 입력하면 도움말을 볼 수 있습니다.");
    while (true) {
      System.out.print(">>");
      try {
        //화면으로부터 라인 단위로 입력받는다.
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        if (input.equals("")) {
          continue;
        }

        if (input.equalsIgnoreCase("q")) {
          System.exit(0);
        } else if (input.equalsIgnoreCase("help")) {
          System.out.println("help - 도움말을 보여줍니다.");
          System.out.println("q 또는 Q - 프로그램을 종료합니다.");
          System.out.println("history - 최근에 입력한 명령어를 최대 " + MAX_SIZE + "개만큼 보여줍니다.");
        } else if (input.equalsIgnoreCase("history")) {
          int i = 0;
          save(input);

          LinkedList tmp = (LinkedList) queue;
          ListIterator listIterator = tmp.listIterator();

          while (listIterator.hasNext()) {
            System.out.println(++i + ". " + listIterator.next());
          }
        } else {
          save(input);
          System.out.println(input);
        }

      } catch (Exception e) {
        System.out.println("입력 오류입니다.");

      }
    }
  }

  private static void save(String input) {
    //queue 에 저장한다
    if (!input.equals("")) {
      queue.offer(input);
    }

    if (queue.size() > MAX_SIZE) {
      queue.remove();
    }
  }

  /*
  * 이 예제는 유닉스의 history 명령어를 Queue 를 이용해 구현해본 것이다. history 명령어는 사용자가 입력한 명령어의 이력을 순서대로 보여주는 것이다.
  * 여기서는 최대 5개만큼의 명령어만 보여주는데  MAX_SIZE 를 변경함으로써 저장할 명령어 갯수를 변경할 수 있다.
  * 대부분의 프로그램에서는 최근에 열어 본 문서들의 목록을 보여주는 기능을 제공하는데, 이런 기능들은 Queue 의 구조를 활용한다면 쉽게 구현할 수 있다.
  *
  *
  * */
}
