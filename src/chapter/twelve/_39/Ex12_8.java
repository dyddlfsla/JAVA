package chapter.twelve._39;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
public class Ex12_8 {

  public static void main(String[] args) {
    //Ex12_8 의 클래스 객체를 얻는다.
    Class<Ex12_8> cls = Ex12_8.class;

    TestInfo annotation = cls.getAnnotation(TestInfo.class);
    System.out.println("annotation.testedBy() = " + annotation.testedBy());
    System.out.println("annotation.testDate().yymmdd() = " + annotation.testDate().yymmdd());
    System.out.println("annotation.testDate().hhmmss() = " + annotation.testDate().hhmmss());

    for (String testTools : annotation.testTools()) {
      System.out.println("testTools = " + testTools);
    }
    System.out.println();

    Annotation[] annotations = cls.getAnnotations();

    for (Annotation element : annotations) {
      System.out.println("element = " + element);
    }
  }
}

@Retention(RetentionPolicy.RUNTIME) // 애너테이션의 유지 기간 정책을 실행 시에 사용으로 설정
@interface TestInfo {

  int count() default 1;

  String testedBy();

  String[] testTools() default "JUnit";

  TestType testType() default TestType.FIRST;

  DateTime testDate();

}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {

  String yymmdd();

  String hhmmss();

}

enum TestType {
  FIRST, FINAL,
}

/*
*
* 애너테이션을 직접 정의하고, 애너테이션의 요소의 값을 출력하는 방법을 보여주는 예제이다. Ex12_8 클래스에 적용된 애너테이션을 실행 시간에 얻으려면, 아래와 같이 하면 된다.
* Class<Ex12_8> cls = Ex12_8.class;
* TestInfo annotation = (TestInfo) cls.getAnnotation(TestInfo.class);
*
* 'Ex12_8.class' 는 클래스 객체를 의미하는 리터럴이다. 앞서 배운 것과 같이, 모든 클래스 파일은 클래스 로더(class loader) 에 의해 메모리에 올라갈 때, 클래스에 대한 정보가 담긴 객체를 생성하는데
* 이 객체를 클래스 객체라고 한다. 이 객체를 참조할 때는 '클래스이름.class' 의 형식을 사용한다.
*
* 클래스 객체에는 해당 클래스가 가진 모든 정보를 가지고 있는데, 애너테이션의 정보도 포함되어 있다.
*
* 클래스 객체가 가지고 있는 getAnnotation() 이라는 메서드에 매개변수로 정보를 얻고자 하는 애너테이션을 지정해주거나 getAnnotations() 로 모든 애너테이션을 배열로 받아올 수 있다.
*
* */
