package mentor.gui.panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RoofPanel extends AbstractPanel {

  private Icon icon = null;

  public RoofPanel() {

    Dimension size = getPreferredSize();
    size.width = 250;
    setPreferredSize(size);

    //GRIDLAYOUT
    setLayout(new GridLayout(1, 1));
    //TABBEDPANE
    JTabbedPane tabbedPane = new JTabbedPane();

    //TABBEDPANE1
    JComponent panel1 = makeTextPanel("Panel #1");
    tabbedPane.addTab("Tab 1", icon, panel1, "Does nothing");
    tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
    panel1.setPreferredSize(new Dimension(410, 50));

    //TABBEDPANE2
    JComponent panel2 = makeTextPanel("Panel #1");
    tabbedPane.addTab("Tab 2", icon, panel2, "Does nothing");
    tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
    panel2.setPreferredSize(new Dimension(410, 50));

    //TABBEDPANE3
    JComponent panel3 = makeTextPanel("Panel #1");
    panel3.setPreferredSize(new Dimension(410, 50));
    tabbedPane.addTab("Tab 3", icon, panel3, "Does nothing");
    tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

    //ADD PANE TO LAYOUT
    add(tabbedPane);
  }
}
