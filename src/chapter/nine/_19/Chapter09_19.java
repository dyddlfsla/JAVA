package chapter.nine._19;

public class Chapter09_19 {
  /*
  * StringBuffer 클래스 역시 문자열을 다루기 위한 것이기 때문에 String 클래스와 유사한 메서드를 많이 가지고 있다.
  * 그리고 StringBuffer 는 추가, 변경, 삭제와 같이 저장된 내용을 변경할 수 있는 메서드들이 추가로 제공된다.
  *
  *
  * StringBuffer(): 16 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다.
  * StringBuffer(int length): 지정된 갯수의 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다.
  * StringBuffer(String str): 지정된 문자열 값을 갖는 StringBuffer 인스턴스를 생성한다.
  * StringBuffer append(boolean b): 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer 인스턴스가 저장하고 있는 문자열 뒤에 덧붙인다.
  * int capacity(): 버퍼 크기를 알려준다.
  * char charAt(int index): 지정된 위치(index) 에 있는 문자를 반환한다.
  * StringBuffer delete(int start, int end): 시작위치(start) 부터 끝 위치(end) 사이에 있는 문자를 제거한다. 끝 위치는 범위에서 제외됨.
  * StringBuffer deleteCharAt(int index): 지정된 위치(index) 의 문자를 제거한다.
  * StringBuffer insert(int pos, Object object): 두 번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치(pos) 에 추가한다.
  * int length(): 저장된 문자열의 길이를 반환한다.
  * StringBuffer replace(int start, int end, String str): 지정된 범위(start ~ end) 의 문자들을 주어진 문자열로 바꾼다.
  * StringBuffer reverse(): 저장되어 있는 문자열의 순서를 거꾸로 나열한다.
  * void setChatAt(int index, char ch): 지정된 위치(index) 의 문자를 ch 로 바꾼다.
  * void setLength(int newLength): 지정된 길이로 문자열의 길이를 변경한다. 길이를 늘리는 경우 나머지 빈 공간을 공백으로 채운다.
  * String toString(): StringBuffer 인스턴스의 문자열을 String 으로 반환
  * String subString(int start)
  * String subString(int start, int end): 지정된 범위 내의 문자열을 String 으로 추출하여 반환한다. 시작 위치만 지정하는 경우 끝 범위는 문자열의 끝범위가 된다.
  *
  *
  *
  *
  * */
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("01");
    StringBuffer sb2 = sb.append(23);
    sb.append('4').append(56);

    StringBuffer sb3 = sb.append(78);
    sb3.append(9.0);

    System.out.println("sb = " + sb);
    System.out.println("sb2 = " + sb2);
    System.out.println("sb3 = " + sb3);

    System.out.println("sb = " + sb.deleteCharAt(10));
    System.out.println("sb = " + sb.delete(3, 6));
    System.out.println("sb = " + sb.insert(3, "abc"));
    System.out.println("sb = " + sb.replace(6, sb.length(), "END"));

    System.out.println("capacity = " + sb.capacity());
    System.out.println("length = " + sb.length());
  }
}
