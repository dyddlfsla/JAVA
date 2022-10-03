package chapter.fourteen._45;

public class Chapter14_45 {

  /*
  * ◆ collect() 와 Collectors
  *
  * 스트림의 최종 연산 중에서 가장 복잡하면서도 유용하게 활용될 수 있는 것이 collect() 이다.
  * collect() 는 스트림의 요소를 수집하는 최종 연산으로 앞서 배운 리듀싱(reducing) 과 유사하다.
  * collect() 가 스트림의 요소를 수집하려면, 어떻게 수집할 것인가에 대한 방법이 정의되어 있어야 하는데, 이 방법을 정의한 것이 바로 컬렉터(collector) 이다.
  *
  * 컬렉터는 Collector 인터페이스를 구현한 것으로, 직접 구현할 수도 있고 미리 작성된 것을 사용할 수도 있다.
  * Collectors 클래스는 미리 작성된 다양한 종류의 컬렉터를 반환하는 static 메서드를 가지고 있으며, 이 클래스를 통해 제공되는 컬렉터만으로도 많은 일들을 할 수 있다.
  *
  * 1.collect(): 스트림의 최종연산, 매개변수로 컬렉터를 필요로 한다.
  * 2.Collector: 인터페이스, 컬렉터는 이 인터페이스를 구현해야한다.
  * 3.Collectors: 클래스, 자바에서는 static 메서드를 통해 미리 작성된 컬렉터를 제공한다.
  *
  * collect() 는 매개변수의 타입이 Collector 인데, 매개변수가 Collector 를 구현한 클래스의 객체이어야 한다는 뜻이다.
  * 그리고 collect() 는 이 객체에 구현된 방법대로 스트림의 요소를 수집한다.
  * ※ sort() 할 때, Comparator 가 필요한 것처럼 collect() 할 때는 Collector 가 필요하다.
  *
  * Object collect(Collector collector) // Collector 를 구현한 클래스만이 매개변수가 될 수 있다.
  * Object collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner)
  *
  * 그리고 매개변수가 3개나 정의된 collect() 는 잘 사용되지는 않지만, Collector 인터페이스를 구현하지 않고
  * 간단히 람다식으로 수집할 때 사용하면 편리하다.
  *
  *
  *
  *
  * */

}
