package mentor.gui.panel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

import mentor.gui.textfield.*;

public class UserPanel extends AbstractPanel {

  private NameTextField fNameTxt = new NameTextField(10);
  private NameTextField lNameTxt = new NameTextField(10);
  private NameTextField birthTxt = new NameTextField(10);
  private NameTextField mobileTxt = new NameTextField(10);
  private NameTextField cityTxt = new NameTextField(10);
  private NameTextField companyTxt = new NameTextField(10);
  private ArrayList<NameTextField> textFieldList = new ArrayList<>();

  private JLabel label;
  private JButton addBtn = new JButton("Add Mentor");

  public UserPanel () {

    textFieldList = createTextFieldList();

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

    //ADD-BUTTON
    gc.gridx = 0;
    gc.gridy++;
    gc.gridwidth = 2;
    add(addBtn, gc);

    addBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          if (textFieldCheck() == true) {
            System.out.println("TRUE");
          }
        } catch (RuntimeException error) {
          System.out.println(error);
        }
      }
    });
  }

  public void updateBtn() {
    /*if (textValues() == false) {
      addBtn.setEnabled(false);
    } else {
      addBtn.setEnabled(true);
    }*/
  }

  public boolean textFieldCheck() {
    for (NameTextField item : textFieldList) {
      System.out.print(item.getText());
      //GOOGLA STRING EQUALS
      if (item.getText() == "hej") {
        System.out.print(item.getText());
        return false;
      } 
    }
    return true;
  }

  public ArrayList<NameTextField> createTextFieldList() {
    textFieldList.add(fNameTxt);
    textFieldList.add(lNameTxt);
    textFieldList.add(birthTxt);
    textFieldList.add(mobileTxt);
    textFieldList.add(cityTxt);
    textFieldList.add(companyTxt);
    return textFieldList;
  }
}
