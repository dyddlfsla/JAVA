package chapter.five;

public class Chapter05_13 {

  /** ◆ String 배열의 초기화
   *
   * 초기화 역시 int 배열과 동일한 방법으로 한다.
   *
   *  String[] name = new String[3];
   *  name[0] = "Kim";
   *  name[1] = "Park";
   *  name[2] = "Yi";
   *
   *  또는 괄호를 사용하여 다음과 같이 초기화 할 수도 있습니다.
   *
   *  String[] name = new String[]{ "Kim", "Park", "Yi"};
   *  String[] name = { "Kim", "Park", "Yi}; // new String[] 을 생략할 수 있다.
   *  특별히 String 클래스만 "Kim" 과 같이 큰따옴표만으로 간략히 표현하는 것이 허용되지만,
   *  원래 String 클래스는 클래스이므로 new 연산자를 통해 생성해야 한다.
   *
   *  name[0] = new String("Kim");
   *  name[1] = new String("Park");
   *  name[2] = new String("Yi");
   *
   *
   * */
  public static void main(String[] args) {
    String[] name = {"Kim", "Park", "Yi"};

    for (int i = 0; i < name.length; i++) {
      System.out.println("name [" + i + "]: " + name[i]);
    }

    String tmp = name[2];
    System.out.println("tmp: " + tmp);
    name[0] = "Yu";

    for (int i = 0; i < name.length; i++) {
      System.out.println(name[i]);
    }
  }
}
