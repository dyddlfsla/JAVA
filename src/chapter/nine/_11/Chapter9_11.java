package chapter.nine._11;

public class Chapter9_11 {

  /** ◆ String 클래스의 생성자와 메서드
   *
   * String 을 다루면서 자주 사용하게 되는 메서드들이 있다. 각 메서드에 따른 특징들과 사용방법을 알아두는 것이 좋다.
   *
   *
   * String(String s): 주어진 문자열(s) 을 갖는 String 인스턴스를 생성한다.
   * String s = new String("Hello");
   *
   * String(char[] value): 주어진 문자열(value) 을 갖는 String 인스턴스를 생성한다
   * char[] c = {'H', 'e', 'l', 'l', 'o'};
   * String s = new String(c);
   *
   * String(StringBuffer buf): StringBuffer 인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다.
   *
   * char charAt(int index): 지정된 위치(index)에 있는 문자를 알려준다. index 는 0부터 시작
   *
   * int compareTo(String str): 문자열(str) 을 사전순서로 비교한다. 같으면 0, 사전순으로 이전이면 음수, 이후면 양수를 반환
   *
   * String concat(String str): 문자열(str) 을 뒤에 덧붙인다.
   *
   * boolean contains(CharSequence s): 지정된 문자열(s) 가 포함되었는지 검사한다.
   *
   * boolean endsWith(String suffix): 지정된 문자열(suffix)로 끝나는지 알려준다.
   *
   * boolean equals(Object obj): 매개변수로 받은 문자열(obj)과 String 인스턴스의 문자열을 비교한다.
   *
   * boolean equalsIgnoreCase(String str): 문자열을 비교할 때 대소문자를 구별하지 않고 비교한다.
   *
   * int indexOf(int ch): 주어진 문자(ch)가 문자열에 존재하는지 확인하여 그 위치(index)를 알려준다. 못 찾으면 -1 을 반환한다.
   *
   * int indexOf(int ch, int pos): 주어진 문자(ch)가 문자열에 존재하는지 확인하는데, 지정된 위치(pos)부터 찾기 시작한다.
   *
   * int indexOf(String str): 주어진 문자열이 존재하는지 확인하여 그 위치를 알려준다.
   *
   * String intern(): 문자열을 상수풀에 등록한다.
   *
   * int lastIndexOf(int ch): 지정된 문자를 찾는데 문자열의 오른쪽에서부터 찾아서 그 위치를 알려준다.
   *
   * int lastIndexOf(String str): 지정된 문자열을 찾는데 문자열의 오른쪽에서부터 찾아서 그 위치를 알려준다.
   *
   * int length(): 문자열의 길이를 알려준다.
   *
   * String replace(char old, char new): 문자열 중 문자(old)를 새로운 문자(new)로 바꾸고 문자열을 반환한다.
   *
   * String replace(CharSequence old, CharSequence new): 문자열 중 문자열(old)을 새로운 문자열(new)로 바꾸고 반환한다.
   *
   * String replaceFirst(String regex, String replacement): 문자열 중에서 지정된 문자열(regex)과 일치하는 것 중 첫 번째 것만 새로운 문자열로 변경한다.
   *
   * String[] split(String regex): 문자열을 지정한 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
   *
   * String[] split(String regex, int limit): 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다. 단 문자열 전체를 지정된 수(limit)로 자른다.
   *
   * boolean startWith(String prefix): 주어진 문자열(prefix)로 시작하는지 검사한다.
   *
   * String subString(int begin)
   * String subString(int begin, int end): 주어진 시작위치부터 끝 위치범위에 포함돈 문자열을 얻는다. 이 때, 끝 위치의 문자는 포함되지 않는다.
   *
   * String toLowerCase(): String 인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환한다.
   *
   * String toString(): String 인스턴스에 저장된 문자열을 반환한다.
   *
   * String toUpperCase(): String 인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환한다.
   *
   * String trim(): 문자열의 왼쪽과 오른쪽 끝에 있는 공백을 없애고 결과를 반환한다. 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
   *
   * static String valueOf(...): 지정된 값을 문자열로 변환하여 반환한다.
   *
   *
   * */


}
