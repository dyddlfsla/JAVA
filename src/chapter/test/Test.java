package chapter.test;

public class Test {

  public static void main(String[] args) {
    Father son = new Son();
    System.out.println(son.name); //예상 결과?
    System.out.println(son.age);
    son.walk();
    System.out.println("==============");
    Son son1 = (Son) son;
    System.out.println(son1.name);
    System.out.println(son1.age);
    son1.walk();
  }

}

class Father {

  String name = "jason";
  int age = 50;

  void walk() {
    System.out.println("Father 가 걷는다.");
  }
}

class Son extends Father {

  String name = "robert";
  int age = 10;

  void walk() {
    System.out.println("Son 이 걷는다.");
  }
}
