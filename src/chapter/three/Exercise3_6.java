package chapter.three;

public class Exercise3_6 {

  public static void main(String[] args) {
    int fahrenheit = 100;
    float celsius = (int)((5/9F * (fahrenheit - 32)) * 100 + 0.5F) / 100F;

    System.out.println("Fahrenheit: " + fahrenheit);
    System.out.println("Celsius: " + celsius);
  }

}
