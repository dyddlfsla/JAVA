package chapter.seven.chapter_07_35;

public class Son extends Father{

  int age = 10;
  String name = "Ailey";

  public static void main(String[] args) {
    Son son = new Son();
    System.out.printf("나이는 %d, 이름은 %s 입니다만,", son.age, son.name);
  }

}
