package chapter.fourteen._39;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_8 {

  public static void main(String[] args) {
    Optional<String> optStr = Optional.of("abcde");
    Optional<Integer> optInt = optStr.map(String::length);

    System.out.println("optStr.get() = " + optStr.get());
    System.out.println("optInt.get() = " + optInt.get());

    int result1 = Optional.of("123")
        .filter(string -> string.length() > 0)
        .map(Integer::parseInt)
        .get();

    int result2 = Optional.of("")
        .filter(string -> string.length() > 0)
        .map(Integer::parseInt)
        .orElse(-1);

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
    
    Optional.of("456")
        .map(Integer::parseInt)
        .ifPresent(integer -> System.out.printf("result3 = %d%n", integer));

    OptionalInt optInt1 = OptionalInt.of(0);
    OptionalInt optInt2 = OptionalInt.empty();

    System.out.println("optInt1.isPresent() = " + optInt1.isPresent());
    System.out.println("optInt2.isPresent() = " + optInt2.isPresent());

    System.out.println("optInt1.getAsInt() = " + optInt1.getAsInt());
//    System.out.println("optInt2.getAsInt() = " + optInt2.getAsInt()); optInt2 에는 값이 없으므로 get 을 사용하면 NoSuchElementException 이 발생한다.
    System.out.println("optInt1 = " + optInt1);
    System.out.println("optInt2 = " + optInt2);
    System.out.println("optInt1.equals(optInt2) = " + optInt1.equals(optInt2));
  }

}
