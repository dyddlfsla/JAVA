package chapter.eight._18;

public class Chapter08_18 {

  /** ◆ 연결된 예외 (chained exception)
   *
   * 한 예외가 다른 예외를 발생시킬 수도 있다. 예를 들어 예외 A 가 예외 B 를 발생시켰다면, A를 B 의 '원인 예외(cause exception)' 라고 한다.
   * 아래의 코드는 앞선 예제를 일부 변형한 것이다. SpaceException 을 원인 예외로 하는 InstallException 을 발생시키는 것을 보여준다.
   *
   * try {
   *   startInstall(); //SpaceException 발생
   *   copyFiles();
   * } catch (Exception e) {
   *   InstallException ie = new InstallException("설치 중 예외발생"); //예외 생성
   *   ie.initCause(e); e 는 SpaceException 의 인스턴스이다. //ie 의 원인 예외를 SpaceException 으로 지정한다.
   *   throw ie; //InstallException 을 발생시킨다.
   * } catch (MemoryException me) {
   *   ...
   * }
   *
   * 먼저 InstallException 을 생성한 후에, initCause() 로 SpaceException 을 InstallException 의 원인 예외로 등록한다.
   * 그리고 'throw' 로 이 예외를 던진다. initCause() 는 Exception 클래스의 조상인 Throwable 클래스에 정의되어 있기 떄문에
   * 모든 예외에서 사용 가능하다.
   *
   * ① Throwable initCause(Throwable cause) : 지정한 예외를 원인 예외로 등록
   * ② Throwable getCause() : 원인 예외를 반환
   *
   * 발생한 예외를 그냥 처리하면 될 텐데, 왜 원인 예외로 등록해서 다시 예외를 발생시키는지 궁금할 것이다. 그 이유는 여러가지 예외를
   * 하나의 큰 분류의 예외로 묶어서 다루기 위해서이다. 그렇다고 InstallException 을 SpaceException 과 MemoryException 의 조상으로
   * 해서 catch 블럭을 작성하면, 실제로 발생한 예외가 어떤 것인지 알 수 없다는 문제가 생긴다. 그리고 SpaceException 과
   * MemoryException 의 상속 관계를 변경해야 한다는 것도 부담이다.
   *
   * try {
   *   startInstall(); //SpaceException 발생
   *   copyFiles();
   * } catch (InstallException e) {
   *   e.printStackTrace(); // InstallException 은 SpaceException 과 MemoryException 의 조상
   * }
   *
   * 그래서 생각한 것이 예외가 원인 예외를 포함할 수 있게 한 것이다. 이렇게 하면, 두 예외는 상속관계가 아니어도 상관없다.
   * 또 다른 이유는 checked 예외를 unchecked 예외로 바꿀 수 있도록 하기 위해서이다. checked 예외로 예외처리를 강제한 이유는
   * 프로그래밍 경험이 적은 사람도 보다 견고한 프로그램을 작성할 수 있도록 유도하기 위한 것이었는데, 지금은 자바가 처음 개발되던 1990년대와
   * 컴퓨터 환경이 많이 달라졌다. 그래서 checked 예외가 발생해도 예외를 처리할 수 없는 상황이 하나 둘 발생하기 시작했다. 이럴 떄 할 수 있는 일이라곤
   * 그저 의미없는 try-catch 문을 추가하는 것 뿐인데, checked 예외를 unchecked 예외로 바꾸면 예외 처리가 선택적이 되므로 억지로 예외 처리를
   * 하지 않아도 된다.
   *
   * static void startInstall() throws SpaceException, MemoryException {
   *   if (!enoughSpace()) {
   *     throw new SpaceException("설치할 공간이 부족합니다");
   *   }
   *   if (!enoughMemory()) {
   *     throw new MemoryException("메모리가 부족합니다.");
   *   }
   * }
   *
   * static void startInstall() throws SpaceException {
   *   if (!enoughSpace()) {
   *     throw new SpaceException("설치할 공긴이 부족합니다");
   *   }
   *   if (!enoughMemory()) {
   *     throw new RuntimeException(new MemoryException("메모리가 부족합니다"));
   *   }
   * }
   *
   * MemoryException 은 Exception 의 자손이므로 반드시 예외를 처리해야 하는데, 이 예외를 RuntimeException 으로 감싸버렸기 때문에
   * unchecked 예외가 되었다. 그래서 더 이상 startInstall() 의 선언부에 MemoryException 을 선언하지 않아도 된다.
   *
   *
   *
   * */
}

class Ex8_13 {

  public static void main(String[] args) {
    try {
      install();
    } catch(InstallException ie) {
      ie.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  static void install() throws InstallException {
    try {
      startInstall();
      copyFiles();
    } catch (SpaceException e) {
      InstallException ie = new InstallException("설치 중 예외발생");
      ie.initCause(e);
      throw ie;
    } catch (MemoryException me) {
      InstallException ie = new InstallException("설치 중 예외발생");
      ie.initCause(me);
      throw ie;
    }
    finally {
      deleteTempFiles();
    }
  }

  static void startInstall() throws SpaceException, MemoryException {
    if (!enoughSpace()) {
      throw new SpaceException("설치할 공간이 부족합니다");
    }
    if (!enoughMemory()) {
      throw new MemoryException("메모리가 부족합니다");
//      throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
    }
  }

  static void copyFiles() {/*파일 복사*/}
  static void deleteTempFiles() {/*임시 파일들을 삭제*/}

  static boolean enoughSpace() {
    return false;
  }

  static boolean enoughMemory() {
    return true;
  }
}


class InstallException extends Exception {

  InstallException(String msg) {
    super(msg);
  }
}

class SpaceException extends Exception {

  SpaceException(String msg) {
    super(msg);
  }
}

class MemoryException extends Exception {

  MemoryException(String msg) {
    super(msg);
  }
}

