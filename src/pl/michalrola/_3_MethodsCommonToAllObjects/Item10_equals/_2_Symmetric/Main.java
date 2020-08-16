package pl.michalrola._3_MethodsCommonToAllObjects.Item10_equals._2_Symmetric;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    CaseInsensitiveStringBroken cisBroken = new CaseInsensitiveStringBroken("Polish");
    String s = "polish";

    System.out.println("---\nHere is the issue, both should be true or false with this rule:");
    System.out.println("cisBroken.equals(s): " + cisBroken.equals(s));
    System.out.println("s.equals(cisBroken): " + s.equals(cisBroken));

    System.out.println("---\nResult is not obvious and won't be the same always in a a list:");
    List<CaseInsensitiveStringBroken> listBroken = new ArrayList<>();
    listBroken.add(cisBroken);
    System.out.println("listBroken.contains(s): " + listBroken.contains(s)); //returns false

    System.out.println("---\nCorrected one will have always false");
    CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
    List<CaseInsensitiveString> list = new ArrayList<>(0);
    list.add(cis);
    System.out.println("list.contains(s): " + list.contains(s));
    System.out.println("Both are false:");
    System.out.println("cis.equals(s): " + cis.equals(s));
    System.out.println("s.equals(cis): " + s.equals(cis));

    //what we actually need example working in both cases
    CaseInsensitiveStringBroken caseInsensitiveStringBroken1 = new CaseInsensitiveStringBroken("Polish");
    CaseInsensitiveStringBroken caseInsensitiveStringBroken2 = new CaseInsensitiveStringBroken("polish");
    System.out.println(caseInsensitiveStringBroken1.equals(caseInsensitiveStringBroken2));
    System.out.println(caseInsensitiveStringBroken2.equals(caseInsensitiveStringBroken1));

    CaseInsensitiveString caseInsensitiveString1 = new CaseInsensitiveString("Polish");
    CaseInsensitiveString caseInsensitiveString2 = new CaseInsensitiveString("polish");
    System.out.println(caseInsensitiveString1.equals(caseInsensitiveString2));
    System.out.println(caseInsensitiveString2.equals(caseInsensitiveString1));

  }

}
