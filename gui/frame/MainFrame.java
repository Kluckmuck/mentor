package mentor.gui.frame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mentor.gui.panel.*;

public class MainFrame extends AbstractFrame {

  private RoofPanel roofPanel;

  public MainFrame(String title) {
    super(title);

    //GRIDBAGLAYOUT
    GridBagConstraints gc = getGBC();
    gc.gridx = 0;
    gc.gridy = 0;
    add(roofPanel, gc);
  }
}
