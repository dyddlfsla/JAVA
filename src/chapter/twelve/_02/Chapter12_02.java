package chapter.twelve._02;

public class Chapter12_02 {

  /*
  * ◆ 타입 변수
  *
  * ArrayList 클래스의 선언에서 클래스 이름 옆의 '<>' 안에 있는 E 를 '타입 변수(type variable)' 라고 하며,
  * 일반적으로 'Type' 의 첫 글자를 따서 알파벳 T 를 사용한다.
  * 그렇다고 타입 변수로 반드시 T 를 사용해야 하는 것은 아니며, T 가 아닌 다른 것을 사용해도 된다.
  * ArrayList<E> 의 경우, 'Element(요소)' 의 첫 글자를 따서 타입 변수의 이름으로 E 를 사용한 것이다.
  *
  * public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable{
  *   ...
  * }
  *
  * 타입 변수가 여러 개인 경우에는 Map<K, V> 와 같이 ',' 콤마를 구분자로 나열하면 된다. K 는 key 를 의미하고 V 는 value 를 의미한다.
  * T, K, V 와 같이 타입 변수는 기호만 다를 뿐 '임의의 참조형 타입' 을 의미한다는 것을 모두 동일하다. 그저 그 타입이 내부에서 가지는 역할을 최대한 살려서 표현한 것 뿐이다.
  *
  * 아래의 코드는 제네릭스가 도입되기 이전의 ArrayList 의 소스이다. 위의 코드와 비교해보면,
  * Object 타입 대신 임의의 타입을 의미하는 타입 변수 'E' 가 사용된 것을 알 수 있다.
  *
  * public class ArrayList extends AbstractList {
  *   private transient Object[] elementData;
  *   public boolean add(Object o) {}
  *   public Object get(int index) {}
  *   ...
  * }
  *
  * 기존에는 다양한 종류의 타입을 다루는 메서드의 매개변수나 리턴 타입으로 Object 타입의 참조변수를 많이 사용했고, 그로인해 형변환이 불가피했지만
  * 이젠 Object 타입 대신 제네릭스를 통해 원하는 타입을 지정하기만 하면 되는 것이다.
  *
  * ArrayList<Tv> tvList = new ArrayList<Tv>(); // 타입변수 E 대신에 실제 필요한 타입 Tv 를 지정함.
  *
  *
  * ◆ 타입 변수에 대입하기
  *
  * ArrayList 와 같은 제네릭 클래스를 생성할 때는 다음과 같이 참조변수와 생성자에 타입 변수 E 대신에 Tv 와 같은 실제 타입을 지정해주어야 한다.
  * 이때, 타입 변수 E 대신 지정된 타입 Tv 를 '대입된 타입(parameterized type)' 이라고 한다.
  *
  * 타입이 대입되고 나면, ArrayList 클래스의 선언에 포함된 타입 변수 E 가 아래와 같이 지정된 타입으로 바뀐다고 생각하면 된다.
  *
  * public class ArrayList extends AbstractList {
  *   private transient Tv[] elementData;
  *   public boolean add(Tv o) {}
  *   public Tv get(int index) {}
  *   ...
  * }
  *
  * 위 코드에서 get() 메서드는 이제 Object 가 아닌 Tv 객체를 반환하게 되므로 형변환이 필요없게 되는 것이다.
  *
  * tvList.add(new Tv());
  * Tv tv = tvList.get(0); // 형변환 없이 get() 반환값을 바로 tv 에 참조한다.
  *
  *
  *
  * */

}
