package mentor.gui.panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mentor.gui.textfield.*;

public class UserPanel extends AbstractPanel {

  NameTextField fNameTxt = new NameTextField(10);
  NameTextField lNameTxt = new NameTextField(10);
  JLabel label;

  public UserPanel () {

    //LAYOUT
    setLayout(new GridBagLayout());
    GridBagConstraints gc = new GridBagConstraints();

    //FIRST NAME
    gc.weightx = 1;
    gc.weighty = 0.5;
    gc.gridx = 0;
    gc.gridy = 0;
    label = fNameTxt.getLabel();
    add(label, gc);
    gc.gridx++;
    System.out.println(gc.gridy);
    add(fNameTxt, gc);

    //LAST NAME
    gc.weightx = 1;
    gc.weighty = 0.5;
    gc.gridx = 0;
    gc.gridy = 1;
    add(lNameTxt, gc);
  }
}
