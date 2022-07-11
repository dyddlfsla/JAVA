package chapter.nine._15;

public class Chapter09_15 {

  /** ◆ StringBuffer 클래스
   *
   * String 클래스는 인스턴스를 생성할 때 지정된 문자열을 변경할 수 없지만 StringBuffer 클래스는 변경이 가능하다.
   * 내부적으로 문자열 편집을 위한 버퍼(buffer) 를 가지고 있으며, StringBuffer 인스턴스를 생성할 때 그 크기를 지정할 수 있다.
   *
   * 이 때, 편집할 문자열의 길이를 고려하여 버퍼의 길이를 충분히 잡아주는 것이 좋다. 문자열이 버퍼의 길이를 넘어서게 되면, 버퍼의 길이를
   * 늘려주는 작업이 추가로 수행되어야 하기 때문에 작업 효율이 떨어진다.
   *
   *
   *
   * ◆ StringBuffer 의 생성자
   *
   * StringBuffer 클래스의 인스턴스를 생성할 때, 적절한 길이의 char 형 배열이 생성되고, 이 배열은 문자열을 저장하고 편집하기 위한 공간, 버퍼로 사용된다.
   *
   * StringBuffer 인스턴스를 생성할 때는 생성자 StringBuffer(int length) 를 사용해서 StringBuffer 인스턴스에 저장될 문자열의 길이를 고려하여
   * 충분히 여유있는 크기를 지정하는 것이 좋다. StringBuffer 인스턴스를 생성할 때, 버퍼의 크기를 지정하지 않으면 16개의 문자를 지정할 수 있는 크기의 버퍼를 생성한다.
   *
   *
   *
   *
   *
   * */

}
