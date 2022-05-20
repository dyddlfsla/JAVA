package chapter.eleven._07;

public class Chapter11_07 {

  /** ◆ ArrayList
   *
   * ArrayList 는 컬렉션 프레임워크에서 가장 많이 사용되는 컬렉션 클래스일 것이다.
   * 이 ArrayList 는 List 인터페이스를 구현하기 때문에 데이터의 저장순서가 유지되고 중복을 허용한다는 특징을 갖고 있다.
   *
   * ArrayList 는 기존의 Vector 를 개선한 것으로 Vector 와 구현 원리 기능적인 측면에서 동일하다고 할 수 있다. 앞에서 얘기했던 것과 같이
   * Vector 는 기존에 작성된 소스와의 호환성을 위해서 계속 남겨두고 있을 뿐이기 때문에 가능하면 Vector 보다는 ArrayList 를 사용하자.
   * ArrayList 는 Object 배열을 이용해서 데이터를 순차적으로 저장한다. 예를 들어, 첫 번째로 저장한 객체는 Object 배열의 0번째 위치에 저장되고
   * 그 다음에 저장하는 객체는 1번째 위치에 저장된다. 이런 식으로 계속 배열에 순서대로 저장되며, 배열에 더 이상 저장할 공간이 없으면 보다 큰 새로운 배열을 생성해서
   * 기존의 배열에 저장된 내용을 새로운 배열로 복사한 다음에 저장된다.
   *
   * public class ArrayList extends AbstractList implements List, RandomAccess, Cloneable, java.io.Serializable {
   *   ...
   *   transient Object[] elementData; // Object 배열
   * }
   *
   * ※ transient 는 직렬화와 관련된 제어자이다.
   *
   * 위의 코드는 ArrayList 의 소스코드 일부인데 ArrayList 는 elementDate 라는 이름의 Object 배열을 멤버변수로 선언하고 있다는 것을 알 수 있다. 선언된 배열의 타입이
   * 모든 객체의 최고 조상인 Object 이기 때문에 모든 종류의 객체를 담을 수 있다.
   *
   *
   *
   *
   * */

}
