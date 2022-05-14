package chapter.ten.exercise._03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_3 {

  static int paycheckCount(Calendar from, Calendar to) {
    return 0;
  }

  static void printResult(Calendar from, Calendar to) {
    Date fromDate = from.getTime();
    Date toDate = to.getTime();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
    System.out.println(paycheckCount(from, to));
  }

  public static void main(String[] args) {
    Calendar fromCal = Calendar.getInstance();
    Calendar toCal = Calendar.getInstance();

    fromCal.set(2020, 0, 1);
    toCal.set(2020, 0, 1);
    printResult(fromCal, toCal);

    fromCal.set(2020, 0, 21);
    toCal.set(2020, 0, 21);
    printResult(fromCal, toCal);

    fromCal.set(2020, 0, 1);
    toCal.set(2020, 2, 1);
    printResult(fromCal, toCal);

    fromCal.set(2020, 0, 1);
    toCal.set(2020, 2, 23);
    printResult(fromCal, toCal);

    fromCal.set(2020, 0, 23);
    toCal.set(2020, 2, 21);
    printResult(fromCal, toCal);

    fromCal.set(2020, 0, 22);
    toCal.set(2020, 2, 21);
    printResult(fromCal, toCal);
  }

}
