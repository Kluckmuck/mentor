package mentor.gui.frame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

import mentor.gui.panel.*;

public class MainFrame extends JFrame {

  //COMPONENTS
  private RoofPanel roofPanel;
  private MainFrame mainFrame;
  private UserPanel userPanel;

  private GridBagConstraints gc;

  public MainFrame(String title) {
    super(title);

    //GRIDBAGLAYOUT
    setLayout(new GridBagLayout());
    GridBagConstraints gc = new GridBagConstraints();
    gc.fill = GridBagConstraints.HORIZONTAL;

    //ROOFPANEL
    gc.weightx = 1;
    gc.weighty = 0.5;
    gc.gridx = 0;
    gc.gridy = 0;
    roofPanel = new RoofPanel();
    add(roofPanel, gc);

    //USERPANEL
    gc.weightx = 1;
    gc.weighty = 0.5;
    gc.gridx = 0;
    gc.gridy = 1;
    userPanel = new UserPanel();
    add(userPanel, gc);
  }

  public void run() {
    language();
    this.setSize(1000,800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public void language() {
    ArrayList<String> infoArray = new ArrayList<String>();
    try {
      Scanner sc = new Scanner(new File ("mentor/lang/eng.txt"));
      while (sc.hasNext() == true ){
          infoArray.add(sc.nextLine());
      }
    }
    catch(FileNotFoundException catchException){
      System.out.println(catchException);
    }
  }
}
