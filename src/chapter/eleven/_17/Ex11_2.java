package chapter.eleven._17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {

  public static void main(String[] args) {
    Stack stack = new Stack();
    Queue queue = new LinkedList();

    stack.push("0");
    stack.push("1");
    stack.push("2");

    queue.offer("0");
    queue.offer("1");
    queue.offer("2");

    System.out.println(" = Stack = ");
    while (!stack.empty()) {
      System.out.println(stack.pop());
    }

    System.out.println(" = Queue =");
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }
  /*
  * 스택과 큐에 각각 "0", "1", "2" 를 같은 순서로 넣고 꺼내었을 때 결과가 다른 것을 알 수 있다. 큐는 먼저 넣은 것이 먼저 꺼내지는 구조(FIFO) 이기 때문에
  * 넣을 때와 같은 순서로 나오게 되고, 스택은 먼저 넣은 것이 나중에 나오게 되는 LIFO 구조이기 때문에 넣을 때의 순서와 꺼낼 때의 순서가 서로 뒤집어지는 것을 알 수 있다.
  *
  * 자바에서는 스택을 Stack 클래스로 구현하여 제공하고 있지만 큐는 Queue 인터페이스로만 정의해 놓았을 뿐 별도의 클래스를 제공하고 있지 않다. 대신 Queue 인터페이스를
  * 구현한 클래스들이 있어서 이들 중의 하나를 선택해서 사용하면 된다.
  *
  * 위의 예제에서와 같이 Queue 인터페이스의 기능을 사용하고자 할 때는 다음과 같이 Java API 를 참고하면 된다.
  * 해당 API 문서를 살펴보게 되면 Queue 인터페이스를 구현한 여러 클래스에 대한 정보들을 확인할 수 있는데
  * 각 클래스들은 각자 나름대로의 용도가 있겠지만 적어도 Queue 인터페이스에 정의된 메서드는 모두 구현해놓았으며 이 메서드들은
  * 내용이 조금씩 다를 순 있지만 대부분 거의 동일한 기능을 한다. 그래서 이들 클래스 중 적당한 하나를 선택하여
  * Queue queue = new LinkedList(); 와 같이 객체를 생성해서 사용하면 될 것이다.
  *
  *
  *
  *
  * */
}
