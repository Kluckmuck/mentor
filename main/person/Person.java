package mentor.main.person;

import java.util.*;
import java.io.*;

import mentor.main.person.*;
import mentor.main.institute.*;

public class Person {

  //Var
  private String fName;
  private String lName;
  private Calendar birthDate;
  private String mobileNr;
  private String city;

  //Calendar
  private Calendar currentDate;
  private int age;
  private int currentYear;
  private int currentMonth;
  private int currentDay;
  private int pYear;
  private int pMonth;
  private int pDay;

  public Person (String fName, String lName, Calendar birthDate, String mobileNr, String city) {
    this.fName = fName;
    this.lName = lName;
    this.birthDate = birthDate;
    this.mobileNr = mobileNr;
    this.city = city;
  }

  public String toString() {
    return fName + " " + lName + ", " + getAge() + ", " + mobileNr;
  }

  public String getName() {
    return fName + " " + lName;
  }

  public int getAge() {
    //Get age
    Calendar currentDate = Calendar.getInstance();
    currentYear = currentDate.get(Calendar.YEAR);
    currentMonth = currentDate.get(Calendar.MONTH);
    pYear = birthDate.get(Calendar.YEAR);
    pMonth = birthDate.get(Calendar.MONTH);
    if (pMonth < currentMonth) {
      return age = currentYear - pYear;
    }
    else if (pMonth == currentMonth) {
      currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
      pDay = birthDate.get(Calendar.DAY_OF_MONTH);
      if (pDay <= currentDay) {
        return age = currentYear - pYear;
      }
    }
    //Remove one year if a Persons month is larger than the current MONTH
    //OR same month and Persons day is larger than current DAY
    return age = currentYear - pYear - 1;
  }
}
