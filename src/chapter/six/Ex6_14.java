package chapter.six;

public class Ex6_14 {
  static {
    System.out.printf("클래스 초기화 블럭입니다. static {}%n");
  }
  {
    System.out.printf("인스턴스 초기화 블럭입니다. {}%n");
  }

  Ex6_14() {
    System.out.printf("생성자 초기화입니다.%n");
  }

  public static void main(String[] args) {
    System.out.printf("Ex6_14 bt = new Ex6_14(); %n");
    Ex6_14 bt1 = new Ex6_14();
    System.out.println(bt1);

    System.out.printf("Ex6_14 bt = new Ex6_14(); %n");
    Ex6_14 bt2 = new Ex6_14();
    System.out.println(bt2);

    /**
     * ① 예제가 실행되면서 Ex6_14 클래스가 메모리에 로딩될 때, 가장 첫 번째로 클래스 초기화 블럭이 수행된다.
     * ② 그 다음 main() 메서드가 수행되어 Ex6_14의 인스턴스가 생성되고 인스턴스 초기화 블럭이 수행된다.
     * ③ 끝으로 생성자가 수행된다.
     *
     * 또한 위에서 알 수 있듯이, 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행되고
     * 인스턴스 초기화 블럭은 매번 인스턴스를 생성할 때마다 수행된다.
     *
     * */
  }
}
