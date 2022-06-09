package chapter.eight._13;

import java.io.File;

public class Chapter08_13 {

  public static void main(String[] args) {
    try {
      File file = createFile(args[0]);
      System.out.println(file.getName() + "파일이 성공적으로 생성되었습니다.");
    } catch (Exception e) {
      System.out.println(e.getMessage() + "다시 입력해주시기 바랍니다.");
    }
  }

  static File createFile(String fileName) throws Exception {
    if (fileName == null || fileName.equals("")) {
      throw new Exception("파일 이름이 유효하지 않습니다.");
    }
    File file = new File(fileName);
    file.createNewFile();
    return file;
  }
}

/*
* 위는 사용자로부터 파일 이름을 입력받아서 파일을 생성하는 예제이다. 파일을 생성하는 것은 createFile() 인데, 이 메서드는 입력받은 파일의 이름이
* 유효하지 않으면 예외를 발생시킨다. createFile() 에 예외가 선언되어 있으므로, 이 예외는 main() 으로 전달되고 main() 의 try-catch 문에 의해 처리된다.
* 이는 main() 이 createFile() 에게 파일을 생성하라고 명령했는데, 작업을 수행하는 과정에서 문제가 생기자 예외를 발생시켜서 main() 에게 알리는 것이라고 할 수 있다.
* 반대로 createFile() 에 try-catch 문을 넣으면, 예외가 발생했을 때 createFile() 이 직접 예외를 처리하기 때문에 main() 은 예외가 발생한 사실조차
* 모르게 된다. 이처럼 예외가 발생했을 때 예외가 발생한 메서드 내에서 자체적으로 처리해도 되는 경우 메서드 내에 try-catch 문을 넣어서 처리하고,
* 위의 예제처럼 메서드 내에서 자체적으로 해결이 안되는 경우(파일 이름을 다시 받아와야 하는 경우)에는 예외를 선언해서 호출한 메서드가 처리하도록 해야한다.
*
* */
