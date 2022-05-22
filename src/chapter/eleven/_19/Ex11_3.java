package chapter.eleven._19;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java Ex11_3 \"EXPRESSION\"");
      System.out.println("Example: java Ex11_3 \"((2+3)*1)+3\"");
      System.exit(0);
    }

    Stack stack = new Stack();
    String expression = args[0];

    System.out.println("expression: " + expression);

    try {
      for (int i = 0; i <expression.length(); i++) {
        char ch = expression.charAt(i);

        if (ch == '(') {
          stack.push(ch + "");
        } else if (ch == ')') {
          stack.pop();
        }
      }

      if (stack.isEmpty()) {
        System.out.println("괄호가 일치합니다.");
      } else {
        System.out.println("괄호가 일치하지 않습니다.");
      }
    } catch (EmptyStackException e) {
      System.out.println("괄호가 일치하지 않습니다.");
    }
  }

  /*
  * 입력한 수식의 괄호가 올바른지 체크하는 예제이다. '(' 를 만나면 스택에 넣고 ')' 를 만나면 스택에서 '(' 를 꺼낸다.
  * ')' 를 만나서 '(' 를 꺼내려 할 때 스택이 비어있거나 수식을 검사하고 난 후에도 스택이 비어있지 않다면 괄호가 잘못 된것이다.
  *
  *
  * */
}
