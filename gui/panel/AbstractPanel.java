package mentor.gui.panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AbstractPanel extends JPanel {

  private static AbstractPanel aPanel;

  public AbstractPanel() {

  }

  public void createInputPanel () {

  }

  protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
}
