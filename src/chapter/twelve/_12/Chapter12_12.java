package chapter.twelve._12;

public class Chapter12_12 {

  /*
  * ◆ 와일드 카드
  *
  * 제네릭 클래스를 생성할 때, 참조변수에 지정된 제네릭 타입과 생성자에 지정된 제네릭 타입은 일치해야 한다.
  *
  *  ArrayList<Tv> list = new ArrayList<Tv>(); // 타입 일치.
  *  List<Tv> list = new ArrayList<Tv>(); // OK. List<Tv> 타입에 ArrayList<Tv> 타입을 넣을 수 있다. 다형성
  *
  * 만일 일치하지 않으면 다음과 같이 컴파일 에러가 발생한다. Product 의 자손이 Tv 라 할지라도 말이다.
  *  ArrayList<Product> list = new ArrayList<Tv>(); // 에러 발생. 제네릭 타입 불일치.
  *
  * 그러면 제네릭 타입에 다형성을 적용할 방법은 없을까? 제네릭 타입으로 '와일드 카드' 를 사용하면 된다. 와일드 카드는 기호 '?' 를 사용하는데
  * 다음과 같이 키워드 'extends' 와 'super' 로 상한과 하한을 제한할 수 있다.
  *
  * ① <? extends T>: 와일드 카드의 상한 제한. T 와 그 자손들만 가능
  * ② <? super T>: 와일드 카드의 하한 제한. T 와 그 조상들만 가능
  * ③ <?>: 제한없음. 모든 타입이 다 가능. <? extends Object> 와 동일
  *
  * 와일드 카드를 이용하면 다음과 같이 하나의 참조변수로 다른 제네릭 타입이 지정된 객체를 다룰 수 있다. (Tv 와 Audio 가 Product 의 자손이라고 가정)
  *
  *  ArrayList<? extends Product> list = new ArrayList<Tv>(); // 가능
  *  ArrayList<? extends Product> list = new ArrayList<Audio>(); // 가능
  *
  * 만약 이 와일드 카드를 아래와 같이 메서드의 매개변수에 적용하면 다음과 같다.
  *
  * static Juice makeJuice(FruitBox<? extends Fruit> box) {
  *   String tmp = "";
  *   for (Fruit fruit : box.getList()) {
  *     tmp += fruit + " ";
  *   }
  *   return new Juice(tmp);
  * }
  *
  * 다음과 같이 제네릭 타입이 다른 여러 객체를 매개변수로 지정할 수 있게 되는 것이다. (Apple 이 Fruit 의 자손이라고 가정)
  *  Juice.makeJuice(new FruitBox<Fruit>());
  *  Juice.makeJuice(new FruitBox<Apple>()); // 이 코드가 가능해진다.
  *
  * 메서드의 선언부가 제네릭이 적용되지 않은 makeJuice(FruitBox<Fruit> box) {...} 였다면
  *  Juice.makeJuice(new FruitBox<Apple>()); 는 에러가 발생한다.
  *
  *
  * */

}
