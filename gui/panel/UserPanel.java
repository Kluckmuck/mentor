package mentor.gui.panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mentor.gui.textfield.*;

public class UserPanel extends AbstractPanel {

  NameTextField fNameTxt = new NameTextField(10);
  NameTextField lNameTxt = new NameTextField(10);
  NameTextField birthTxt = new NameTextField(10);
  NameTextField mobileTxt = new NameTextField(10);
  NameTextField cityTxt = new NameTextField(10);
  NameTextField companyTxt = new NameTextField(10);
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
    //label = fNameTxt.getLabel();
    label = new JLabel("First Name: ");
    add(label, gc);
    gc.gridx++;
    add(fNameTxt, gc);

    //LAST NAME
    gc.gridx = 0;
    gc.gridy++;
    label = new JLabel("Surname:");
    add(label, gc);
    gc.gridx++;
    add(lNameTxt, gc);

    //BIRTH DATE
    gc.gridx = 0;
    gc.gridy++;
    label = new JLabel("Birth date:");
    add(label, gc);
    gc.gridx++;
    add(birthTxt, gc);

    //MOBILENR
    gc.gridx = 0;
    gc.gridy++;
    label = new JLabel("Mobile number:");
    add(label, gc);
    gc.gridx++;
    add(mobileTxt, gc);

    //CITY
    gc.gridx = 0;
    gc.gridy++;
    label = new JLabel("City:");
    add(label, gc);
    gc.gridx++;
    add(cityTxt, gc);

    //COMPANY
    gc.gridx = 0;
    gc.gridy++;
    label = new JLabel("Company:");
    add(label, gc);
    gc.gridx++;
    add(companyTxt, gc);
  }
}
