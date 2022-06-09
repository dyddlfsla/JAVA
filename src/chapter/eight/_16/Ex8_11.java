package chapter.eight._16;

public class Ex8_11 {

  public static void main(String[] args) {
    try {
      startInstall();
      copyFiles();
    } catch (SpaceException se) {
      System.out.println("에러 메시지: " + se.getMessage());
      se.printStackTrace();
      System.out.println("공간을 확보한 후 다시 설치하시기 바랍니다.");
    } catch (MemoryException me) {
      System.out.println("에러 메시지: " + me.getMessage());
      me.printStackTrace();
      System.gc(); // Garbage collection 을 수행하여 메모리를 늘려준다.
      System.out.println("다시 설치를 시도하세요.");
    } finally {
      deleteTempFiles();
    }
  }

  static void startInstall() throws SpaceException, MemoryException {
    if (!enoughSpace()) {
      throw new SpaceException("설치할 공간이 부족합니다");
    }
    if (!enoughMemory()) {
      throw new MemoryException("메모리가 부족합니다");
    }
  }

  static void copyFiles() {
    System.out.println("파일을 복사 중입니다.");
  }
  static void deleteTempFiles() {
    System.out.println("임시파일들을 삭제 중입니다.");
  }

  private static boolean enoughMemory() {
    return true;
  }

  private static boolean enoughSpace() {
    return false;
  }

  /*
  * MemoryException 과 SpaceException, 두 개의 사용자 정의 예외 클래스를 새로 만들어서 사용했다.
  * 이 두 예외는 startInstall() 을 수행하는 동안에 발생할 수 있으며, enoughSpace() 와 enoughMemory() 의 결과에 따라
  * 발생하는 예외의 종류가 달라지도록 했다.
  *
  * */
}


