package chapter.seven._52;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_18 {

  public static void main(String[] args) {
    Button b = new Button("start");
    b.addActionListener(new EventHandler());
  }
}

class EventHandler implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.printf("ActionEvent occurred!! %n");
  }
}

/*
* 익명 클래스로 변환하는 예제
* */
