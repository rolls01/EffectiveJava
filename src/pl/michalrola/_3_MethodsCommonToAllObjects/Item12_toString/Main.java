package pl.michalrola._3_MethodsCommonToAllObjects.Item12_toString;

public class Main {

  public static void main(String[] args) {

    short areaCode = 707;
    short prefix = 867;
    short lineNumber = 5309;

    System.out.println("---\nNo toString:");
    System.out.println(pl.michalrola._3_MethodsCommonToAllObjects.Item11_hashCode.PhoneNumber.create(areaCode, prefix, lineNumber));
    System.out.println("---\nWith toString:");
    System.out.println(PhoneNumber.create(areaCode, prefix, lineNumber));

    /**
     * If toString format is different than usual document your intention.
     *
     * Do not pass object information by toString - bad idea - error-prone and fragile system
     *
     */

  }

}
