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
   *
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



