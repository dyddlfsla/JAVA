package chapter.two;

public class Ex2_12 {

  public static void main(String[] args) {
    String str = "3";

    System.out.println(str.charAt(0) - '0'); //문자열을 문자로 변환 후 다시 숫자로 변환.
    System.out.println('3' - '0' + 1); //문자를 숫자로 변환 후 + 1 연산.
    System.out.println(Integer.parseInt("3") + 1); //문자열을 int로 변환 후  +1 연산.
    System.out.println("3" + 1);
    System.out.println((char)(3 + '0')); // + '0'을 통해 숫자를 문자로 변환.
  }
}
