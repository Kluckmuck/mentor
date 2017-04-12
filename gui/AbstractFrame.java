package mentor.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AbstractFrame extends JFrame {

  private AbstractFrame aFrame;
  private GridBagConstraints gc;

  public AbstractFrame(String title) {
    super(title);

    //FRAME
    aFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);


    //GRIDBAGLAYOUT
    setLayout(new GridBagLayout());
    GridBagConstraints gc = new GridBagConstraints();
    gc.fill = GridBagConstraints.HORIZONTAL;

  }

  public GridBagConstraints getGBC() {
    return gc;
  }
}
