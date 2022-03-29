package chapter.seven.chapter_07_35;

public class MyCard implements PlayingCard {

  @Override
  public String getCardNumber() {
    return "" + (this.DIAMOND + this.CLOVER + this.SPADE + this.HEART);
  }

  @Override
  public String getCardKind() {
    return null;
  }

  public static void main(String[] args) {
    MyCard card = new MyCard();
    System.out.printf("카드번호는 %s입니다. %n", card.getCardNumber());
  }
}
