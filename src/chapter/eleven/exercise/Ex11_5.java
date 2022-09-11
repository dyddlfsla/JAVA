package chapter.eleven.exercise;

import java.util.HashSet;

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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SutdaCard sutdaCard = (SutdaCard) o;
    return num == sutdaCard.num && isKwang == sutdaCard.isKwang;
  }

  @Override
  public int hashCode() {
    return this.toString().hashCode();
  }

  @Override
  public String toString() {
    return num + (isKwang ? "K" : "");
  }
}
public class Ex11_5 {

  /*
  * HashSet 에 중복된 카드가 저장되지 않도록 hashCode() 를 알맞게 오버라이딩하시오.
  *
  *
  * */

  public static void main(String[] args) {
    SutdaCard c1 = new SutdaCard(3, true);
    SutdaCard c2 = new SutdaCard(3, true);
    SutdaCard c3 = new SutdaCard(1, true);

    HashSet hashSet = new HashSet();
    hashSet.add(c1);
    hashSet.add(c2);
    hashSet.add(c3);

    System.out.println("hashSet = " + hashSet);
  }
}
