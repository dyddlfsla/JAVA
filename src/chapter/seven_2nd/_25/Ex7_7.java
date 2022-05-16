package chapter.seven_2nd._25;

public class Ex7_7 {

  public static void main(String[] args) {
    Car car = null;
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

    fe.water();
    car = fe; // car = (Car) fe; 에서 (Car) 캐스팅 연산자 생략
    //car.water() 에러. Car 타입의 참조변수로는 water() 를 호출할 수 없다.
    fe2 = (FireEngine) car; //조상 타입에서 자손 타입으로 형변환 하는 경우 (FireEngine) 캐스팅 연산자 생략 불가
    fe2.water();

    A a;
    B b = new B();
    C c = new C();
    a = b;
    c = (C) a;
//    System.out.println(b.b);

  }
}

class Car {
  String color;
  int door;

  void drive() {
    System.out.println("drive, Brrr ~ ");
  }
  void stop() {
    System.out.println("stop!!!");
  }
}

class FireEngine extends Car {
  void water() {
    System.out.println("water!!!");
  }

  /**
   * 이 예제에서 중요한 부분을 하나씩 살펴보자.
   *
   * FireEngine fe = new FireEngine(); //FireEngine 객체 생성
   * car = fe; // fe 의 값을 car 에 저장.
   *
   * fe(0x100) → 0x100
   *            null(color)
   *            0 (door)
   *            drive()
   *            stop()
   *            water()
   *
   * fe(0x100)  →   0x100
   * car(0x100) ↗   null(color)
   *                0 (door)
   *                drive()
   *                stop()
   *                water()
   *
   * 참조변수 fe 의 주소값을 car 에 저장해서 car 로도 FireEngine 인스턴스를 다룰 수 있게 되었다.
   * 하지만 참조변수 fe 와 달리 car 로는 FireEngine 인스턴스의 멤버 중 4개만 사용 가능하다.
   *
   * */
}

class A {
  String a = "a";
}

class B extends A {
  String b = "b";
}

class C extends B {
  String c = "c";
}
