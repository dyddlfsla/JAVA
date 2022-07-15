package chapter.nine._exercise;

public class Exercise9_1 {
  /*
  * 다음과 같은 실행결과를 얻도록 SutdaCard 클래스의 equals() 를 멤버변수인 num, isKwang 의 값을 비교하도록
  * 오버라이딩하고 테스트 하시오.
  *
  * */

  public static void main(String[] args) {
    SutdaCard c1 = new SutdaCard(3, true);
    SutdaCard c2 = new SutdaCard(3, true);

    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
    System.out.println("c1.equals(c2) : " + c1.equals(c2));

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
  public boolean equals(Object obj) {
    if (obj instanceof SutdaCard) {
      SutdaCard sutdaCard = (SutdaCard) obj;
      return this.num == sutdaCard.num && this.isKwang == sutdaCard.isKwang;
    }
    return false;
  }

  @Override
  public String toString() {
    return this.num + (this.isKwang ? "K" : "");
  }
}
