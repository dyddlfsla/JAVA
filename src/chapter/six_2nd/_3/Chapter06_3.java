package chapter.six_2nd._3;

public class Chapter06_3 {

  /**
   *  ◆ 객체의 구성 요소 - 기능과 속성
   *
   *  객체는 속성과 기능, 두 종류의 구성 요소로 이루어져 있으며, 일반적으로 객체는 다수의 속성과 다수의 기능을 갖는다.
   *  즉 객체는, 속성과 기능의 집합이라고 할 수 있다. 그리고 객체가 가지고 있는 속성과 기능을 그 객체의 멤버(구성원, member)라 한다.
   *  클래스란 객체를 정의한 것이므로 클래스에는 객체의 모든 속성과 기능이 정의되어 있다. 클래스로부터 객체를 생성하면, 클래스에 정의된 속성과 기능을
   *  가진 객체가 만들어지는 것이다.
   *
   *  보다 쉽게 이해할 수 있도록 TV 를 예로 들어보자. TV 의 속성으로는 전원 상태, 크기, 길이, 높이, 색상, 불륨, 채널과 같은 것들이 있으며
   *  기능으로는 켜기, 끄기, 볼륨 높이기, 채널 변경하기 등이 있다.
   *
   *  TV 객체의 속성 : 크기, 길이, 높이, 색상, 볼륨, 채널, ... 등
   *  TV 객체의 기능 : 켜기, 끄기, 볼륨 높이기, 낮추기, 채널 변경하기, ... 등
   *
   *  객체 지향 프로그래밍에서는 속성과 기능을 각각 변수와 메서드로 표현한다.
   *
   *   속성(property) → 멤버변수(variable)
   *   기능(function) → 메서드(method)
   *
   *         채널 → int channel
   *    채널 높이기 → channelUp() {...}
   *
   * 위에서 분석한 내용을 토대로 TV 클래스를 만들어 보면 다음과 같다.
   *
   * 속성: 크기, 길이, 높이, 색상, 채널
   * 기능: 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기 등
   *
   * class Tv {
   *   String color; // 색상
   *   boolean power; // 전원 상태
   *   int channel; // 채널
   *
   *   void power() {
   *     power = !power; // 전원 끄고 켜기
   *   }
   *
   *   void channelUp() {
   *     channel++;  // 채널 올리기
   *   }
   *
   *   void channelDown() {
   *     channel--; //채널 내리기
   *   }
   * }
   *
   * 실제로 TV 가 갖는 기능과 속성은 이외에도 더 있지만, 프로그래밍에 필요한 속성과 기능만을 선택하여 클래스를 작성하면 된다.
   *
   *
   * */

}
