package mentor.main;

import java.util.*;
import java.io.*;

import mentor.main.*;

public class Mentor extends Person {

  //Var
  private ArrayList<Adept> adepts;
  private Company company;
  private int counter;

  public Mentor (String fName, String lName, Calendar birthDate, String mobileNr, String city, ArrayList<Adept> adepts, Company company) {
    super(fName, lName, birthDate, mobileNr, city);
    this.adepts = adepts;
    this.company = company;
  }

  public String toString() {
    for (Adept item : adepts) {
      counter++;
    }
    return (super.toString() + ", " + counter + ", " + company);
  }
}
