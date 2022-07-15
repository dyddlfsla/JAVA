package chapter.nine._exercise;

public class Exercise9_3 {
  /*
  * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
  * 메서드명: count
  * 기능: 주어진 문자열 src 에 찾으려는 문자열(target) 이 몇 번 나오는지 세어서 반환한다.
  * 매개변수: String src, String target
  *
  * */
  static int count(String src, String target) {
    int count = 0; //찾은 횟수
    int pos = 0; //찾기 시작할 위치

    for (; pos < src.length();) {
      int index = src.indexOf(target, pos);
      if (index >= 0) {
        count++;
        pos = (index + target.length());
      }
      if (index == -1) {
        break;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    System.out.println(count("12345AB12AB345AB", "AB"));
    System.out.println(count("12345", "AB"));
  }
}
