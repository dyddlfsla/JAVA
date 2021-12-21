package chapter.seven;

public class Chapter07_24 {

  /** ◆ 참조변수의 형변환
   *
   * 기본형 변수처럼 참조변수도 형변환이 가능하다. 단, 서로 상속 관계에 있는 클래스 사이에서만 가능하기 때문에 자손타입의 참조변수를
   * 조상 타입의 참조변수로, 조상 타입의 참조변수를 자손 타입의 참조변수로의 형변환만 가능하다.
   *
   * 바로 윗 조상이나 자손이 아닌, 조상의 조상으로도 형변환이 가능하다. 따라서 모든 참조변수는 모든 클래스의 조상인 Object 클래스 타입으로
   * 형변환이 가능하다.
   *
   * class car {}
   * class FireEngine extends Car {}
   * class Ambulance extends Car {}
   *
   * FireEngine fireEngine = new FireEngine();
   * Car car = (Car) fireEngine;                    //OK. 조상인 Car 타입으로 형변환 가능(형변환 연산자 생략가능)
   * FireEngine fireEngine2 = (FireEngine) car;     //OK. 자손인 FireEngine 타입으로도 형변환 가능.
   * Ambulance ambulance = (Ambulance) fireEngine;  //에러. 상속관계가 아닌 경우 클래스 간의 형변환 불가.
   *
   * 기본형의 형변환과 달리 참조형의 형변환은 변수에 저장된 값(주소값)이 변환되는 것이 아니다.
   * 참조변수의 형변환은 그저 리모컨(참조변수)을 다른 종류의 것으로 바꾸는 것뿐이다. 리모컨의 타입을 바꾸는 이유는 사용할 수 있는
   * 멤버를 조절하기 위한 것이고 위와 같이 조상 타입으로의 형변환 시 형변환 연산자()를 생략할 수 있는 이유는 조상 타입으로 형변환하면
   * 다룰 수 있는 멤버의 갯수는 항상 줄어들고 때문에 안전하기 때문이다. 반대로 실제 객체가 가진 기능보다 리모컨의 버튼이 더 많으면 안된다.
   * */

}
