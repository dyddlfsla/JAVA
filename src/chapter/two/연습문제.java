package chapter.two;

public class 연습문제 {

  /**
   * 2-1. 8개의 기본형을 알맞은 자리에 넣으시오.
   *
   * sol:
   * --------------------------------------
   *        1byte   2byte   4byte   8byte
   *
   * 논리형  boolean
   * 문자형           char
   * 정수형  byte    short    int     long
   * 실수형                  float   double
   * --------------------------------------
   *
   * 2-2. 키워드가 아닌 것은?
   * sol: True, NULL, Class, System  자바에서는 대소문자를 구분하므로 true는 키워드지만 True는 키워드가 아니다.
   *
   * 2-3. char 타입의 변수에 저장될 수 있는 정수 값의 범위?
   * sol: char타입은 유니코드 정수값을 변수로 저장한다. 범위는 0 ~ 65535
   *
   * 2-4. 다음 중 변수를 잘못 초기화한 것은?
   * sol: byte b = 256; byte의 범위는 -126 ~ 127 이다.
   *      char c = ''; 문자 타입에는 빈 문자가 불가능하다.
   *      char answer = 'no'; 문자 타입에는 단일 문자만 저장할 수 있다.
   *      float f = 3.14; 리터럴 접미사 f는 생략할 수 없다.
   *
   * 2-5. 다음 리터럴, 변수, 상수, 키워드를 고르시오.
   * sol: 리터럴 = 100, 100L, 3.14f / 키워드 = int, long, final, float / 변수 = i, l / 상수 = PI
   *
   * 2-6. 다음 중 기본형(primitive type)이 아닌 것?
   * sol: Byte
   *
   * 2-7. 다음 문장들의 출력 결과는? 오류인 경우, 오류라고 작성
   * sol: "12"
   *      "true"
   *      35
   *      3
   *      3
   *      "Java"
   *      오류
   *
   * 2-8. 변수 x, y, z의 값을 서로 바꾸는 예제를 만드시오.
   * */

  public static void main(String[] args) {
    int x = 1;
    int y = 2;
    int z = 3;
    int tmp;

    tmp = x;
    x = y;
    y = z;
    z = tmp;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);

  }

}
