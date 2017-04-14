package mentor.gui.textfield;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mentor.main.person.*;

public class AbstractTextField extends JTextField {

  Person p;
  JLabel label;

  public AbstractTextField (int i) {
    super(i);
  }

  public JLabel getLabel() {
    label = new JLabel("Namn");
    return label;
  }
}
