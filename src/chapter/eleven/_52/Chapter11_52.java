package chapter.eleven._52;

public class Chapter11_52 {

  /*
  * ◆ Collections 의 메서드 - 동기화
  *
  * Arrays 클래스가 배열과 관련된 여러 메서드를 제공하는 것처럼, Collections 는 컬렉션과 관련된 메서드를 제공한다.
  * fill(), copy(), sort(), binarySearch() 등의 메서드는 두 클래스에 모두 포함되어 있으며 같은 기능을 한다.
  *
  * ※ java.util.Collection 는 인터페이스고, java.util.Collections 는 클래스이다.
  *
  * 1. 컬렉션의 동기화
  * 멀티 쓰레드(multi-thread) 프로그래밍에서는 하나의 객체를 여러 쓰레드가 동시에 접근할 수 있기 때문에 데이터의 무결성(integrity) 을
  * 유지하기 위해서는 공유되는 객체에 동기화(synchronization)가 필요하다.
  *
  * Vector 와 Hashtable 과 같은 구버전(JDK1.2 이전) 의 클래스들은 자체적으로 동기화 처리가 되어 있는데, 멀티 쓰레드 프로그래밍이 아닌 경우
  * 오히려 불필요한 기능이 되어버려 성능을 떨어뜨리는 요인이 된다.
  *
  * 그래서 새로 추가된 ArrayList 와 HashMap 과 같은 컬렉션의 경우, 동기화를 자체적으로 처리하지 않고 필요한 경우에만 java.util.Collections 클래스의 동기화
  * 메서드를 이용해서 동기화처리를 하도록 변경되었다.
  *
  * Collections 클래스에는 다음과 같은 동기화 메서드를 제공하고 있으므로, 동기화가 필요할 때 해당되는 것을 사용하면 된다.
  *
  * static Collection synchronizationCollection(Collection c)
  * static List synchronizationList(List list)
  * static Set synchronizationSet(Set s)
  * static Map synchronizationMap(Map m)
  * static SortedSet synchronizationSortedSet(Sorted s)
  * static SortedMap synchronizationSortedMap(Sorted m)
  *
  * 다음과 같이 사용할 수 있다.
  *
  * List syncList = Collections.synchronizationList(new ArrayList(...));
  *
  * 지금은 동기화된 컬렉션이 필요한 경우 Collections 클래스의 동기화 메서드를 사용한다는 정도만 알아두자.
  *
  *
  *
  *
  * */

}
