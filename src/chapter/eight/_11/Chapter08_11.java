package chapter.eight._11;

public class Chapter08_11 {
  /** ◆ 메서드에 예외 선언하기
   * 예외를 처리하는 방법에는 지금까지 배운 try-catch 문을 사용하는 것 외에, 예외를 메서드에 선언하는 방법이 있다.
   * 메서드에 예외를 선언하려면, 메서드의 선언부에 키워드 throws 를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어주면 된다.
   * 그리고 예외가 여러 개일 경우에는 쉼표(,) 로 구분한다.
   *
   * void method() throws Exception1, Exception2, Exception3, ... {
   *
   * }
   *
   * ※ 예외를 발생시키는 키워드 throw 와 메서드에 예외를 선언하는 키워드 throws 를 잘 구별하자.
   * 만일 아래와 같이 모든 예외의 최고 조상인 Exception 클래스를 메서드에 선언하면, 이 메서드는 모든 종류의 예외가 발생할 가능성이 있다는 것이다.
   *
   * void method() throws Exception {
   *   ...
   * }
   *
   * 예외를 선언하면, 이 예외 뿐만 아니라 그 자손타입의 예외까지도 발생할 수 있다는 점에 주의하자. 앞서 오버라이딩에서 살펴본 것과 같이,
   * 오버라이딩할 떄는 단순히 선언된 예외의 개수가 아니라 상속관계까지 고려해야 한다.
   *
   * 메서드의 선언부에 예외를 선언함으로써 메서드를 사용하려는 사람이 메서드의 선언부를 보았을 때, 이 메서드를 사용하기 위해서는 어떠한 예외들이
   * 처리되어져야 하는지 쉽게 알 수 있다.
   *
   * 기존의 많은 언어들에서는 메서드에 예외 선언을 하지 않기 때문에, 경험 많은 프로그래머가 아니고서는 어떤 상황에 어떤 종류의 예외가 발생할 가능성이
   * 있는지 충분히 예측하기 힘들기 떄문에 그에 대한 대비를 하는 것이 어려웠다.
   *
   * 그러나 자바에서는 메서드를 작성할 때 메서드 내에서 발생할 가능성이 있는 예외를 메서드의 선언부에 명시하여 이 메서드를 사용하는 쪽에서는 이에 대한
   * 처리를 하도록 강요하기 때문에, 프로그래머들의 짐을 덜어 주는 것은 물론이고 보다 견고한 프로그램 코드를 작성할 수 있도록 도와준다.
   *
   *
   * */
  public static void main(String[] args) {
    Person person = new Person("jace");
    System.out.println(person.getName());
  }
}

class Person {
  private String name;

  public String getName() {
    return name;
  }

  Person (String name) {
      if (name.length() < 5) {
        throw new RuntimeException("이름은 5자 이상이어야 합니다.");
      }
      this.name = name;
    }
}



