package chapter.five;

public class Ex5_5 {

  public static void main(String[] args) {
    int[] ball = new int[45];

    for (int i = 0; i < ball.length; i++) {
      ball[i] = i + 1;
    }

    int tmp = 0;
    int randomNumber = 0;

    for (int i = 0; i < ball.length; i++) {
      randomNumber = (int) (Math.random() * 45) + 1;
      tmp = ball[i];
      ball[i] = ball[randomNumber];
      ball[randomNumber] = tmp;
    }

    for (int i = 0; i < 6; i++) {
      System.out.printf("ball[%d] = %d%n", i, ball[i]);
    }
  }
}
