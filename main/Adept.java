package mentor.main;

import java.util.*;
import java.io.*;

import mentor.main.*;

public class Adept extends Person {

  //Var
  private Mentor mentor;
  private School school;

  public Adept (String fName, String lName, Calendar birthDate, String mobileNr, String city, Mentor mentor, School school) {
    super(fName, lName, birthDate, mobileNr, city);
    this.mentor = mentor;
    this.school = school;
  }

  public String toString() {
    return (super.toString() + ", " + mentor.getName() + ", " + school);
  }
}
