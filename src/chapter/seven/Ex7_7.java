package chapter.seven;

public class Ex7_7 {

  public static void main(String[] args) {
    Car car = null;
    FireEngine fireEngine1 = new FireEngine();
    FireEngine fireEngine2 = null;

    fireEngine1.water();
    car = fireEngine1;
    // car.water 에러발생. Car 타입의 참조변수로는 water()를 호출할 수 없다.

    fireEngine2 = (FireEngine) car;
    fireEngine2.water();
  }
}

class Car {
  String color;
  int door;

  void drive() { //운전하는 기능.
    System.out.println("drive, Brrrr~");
  }

  void stop() { //정지 기능.
    System.out.println("stop!!");
  }
}

class FireEngine extends Car {
  void water() { //물 뿌리는 기능.
    System.out.println("water!!");
  }
}
