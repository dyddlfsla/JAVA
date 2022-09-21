package chapter.twelve._39;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Ex12_8 {

  public static void main(String[] args) {

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


