package chapter.nine._exercise;

public class Exercise9_5 {
  /*
  * 메서드명: delChar
  * 기능: 주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
  * 반환타입: String
  * 매개변수: String src - 변환할 문자열, String delCh - 제거할 문자열
  * StringBuffer 와 String 클래스의 charAt(int i), indexOf(int ch) 를 사용
  *
  *
  * */

  static String delChar(String src, String delCh) {
    StringBuffer srcBuffer = new StringBuffer(src);
    for (int i = 0; i < srcBuffer.length(); i++) {
      if (delCh.indexOf(srcBuffer.charAt(i)) >= 0) {
        srcBuffer.deleteCharAt(i);
      }
    }
    return new String(srcBuffer);
  }

  public static void main(String[] args) {
    System.out.println("(1!2@3^4~5) -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
    System.out.println("(1 2 3 4\t5) -> " + delChar("(1 2 3 4\t5)", " \t"));
  }
}
