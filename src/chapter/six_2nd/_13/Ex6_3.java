package chapter.six_2nd._13;

public class Ex6_3 {

  public static void main(String[] args) {
    System.out.printf("Card.width = %d%n", +Card.width);
    System.out.printf("Card.height = %d%n", +Card.height);

    Card c1 = new Card();
    c1.kind = "Heart";
    c1.number = 7;

    Card c2 = new Card();
    c2.kind = "Spade";
    c2.number = 4;

    System.out.printf("c1 카드의 종류는 %s, %d 이며 크기는 %d, %d 입니다. %n", c1.kind, c1.number, Card.width, Card.height);
    System.out.printf("c2 카드의 종류는 %s, %d 이며 크기는 %d, %d 입니다. %n", c2.kind, c2.number, Card.width, Card.height);

    System.out.printf("c1 의 width 와 height 를 각각 %d, %d 로 변경합니다. %n", 50, 80);
    c1.width = 50;
    c1.height = 80; //클래스 변수의 값 변경

    System.out.printf("c1 카드의 종류는 %s, %d 이며 크기는 %d, %d 입니다. %n", c1.kind, c1.number, Card.width, Card.height);
    System.out.printf("c2 카드의 종류는 %s, %d 이며 크기는 %d, %d 입니다. %n", c2.kind, c2.number, Card.width, Card.height);


  }

}

class Card {
  String kind;
  int number;

  static int width = 100;
  static int height = 250;
}

/*
* Card 클래스의 클래스 변수(static 변수)인 width, height 는 Card 클래스의 인스턴스를 생성하지 않고도 '클래스이름.클래스변수명' 과 같은 방식으로 사용할 수 있다.
* Card 인스턴스인 c1 과 c2 는 클래스 변수인 width 와 height 를 공유하기 때문에 c1 의 width 와 height 를 변경하면 c2 의 width 와 height 값도 바뀐 것과
* 같은 결과를 얻는다.
*
* Card.width, c1.width, c2.width 는 모두 같은 저장공간을 참조하므로 항상 같은 값이다.
* 클래스 변수를 사용할 때는 Card.width 와 같이 '클래스이름.클래스변수명' 의 형태로 하는 것이 좋다. 참조변수 c1, c2 를 통해서도 클래스 변수를 사용할 수 있지만
* 이렇게 하면  클래스 변수를 인스턴스 변수로 오해할 수 있기 때문이다.
*
* */
