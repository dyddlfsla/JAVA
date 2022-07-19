package chapter.seven.exercise;

public class Exercise7_1 {

  /*
  * 섯다카드 20장을 포함하는 섯다 카드 한 벌(SutdaDeck 클래스) 을 정의한 것이다. 섯다카드 20장을 담는 SutDaCard 배열을 초기화 하시오.
  * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8 인 경우에는 둘 중의 한 장은 광(Kwang) 이어야 한다.
  * SutdaCard 의 인스턴스 변수 isKwang 의 값이 true 여야 한다.
  *
  * */

}

class SutdaDeck {
  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];

//  SutdaDeck() {
//    for (int i = 0; i < CARD_NUM; i++) {
//      boolean isKwang;
//      int num;
//      if ()
//      cards[i] = new SutdaCard(++i, )
//    }
//
//  }
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
