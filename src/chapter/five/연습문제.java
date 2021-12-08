package chapter.five;

import java.util.Arrays;

public class 연습문제 {

  /**
   *
   *  1. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.
   *
   *  sol:
   *   ✔︎ ① int[] arr[]; //arr 라는 이름으로 2차원 int 배열을 생성한다.
   *   ✔︎ ② int[] arr = {1, 2, 3,}; // 마지막 쉼표(,)는 있어도 상관없다.
   *   ✔︎ ③ int[] arr = new int[5]; // 길이가 5인 int 배열을 생성한다.
   *   ✖︎︎ ④ int[] arr = new int[5]{1,2,3,4,5}; // 배열 생성과 초기화를 동시에 하는 경우 배열의 길이를 지정할 수 없다.
   *   ✖︎ ⑤ int arr[5]; // 길이 지정은 new 연산자를 통해야 한다.
   *   ✖︎ ⑥ int[] arr[] = new int[3][]; // 행과 열 모두 길이를 지정해야 한다.
   *
   *
   *  2. 다음과 같은 배열이 있을 때, arr[3].length 의 값은?
   *
   *  int[][] arr = {
   *    {5, 5, 5, 5, 5},
   *    {10, 10, 10},
   *    {20, 20, 20, 20},
   *    {30, 30}
   *  };
   *
   *  sol: arr[3].length = 2
   *
   *  3. 배열 arr 에 담긴 모든 값을 더하는 코드를 작성하시오.
   *
   *  sol:
   *  int[] arr = {10, 20, 30, 40, 50};
   *     int sum = 0;
   *
   *     for (int i = 0; i < arr.length; i++) {
   *       sum += arr[i];
   *     }
   *     System.out.printf("배열의 모든 합은 %d 입니다.%n", sum);
   *
   *
   *  4. 2차원 배열 arr 에 담긴 모든 값의 총합과 평균을 구하는 코드를 작성하시오.
   *
   *  sol:
   *  int[][] arr = {
   *         {5, 5, 5, 5, 5},
   *         {10, 10, 10, 10, 10},
   *         {20, 20, 20, 20, 20},
   *         {30, 30, 30, 30, 30}
   *     };
   *
   *     int total = 0;
   *     float average = 0.0f;
   *     int count = 0;
   *
   *     for (int i = 0; i < arr.length; i++) {
   *       count += arr[i].length;
   *       for (int j = 0; j < arr[i].length; j++) {
   *         total += arr[i][j];
   *       }
   *     }
   *     average = (float) total / count;
   *
   *     System.out.printf("총합은 : %d%n", total);
   *     System.out.printf("평균은 : %.2f%n", average);
   *
   *
   *  5. 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 코드를 완성하시오.
   *
   *  sol:
   *  int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
   *     int[] ball3 = new int[3];
   *
   *     for (int i = 0; i < ballArr.length; i++) {
   *       int randomNum = (int) (Math.random() * ballArr.length);
   *
   *       int tmp = ballArr[0];
   *       ballArr[0] = ballArr[randomNum];
   *       ballArr[randomNum] = tmp;
   *     }
   *
   *     ball3 = Arrays.copyOf(ballArr, 3);
   *     for (int i = 0; i < ball3.length; i++) {
   *       System.out.printf("배열의 각 요소는 : %d 입니다. %n", ball3[i]);
   *     }
   *
   *  6. 다음 코드를 완성하시오
   *
   *  sol:
   *
   *  String[] words = {"television", "computer", "mouse", "phone"};
   *     Scanner scanner = new Scanner(System.in);
   *
   *     for (int i = 0; i < words.length; i++) {
   *       char[] question = words[i].toCharArray();
   *       for (int j = 0; j < question.length; j++) {
   *         int random = (int) (Math.random() * question.length);
   *         char tmp = question[0];
   *         question[0] = question[random];
   *         question[random] = tmp;
   *       }
   *       System.out.printf("Q%d, %s가 무슨 단어일지 맞춰보세요.>%n", i + 1, new String(question));
   *       String userAnswer = scanner.nextLine();
   *
   *       if (userAnswer.trim().equals(words[i])) {
   *         System.out.printf("정답입니다!%n");
   *       } else {
   *         System.out.printf("땡! 틀렸습니다.%n");
   *       }
   *     }
   *
   *
   * */
  public static void main(String[] args) {
    int[] arr[] = new int[3][5];
    System.out.printf("arr[] : %s 입니다. %n", Arrays.deepToString(arr));
  }
}
