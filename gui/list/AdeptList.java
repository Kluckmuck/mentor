package mentor.gui.list;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import mentor.gui.panel.*;
import mentor.main.person.*;

public class AdeptList extends AbstractPanel {

  JList<Adept> list;
  DefaultListModel<Adept> model;

  public AdeptList () {

    //BORDER
    setBorder(BorderFactory.createTitledBorder("Adepts"));
    //JList (SAKER I LISTAN)
    model = new DefaultListModel<Adept>();

    //JList
    list = new JList<Adept>(model);
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    list.setSelectedIndex(0);
    //list.addListSelectionListener(this);
    list.setVisibleRowCount(5);
    JScrollPane listScrollPane = new JScrollPane(list);

    //LAYOUT
    setLayout(new GridBagLayout());
    GridBagConstraints gc = new GridBagConstraints();

    //ADD LIST
    gc.anchor = GridBagConstraints.LINE_START;
    gc.weightx = 1;
    gc.weighty = 0.5;
    gc.gridx = 0;
    gc.gridy = 0;
    add(listScrollPane, gc);
  }
}
