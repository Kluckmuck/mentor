package mentor.gui.frame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AbstractFrame extends JFrame {

  private static JFrame aFrame;
  private GridBagConstraints gc;

  public AbstractFrame(String title) {
    aFrame = new JFrame(title);
    aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void run() {
    //Display window
    aFrame.pack();
    aFrame.setVisible(true);
  }
}
