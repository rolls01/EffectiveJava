package pl.michalrola._3_MethodsCommonToAllObjects.Item11_hashCode;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Map<PhoneNumber, String> m = new HashMap<>();

    short areaCode = 707;
    short prefix = 867;
    short lineNumber = 5309;

    m.put(PhoneNumber.create(areaCode, prefix, lineNumber), "Jenny");

    System.out.println(m.get(PhoneNumber.create(areaCode, prefix, lineNumber)));
    // will return null when no hashCode
    //proper implemented hashCode and return Jenny

  }

}
