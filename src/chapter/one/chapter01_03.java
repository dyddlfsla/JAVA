package chapter.one;

public class chapter01_03 {
  /*
   *  자바의 특징
   *
   * 1. 운영체제에 독립적이다.
   * = 기존의 언어는 한 운영체제에 맞게 개발된 프로그램을 다른 종류의 운영체제에 적용하기 위해서는 많은 노력이 필요했지만, 자바에서는 더 이상 그럴 필요가 없다.
   * 이것은 일종의 에뮬레이터인 자바가상머신(JVM)을 통해서 가능한 것인데, 자바 응용프로그램은 운영체제나 하드웨어가 아닌 JVM하고만 통신하고
   * JVM이 자바 응용프로그램으로부터 전달 받은 명령을 해당 운영체제가 이해할 수 있도록 변환하여 전달한다. 자바로 작성된 프로그램은 운영체제에는 독립적이지만
   * JVM은 운영체제에 종속적이어서 썬에서는 여러 운영체제에 설치할 수 있는 서로 다른 버전의 JVM을 제공하고 있다.
   *
   * 그래서 자바로 작성된 프로그램은 운영체제와 하드웨어에 관계없이 실행 가능하며 이것을 '한번 작성하면, 어디서나 실행된다.(write once, run anywhere)고 표현하기도 한다.
   *
   *
   * 2. 객체지향 언어이다
   * = 자바는 프로그래밍의 대세로 자리 잡은 객체지향 프로그래밍언어(object-oriented programming language) 중 하나로 객체지향 개념의 특징인 상속, 캡슐화,
   * 다형성이 잘 적용된 순수한 객체지향 언어라는 평가를 받고 있다.
   *
   *
   * 3. 비교적 배우기 쉽다.
   * = 자바의 연산자와 기본 구문은 C++에서, 객체지향 관련 구문은 스몰톡(small talk)이라는 객체지향 언어에서 가져왔다. 객체지향 언어가 배우기가 어렵기 때문에
   * 사용자층을 확보하지 못했으나 자바의 간결하면서도 명료한 객체지향적 설계는 사용자들이 객체지향 개념을 보다 쉽게 이해하고 활용할 수 있도록 하였다.
   *
   * 4. 자동 메모리 관리(Garbage Collection)
   * = 자바로 작성된 프로그램이 실행되면, 가비지컬렉터가 자동적으로 메모리를 관리해주기 때문에 프로그래머는 메모리를 따로 관리 하지 않아도 된다. 가비지컬렉터가 없다면
   * 프로그래머가 사용하지 않는 메모리를 체크하고 반환하는 일을 수동적으로 처리해야 할 것이다. 자동으로 메모리를 관리한다는 것은 다소 비효율적인 면도 있지만, 프로그래머가
   * 보다 프로그래밍에 집중할 수 있도록 도와준다.
   *
   * 5. 네트워크와 분산처리를 지원한다.
   * = 인터넷과 대규모 분산환경을 염두에 두었기 때문에 풍부하고 다양한 네트워크 프로그래밍 라이브러리를 통해 비교적 짧은 시간에 네트워크 관련 프로그램을 쉽게 개발할 수 있다.
   *
   * 6. 멀티쓰레드를 지원한다.
   * = 자바에서 개발되는 멀티쓰레드 프로그램은 시스템과는 관계없이 구현가능하며, 관련된 라이브러리가 제공되므로 구현이 쉽다. 그리고 여러 쓰레드에 대한 스케줄링을
   * 자바 인터프리터가 담당하게 된다.
   *
   * 7. 동적 로딩(Dynamic loading)을 지원한다.
   * = 보통 자바로 작성된 애플리케이션은 여러 개의 클래스로 구성되어 있다. 자바는 동적 로딩을 지원하기 때문에 실행 시에 모든 클래스가 로딩되지 않고
   * 필요한 시점에 클래스를 로딩하여 사용할 수 있다는 장점이 있다. 그 외에도 일부 클래스가 변경되어도 전체 애플리케이션을 다시 컴파일하지 않아도 되며,
   * 애플리케이션의 변경사항이 발생해도 비교적 적은 작업만으로도 처리할 수 있는 유연한 애플리케이션을 작성할 수 있다.
   *
   * */
}
