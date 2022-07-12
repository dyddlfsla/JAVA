package chapter.nine._20;

public class Chapter09_21 {

  /** ◆ StringBuilder
   *
   * StringBuffer 는 멀티 쓰레드에 안전(thread safe) 하도록 동기화되어 있다. 아직은 멀티쓰레드나 동기화에 대해서 배우지 않았지만, 동기화가
   * StringBuffer 의 성능을 떨어뜨린다는 것만 이해하면 된다. 멀티쓰레드로 작성된 프로그램이 아닌 경우, StringBuffer 의 동기화는 불필요하게 성능만 떨어뜨린다.
   *
   * 그래서 StringBuffer 에서 쓰레드의 동기화만 뺀 StringBuilder 가 새로 추가되었다. StringBuilder 는 StringBuffer 와 완전히 똑같은 기능으로 작성되어 있어서
   * 소스코드에서 StringBuffer 대신 StringBuilder 를 사용하도록 바꾸기만 하면 된다. 즉, StringBuffer 타입의 참조변수를 선언한 부분과 StringBuilder 의 생성자만 바꾸면 된다.
   *
   * StringBuffer sb;
   * sb = new StringBuffer();
   * sb.append("abc");
   *
   * StringBuilder sb;
   * sb = new StringBuilder();
   * sb.append("abc");
   *
   * StringBuffer 도 충분히 성능이 좋기 때문에 성능 향상이 반드시 필요한 경우를 제외하고는 기존에 작성한 코드를 StringBuilder 로 굳이 바꿀 필요는 없다.
   *
   *
   * */

}
