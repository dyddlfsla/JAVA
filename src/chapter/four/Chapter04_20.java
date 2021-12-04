package chapter.four;

public class Chapter04_20 {

  /** ◆ break 문
   *
   * 앞서 switch 문에서 break 문에 대해서 배웠다. 반복문에서도 break 문을 사용할 수 있는데,
   * switch 문에서 그랬던 것처럼, break 문은 자신이 포함된 가장 가까운 반복문 하나를 벗어나게 해준다.
   * 주로 if 문과 같이 사용되어 특정 조건을 만족할 때 반복문을 벗어나게 한다.
   *
   * */

  public static void main(String[] args) {
    int sum = 0;
    int i = 0;

    while (true) {
      if (sum > 100) {
        break; //break 문이 수행되면 그 즉시 while 문을 벗어난다.
      }
      ++i;
      sum += i;
    }
    System.out.println("i = " + i);
    System.out.println("sum = " + sum);
  }

  //이처럼 무한반복문에는 항상 break 문이 같이 작성되어야 한다. 만일 그렇지 않으면
  //무한 반복문을 빠져나올 방법은 없으므로 프로그램은 종료되지 않게 된다.
}
