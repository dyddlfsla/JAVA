package chapter.four;

public class 연습문제 {

  /**
   * 1. 다음의 문장들을 조건식으로 표현하라.
   *
   * sol:
   * ① int x;
   *    10 < x && x < 20
   *
   * ② ch != ' ' && ch != '\t'
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
   *     int i = 1;
   *     int sign = 1;
   *     while (sum < 100) {
   *       sum += i * sign;
   *       System.out.println("i = " + i + ", sum = " + sum);
   *       i++;
   *       sign = -sign;
   *     }
   *  } //199까지 더 했을 때.
   *
   *  5. 다음 for 문을 while 문으로 변경하시오.
   *
   *  sol:
   *  int i = 0;
   *     while (i <= 10) {
   *       int j = 0;
   *       while (j <= i) {
   *         System.out.print("*");
   *         j++;
   *       }
   *       System.out.println();
   *       i++;
   *     }
   *
   *  6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
   *
   *  sol:
   *  for (int i = 1; i <= 6; i++) {
   *       for (int j = 1; j <= 6; j++) {
   *         if (i + j == 6) {
   *           System.out.printf("(%d, %d)%n", i, j);
   *         }
   *       }
   *     }
   *
   *  7.
   *
   *  sol:
   *  String str = "12345";
   *     int sum = 0;
   *
   *     for (int i = 0; i < str.length(); i++) {
   *       sum += (str.charAt(i) - '0');
   *     }
   *
   *     System.out.println("sum = " + sum);
   *   }
   *
   *  8.
   *  sol:
   *  int value = (int) (Math.random() * 6) + 1;
   *     System.out.println("value = " + value);
   *
   *  9.
   *  sol:
   *  int num = 12345;
   *     int sum = 0;
   *
   *     while (num > 0) {
   *       sum += num %10;
   *       num /= 10;
   *     }
   *     System.out.println("sum = " + sum);
   *   }
   *
   *  10.
   *  sol:
   *  int answer = (int) (Math.random() * 100) + 1;
   *     int input = 0;
   *     int count = 0;
   *
   *     Scanner scanner = new Scanner(System.in);
   *
   *     do {
   *       System.out.print("1과 100사이의 값을 입력하세요 :");
   *       input = scanner.nextInt();
   *       count++;
   *
   *       if (input > answer) {
   *         System.out.println("더 작은 수를 입력하세요.");
   *       } else {
   *         System.out.println("더 큰 수를 입력하세요.");
   *       }
   *     } while (input != answer);
   *     System.out.println("정답입니다. 시도한 횟수는 " + count + "번 입니다.");
   *
   * */
}
