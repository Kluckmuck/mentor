package mentor.gui.frame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mentor.gui.panel.*;

public class MainFrame extends AbstractFrame {

  private RoofPanel roofPanel;
  private GridBagConstraints gc;

  public MainFrame(String title) {
    super(title);

    /*Dimension size = getPreferredSize();
    size.width = 250;
    setPreferredSize(size);*/

    //GRIDBAGLAYOUT
    setLayout(new GridBagLayout());
    GridBagConstraints gc = new GridBagConstraints();
    gc.fill = GridBagConstraints.HORIZONTAL;

    //ROOFPANEL
    gc.gridx = 0;
    gc.gridy = 0;
    roofPanel = new RoofPanel();
    add(roofPanel, gc);
  }
}
