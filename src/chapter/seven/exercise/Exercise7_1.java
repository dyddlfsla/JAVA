package chapter.seven.exercise;

public class Exercise7_1 {

  /*
  * 7-1.
  * 섯다카드 20장을 포함하는 섯다 카드 한 벌(SutdaDeck 클래스) 을 정의한 것이다. 섯다카드 20장을 담는 SutDaCard 배열을 초기화 하시오.
  * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8 인 경우에는 둘 중의 한 장은 광(Kwang) 이어야 한다.
  * SutdaCard 의 인스턴스 변수 isKwang 의 값이 true 여야 한다.
  *
  * 7-2.
  * SutdaDeck 클래스에 다음과 같이 새로운 메서드를 추가하고 테스트하시오.
  * 1. - 메서드명: shuffle / 기능: 배열 cards 에 담긴 카드의 위치를 뒤섞는다. (Math.random() 사용) / 반환타입: 없음 / 매개변수: 없음
  * 2. - 메서드명: pick / 기능: 배열 cards 에서 지정된 위치의 SutdaCard 를 반환한다. / 반환타입: SutdaCard / 매개변수: int index
  * 3. - 메서드명: pick / 기능: 배열 cards 에서 임의의 위치의 SutdaCard 를 반환한다. (Math.random() 사용) / SutdaCard / 매개변수: 없음
  *
  * */

  public static void main(String[] args) {
    SutdaDeck deck = new SutdaDeck();
    for (int i = 0; i < deck.cards.length; i++) {
      System.out.print(deck.cards[i] + ",");
    }
  }
}

class Exercise7_2 {

  public static void main(String[] args) {
    SutdaDeck deck = new SutdaDeck();
    System.out.println(deck.pick(0));
    System.out.println(deck.pick());
    deck.shuffle();

    for (int i = 0; i < deck.cards.length; i++) {
      System.out.print(deck.cards[i] + ", ");
    }

    System.out.println();
    System.out.println(deck.pick(0));
  }
}

class SutdaDeck {
  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];

  SutdaDeck() {
    for (int i = 0; i < 10; i++) {
      boolean isKwang = false;
      int num = i + 1;
      if (num == 1 || num == 3 || num == 8) {
        isKwang = true;
      }
      cards[i] = new SutdaCard(num, isKwang);
      isKwang = false;
      cards[i + 10] = new SutdaCard(num, isKwang);
    }
  }

  //1. - 메서드명: shuffle / 기능: 배열 cards 에 담긴 카드의 위치를 뒤섞는다. (Math.random() 사용) / 반환타입: 없음 / 매개변수: 없음
  public void shuffle() {
    for (int i = 0; i < cards.length; i++) {
      int randomIdx = (int) (Math.random() * CARD_NUM);
      SutdaCard tmp = cards[i];
      cards[i] = cards[randomIdx];
      cards[randomIdx] = tmp;
    }
  }

  //2. - 메서드명: pick / 기능: 배열 cards 에서 지정된 위치의 SutdaCard 를 반환한다. / 반환타입: SutdaCard / 매개변수: int index
  public SutdaCard pick(int index) {
    if (index < 0 || index >= CARD_NUM) {
      return null;
    }
    return cards[index];
  }

  //3. - 메서드명: pick / 기능: 배열 cards 에서 임의의 위치의 SutdaCard 를 반환한다. (Math.random() 사용) / SutdaCard / 매개변수: 없음
  public SutdaCard pick() {
    return pick((int) (Math.random() * CARD_NUM));
  }
}

class SutdaCard {
  int num;
  boolean isKwang;

  SutdaCard() {
    this(1, true);
  }

  SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  @Override
  public String toString() {
    return num + (isKwang ? "K" : "");
  }
}
