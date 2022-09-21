package chapter.twelve._36;

public class Chapter12_36 {

  /*
  * ◆ 모든 애너테이션의 조상
  *
  * 모든 애너테이션의 조상은 Annotation 이다. 그러나 애너테이션은 상속이 허용되지 않으므로 아래와 같이 명시적으로 Annotation 을 조상으로 지정할 수 없다.
  *
  * @interface TestInfo extends Annotation { // 에러. 허용되지 않는 표현
  *   int count();
  *   String testedBy();
  *   ...
  * }
  *
  * 게다가 아래의 소스에서 볼 수 있듯이 Annotation 은 애너테이션이 아니라 인터페이스로 정의되어 있다.
  *
  * public interface Annotation { // Annotation 자신은 인터페이스이다.
  *   boolean equals(Object obj);
  *   int hashCode();
  *   String toString();
  *
  *   Class<? extends Annotation> annotation(); // 애너테이션의 타입을 반환
  * }
  *
  * 모든 애너테이션의 조상인 Annotation 이 위와 같이 정의되어 있기 때문에, 모든 애너테이션 객체에 대해 equals(), hashCode(), toString() 과 같은 메서드를 호출하는 것이 가능하다.
  *
  * Class<AnnotationTest> class = Annotation.class;
  * Annotation[] annoArr = class.getAnnotations();
  *
  * for (Annotation annotation : annoArr) {
  *   System.out.println("toString():" + annotation.toString());
  *   System.out.println("hashCode():" + annotation.hashCode());
  *   System.out.println("equals():" + annotation.equals());
  *   System.out.println("annotationType():" + annotation.annotationType());
  * }
  *
  * 위의 코드는 AnnotationTest 클래스에 적용된 모든 애너테이션에 대해 toString(), hashCode() 를 호출한다.
  *
  *
  * ◆ 마커 애너테이션
  *
  * 애너테이션을 정의할 때 필요한 값이 없다면 애너테이션의 요소를 하나도 정의하지 않을 수 있다.
  * Serializable, Cloneable 인터페이스처럼 요소가 하나도 정의되지 않은 애너테이션을 마커 애너테이션이라고 한다.
  *
  *  @Target(ElementType.METHOD)
  *  @Retention(RetentionPolicy.SOURCE)
  *  public @interface Override {} // 마커 애너테이션. 정의된 요소가 하나도 없다.
  *
  *  @Target(ElementType.METHOD)
  *  @Retention(RetentionPolicy.SOURCE)
  *  public @interface Test {} // 마커 애너테이션. 정의된 요소가 하나도 없다.
  *
  *
  *
  * */

}
