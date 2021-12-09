package chapter.six;

public class Ex6_3 {

  public static void main(String[] args) {
    System.out.printf("Card.width = %d 입니다.%n", Card.width);
    System.out.printf("Card.height = %d 입니다.%n", Card.height);

    Card card1 = new Card();
    card1.kind = "Heart";
    card1.number = 7;

    Card card2 = new Card();
    card2.kind = "Space";
    card2.number = 4;

    System.out.printf("card1은 %s, %d 이며, 크기는 가로 %d, 세로 %d 입니다.%n", card1.kind, card1.number, card1.width, card1.height);
    System.out.printf("card2은 %s, %d 이며, 크기는 가로 %d, 세로 %d 입니다.%n", card2.kind, card2.number, card2.width, card2.height);
    System.out.printf("card1의 width 와 height 를 각각 50, 80으로 변경합니다.%n ");
    card1.width = 50;
    card1.height = 80;

    System.out.printf("card1은 %s, %d 이며, 크기는 가로 %d, 세로 %d 입니다.%n", card1.kind, card1.number, card1.width, card1.height);
    System.out.printf("card2은 %s, %d 이며, 크기는 가로 %d, 세로 %d 입니다.%n", card2.kind, card2.number, card2.width, card2.height);

  }
}

class Card{
  String kind;
  int number;
  static int width = 100;
  static int height = 250;
}
