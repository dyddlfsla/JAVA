package chapter.seven._52;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_19 {

  public static void main(String[] args) {
    Button b = new Button("start");
    b.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.printf("ActionEvent occurred!!");
      }
    });
  }
}
