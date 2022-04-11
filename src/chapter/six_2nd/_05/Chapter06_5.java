package chapter.six_2nd._05;

public class Chapter06_5 {

  /**
   *  ◆ 한 파일에 여러 클래스 작성하기
   *
   *  하나의 소스파일에 하나의 클래스만을 정의하는 것이 보통이지만, 하나의 소스파일에 둘 이상의 클래스를 정의하는 것도 가능하다.
   *  이 떄 주의해야할 점은 '소스파일의 이름은 public class 의 이름과 일치해야 한다'는 것이다. 만일 소스파일 내에 public class 가 없다면
   *  소스파일의 이름은 소스 파일 내의 어떤 클래스의 이름으로 해도 상관없다.
   *
   *  1. Hello2.java
   *     public class Hello2{}   → public class 가 있는 경우 소스파일의 이름은 반드시 public class 의 이름과 일치해야 한다.
   *            class Hello3{}
   *
   *  2. Hello2.java
   *      class Hello2{}         → public class 가 하나도 없는 경우, 소스파일의 이름은 Hello2.java 또는 Hello3.java 둘 다 가능하다.
   *      class Hello3{}
   *
   *  3. Hello2.java
   *     public class Hello2{}   → 하나의 소스파일에 둘 이상의 public class 가 존재하면 안된다. 각 클래스를 별도의 소스파일로 나누어서 저장하거나 아니면 하나의 클래스에만 public 을 붙여야 한다.
   *     public class Hello3{}
   *
   *  4. Hello3.java
   *     public class Hello2{}   → 소스파일의 이름은 public class 의 이름과 일치해야 한다. Hello2.java 로 수정
   *            class Hello3{}
   *
   *  5. hello2.java
   *     public class Hello2{}   → 자바에서는 대소문자를 구분하므로 public class 의 이름과 소스파일의 이름이 대소문자까지 완벽히 일치해야 한다.
   *            class Hello3{}
   * 소스파일 (*.java)과 달리 클래스 파일(*.class) 은 클래스 마다 하나씩 만들어지므로 위 표의 1번 소스파일을 컴파일하면 실제로 'Hello2.class' 와 'Hello3.class' 가 만들어진다.
   *
   * */

}
