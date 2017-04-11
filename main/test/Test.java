package mentor.main.test;

import java.util.*;
import java.io.*;

import mentor.main.person.*;
import mentor.main.institute.*;

//javac mentor/main/*.java && java mentor/main/Test

public class Test {
  public static void main(String[] args) {

    Calendar rightNow = Calendar.getInstance();
    rightNow.set(1994, 3, 10);

    Person p = new Person("Viktor", "Lundberg", rightNow, "0706566805");
    ArrayList<Adept> adeptList = new ArrayList<Adept>();
    Company company = new Company("Ica");
    Mentor m = new Mentor("Viktor", "Lundberg", rightNow, "0706566805", adeptList, company);
    School school = new School("GU");
    Adept a = new Adept("Karl", "Lundberg", rightNow, "0706566805", m, school);
    adeptList.add(a);

    System.out.println(m.toString());

    //System.out.println(rightNow);
  }
}
