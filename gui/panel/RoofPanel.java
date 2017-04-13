package mentor.gui.panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RoofPanel extends AbstractPanel {

  private Icon icon = null;

  public RoofPanel() {

    //GRIDLAYOUT
    setLayout(new GridLayout(1, 1));

    JTabbedPane tabbedPane = new JTabbedPane();
    JComponent panel1 = makeTextPanel("Panel #1");
    tabbedPane.addTab("Tab 1", icon, panel1, "Does nothing");
    tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
    panel1.setPreferredSize(new Dimension(410, 50));

    add(tabbedPane);
  }
}
