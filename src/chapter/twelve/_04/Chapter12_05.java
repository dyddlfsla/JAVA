package chapter.twelve._04;

import java.util.ArrayList;
import java.util.List;

public class Chapter12_05 {

  /*
  * ◆ 제네릭 타입과 다형성
  *
  * 제네릭 클래스의 객체를 생성할 때, 참조변수에 지정해준 제네릭 타입과 생성자에 지정해준 제네릭 타입은 일치해야 한다.
  * 클래스 Tv 와 Product 가 서로 상속관계에 있어도 일치해야 한다.
  *
  *  ArrayList<Tv> list = new ArrayList<Tv>(); //OK. 일치
  *  ArrayList<Product> list = new ArrayList<Tv>(); // 에러. 불일치
  *
  * 그러나 제네릭 타입이 아닌 클래스의 타입 간에 다형성을 적용하는 것은 가능하다. 이 경우에도 제네릭 타입은 일치해야 한다.
  *
  * List<Tv> list = new ArrayList<Tv>(); // OK. 다형성 ArrayList 가 List 를 구현
  * List<Tv> list = new LinkedList<Tv>(); // LinkedList 가 List 를 구현
  *
  * 그러면 ArrayList 에 Product 의 자손 객체만 저장할 수 는 없을까? 그럴 때는 제네릭 타입이 Product 인 ArrayList 를 생성하고
  * 이 ArrayList 에 Product 의 자손인 Tv 와 Audio 의 객체를 저장하면 된다.
  *
  * ArrayList<Product> list = new ArrayList<Product>();
  *
  * list.add(new Product());
  * list.add(new Tv());
  * list.add(new Audio());
  *
  * 대신 ArrayList 에서 객체를 꺼낼 때, 형변환이 필요하다.
  *
  * Product product = list.get(0); // Product 객체는 형변환 필요 없음.
  * Tv tv = (Tv) list.get(1); //Product 의 자손 객체들은 형변환이 필요함.
  *
  *
  *
  * */

  public static void main(String[] args) {
    ArrayList<Product> productList = new ArrayList<Product>();
    ArrayList<Tv> tvList = new ArrayList<Tv>();
//    ArrayList<Product> productList2 = new ArrayList<Tv>(); 에러.
    List<Tv> tvList2 = new ArrayList<Tv>(); // OK. 다형성

    productList.add(new Tv());
    productList.add(new Audio());

    tvList.add(new Tv());
    tvList.add(new Tv());

    printAll(productList);
//    printAll(tvList); 에러 발생.
  }

  public static void printAll(ArrayList<Product> list) {
    for (Product product : list) {
      System.out.println(product);
    }
  }

}

class Product {}

class Tv extends Product {}

class Audio extends Product {}
