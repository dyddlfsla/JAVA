package chapter.nine._04;

public class Chapter09_4 {

  /** ◆ Object 클래스의 메서드 - hashCode()
   *
   * 이 메서드는 해싱(hashing) 기법에 사용되는 '해시함수(hash function)' 를 구현한 것이다. 해싱은 데이터관리기법 중의 하나인데
   * 다량의 데이터를 저장하고 검색하는 데 유용하다. 해시함수는 찾고자하는 값을 입력하면, 그 값이 저장된 위치를 알려주는 해시코드(hashCode)를 반환한다.
   * 일반적으로 해시코드가 같은 두 객체가 존재하는 것이 가능하지만, Object 클래스에 정의된 hashCode() 메서드는 객체의 주소값을 이용해서 해시코드를 만들어
   * 반환하기 때문에 서로 다른 두 객체는 결코 같은 해시코드를 가질 수 없다.
   *
   * 앞서 살펴본 것과 같이 클래스의 인스턴스 변수 값으로 객체의 같고 다름을 판단해야하는 경우라면 equals() 메서드 뿐만 아니라 hashCode() 메서드도 적절히
   * 오버라이딩해야 한다. 같은 객체라면 hashCode() 메서드를 호출했을 때의 결과 값인 해시코드도 같아야 하기 때문이다.
   * 만일 hashCode() 메서드를 오버라이딩하지 않는다면 Object 클래스에 정의된 대로 모든 객체가 서로 다른 해시코드를 가질 것이다.
   *
   *
   *
   *
   * */
  public static void main(String[] args) {
    String str1 = new String("abc");
    String str2 = new String("abc");

    System.out.println(str1.equals(str2));
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));

  }

  /*
  * String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 hashCode() 메서드가 오버라이딩되어 있기 때문에
  * 문자열의 내용이 같은 str1 과 str2 에 대해 hashCode() 를 호출하면 항상 동일한 해시코드 값을 얻는다.
  *
  * 반면에 System.identifyHashCode(Object obj) 는 Object 클래스의 hashCode() 메서드처럼 객체의 주소값으로
  * 해시코드를 생성하기 떄문에 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장한다. 그래서 str1 과 str2 가 해시코드는 같지만
  * 서로 다른 객체라는 것을 알 수 있다.
  *
  *
  *
  * */
}
