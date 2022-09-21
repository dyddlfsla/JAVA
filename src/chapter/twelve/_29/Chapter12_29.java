package chapter.twelve._29;

public class Chapter12_29 {

  /*
  * ◆ 메타 애너테이션
  *
  * 메타 애너테이션이란, 애너테이션을 위한 애너테이션 즉, 애너테이션에 붙이는 애너테이션으로 애너테이션을 정의할 때 적용 대상이나 유지기간을 지정하는데 사용된다.
  *
  * ① @Target: 애너테이션이 적용 가능한 대상을 지정하는데 사용한다.
  *   지정할 수 있는 애너테이션 적용 대상의 종류는 다음과 같다.
  *   ANNOTATION_TYPE, CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE, TYPE_PARAMETER, TYPE_USE
  *
  *   import static java.lang.annotation.ElementType.*;
  *   @Target({FIELD, TYPE, TYPE_USE})
  *   public @interface MyAnnotation {
  *     ...
  *   }
  *
  * ② @Documented: 애너테이션 정보가 javadoc 으로 작성된 문서에 포함되게 한다.
  * ③ @Inherited: 애너테이션이 자손 클래스에 상속되도록 한다.
  *   이 애너테이션을 붙이면 자식 클래스에도 해당 애너테이션이 붙은 것과 같이 인식된다.
  * ④ @Retention: 애너테이션이 유지되는 범위를 지정하는데 사용한다.
  *   애너테이션 유지 정책의 종류는 다음과 같다.
  *   SOURCE, CLASS, RUNTIME
  *
  *   @Target({ElementType.METHOD})
  *   @Retention(RetentionPolicy.SOURCE)
  *   public @interface Override {}
  *   SOURCE 라는 유지 정책은 컴파일러가 사용하는 유지 정책이다. 따라서 자신이 직접 컴파일러를 만드는 경우가 아니라면 이 유지 정책은 필요없다.
  *
  *   @Target({ElementType.METHOD})
  *   @Retention(RetentionPolicy.RUNTIME)
  *   public @interface FunctionalInterface {}
  *   유지 정책을 RUNTIME 으로 하면 실행 시에 '리플렉션(reflection)' 을 통해 클래스 파일에 저장된 애너테이션 정보를 읽어서 처리할 수 있다.
  *   유지 정책 CLASS 는 컴파일러가 애너테이션의 정보를 클래스 파일에 저장할 수 있게는 하지만, 클래스 파일이 JVM 에 로딩될 때는 애너테이션의 정보가 무시되어
  *   실행 시에 애너테이션에 대한 정보를 얻을 수 없다. 이 때문에 CLASS 는 유지 정책의 기본값이지만 잘 활용되지 않는다.
  *
  *
  * ⑤ @Repeatable: 애너테이션을 반복해서 적용할 수 있게 한다.(JDK1.8)
  *   일반적으로 하나의 대상에 한 종류의 애너테이션을 붙이는데, '@Repeatable' 이 붙은 애너테이션은 여러 번 붙일 수가 있다.
  *
  * */

}
