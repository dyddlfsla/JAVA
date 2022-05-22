package chapter.eleven._16;

public class Chapter11_16 {

  /** ◆ Stack 과 Queue 의 메서드
   *
   * 1. Stack 의 메서드
   *
   * - boolean empty() : Stack 이 비었는지 알려준다.
   * - Object peek() : Stack 의 맨 위에 저장된 객체를 반환. pop() 과 달리 Stack 에서 객체를 꺼내지는 않음. (비었을 떄는 EmptyStackException 발생)
   * - Object pop() : Stack 의 맨 위에 저장된 객체를 꺼낸다. (마찬가지로 비었을 때, 예외 발생)
   * - Object push(Object item) : Stack 에 객체(item)을 저장한다.
   * - int search(Object o) : Stack 에서 주어진 객체(o) 를 찾아서 그 위치를 반환, 못찾으면 -1 을 반환 (배열과 달리 위치는 0이 아닌 1에서부터 시작함)
   *
   * 2. Queue 의 메서드
   *
   * - boolean add(Object o): 지정된 객체를 Queue 에 추가한다. 성공하면 true 를 반환. 저장공간이 부족하면 IllegalStateException 발생.
   * - Object remove() : Queue 에서 객체를 꺼내 반환. 비어 있으면 NoSuchElementException 발생
   * - Object element() : 삭제없이 요소를 읽어온다. peek 과 달리 Queue 가 비었을 때 NoSuchElementException 발생
   * - boolean offer(Object o) : Queue 에 객체를 저장. 성공하면 true , 실패하면 false
   * - Object poll() : Queue 에서 객체를 꺼내서 반환. 비어있으면 null 반환
   * - Object peek() : 삭제없이 요소를 읽어온다. 비어있으면 null 반환
   *
   *
   * */

}
