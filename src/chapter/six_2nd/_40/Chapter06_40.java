package chapter.six_2nd._40;

public class Chapter06_40 {

  static { //클래스 초기화 블럭
    System.out.printf("static {} 초기화 시작 \n");
  }

  { //인스턴스 초기화 블럭
    System.out.printf("인스턴스 {} 초기화 시작 \n");
  }

  public Chapter06_40() {
    System.out.printf("생성자 초기화 시작\n");
  }

  public static void main(String[] args) {
    System.out.printf("Chapter06_40 bt = new Chapter06_40();\n");
    Chapter06_40 bt = new Chapter06_40();

    System.out.printf("Chapter06_40 bt2 = new Chapter06_40();\n");
    Chapter06_40 bt2 = new Chapter06_40();
  }

  /**
   * 예제가 실행되면서 Chapter06_40 이 메모리에 로딩될 때, 클래스 초기화 블럭이 가장 먼저 수행되어 'static {}' 이 화면에 출력된다.
   * 그 다음에 main 메서드가 수행되어 Chapter06_40 의 인스턴스가 생성되면서 인스턴스 초기화 블럭이 먼저 수행되고, 그 다음 마지막으로 생성자가 호출된다.
   * 위의 결과에서 알 수 있듯이 클래스 초기화 블럭은 처음 클래스가 메모리에 로딩될 때 한번만 수행되지만, 인스턴스 초기화 블럭은 인스턴스가 생성될 때마다
   * 수행된다.
   *
   * */
}
