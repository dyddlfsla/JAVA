package chapter.four;

public class 연습문제 {

  /**
   * 1. 다음의 문장들을 조건식으로 표현하라.
   *
   * sol:
   * ① int x;
   *    10 < x && x < 20
   *
   * ② ch != ' ' && ch != ?
   *
   * ③ ch == 'x' || ch == 'X'
   *
   * ④ '0' <= ch && ch <= '9'
   *
   * ⑤ 'a' <= ch && ch <= 'z' || 'A' <= ch && < ch <= 'Z'
   *
   * ⑥ year %400 == 0 || year %4 == 0 && year %100 != 0
   *
   * ⑦ !powerOn
   *
   * ⑧ str.equals("yes")
   *
   * 2. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
   *
   * sol:
   *  int sum = 0;
   *  for (int i = 1; i <= 20; i++) {
   *    if (i %2 == 0 || i %3 == 0 ) {
   *      continue;
   *    }
   *    sum += i;
   *  }
   *  System.out.print(sum); // sum = 73
   *
   * 3. 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1 + 2 + 3... + 10) 의 결과를 계산하시오.
   *
   * sol:
   *  int sum = 0;
   *  for (int i = 1; i <= 10; i++) {
   *    for (int j = 1; j <= i j++) {
   *      sum += j
   *    }
   *  }
   *  System.out.print(sum); // sum = 220
   *
   * 4. 1 + (-2) + 3 + (-4) + 5 + (-6) + ... 과 같이 계속 더해 나갔을 경우 몇까지 더해야 총합이 100이상이 되는가?
   *
   * sol:
   *
   *  int sum = 0;
   *  int i = 1;
   *  while (sum <= 100) {
   *    if (i %2 == 0) {
   *      -i;
   *    }
   *    sum += i;
   *    i++;
   *    System.out.println("i = " + i + "sum = " + sum);
   *  }
   *
   *
   * */



}
