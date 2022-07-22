package chapter.seven.exercise;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exercise7_9 {
  /*
  * 아래의 EventHandler 를 익명 클래스(anonymous class) 로 변경하시오
  * */

  public static void main(String[] args) {
    Frame frame = new Frame();
    frame.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
      }
    });
  }
}


