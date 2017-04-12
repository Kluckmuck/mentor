package mentor.gui.panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AbstractPanel extends JPanel {

  private static AbstractPanel aPanel;
  private GridBagConstraints gc;

  public AbstractPanel() {

    //Panel
    aPanel.setVisible(true);


    //GRIDBAGLAYOUT
    setLayout(new GridBagLayout());
    GridBagConstraints gc = new GridBagConstraints();
    gc.fill = GridBagConstraints.HORIZONTAL;

  }

  public GridBagConstraints getGBC() {
    return gc;
  }
}
