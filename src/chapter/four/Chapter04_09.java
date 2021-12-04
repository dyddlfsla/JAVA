package chapter.four;

public class Chapter04_09 {

  /** ◆ 1. Switch 문
   *  if 문은 조건식의 결과가 참과 거짓, 두 가지 밖에 없기 때문에 경우의 수가 많아질수록 조건식을 계속 추가하며
   *  복잡해지게 된다.
   *  이러한 if 문과 달리 Switch 문은 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고,
   *  표현도 간결하므로 알아보기 좋다.
   *
   *  Switch 문은 조건식을 먼저 계산한 다음, 그 결과와 일치하는 case 문으로 이동한다.
   *  이동한 case 문 아래에 있는 문장들을 수행하며, break 문을 만나면 전체 switch 문을 빠져나가게 된다.
   *
   *    switch(조건식) {
   *      case 값1 :
   *      //조건식의 결과가 값1과 같을 경우 수행될 문장들.
   *      break;
   *      case 값2 :
   *      //조건식의 결과가 값2와 같을 경우 수행될 문장들.
   *      break;
   *      default :
   *      //조건식의 결과와 일치하는 case문이 없을 때 수행되는 문장들.
   *
   *      }
   *
   * default 문의 위치는 어디라도 상관없지만 보통 마지막에 놓기 때문에 break 문을 쓰지 않아도 된다.
   * switch 문에서 break 문은 각 case 문의 영역을 구분해주는 역할을 하는데, 만일 break 문을 생략하면 case 문 영역의
   * 구분이 없어지므로 다른 break 문을 만날 때까지 모든 문장을 실행해버린다. 따라서, 각 case 문의 마지막에 break 문을
   * 붙여주어야 한다.
   *
   * ◆ 2. switch 문의 제약 조건
   * switch 문의 조건식은 결과값이 반드시 정수이어야 하며, 이 값과 일치하는 case 문으로 이동하기 때문에
   * case 문의 값 역시 정수여야 하며, 중복되어서는 안된다. 게다가 case 문의 값은 반드시 상수여야 한다.
   * 변수나 실수는 case 문의 값으로 사용될 수 없다.
   *
   *
   *  public static void main(String[] args) {
   *     int num = 5;
   *     int result = 10;
   *     final int ONE = 1;
   *     switch (result) {
   *       case '1':
   *       case ONE:
   *       case "YES":
   *       case num: //에러. 변수는 CASE 문의 값으로 사용 불가.
   *       case 1.0: //에러. 실수도 불가.
   *     }
   *   }
   *
   * */



}
