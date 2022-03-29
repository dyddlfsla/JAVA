package chapter.seven.chapter_07_35;

public interface PlayingCard {

  public static final int SPADE = 4;
  final int DIAMOND = 3; // public static 이 생략됨. 컴파일러가 자동적으로 추가해준다.
  static int HEART = 2; // public final 이 생략됨. 컴파일러가 자동적으로 추가해준다.
  int CLOVER = 1; // public static final 이 생략됨. 컴파일러가 자동적으로 추가해준다.

  public abstract String getCardNumber(); //public abstract 를 다 붙여도 되지만 생략 가능함.
  String getCardKind(); // public abstract 를 생략함.

}
